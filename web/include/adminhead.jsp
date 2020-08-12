<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="${ctx }/layui/css/layui.css" media="all">
<link rel="stylesheet" type="text/css"
	href="http://cdn.bootcss.com/font-awesome/4.6.0/css/font-awesome.min.css">
<script src="${ctx }/layui/layui.js"></script>
<style type="text/css">
.layui-form-label {
	width: 60px;
	padding: 9px 5px;
}

.layui-input-block {
	margin-left: 80px;
}

.table-head-one-line {
	margin-top: 10px;
	height: 33px;
}

.table-head-two-line {
	margin-top: 10px;
	height: 75px;
}

.layui-table img {
	max-width: 200px;
}

.layui-table-cell {
	padding: 0px;
}

.layui-upload-img {
	padding-left: 10px;
	max-width: 400px;
	max-height: 200px;
}
.layui-table-cell{
	height: 100%;
	width:100%;
}
</style>
<script type="text/html" id="allBar">
  	<a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="view">预览</a>
  	<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
 	<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script type="text/html" id="editBar">
 	<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
</script>
<script type="text/html" id="editDelBar">
  	<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
	<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script type="text/javascript">
	//常用控件直接定义在外层
	var layer;
	var $;
	var table;
	var form;
	var layedit;
	//验证器3个默认提示名
	var name2 = '';
	var name4 = '';
	var name6 = '';
	//编辑器的index
	var layeditindex;

	//关闭全部弹窗,并且刷新表格(如果有相应的控件定义)
	function closeAndReolad() {
		if (layer) {
			layer.closeAll();
		}
		if (table) {
			table.reload('tb')
		}
	}

	//开启表单验证
	function intiFormVerify() {
		form.verify({
			text2 : function(value) {
				if (value.length < 2) {
					return name2 + '最少输入<2>个字!';
				}
			},
			text4 : function(value) {
				if (value.length < 4) {
					return name4 + '最少输入<4>个字!';
				}
			},
			text6 : function(value) {
				if (value.length < 6) {
					return name6 + '最少输入<6>个字!';
				}
			},
			pass : [ /(.+){6,12}$/, '密码必须6到12位' ],
			//编辑器验证器
			content : function(value) {
				layedit.sync(layeditindex);
			}
		});
	}

	//表单提交,这边调用父亲的closeAndReolad,因为这个方法是在弹窗iframe中调用
	function submitForm(data) {
		layer.load(2);
		$.post(data.form.action, data.field, function(res) {
			if (res.code == 0) {
				layer.alert(res.msg, {
					icon : 1,
					title : '提示',
					closeBtn : 0
				}, function() {
					window.parent.closeAndReolad();
				});
			} else {
				layer.alert(res.msg, {
					icon : 2,
					title : '提示',
					closeBtn : 0
				}, function() {
					layer.closeAll();
				})
			}
		}, 'json');
	}

	//添加一条记录弹窗
	function addOneRecord(title, width, height, url) {
		layer.open({
			type : 2,
			title : title,
			area : [ width + 'px', height + 'px' ],
			content : url //这里content是一个URL，如果你不想让iframe出现滚动条，你还可以content: ['http://sentsin.com', 'no']
		});
	}

	//编辑一条记录弹窗
	function editOneRecord(title, width, height, url, id) {
		if(url.indexOf("?")>-1){
			url=url+"&id="+id;
		}else{
			url= url + '?id=' + id
		}
		layer.open({
			type : 2,
			title : title,
			area : [ width + 'px', height + 'px' ],
			content :url //这里content是一个URL，如果你不想让iframe出现滚动条，你还可以content: ['http://sentsin.com', 'no']
		});
	}

	//删除一条记录
	function delOneRecord(url, id) {
		layer.confirm('确定要删除?', function(index) {
			$.ajax({
				url : '${ctx}/admin/' + url,
				type : 'POST',
				async : true,
				timeout : '20000',
				dataType : 'json',
				data : {
					'id' : id
				},
				beforeSend : function(XMLHttpRequest) {
					layer.load(2);
				},
				success : function(json) {
					if (json.code == 0) {
						layer.alert(json.msg, {
							icon : 1,
							title : '结果',
							closeBtn : 0
						}, function(index) {
							closeAndReolad();
						});
					} else {
						layer.alert(json.msg, {
							icon : 2,
							title : '提示',
							closeBtn : 0
						}, function() {
							layer.closeAll()
						});

					}
				},
				complete : function() {},
				error : function() {
					layer.alert("请求出错!", {
						icon : 2,
						title : '提示',
						closeBtn : 0
					}, function() {
						layer.closeAll()
					});
				}
			});
		});
	}

	//修改一条记录的某个字段,用于开启了单元格编辑后的提交保存
    /**
	 *
     * @param url 链接
     * @param id
     * @param fieldName 字段名
     * @param fieldValue 字段值
     * @param enableNull
     * @returns {boolean}
     */
	function saveOneRecord(url, id, fieldName, fieldValue, enableNull,callback) {
		if (!enableNull) {
			enableNull = false;
		}
		//已经是number的话不需要验证
		if (typeof fieldValue != 'number') {
			//如果不允许空又输入空,报错并且刷新还原
			if (!enableNull && !fieldValue) {
				layer.alert('不允许输入空值!', {
					icon : 2,
					title : '提示',
					closeBtn : 0
				}, function(index) {
					closeAndReolad();
				});
				return false;
			}
		}
		var loadIndex;
		$.ajax({
			url : '${ctx}/admin/' + url,
			type : 'POST',
			async : true,
			timeout : '20000',
			dataType : 'json',
			data : {
				'id' : id,
				'fieldName' : fieldName,
				'fieldValue' : fieldValue
			},
			beforeSend : function(XMLHttpRequest) {
				loadIndex=layer.load(2);
			},
			success : function(json) {
				//成功了,关闭layer就好了
				if (json.code == 0) {
					layer.msg('成功', {icon: 1,time:1500});
					layer.close(loadIndex);
                    if(callback){
                        callback();
                    }
				} else { //失败直接刷新表格,数据就恢复成旧的
					layer.alert(json.msg, {
						icon : 2,
						title : '提示',
						closeBtn : 0
					}, function(index) {
						closeAndReolad();
					});
				}
			},
			complete : function() {},
			error : function() {
				layer.alert("请求出错!", {
					icon : 2,
					title : '提示',
					closeBtn : 0
				}, function() {
					layer.closeAll()
				});
			}
		});
	}
	//添加一个tab标签
	function addOneTab(icon,id,title,url){
		window.parent.addTab(icon,id,title,url);
	}
	
	function lalert(content){
		layer.alert(content, {
			icon : 2,
			title : '提示',
			closeBtn : 0
		}, function(index) {
			layer.close(index)
		});
	}
	
	function info(content){
		layer.alert(content, {
			icon : 1,
			title : '提示',
			closeBtn : 0
		}, function(index) {
			layer.close(index)
		});
	}
</script>


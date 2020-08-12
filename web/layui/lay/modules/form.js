/** layui-v2.2.4 MIT License By http://www.layui.com */
 ;layui.define("layer",function(e){"use strict";var t=layui.$,a=layui.layer,i=layui.hint(),n=layui.device(),l="form",r=".layui-form",s="layui-this",o="layui-hide",c="layui-disabled",u=function(){this.config={verify:{required:[/[\S]+/,"必填项不能为空"],phone:[/^1\d{10}$/,"请输入正确的手机号"],email:[/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/,"邮箱格式不正确"],url:[/(^#)|(^http(s*):\/\/[^\s]+\.[^\s]+)/,"链接格式不正确"],number:function(e){if(!e||isNaN(e))return"只能填写数字"},date:[/^(\d{4})[-\/](\d{1}|0\d{1}|1[0-2])([-\/](\d{1}|0\d{1}|[1-2][0-9]|3[0-1]))*$/,"日期格式不正确"],identity:[/(^\d{15}$)|(^\d{17}(x|X|\d)$)/,"请输入正确的身份证号"]}}};u.prototype.set=function(e){var a=this;return t.extend(!0,a.config,e),a},u.prototype.verify=function(e){var a=this;return t.extend(!0,a.config.verify,e),a},u.prototype.on=function(e,t){return layui.onevent.call(this,l,e,t)},u.prototype.render=function(e,a){var n=this,u=t(r+function(){return a?'[lay-filter="'+a+'"]':""}()),d={select:function(){var e,a="请选择",i="layui-form-select",n="layui-select-title",r="layui-select-none",d="",f=u.find("select"),y=function(a,l){t(a.target).parent().hasClass(n)&&!l||(t("."+i).removeClass(i+"ed "+i+"up"),e&&d&&e.val(d)),e=null},v=function(a,u,f){var v=t(this),p=a.find("."+n),m=p.find("input"),k=a.find("dl"),x=k.children("dd");if(!u){var g=function(){var e=a.offset().top+a.outerHeight()+5-h.scrollTop(),t=k.outerHeight();a.addClass(i+"ed"),x.removeClass(o),e+t>h.height()&&e>=t&&a.addClass(i+"up")},b=function(e){a.removeClass(i+"ed "+i+"up"),m.blur(),e||C(m.val(),function(e){e&&(d=k.find("."+s).html(),m&&m.val(d))})};p.on("click",function(e){a.hasClass(i+"ed")?b():(y(e,!0),g()),k.find("."+r).remove()}),p.find(".layui-edge").on("click",function(){m.focus()}),m.on("keyup",function(e){var t=e.keyCode;9===t&&g()}).on("keydown",function(e){var t=e.keyCode;9===t?b():13===t&&e.preventDefault()});var C=function(e,a,i){var n=0;layui.each(x,function(){var a=t(this),l=a.text(),r=l.indexOf(e)===-1;(""===e||"blur"===i?e!==l:r)&&n++,"keyup"===i&&a[r?"addClass":"removeClass"](o)});var l=n===x.length;return a(l),l},w=function(e){var t=this.value,a=e.keyCode;return 9!==a&&13!==a&&37!==a&&38!==a&&39!==a&&40!==a&&(C(t,function(e){e?k.find("."+r)[0]||k.append('<p class="'+r+'">无匹配项</p>'):k.find("."+r).remove()},"keyup"),void(""===t&&k.find("."+r).remove()))};f&&m.on("keyup",w).on("blur",function(t){e=m,d=k.find("."+s).html(),setTimeout(function(){C(m.val(),function(e){d||m.val("")},"blur")},200)}),x.on("click",function(){var e=t(this),i=e.attr("lay-value"),n=v.attr("lay-filter");return!e.hasClass(c)&&(e.hasClass("layui-select-tips")?m.val(""):(m.val(e.text()),e.addClass(s)),e.siblings().removeClass(s),v.val(i).removeClass("layui-form-danger"),layui.event.call(this,l,"select("+n+")",{elem:v[0],value:i,othis:a}),b(!0),!1)}),a.find("dl>dt").on("click",function(e){return!1}),t(document).off("click",y).on("click",y)}};f.each(function(e,l){var r=t(this),o=r.next("."+i),u=this.disabled,d=l.value,f=t(l.options[l.selectedIndex]),y=l.options[0];if("string"==typeof r.attr("lay-ignore"))return r.show();var h="string"==typeof r.attr("lay-search"),p=y?y.value?a:y.innerHTML||a:a,m=t(['<div class="'+(h?"":"layui-unselect ")+i+(u?" layui-select-disabled":"")+'">','<div class="'+n+'"><input type="text" placeholder="'+p+'" value="'+(d?f.html():"")+'" '+(h?"":"readonly")+' class="layui-input'+(h?"":" layui-unselect")+(u?" "+c:"")+'">','<i class="layui-edge"></i></div>','<dl class="layui-anim layui-anim-upbit'+(r.find("optgroup")[0]?" layui-select-group":"")+'">'+function(e){var t=[];return layui.each(e,function(e,i){0!==e||i.value?"optgroup"===i.tagName.toLowerCase()?t.push("<dt>"+i.label+"</dt>"):t.push('<dd lay-value="'+i.value+'" class="'+(d===i.value?s:"")+(i.disabled?" "+c:"")+'">'+i.innerHTML+"</dd>"):t.push('<dd lay-value="" class="layui-select-tips">'+(i.innerHTML||a)+"</dd>")}),0===t.length&&t.push('<dd lay-value="" class="'+c+'">没有选项</dd>'),t.join("")}(r.find("*"))+"</dl>","</div>"].join(""));o[0]&&o.remove(),r.after(m),v.call(this,m,u,h)})},checkbox:function(){var e={checkbox:["layui-form-checkbox","layui-form-checked","checkbox"],_switch:["layui-form-switch","layui-form-onswitch","switch"]},a=u.find("input[type=checkbox]"),i=function(e,a){var i=t(this);e.on("click",function(){var t=i.attr("lay-filter"),n=(i.attr("lay-text")||"").split("|");i[0].disabled||(e.data("_class",a[1]),i[0].checked?(i[0].checked=!1,e.data("_method","addClass").data("_text",n[0]),e.removeClass(a[1]).find("em").text(n[1])):(i[0].checked=!0,e.data("_method","removeClass").data("_text",n[1]),e.addClass(a[1]).find("em").text(n[0])),layui.event.call(i[0],l,a[2]+"("+t+")",{elem:i[0],value:i[0].value,othis:e}))})};a.each(function(a,n){var l=t(this),r=l.attr("lay-skin"),s=(l.attr("lay-text")||"").split("|"),o=this.disabled;"switch"===r&&(r="_"+r);var u=e[r]||e.checkbox;if("string"==typeof l.attr("lay-ignore"))return l.show();var d=l.next("."+u[0]),f=t(['<div class="layui-unselect '+u[0]+(n.checked?" "+u[1]:"")+(o?" layui-checkbox-disbaled "+c:"")+'" lay-skin="'+(r||"")+'">',{_switch:"<em>"+((n.checked?s[0]:s[1])||"")+"</em><i></i>"}[r]||(n.title.replace(/\s/g,"")?"<span>"+n.title+"</span>":"")+'<i class="layui-icon">'+(r?"&#xe605;":"&#xe618;")+"</i>","</div>"].join(""));d[0]&&d.remove(),l.after(f),i.call(this,f,u)})},radio:function(){var e="layui-form-radio",a=["&#xe643;","&#xe63f;"],i=u.find("input[type=radio]"),n=function(i){var n=t(this),s="layui-anim-scaleSpring";i.on("click",function(){var o=n[0].name,c=n.parents(r),u=n.attr("lay-filter"),d=c.find("input[name="+o.replace(/(\.|#|\[|\])/g,"\\$1")+"]");n[0].disabled||(layui.each(d,function(){var i=t(this).next("."+e);this.checked=!1,i.removeClass(e+"ed"),i.find(".layui-icon").removeClass(s).html(a[1])}),n[0].checked=!0,i.addClass(e+"ed"),i.find(".layui-icon").addClass(s).html(a[0]),layui.event.call(n[0],l,"radio("+u+")",{elem:n[0],value:n[0].value,othis:i}))})};i.each(function(i,l){var r=t(this),s=r.next("."+e),o=this.disabled;if("string"==typeof r.attr("lay-ignore"))return r.show();var u=t(['<div class="layui-unselect '+e+(l.checked?" "+e+"ed":"")+(o?" layui-radio-disbaled "+c:"")+'">','<i class="layui-anim layui-icon">'+a[l.checked?0:1]+"</i>",void 0==r.attr("notitle")?"<span>"+(l.title||"未命名")+"</span>":"","</div>"].join(""));s[0]&&s.remove(),r.after(u),n.call(this,u)})}};return e?d[e]?d[e]():i.error("不支持的"+e+"表单渲染"):layui.each(d,function(e,t){t()}),n},u.prototype.resetCheckbox=function(e,t){t[t.data("_method")](t.data("_class")),t.find("em").text(t.data("_text")),e.checked=!e.checked};var d=function(){var e=t(this),i=f.config.verify,s=null,o="layui-form-danger",c={},u=e.parents(r),d=u.find("*[lay-verify]"),y=e.parents("form")[0],h=u.find("input,select,textarea"),v=e.attr("lay-filter");if(layui.each(d,function(e,l){var r=t(this),c=r.attr("lay-verify").split("|"),u=r.attr("lay-verType"),d=r.val();if(r.removeClass(o),layui.each(c,function(e,t){var c,f="",y="function"==typeof i[t];if(i[t]){var c=y?f=i[t](d,l):!i[t][0].test(d);if(f=f||i[t][1],c&&"required"===t||c&&d)return"tips"===u?a.tips(f,function(){return"string"==typeof r.attr("lay-ignore")||"select"!==l.tagName.toLowerCase()&&!/^checkbox|radio$/.test(l.type)?r:r.next()}(),{tips:1}):"alert"===u?a.alert(f,{title:"提示",shadeClose:!0}):a.msg(f,{icon:5,shift:6}),n.android||n.ios||l.focus(),r.addClass(o),s=!0}}),s)return s}),s)return!1;var p={};return layui.each(h,function(e,t){if(t.name=(t.name||"").replace(/^\s*|\s*&/,""),t.name){if(/^.*\[\]$/.test(t.name)){var a=t.name.match(/^(.*)\[\]$/g)[0];p[a]=0|p[a],t.name=t.name.replace(/^(.*)\[\]$/,"$1["+p[a]++ +"]")}/^checkbox|radio$/.test(t.type)&&!t.checked||(c[t.name]=t.value)}}),layui.event.call(this,l,"submit("+v+")",{elem:this,form:y,field:c})},f=new u,y=t(document),h=t(window);f.render(),y.on("reset",r,function(){var e=t(this).attr("lay-filter");setTimeout(function(){f.render(null,e)},50)}),y.on("submit",r,d).on("click","*[lay-submit]",d),e(l,f)});
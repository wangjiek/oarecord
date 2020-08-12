package com.hospital.soft.common.result;

import com.baomidou.mybatisplus.plugins.Page;

import java.util.LinkedHashMap;

@SuppressWarnings("all")
public class JsonAdminResult extends LinkedHashMap<String, Object> {

	private static final long serialVersionUID = 4625270830131770651L;

	public JsonAdminResult() {
		
	}
	
	public JsonAdminResult(Page page) {
		this.put("code", 0);
		this.put("msg", "");
		this.put("curPage", page.getCurrent());
		this.put("pageSize", page.getSize());
		this.put("count", page.getTotal());
		this.put("data", page.getRecords());
	}
	
	public JsonAdminResult(boolean isSuccess) {
		if (isSuccess) {
			this.put("code", 0);
			this.put("msg", "成功");
		} else {
			this.put("code", 500);
			this.put("msg", "失败");
		}
	}
	
	public JsonAdminResult(int code, String msg) {
		this.put("code", code);
		this.put("msg", msg);
	}

	// 把成功的的转换成失败的记录
	public JsonAdminResult convertToErrorResult(String msg) {
		return convertToErrorResult(500, msg);
	}

	public JsonAdminResult convertToErrorResult(int code, String msg) {
		this.put("code", code);
		this.put("msg", msg);
		return this;
	}

}

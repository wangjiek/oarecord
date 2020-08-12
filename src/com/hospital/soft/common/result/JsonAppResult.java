package com.hospital.soft.common.result;

import com.baomidou.mybatisplus.plugins.Page;

import java.util.HashMap;
import java.util.LinkedHashMap;

@SuppressWarnings("all")
public class JsonAppResult extends LinkedHashMap<String, Object> {

	private static final long serialVersionUID = 4625270830131770651L;

	public JsonAppResult() {
	}

	public String getStatus(){
		
		return (String)this.get("status");
	}
	public String getMsg(){
		
		return (String)this.get("errmsg");
	}
	public JsonAppResult(Page page) {
		this.put("status", "1");
		this.put("errmsg", "成功");
		HashMap<String,Object> result = new HashMap<String,Object>();
		result.put("curPage", page.getCurrent());
		result.put("pageSize", page.getSize());
		result.put("count", page.getTotal());
		result.put("list", page.getRecords());
		this.put("result",result );
	}

	public JsonAppResult(boolean isSuccess) {
		if (isSuccess) {
			this.put("status", "1");
			this.put("errmsg", "成功");
		} else {
			this.put("status", "2");
			this.put("errmsg", "失败");
		}

	}

	public JsonAppResult(String status, String errmsg) {
		this.put("status", status);
		this.put("errmsg", errmsg);
	}

	// 把成功的的转换成失败的记录
	public JsonAppResult convertToErrorResult(String errmsg) {
		return convertToErrorResult("2", errmsg);
	}

	public JsonAppResult convertToErrorResult(String status, String errmsg) {
		this.put("status", status);
		this.put("errmsg", errmsg);
		return this;
	}

	// 兼容旧接口
	public void addResult(String key, Object value) {
		if (this.containsKey("result")) {
			HashMap result = (HashMap) this.get("result");
			result.put(key, value);
		} else {
			HashMap result = new HashMap();
			result.put(key, value);
			this.put("result", result);
		}
	}
}

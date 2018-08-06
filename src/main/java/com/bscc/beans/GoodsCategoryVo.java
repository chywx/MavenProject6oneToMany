package com.bscc.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"displayorder","commissionrate","enabled"})
public class GoodsCategoryVo {
	private Integer goodscateid;
    private String name;
    private Integer parentid;
    private String description;
    private Integer displayorder;
    private Double commissionrate;
    private Integer enabled;
    private List<GoodsCategoryVo> catelist;
	public Integer getGoodscateid() {
		return goodscateid;
	}
	public void setGoodscateid(Integer goodscateid) {
		this.goodscateid = goodscateid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getParentid() {
		return parentid;
	}
	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getDisplayorder() {
		return displayorder;
	}
	public void setDisplayorder(Integer displayorder) {
		this.displayorder = displayorder;
	}
	public Double getCommissionrate() {
		return commissionrate;
	}
	public void setCommissionrate(Double commissionrate) {
		this.commissionrate = commissionrate;
	}
	public Integer getEnabled() {
		return enabled;
	}
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
	public List<GoodsCategoryVo> getCatelist() {
		return catelist;
	}
	public void setCatelist(List<GoodsCategoryVo> catelist) {
		this.catelist = catelist;
	}
	@Override
	public String toString() {
		return "GoodsCategoryVo [goodscateid=" + goodscateid + ", name=" + name + ", parentid=" + parentid
				+ ", description=" + description + ", displayorder=" + displayorder + ", commissionrate="
				+ commissionrate + ", enabled=" + enabled + ", catelist=" + catelist + "]";
	}
    

}

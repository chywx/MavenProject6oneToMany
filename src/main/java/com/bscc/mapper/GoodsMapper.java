package com.bscc.mapper;

import java.util.List;

import com.bscc.beans.GoodsCategoryVo;

public interface GoodsMapper {
	List<GoodsCategoryVo> getCategory(Integer pid);
}

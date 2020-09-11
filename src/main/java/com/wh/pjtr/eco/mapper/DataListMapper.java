package com.wh.pjtr.eco.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wh.pjtr.eco.model.DataListVO;

@Mapper
public interface DataListMapper {
	
	List<DataListVO> selectDataList();
	List<DataListVO> selectDataListByResNo(String resno);

}

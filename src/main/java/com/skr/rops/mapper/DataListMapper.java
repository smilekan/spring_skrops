package com.skr.rops.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.skr.rops.model.DataListVO;

@Mapper
public interface DataListMapper {
	
	List<DataListVO> selectDataList();
	List<DataListVO> selectDataListByResNo(String resno);

}

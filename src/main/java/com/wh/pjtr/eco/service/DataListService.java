package com.wh.pjtr.eco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wh.pjtr.eco.mapper.DataListMapper;
import com.wh.pjtr.eco.model.DataListVO;

@Service
@Transactional
public class DataListService {
	
	@Autowired
	DataListMapper dataListMapper;
	
	public List<DataListVO> selectDataList() throws Exception {
		return dataListMapper.selectDataList();
	}

	public List<DataListVO> selectDataListByResNo(String resno) throws Exception {
		return dataListMapper.selectDataListByResNo(resno);
	}

}

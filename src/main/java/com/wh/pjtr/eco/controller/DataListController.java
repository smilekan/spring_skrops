package com.wh.pjtr.eco.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wh.pjtr.eco.common.SessionInfo;
import com.wh.pjtr.eco.model.DataListVO;
import com.wh.pjtr.eco.service.DataListService;

@RestController
@RequestMapping("/DataList")
public class DataListController {

	@Resource
	SessionInfo sessionInfo;
	
	@Autowired
	DataListService dataListService;
	
	@GetMapping("/getDataList")
	public List<DataListVO> getDataList(){
		try {
			List<DataListVO> vos = dataListService.selectDataList();
			
			return vos;
		}
		catch(Exception ex) {
			System.out.print(ex.getMessage());
			
			DataListVO err = new DataListVO();
			err.setStatus("ERR");
			err.setMessage(ex.getMessage());
			
			List<DataListVO> vos = new ArrayList<DataListVO>();
			vos.add(err);
			return vos;
		}
	}

	@GetMapping("/getDataListByResNo")
	public List<DataListVO> getDataListByResNo(String resno){
		try {
			List<DataListVO> vos = dataListService.selectDataListByResNo(resno);
			
			return vos;
		}
		catch(Exception ex) {
			System.out.print(ex.getMessage());
			
			DataListVO err = new DataListVO();
			err.setStatus("ERR");
			err.setMessage(ex.getMessage());
			
			List<DataListVO> vos = new ArrayList<DataListVO>();
			vos.add(err);
			return vos;
		}
	}
	
	@PostMapping("/getDataListByVO")
	public List<DataListVO> getDataListByResNo(@RequestBody DataListVO vo){
		try {
			List<DataListVO> vos = dataListService.selectDataListByResNo(vo.getId());
			
			return vos;
		}
		catch(Exception ex) {
			System.out.print(ex.getMessage());
			
			DataListVO err = new DataListVO();
			err.setStatus("ERR");
			err.setMessage(ex.getMessage());
			
			List<DataListVO> vos = new ArrayList<DataListVO>();
			vos.add(err);
			return vos;
		}
	}	
}

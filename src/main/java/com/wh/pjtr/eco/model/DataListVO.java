package com.wh.pjtr.eco.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
public class DataListVO extends CommonVO {
	
	/** 테스트 코드 */
	private String id;
	
	/** 상세 설명 */
	private String desc;
	
}

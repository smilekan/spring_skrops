package com.wh.pjtr.eco.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class CommonVO {
	String status = "OK";
	String message;
}

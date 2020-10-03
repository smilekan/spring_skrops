package com.skr.rops.common;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
@ToString
public class SessionInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long userId;
}

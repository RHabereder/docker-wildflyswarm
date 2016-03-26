package net.habereder.web.docker.wildflyswarm.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class IndexController implements Serializable {

	private static final long serialVersionUID = 5551425871717774789L;

	public IndexController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init() {
	}

	
}

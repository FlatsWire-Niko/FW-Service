/**
 * 
 */
package com.flatswire.fwservice.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nicolas Minig
 *
 */
@RestController
@RequestMapping("infos")
public class Infos {

	/**
	 * 
	 * @return
	 */
	@GetMapping("/")
	public String infos() {
		return String.format("<h1><center>%s</center></h1>", LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
	}

}

package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.management.AttributeNotFoundException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import com.example.demo.entity.Holiday;
import com.example.demo.service.HolidayService;


@RestController
@RequestMapping("/api/v1/Holiday")
public class HolidayController {

	@Autowired
	HolidayService hserv;

	@GetMapping
	public List<Holiday>  getHolidays()
	{
		return hserv.getHolidays().get();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Holiday>  getHolidayById(@PathVariable("id") int holidayId) throws AttributeNotFoundException
	{	
		Holiday org = (Holiday) hserv.findById(holidayId).orElseThrow(() -> new AttributeNotFoundException("Holiday not found."));
		return ResponseEntity.ok(org);
	}

	@PostMapping("/save")
	public ResponseEntity<?> addHoliday(@RequestBody Holiday holiday, UriComponentsBuilder builder,
			HttpServletRequest httpRequest) {
		Holiday org = hserv.addHoliday1(holiday);
		UriComponents components = builder.path(httpRequest.getRequestURI() + "/{id}").buildAndExpand(org.getId());
		return ResponseEntity.created(components.toUri()).body(org);
	}

	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteHolidayById(@PathVariable int id) throws AttributeNotFoundException
	{
		hserv.findById(id).orElseThrow();
		hserv.deleteHoliday(id);
		HashMap<String, Boolean> res =  new HashMap<>();
		res.put("delete", Boolean.TRUE);
		return res;

	}

	@PutMapping("/{id}")
	public ResponseEntity<Holiday> updateHoliday(@PathVariable("id") int id,  @Validated @RequestBody Holiday holiday) throws AttributeNotFoundException
	{
		Holiday org = (Holiday) hserv.findById(id).orElseThrow(() -> new AttributeNotFoundException("Holiday not found."));
		Holiday.setId((long) id);
		org = hserv.addHoliday(holiday);
		return ResponseEntity.ok(org);	
	}
}



package com.care.root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.care.root.dto.MovieBookDto;
import com.care.root.service.MovieBookService;

@RestController
@RequestMapping("book")
@CrossOrigin
public class MovieBookRestController {
	@Autowired MovieBookService mbs;
	@PostMapping("save")
	public Integer save(@RequestBody MovieBookDto dto) {
		return mbs.save(dto);
	}
	@GetMapping("booksearch/{bookPhone}")
	public MovieBookDto bookSearch(@PathVariable String bookPhone) {
		return mbs.bookSearch(bookPhone);
	}
}
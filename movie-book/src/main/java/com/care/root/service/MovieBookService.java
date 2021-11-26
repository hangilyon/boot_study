package com.care.root.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.dao.MovieBookDao;
import com.care.root.dto.MovieBookDto;

@Service
public class MovieBookService {
	@Autowired MovieBookDao dao;
	public Integer save(MovieBookDto dto) {
		return dao.save(dto);
	}
	public MovieBookDto bookSearch(String bookPhone) {
		return dao.bookSearch(bookPhone);
	}

}
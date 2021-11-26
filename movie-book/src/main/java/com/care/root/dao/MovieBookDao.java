package com.care.root.dao;


import org.apache.ibatis.annotations.*;

import com.care.root.dto.MovieBookDto;

public interface MovieBookDao {
	@Results(id="movieBookDto", value = {
			@Result(property = "bookDate", column="book_date"),
			@Result(property = "bookName", column="book_name"),
			@Result(property = "bookPhone", column="book_phone"),
			@Result(property = "bookCount", column="book_count"),
			@Result(property = "movieId", column="movie_id"),
			@Result(property = "movieTitle", column="movie_title"),
			@Result(property = "movieDate", column="movie_date")
	})
	@Select("select * from booking where book_phone = #{bookPhone}")
	public MovieBookDto bookSearch(String bookPhone);

	@Insert(
"insert into booking"
+ "(book_date,book_name,book_phone,book_count,movie_id,movie_title,movie_date)"
+"values"
+ "(#{bookDate},#{bookName},#{bookPhone},#{bookCount},#{movieId},#{movieTitle},#{movieDate})"
			)
	public int save(MovieBookDto dto);
	
}
package com.WeekendTask.Book.Respo;

import com.WeekendTask.Book.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}

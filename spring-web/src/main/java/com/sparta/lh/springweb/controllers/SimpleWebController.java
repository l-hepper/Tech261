package com.sparta.lh.springweb.controllers;

import com.sparta.lh.springweb.entities.Book;
import com.sparta.lh.springweb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SimpleWebController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/")
    public String welcome(Model model) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime now = LocalTime.now();
        model.addAttribute("message", "Hello World!");
        model.addAttribute("date", LocalDate.now());
        model.addAttribute("time", now.format(formatter));
        return "welcome";
    }

    @GetMapping("/books")
    public String getBooks(@RequestParam(required = false, defaultValue = "World") String msg, Model model) {
        model.addAttribute("books", bookRepository.findAll());
        model.addAttribute("msg", msg);
        return "books/list";
    }

    @GetMapping("books/create")
    public String createBookPage(Model model) {
        model.addAttribute("book", new Book());
        return "books/create";
    }

    @PostMapping("/books/create")
    public String createBook(@ModelAttribute Book book, Model model) {
        bookRepository.save(book);
        return "redirect:/books";
    }
}

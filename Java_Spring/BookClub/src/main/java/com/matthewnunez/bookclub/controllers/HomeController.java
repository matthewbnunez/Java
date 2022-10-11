package com.matthewnunez.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.matthewnunez.bookclub.models.Book;
import com.matthewnunez.bookclub.services.BookService;

@Controller
public class HomeController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public String dashboard(HttpSession session, Model model) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/logout";
		}
		model.addAttribute("bookList", bookService.allBooks());
		return "dashboard.jsp";
	}
	
	@GetMapping("/books/new")
	public String renderCreateBook(
			@ModelAttribute("newBook") Book newBook) {
		return "newBook.jsp";
	}
	
	@PostMapping("/books/process")
	public String processBookForm(
			@Valid @ModelAttribute("newBook") Book book,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "newBook.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/books";
		}
	}
	
	@GetMapping("/books/{id}")
	public String bookDetails(@PathVariable("id")Long id, Model model) {
		Book foundBook = bookService.oneBook(id);
		model.addAttribute("book", foundBook);
		return "oneBook.jsp";
	}
	
	@GetMapping("/books/edit/{id}")
	public String showEditForm(@PathVariable("id")Long id, Model model) {
		Book foundBook = bookService.oneBook(id);
		model.addAttribute("book", foundBook);
		return "editBook.jsp";
	}
	
	@PutMapping("/books/edit/{id}")
	public String processEdit(
			@Valid @ModelAttribute("book") Book book,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "editBook.jsp";
		} else {
			bookService.editBook(book);
			return "redirect:/books";
		}
	}
	
	@DeleteMapping("/books/delete/{id}")
	public String deleteBook(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
		return "redirect:/books";
	}
}

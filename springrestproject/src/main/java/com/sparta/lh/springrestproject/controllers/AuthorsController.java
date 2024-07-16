package com.sparta.lh.springrestproject.controllers;

import com.sparta.lh.springrestproject.entities.Author;
import com.sparta.lh.springrestproject.repositories.AuthorRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Objects;

// @Controller indicates to spring that beans can be created from this class - and that it has common functionality expected of a controller.
// @RestControler will automatically serialize the object when it is communicated to the client
// @RestController will automatically deserialise request bodies into the relevant class too
@RestController
@RequestMapping("/api/authors") // this will preface every path with the provided value
public class AuthorsController {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorsController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("")
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    // keep the controller methods as lightweight as possible - no business rule logic at all
    // it should only get a request and send a response back and that is it
    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthor(@PathVariable Integer id) {
        Author author = authorRepository.findById(id).orElse(null);
        if (author == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(author, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Author> addAuthor(@RequestBody Author author) {
        authorRepository.save(author);

        URI location = URI.create("http://localhost:8080/api/authors/" + author.getId());

//        return new ResponseEntity<>(author, HttpStatus.CREATED);
        return ResponseEntity.created(location).body(author);
    }

    // it is common when doing a put request to return no content if an existing resource is updated
    // you can return 201 created for a put request that creates a new resource (along with the specific URI and the newly created resource)
    @PutMapping("/{id}")
    public ResponseEntity<Author> updateAuthor(@PathVariable Integer id, @RequestBody Author author) {
        if (!id.equals(author.getId())) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        if (!authorRepository.existsById(author.getId())) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        authorRepository.save(author);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

//    @PostMapping
//    public ResponseEntity<Author> addAuthor(@RequestBody Author author, HttpServletRequest request) {
//        authorRepository.save(author);
//
//        URI location = URI.create(request.getRequestURL().toString() + author.getId());
//
////        return new ResponseEntity<>(author, HttpStatus.CREATED);
//        return ResponseEntity.created(location).body(author);
//    }


}

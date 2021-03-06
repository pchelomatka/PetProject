package main.controller.common;

import main.domain.common.AbstractEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CommonController<E extends AbstractEntity> {

    @PostMapping
    ResponseEntity<E> save(@RequestBody E entity);

    @PutMapping
    ResponseEntity<E> update(@RequestBody E entity);

    @GetMapping
    ResponseEntity<E> get(@RequestParam Long id);

    @GetMapping("/all")
    ResponseEntity<List<E>> getAll();

    @DeleteMapping
    Boolean delete(@RequestParam Long id);
}

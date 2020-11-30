package Ibook.Review.demo.controller;

import Ibook.Review.demo.CommonUtil.Const;
import Ibook.Review.demo.entity.Categories;
import Ibook.Review.demo.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("cats")
@CrossOrigin
public class CategoriesController {

    @Autowired
    CategoriesService categoriesService;


    @GetMapping(consumes = "application/json")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Categories>> getAllCategories(@RequestParam(value="page", defaultValue = Const.NUMBER_PAGE_START_DEFAULT) Integer page,
                                                             @RequestParam(value="size", defaultValue = Const.NUMBER_SIZE_PAGE_DEFAULT) Integer size){
        return new ResponseEntity<>(categoriesService.getAllCategories(page, size).getContent(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Categories getCategory(@PathVariable long id){
        return categoriesService.getCatById(id);
    }

    @PutMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Integer getSize(){
        return categoriesService.getSize();
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public void addCategories(@RequestBody Categories categories){
        categoriesService.addCategories(categories);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public boolean updateCategories(@PathVariable Long id, @RequestBody @Valid Categories categories){
        return categoriesService.updateCategories(id, categories);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public boolean deleteCategories(@PathVariable Long id){
        return categoriesService.deleteCategories(id);
    }
}

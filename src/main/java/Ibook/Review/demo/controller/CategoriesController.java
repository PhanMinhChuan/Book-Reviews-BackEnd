package Ibook.Review.demo.controller;

import Ibook.Review.demo.entity.Categories;
import Ibook.Review.demo.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {
    @Autowired
    private CategoriesService categoriesService;

    @GetMapping
    public List<Categories> getAllCategories(){
        return categoriesService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Categories getCategory(@PathVariable long id){
        return categoriesService.getCategories(id);
    }

    @PostMapping
    public boolean addCategories(@RequestBody Categories categories){
        return categoriesService.addCategories(categories);
    }

    @PutMapping
    public boolean updateCategories(@RequestBody @Valid Categories categories){
        return categoriesService.updateCategories(categories);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCategories(@PathVariable long id){
        return categoriesService.deleteCategories(id);
    }
}

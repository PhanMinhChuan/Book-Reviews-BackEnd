package Ibook.Review.demo.service.impl;

import Ibook.Review.demo.entity.Book;
import Ibook.Review.demo.entity.Categories;
import Ibook.Review.demo.repository.BookRepository;
import Ibook.Review.demo.repository.CategoriesRepository;
import Ibook.Review.demo.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImlp implements CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Autowired
    private BookRepository bookRepository;

    public Categories getCatById(long id){
        return categoriesRepository.findById(id).get();
        //return null;
    }

    public Page<Categories> getAllCategories(Integer page, Integer size){
        Pageable pageable = PageRequest.of(page, size);
        return categoriesRepository.findAll(pageable);
    }

    public Page<Book> getBookByCategoryId(long id, Integer page, Integer size){
        Pageable pageable = PageRequest.of(page, size);
        return bookRepository.findBookByCategoryById(id, "APPROVED",pageable);
    }

    public void addCategories(Categories categories){
        //if(!categoriesRepository.existsByName(categories.getName())) {
        categories.setId(categoriesRepository.findAll().get(categoriesRepository.findAll().size() - 1).getId() + 1);
        categoriesRepository.save(categories);
        //}
    }

    public boolean deleteCategories(long id){
        if(categoriesRepository.existsById(id)){
            categoriesRepository.deleteById(id);
            return true;
        }
        else return false;
    }

    public void updateCategories(long id, Categories categories){
        //if(categoriesRepository.existsById(categories.getId())){
            Categories cat = categoriesRepository.findById(id).get();

            cat.setName(categories.getName());
            categoriesRepository.save(cat);
            //categoriesRepository.insert(categories);
            //return true;
        //}
        //else return false;
    }

    @Override
    public List<Categories> getSize() {
        return categoriesRepository.findAll();
    }
}

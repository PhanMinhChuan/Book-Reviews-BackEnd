package Ibook.Review.demo.service.impl;

import Ibook.Review.demo.entity.Categories;
import Ibook.Review.demo.repository.CategoriesRepository;
import Ibook.Review.demo.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImlp implements CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    public Categories getCategories(long id){
        return categoriesRepository.findById(id).get();
    }

    public List<Categories> getAllCategories(){
        return categoriesRepository.findAll();
    }

    public boolean addCategories(Categories categories){
        if(!categoriesRepository.existsByName(categories.getName())) {
            categories.setId(categoriesRepository.count());
            categoriesRepository.save(categories);
            return true;
        }
        else return false;
    }

    public boolean deleteCategories(long id){
        if(categoriesRepository.existsById(id)){
            categoriesRepository.deleteById(id);
            return true;
        }
        else return false;
    }

    public boolean updateCategories(Categories categories){
        if(categoriesRepository.existsById(categories.getId())){
            categoriesRepository.insert(categories);
            return true;
        }
        else return false;
    }
}

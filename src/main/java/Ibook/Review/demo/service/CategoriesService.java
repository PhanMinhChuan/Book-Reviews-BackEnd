package Ibook.Review.demo.service;

import Ibook.Review.demo.entity.Categories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoriesService {
    public Categories getCategories(long id);

    public List<Categories> getAllCategories();

    public boolean addCategories(Categories categories);

    public boolean deleteCategories(long id);

    public boolean updateCategories(Categories categories);
}

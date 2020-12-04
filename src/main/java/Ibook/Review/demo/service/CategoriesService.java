package Ibook.Review.demo.service;

import Ibook.Review.demo.entity.Categories;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoriesService {

    public Categories getCatById(long id);

    public Page<Categories> getAllCategories(Integer page, Integer size);

    public void addCategories(Categories categories);

    public boolean deleteCategories(long id);

    public void updateCategories(long id, Categories categories);

    List<Categories> getSize();
}

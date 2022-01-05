package com.probal.app.service;


import com.probal.app.dao.CategoryDao;
import com.probal.app.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public void saveCategoryToDb(Category category) {
        categoryDao.save(category);
    }

    public List<Category> getAllCategories() {
        return categoryDao.findAll();
    }

    public Category findCategoryById(Long catId) throws Exception {
        Category category =  categoryDao.findById(catId).orElseThrow(() -> new Exception("Category does not exist with this" + catId));
        return category;
    }
}

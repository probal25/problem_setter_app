package com.probal.app.controller;


import com.probal.app.model.Category;
import com.probal.app.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addCategoryView(Model model) {
        model.addAttribute("category", new Category());
        return "Category/category_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addCategory(@ModelAttribute Category category) {
        categoryService.saveCategoryToDb(category);
        return "redirect:/category/list";
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String categoryListView(Model model) {
        List<Category> categoryList = categoryService.getAllCategories();
        model.addAttribute("category_list", categoryList);
        return "Category/category_list";
    }

    @RequestMapping(value = "/view/{id}")
    public String categoryViewById(@PathVariable("id") Long catId, Model model) throws Exception {
        Category category = categoryService.findCategoryById(catId);
        model.addAttribute("category", category);
        return "Category/category_view";
    }


}

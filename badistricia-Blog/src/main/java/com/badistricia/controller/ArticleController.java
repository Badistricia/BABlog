package com.badistricia.controller;

import com.badistricia.domain.entity.Article;
import com.badistricia.domain.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author badistricia
 * @version 1.0
 * @description :
 * @date 2022/7/28 21:59:41
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    ArticleService articleService;
    @RequestMapping(value= "/list",method = RequestMethod.GET)
    public List<Article> test(){
        return articleService.list();
    }
}

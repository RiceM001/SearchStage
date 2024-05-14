package com.yupi.springbootinit.controller;

import com.yupi.springbootinit.model.vo.SearchVO;
import com.yupi.springbootinit.service.PictureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.naming.directory.SearchResult;
import java.util.List;

@RestController
@RequestMapping("/search")
@Slf4j
public class SearchContorller {

    @Resource
    private PictureService pictureService;

    @PostMapping("/all")
    public List<SearchVO> searchAll(SearchResult searchResult){

    }
}

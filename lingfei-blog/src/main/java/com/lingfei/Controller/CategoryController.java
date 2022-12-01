package com.lingfei.Controller;

import com.lingfei.domain.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lingfei Wang
 * @version 1.0
 * @date 2022/12/1 21:19
 * @Decription:
 */


@RestController
@RequestMapping("/categoty")
public class CategoryController {

    @Autowired
    private CategotyService categotyService;

    @GetMapping("/getCategoryList")
    public ResponseResult getCategoryList(){
        return categotyService.getCategoryList();
    }
}

package com.mazhq.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.mazhq.web.dao.UserAuthDao;
import com.mazhq.web.entity.UserAuthEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

/**
 * @author mazhq
 * @Title: UserAuthController
 * @ProjectName: zeus
 * @Description: TODO
 * @date 2019/8/1 17:18
 */
@Controller
@RequestMapping("/user")
public class UserAuthController {
    @Autowired
    private UserAuthDao userAuthDao;
    
    @RequestMapping("/studentAdd")
    public String indexTeacher(){
        return "student-add";
    }

    @RequestMapping(value="save",method=RequestMethod.POST)
    @ResponseBody
    public String save(){
        for (int i=0;i<40;i++) {
            UserAuthEntity userAuthEntity = new UserAuthEntity();
            userAuthEntity.setUserId((long)i);
            userAuthEntity.setAddDate(new Date());
            userAuthEntity.setEmail("test"+i+"@163.com");
            userAuthEntity.setPassword("123456");
            userAuthEntity.setPhone("1388888888"+i);
            Random r = new Random();
            userAuthEntity.setRemark(""+r.nextInt(100));
            userAuthDao.save(userAuthEntity);
        }
        return "success";
    }

    @RequestMapping("select")
    @ResponseBody
    public String select(){
        return JSONObject.toJSONString(userAuthDao.findAll(Sort.by(Sort.Order.desc("remark"))));
    }
    @RequestMapping("selectbyid")
    @ResponseBody
    public String selectbyid(Long id){
        return JSONObject.toJSONString(userAuthDao.findById(id));
    }
    @RequestMapping("page")
    @ResponseBody
    public String page(Long id){
    	Page<UserAuthEntity> users = userAuthDao.findAll(new PageRequest(1, 20));
        return JSONObject.toJSONString(users);
    }
}

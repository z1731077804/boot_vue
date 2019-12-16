package com.by.controller;

import com.by.entity.TStu;
import com.by.service.TStuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TStu)表控制层
 *
 * @author makejava
 * @since 2019-12-12 20:40:51
 */
@Controller
@RequestMapping("vue")
public class TStuController {
    /**
     * 服务对象
     */
    @Resource
    private TStuService tStuService;

    @RequestMapping("list")
    public String list(){
        return "list";
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TStu selectOne(Integer id) {
        return this.tStuService.queryById(id);
    }

    @ResponseBody
    @RequestMapping("findAll")
    public List<TStu> findAll(){
        List<TStu> tStus = this.tStuService.queryAllByLimit(0, 1000);
        return tStus;
    }

    @ResponseBody
    @RequestMapping("deleteById")
    public void deleteById(Integer id){
        boolean b = this.tStuService.deleteById(id);
    }

    @ResponseBody
    @RequestMapping("add")
    public void add(TStu tStu){
        this.tStuService.insert(tStu);
    }

    @ResponseBody
    @RequestMapping("update")
    public void update(TStu tStu){
        this.tStuService.update(tStu);
    }

}
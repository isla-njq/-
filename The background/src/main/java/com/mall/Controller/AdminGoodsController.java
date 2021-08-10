package com.mall.Controller;

/*
@author 
@create 2021-07-19-13:27
@Request
*/


import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mall.Service.ICategoryService;
import com.mall.Service.IGoodsService;
import com.mall.Service.IStoresService;
import com.mall.entity.Category;
import com.mall.entity.Goods;
import com.mall.entity.ResultMap;
import com.mall.entity.Stores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RequestMapping("/admin/goods")
@Controller

public class AdminGoodsController {

    @Resource
    private IGoodsService goodsService;
    @Resource
    private ICategoryService categoryService;
    @Resource
    private IStoresService storesService;


    @RequestMapping(value = "/list",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String list(Model model) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<Goods> goodsList = goodsService.list();
        //model.addAttribute("goodsList",goodsList);
        String str = mapper.writeValueAsString(goodsList);
        return str;
    }


    /*@RequestMapping("/list")
    public String list(Model model){
        List<Goods> goodsList = goodsService.list();
        model.addAttribute("goodsList",goodsList);
        return "/admin/goods_list";
    }*/

    /*@RequestMapping("/add_show")
    public String add_show(Model model){
        List<Category> categoryList = categoryService.list();
        model.addAttribute("categoryList",categoryList);
        return "/admin/goods_add";
    }*/
    @RequestMapping(value = "/add_show",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String add_show(Model model) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<Goods> goodsList = goodsService.list();
        model.addAttribute("goodsList",goodsList);
        String str = mapper.writeValueAsString(model);
        return str;
    }





    @RequestMapping(value = "/add_submit",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String add_submit(Goods goods, MultipartFile file) throws JsonProcessingException {
        String imgFile = null;
        if(file.isEmpty()){
            imgFile="/img/mr.jpg";
        }
        else{
            String newFile =  UUID.randomUUID()+"-"+file.getOriginalFilename();
            File f = new File("C:/proj_img",newFile);
            if(!f.getParentFile().exists()){
                f.mkdirs();
            }
            try{
                file.transferTo(f);
                imgFile="C:/proj_img/upfile/"+newFile;
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        goods.setGoodsPicture(imgFile);
        goodsService.insert(goods);
        ObjectMapper mapper = new ObjectMapper();
        List<Goods> goodsList = goodsService.list();
        String str = mapper.writeValueAsString(goodsList);
        return  str;

    }



    /*@RequestMapping("/update_show")
    public String update_show(Integer goodsId,Model model){
        Goods goods = goodsService.find(goodsId);
        List<Category> categoryList = categoryService.list();
        model.addAttribute("goods",goods);
        model.addAttribute("categoryList",categoryList);
        return "/admin/goods_update";
    }*/

    @RequestMapping(value = "/update_show",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String update_show(Integer goodsId,Model model) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Goods goods = goodsService.find(goodsId);
        List<Category> categoryList = categoryService.list();
        model.addAttribute("goods",goods);
        model.addAttribute("categoryList",categoryList);
        String str = mapper.writeValueAsString(model);
        return str;
    }


    /*@RequestMapping("/update_submit")
    public String update_submit(Goods goods, MultipartFile file) {
        if(!file.isEmpty()){
            String newFile =  UUID.randomUUID()+"-"+file.getOriginalFilename();
            File f = new File("C:/proj_img",newFile);
            if(!f.getParentFile().exists()){
                f.mkdirs();
            }
            try{
                file.transferTo(f);
                goods.setGoodsPicture("/upfile/"+newFile);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        goodsService.update(goods);
        return  "redirect:/admin/goods/list";
    }*/
    @RequestMapping(value = "/update_submit",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String update_submit(Goods goods, MultipartFile file)throws JsonProcessingException{
        if(!file.isEmpty()){
            String newFile =  UUID.randomUUID()+"-"+file.getOriginalFilename();
            File f = new File("C:/proj_img",newFile);
            if(!f.getParentFile().exists()){
                f.mkdirs();
            }
            try{
                file.transferTo(f);
                goods.setGoodsPicture("/upfile/"+newFile);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        goodsService.update(goods);
        ObjectMapper mapper = new ObjectMapper();
        List<Goods> goodsList = goodsService.list();
        String str = mapper.writeValueAsString(goodsList);
        return str;
    }



    @RequestMapping(value = "/findstoresName",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String findstoresName(Integer storesId) throws JsonProcessingException{
        Stores stores = storesService.find(storesId);
        ObjectMapper mapper = new ObjectMapper();
        String str=mapper.writeValueAsString(stores.getStoresName());
        return str;
    }

    @RequestMapping(value = "/findstoresgoods",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String findstoresgoods(Integer storesId,Model model) throws JsonProcessingException{
        ObjectMapper mapper=new ObjectMapper();
        List<Goods>storesgoodsList = goodsService.storesgoods(1);
        model.addAttribute("storesgoodsList",storesgoodsList);
        String str=mapper.writeValueAsString(model);
        return str;
    }
}

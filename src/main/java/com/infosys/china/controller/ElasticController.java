/**
* 文件名：ElasticController.java
* 版权：Company Technologies Co.,Ltd.Copyright YYYY-YYYY,All rights reserved
* 版权：Copyright (c) 2020, jia2040020@126.com All Rights Reserved.
* 描述：<描述>
* 修改人：Administrator
* 修改时间：2020年4月6日
* 修改内容：<修改内容>
*/
package com.infosys.china.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.china.bean.DocBean;
import com.infosys.china.service.IElasticService;

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author Jiayoubing
* @version [版本号,2020年4月6日]
* @see [相关类/方法]
* @since [产品/模块版本]
*/
@RestController
@RequestMapping("/elastic")
public class ElasticController
{
    @Autowired
    private IElasticService elasticService;

    @GetMapping("/init")
    public void init(){
        elasticService.createIndex();
        List<DocBean> list =new ArrayList<DocBean>();
        list.add(new DocBean(1L,"XX0193","XX8064","xxxxxx",1));
        list.add(new DocBean(2L,"XX0210","XX7475","xxxxxxxxxx",1));
        list.add(new DocBean(3L,"XX0257","XX8097","xxxxxxxxxxxxxxxxxx",1));
        elasticService.saveAll(list);

    }

    @GetMapping("/all")
    public Iterator<DocBean> all(){
        return elasticService.findAll();
    }

}

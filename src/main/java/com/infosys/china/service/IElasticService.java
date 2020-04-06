/**
* 文件名：IElasticService.java
* 版权：Company Technologies Co.,Ltd.Copyright YYYY-YYYY,All rights reserved
* 版权：Copyright (c) 2020, jia2040020@126.com All Rights Reserved.
* 描述：<描述>
* 修改人：Administrator
* 修改时间：2020年4月6日
* 修改内容：<修改内容>
*/
package com.infosys.china.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.data.domain.Page;

import com.infosys.china.bean.DocBean;

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author Jiayoubing
* @version [版本号,2020年4月6日]
* @see [相关类/方法]
* @since [产品/模块版本]
*/
public interface IElasticService
{
    void createIndex();

    void deleteIndex(String index);

    void save(DocBean docBean);

    void saveAll(List<DocBean> list);

    Iterator<DocBean> findAll();

    Page<DocBean> findByContent(String content);

    Page<DocBean> findByFirstCode(String firstCode);

    Page<DocBean> findBySecordCode(String secordCode);

    Page<DocBean> query(String key);

}

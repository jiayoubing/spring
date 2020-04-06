/**
 * 文件名：ElasticServiceImpl.java 版权：Company Technologies Co.,Ltd.Copyright
 * YYYY-YYYY,All rights reserved 版权：Copyright (c) 2020, jia2040020@126.com All
 * Rights Reserved. 描述：<描述> 修改人：Administrator 修改时间：2020年4月6日 修改内容：<修改内容>
 */
package com.infosys.china.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

import com.infosys.china.bean.DocBean;
import com.infosys.china.dao.ElasticRepository;
import com.infosys.china.service.IElasticService;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Jiayoubing
 * @version [版本号,2020年4月6日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Service("elasticService")
public class ElasticServiceImpl implements IElasticService
{
    @Autowired
    private ElasticsearchRestTemplate elasticsearchTemplate;

    @Autowired
    private ElasticRepository elasticRepository;

    private Pageable pageable = PageRequest.of(0, 10);

    public void createIndex()
    {
        elasticsearchTemplate.createIndex(DocBean.class);
    }

    public void deleteIndex(String index)
    {
        elasticsearchTemplate.deleteIndex(index);
    }

    public void save(DocBean docBean)
    {
        elasticRepository.save(docBean);
    }

    public void saveAll(List<DocBean> list)
    {
        elasticRepository.saveAll(list);
    }

    public Iterator<DocBean> findAll()
    {
        return elasticRepository.findAll().iterator();
    }

    public Page<DocBean> findByContent(String content)
    {
        // TODO Auto-generated method stub
        return null;
    }

    public Page<DocBean> findByFirstCode(String firstCode)
    {
        // TODO Auto-generated method stub
         return elasticRepository.findByContent(firstCode,pageable);
    }

    public Page<DocBean> findBySecordCode(String secordCode)
    {
        // TODO Auto-generated method stub
        return elasticRepository.findBySecordCode(secordCode, pageable);
    }

    public Page<DocBean> query(String key)
    {
        // TODO Auto-generated method stub
        return elasticRepository.findByContent(key, pageable);
    }

   

}

/**
 * 文件名：DocBean.java 版权：Company Technologies Co.,Ltd.Copyright YYYY-YYYY,All
 * rights reserved 版权：Copyright (c) 2020, jia2040020@126.com All Rights
 * Reserved. 描述：<描述> 修改人：Administrator 修改时间：2020年4月6日 修改内容：<修改内容>
 */
package com.infosys.china.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Jiayoubing
 * @version [版本号,2020年4月6日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@NoArgsConstructor
@Accessors(chain = true)
@Document(indexName = "ems",type = "_doc", shards = 1, replicas = 0)
public class DocBean
{
    @Id
    private Long id;

    @Field(type = FieldType.Keyword)
    private String firstCode;

    @Field(type = FieldType.Keyword)
    private String secordCode;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String content;

    @Field(type = FieldType.Integer)
    private Integer type;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getFirstCode()
    {
        return firstCode;
    }

    public void setFirstCode(String firstCode)
    {
        this.firstCode = firstCode;
    }

    public String getSecordCode()
    {
        return secordCode;
    }

    public void setSecordCode(String secordCode)
    {
        this.secordCode = secordCode;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public Integer getType()
    {
        return type;
    }

    public void setType(Integer type)
    {
        this.type = type;
    }

    public DocBean(Long id, String firstCode, String secordCode, String content, Integer type)
    {
        this.id = id;
        this.firstCode = firstCode;
        this.secordCode = secordCode;
        this.content = content;
        this.type = type;
    }

}

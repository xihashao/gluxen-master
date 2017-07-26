package com.gluxen.jgx.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.gluxen.jgx.dao.mapper.CmsArticleTagMapper;
import com.gluxen.jgx.dao.model.CmsArticleTag;
import com.gluxen.jgx.dao.model.CmsArticleTagExample;
import com.gluxen.jgx.rpc.api.CmsArticleTagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsArticleTagService实现
* Created by shuzheng on 2017/7/26.
*/
@Service
@Transactional
@BaseService
public class CmsArticleTagServiceImpl extends BaseServiceImpl<CmsArticleTagMapper, CmsArticleTag, CmsArticleTagExample> implements CmsArticleTagService {

    private static Logger _log = LoggerFactory.getLogger(CmsArticleTagServiceImpl.class);

    @Autowired
    CmsArticleTagMapper cmsArticleTagMapper;

}
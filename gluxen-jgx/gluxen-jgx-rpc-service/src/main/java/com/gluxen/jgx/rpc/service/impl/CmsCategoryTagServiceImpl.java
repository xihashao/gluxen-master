package com.gluxen.jgx.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.gluxen.jgx.dao.mapper.CmsCategoryTagMapper;
import com.gluxen.jgx.dao.model.CmsCategoryTag;
import com.gluxen.jgx.dao.model.CmsCategoryTagExample;
import com.gluxen.jgx.rpc.api.CmsCategoryTagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsCategoryTagService实现
* Created by shuzheng on 2017/7/26.
*/
@Service
@Transactional
@BaseService
public class CmsCategoryTagServiceImpl extends BaseServiceImpl<CmsCategoryTagMapper, CmsCategoryTag, CmsCategoryTagExample> implements CmsCategoryTagService {

    private static Logger _log = LoggerFactory.getLogger(CmsCategoryTagServiceImpl.class);

    @Autowired
    CmsCategoryTagMapper cmsCategoryTagMapper;

}
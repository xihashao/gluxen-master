package com.gluxen.jgx.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.gluxen.jgx.dao.mapper.UpmsSystemMapper;
import com.gluxen.jgx.dao.model.UpmsSystem;
import com.gluxen.jgx.dao.model.UpmsSystemExample;
import com.gluxen.jgx.rpc.api.UpmsSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsSystemService实现
* Created by shuzheng on 2017/7/26.
*/
@Service
@Transactional
@BaseService
public class UpmsSystemServiceImpl extends BaseServiceImpl<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

    private static Logger _log = LoggerFactory.getLogger(UpmsSystemServiceImpl.class);

    @Autowired
    UpmsSystemMapper upmsSystemMapper;

}
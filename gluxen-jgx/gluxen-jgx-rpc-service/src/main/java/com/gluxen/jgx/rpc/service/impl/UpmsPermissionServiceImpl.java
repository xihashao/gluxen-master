package com.gluxen.jgx.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.gluxen.jgx.dao.mapper.UpmsPermissionMapper;
import com.gluxen.jgx.dao.model.UpmsPermission;
import com.gluxen.jgx.dao.model.UpmsPermissionExample;
import com.gluxen.jgx.rpc.api.UpmsPermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsPermissionService实现
* Created by shuzheng on 2017/7/26.
*/
@Service
@Transactional
@BaseService
public class UpmsPermissionServiceImpl extends BaseServiceImpl<UpmsPermissionMapper, UpmsPermission, UpmsPermissionExample> implements UpmsPermissionService {

    private static Logger _log = LoggerFactory.getLogger(UpmsPermissionServiceImpl.class);

    @Autowired
    UpmsPermissionMapper upmsPermissionMapper;

}
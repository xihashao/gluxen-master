package com.gluxen.jgx.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.gluxen.jgx.dao.mapper.UpmsRolePermissionMapper;
import com.gluxen.jgx.dao.model.UpmsRolePermission;
import com.gluxen.jgx.dao.model.UpmsRolePermissionExample;
import com.gluxen.jgx.rpc.api.UpmsRolePermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsRolePermissionService实现
* Created by shuzheng on 2017/7/26.
*/
@Service
@Transactional
@BaseService
public class UpmsRolePermissionServiceImpl extends BaseServiceImpl<UpmsRolePermissionMapper, UpmsRolePermission, UpmsRolePermissionExample> implements UpmsRolePermissionService {

    private static Logger _log = LoggerFactory.getLogger(UpmsRolePermissionServiceImpl.class);

    @Autowired
    UpmsRolePermissionMapper upmsRolePermissionMapper;

}
package com.gluxen.jgx.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.gluxen.jgx.dao.mapper.UpmsUserMapper;
import com.gluxen.jgx.dao.model.UpmsUser;
import com.gluxen.jgx.dao.model.UpmsUserExample;

/**
* 降级实现UpmsUserService接口
* Created by shuzheng on 2017/7/26.
*/
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

}

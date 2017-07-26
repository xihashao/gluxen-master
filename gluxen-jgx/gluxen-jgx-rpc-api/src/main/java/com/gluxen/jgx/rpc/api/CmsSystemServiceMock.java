package com.gluxen.jgx.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.gluxen.jgx.dao.mapper.CmsSystemMapper;
import com.gluxen.jgx.dao.model.CmsSystem;
import com.gluxen.jgx.dao.model.CmsSystemExample;

/**
* 降级实现CmsSystemService接口
* Created by shuzheng on 2017/7/26.
*/
public class CmsSystemServiceMock extends BaseServiceMock<CmsSystemMapper, CmsSystem, CmsSystemExample> implements CmsSystemService {

}

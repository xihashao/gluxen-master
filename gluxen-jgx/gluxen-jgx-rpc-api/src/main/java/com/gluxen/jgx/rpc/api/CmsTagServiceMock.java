package com.gluxen.jgx.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.gluxen.jgx.dao.mapper.CmsTagMapper;
import com.gluxen.jgx.dao.model.CmsTag;
import com.gluxen.jgx.dao.model.CmsTagExample;

/**
* 降级实现CmsTagService接口
* Created by shuzheng on 2017/7/26.
*/
public class CmsTagServiceMock extends BaseServiceMock<CmsTagMapper, CmsTag, CmsTagExample> implements CmsTagService {

}

package com.gluxen.jgx.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.gluxen.jgx.dao.mapper.CmsPageMapper;
import com.gluxen.jgx.dao.model.CmsPage;
import com.gluxen.jgx.dao.model.CmsPageExample;

/**
* 降级实现CmsPageService接口
* Created by shuzheng on 2017/7/26.
*/
public class CmsPageServiceMock extends BaseServiceMock<CmsPageMapper, CmsPage, CmsPageExample> implements CmsPageService {

}

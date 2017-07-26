package com.gluxen.jgx.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.gluxen.jgx.dao.mapper.CmsCategoryMapper;
import com.gluxen.jgx.dao.model.CmsCategory;
import com.gluxen.jgx.dao.model.CmsCategoryExample;

/**
* 降级实现CmsCategoryService接口
* Created by shuzheng on 2017/7/26.
*/
public class CmsCategoryServiceMock extends BaseServiceMock<CmsCategoryMapper, CmsCategory, CmsCategoryExample> implements CmsCategoryService {

}

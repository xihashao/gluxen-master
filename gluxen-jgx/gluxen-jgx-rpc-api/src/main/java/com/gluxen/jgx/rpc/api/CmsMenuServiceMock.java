package com.gluxen.jgx.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.gluxen.jgx.dao.mapper.CmsMenuMapper;
import com.gluxen.jgx.dao.model.CmsMenu;
import com.gluxen.jgx.dao.model.CmsMenuExample;

/**
* 降级实现CmsMenuService接口
* Created by shuzheng on 2017/7/26.
*/
public class CmsMenuServiceMock extends BaseServiceMock<CmsMenuMapper, CmsMenu, CmsMenuExample> implements CmsMenuService {

}

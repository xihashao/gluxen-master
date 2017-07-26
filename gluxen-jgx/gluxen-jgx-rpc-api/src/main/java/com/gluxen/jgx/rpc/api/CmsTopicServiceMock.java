package com.gluxen.jgx.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.gluxen.jgx.dao.mapper.CmsTopicMapper;
import com.gluxen.jgx.dao.model.CmsTopic;
import com.gluxen.jgx.dao.model.CmsTopicExample;

/**
* 降级实现CmsTopicService接口
* Created by shuzheng on 2017/7/26.
*/
public class CmsTopicServiceMock extends BaseServiceMock<CmsTopicMapper, CmsTopic, CmsTopicExample> implements CmsTopicService {

}

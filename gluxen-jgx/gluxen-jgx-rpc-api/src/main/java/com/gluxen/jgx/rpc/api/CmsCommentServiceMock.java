package com.gluxen.jgx.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.gluxen.jgx.dao.mapper.CmsCommentMapper;
import com.gluxen.jgx.dao.model.CmsComment;
import com.gluxen.jgx.dao.model.CmsCommentExample;

/**
* 降级实现CmsCommentService接口
* Created by shuzheng on 2017/7/26.
*/
public class CmsCommentServiceMock extends BaseServiceMock<CmsCommentMapper, CmsComment, CmsCommentExample> implements CmsCommentService {

}

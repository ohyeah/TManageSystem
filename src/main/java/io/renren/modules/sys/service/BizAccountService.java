package io.renren.modules.sys.service;

import io.renren.modules.sys.entity.BizGoodsEntity;

import java.util.List;
import java.util.Map;

public interface BizAccountService {

    List<BizGoodsEntity> queryAllGoods(Map<String, Object> paras);
}

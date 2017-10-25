package io.renren.modules.sys.controller;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;
import io.renren.modules.sys.entity.BizGoodsEntity;
import io.renren.modules.sys.service.BizAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/biz/account")
public class BizManageController extends AbstractController {
    @Autowired
    private BizAccountService bizAccountService;

    @RequestMapping("/list")
    public R queryAllAccounts(@RequestParam Map<String, Object> params) {
        Query query = new Query(params);

        List<BizGoodsEntity> list = bizAccountService.queryAllGoods(query);
        PageUtils page = new PageUtils(list, list.size(), query.getLimit(), query.getPage());
        return R.ok().put("page", page);
    }
}

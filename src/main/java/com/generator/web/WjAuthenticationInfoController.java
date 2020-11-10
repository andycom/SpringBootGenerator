package com.generator.web;
import com.generator.core.Result;
import com.generator.util.ResultUtil;
import com.generator.model.WjAuthenticationInfo;
import com.generator.service.WjAuthenticationInfoService;
import com.generator.input.WjAuthenticationInfoInput;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* Created by @hamish on 2020/11/10.
*/
@RestController
@RequestMapping("/wj_authentication_info")
@Api(tags = "WjAuthenticationInfo")
public class WjAuthenticationInfoController {
    @Resource
    private WjAuthenticationInfoService wjAuthenticationInfoService;

    /**
    * 增加
    * @param wjAuthenticationInfo
    * @return
    */
    @PostMapping("/add")
    public Result add(@RequestBody WjAuthenticationInfo wjAuthenticationInfo) {
        wjAuthenticationInfoService.add(wjAuthenticationInfo);
        return ResultUtil.success();
    }

    /**
    * 删除
    * @param id
    * @return
    */
    @PostMapping("/delete")
    public Result delete(@RequestParam Long id) {
        wjAuthenticationInfoService.deleteById(id);
        return ResultUtil.success();
    }

    /**
    * 修改
    * @param wjAuthenticationInfo
    * @return
    */
    @PostMapping("/update")
    public Result update(@RequestBody WjAuthenticationInfo wjAuthenticationInfo) {
        wjAuthenticationInfoService.update(wjAuthenticationInfo);
        return ResultUtil.success();
    }

    /**
    * 通过id查找
    * @param id
    * @return
    */
    @PostMapping("/detail")
    public Result detail(@RequestParam Long id) {
        WjAuthenticationInfo wjAuthenticationInfo = wjAuthenticationInfoService.selectById(id);
        return ResultUtil.success(wjAuthenticationInfo);
    }

    /**
    * 分页查找
    * @param input 输入对象
    * @return
    */
    @PostMapping("/list")
    public Result list(@RequestBody WjAuthenticationInfoInput input) {
        PageInfo<WjAuthenticationInfo> pageInfo = wjAuthenticationInfoService.selectByInput(input);
        return ResultUtil.success(pageInfo);
    }
}

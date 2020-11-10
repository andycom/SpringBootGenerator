package com.generator.service;
import com.generator.model.WjAuthenticationInfo;
import com.generator.input.WjAuthenticationInfoInput;
import com.github.pagehelper.PageInfo;

/**
* Created by @hamish on 2020/11/10.
*/
public interface WjAuthenticationInfoService {

    /**
    * 增加
    * @param wjAuthenticationInfo
    */
    void add(WjAuthenticationInfo wjAuthenticationInfo);

    /**
    * 通过id删除
    * @param wjAuthenticationInfoId
    */
    void deleteById(Long wjAuthenticationInfoId);

    /**
    * 修改
    * @param wjAuthenticationInfo
    */
    void update(WjAuthenticationInfo wjAuthenticationInfo);

    /**
    * 通过id查找
    * @param wjAuthenticationInfoId
    * @return
    */
    WjAuthenticationInfo selectById(Long wjAuthenticationInfoId);

    /**
    * 通过输入参数分页查找
    * @param wjAuthenticationInfoInput
    * @return
    */
    PageInfo<WjAuthenticationInfo> selectByInput(WjAuthenticationInfoInput wjAuthenticationInfoInput);

}

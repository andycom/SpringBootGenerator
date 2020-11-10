package com.generator.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.generator.dao.WjAuthenticationInfoMapper;
import com.generator.input.WjAuthenticationInfoInput;
import com.generator.model.WjAuthenticationInfo;
import com.generator.model.WjAuthenticationInfoExample;
import com.generator.service.WjAuthenticationInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
* Created by @hamish on 2020/11/10.
*/
@Service
@Transactional(readOnly = true)
public class WjAuthenticationInfoServiceImpl implements WjAuthenticationInfoService {

    @Resource
    private WjAuthenticationInfoMapper wjAuthenticationInfoMapper;

    @Transactional
    @Override
    public void add(WjAuthenticationInfo wjAuthenticationInfo) {
        wjAuthenticationInfoMapper.insert(wjAuthenticationInfo);
    }

    @Transactional
    @Override
    public void deleteById(Long wjAuthenticationInfoId) {
        wjAuthenticationInfoMapper.deleteByPrimaryKey(wjAuthenticationInfoId);
    }

    @Transactional
    @Override
    public void update(WjAuthenticationInfo wjAuthenticationInfo) {
        wjAuthenticationInfoMapper.updateByPrimaryKey(wjAuthenticationInfo);
    }

    @Override
    public WjAuthenticationInfo selectById(Long wjAuthenticationInfoId) {
        return wjAuthenticationInfoMapper.selectByPrimaryKey(wjAuthenticationInfoId);
    }

    @Override
    public PageInfo<WjAuthenticationInfo> selectByInput(WjAuthenticationInfoInput wjAuthenticationInfoInput) {
        WjAuthenticationInfoExample example=new WjAuthenticationInfoExample();

        WjAuthenticationInfoExample.Criteria criteria=example.createCriteria();

        //条件查询
        if(wjAuthenticationInfoInput.getKeywords()!=null&&!wjAuthenticationInfoInput.getKeywords().equals("")){

        }

        PageHelper.startPage(wjAuthenticationInfoInput.getPageNum(),wjAuthenticationInfoInput.getPageSize());

        List<WjAuthenticationInfo> list=wjAuthenticationInfoMapper.selectByExample(example);

        return new PageInfo<>(list);
    }
}

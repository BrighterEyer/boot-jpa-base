package cn.huanzi.qch.springbootsecurity.sys.service;

import cn.huanzi.qch.springbootsecurity.common.pojo.Result;
import cn.huanzi.qch.springbootsecurity.common.service.CommonService;
import cn.huanzi.qch.springbootsecurity.sys.pojo.SysUserAuthority;
import cn.huanzi.qch.springbootsecurity.sys.vo.SysUserAuthorityVo;

import java.util.List;

public interface SysUserAuthorityService extends CommonService<SysUserAuthorityVo, SysUserAuthority, String> {
    Result<List<SysUserAuthorityVo>> findByUserId(String userId);
}

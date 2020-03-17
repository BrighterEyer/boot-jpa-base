package cn.huanzi.qch.springbootsecurity.sys.repository;

import cn.huanzi.qch.springbootsecurity.common.repository.*;
import cn.huanzi.qch.springbootsecurity.sys.pojo.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository extends CommonRepository<SysUser, String> {
    SysUser findByLoginName(String username);
}

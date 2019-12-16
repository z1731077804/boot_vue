package com.by.service;

import com.by.entity.TStu;
import java.util.List;

/**
 * (TStu)表服务接口
 *
 * @author makejava
 * @since 2019-12-12 20:40:51
 */
public interface TStuService {

    /**
     * 通过ID查询单条数据
     *
     * @param stuId 主键
     * @return 实例对象
     */
    TStu queryById(Integer stuId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TStu> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tStu 实例对象
     * @return 实例对象
     */
    TStu insert(TStu tStu);

    /**
     * 修改数据
     *
     * @param tStu 实例对象
     * @return 实例对象
     */
    TStu update(TStu tStu);

    /**
     * 通过主键删除数据
     *
     * @param stuId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer stuId);

}
package com.macro.mall;

import com.macro.mall.mapper.PmsBrandMapper;
import com.macro.mall.model.PmsBrand;
import com.macro.mall.model.PmsBrandExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author VeniVeci
 * @program: mall
 * @description:
 * @date: 2023/11/5
 */
@SpringBootTest()
public class testExample {
    @Autowired
    PmsBrandMapper pmsBrandMapper;
    @Test
    public void test() {
        PmsBrandExample pmsBrandExample = new PmsBrandExample();
        pmsBrandExample.setOrderByClause("first_letter asc");
        pmsBrandExample.setDistinct(true);
////        pmsBrandExample.getOredCriteria().add()
        List<PmsBrand> brands = pmsBrandMapper.selectByExample(pmsBrandExample);
        System.out.println(brands.size());
        System.out.println(brands);
    }
}

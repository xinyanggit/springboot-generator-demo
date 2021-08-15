package com.yx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** 测试web endPoint
 * @author yangxin
 * @create 2021-08-15 3:59 下午
 */
@RestController
public class IndexController {

    /**
     * 测试案例
     * @param index
     * @return
     */
    @GetMapping("/index")
    public String index(@RequestParam("index") String index) {
        return index;
    }
}

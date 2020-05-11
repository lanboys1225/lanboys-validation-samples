package com.bing.lan.validation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Data;

/**
 * Created by lb on 2020/5/11.
 */

@Data
public class User {

    @NotBlank(message = "用户名不能为空")
    private String name;
    @Min(value = 18, message = "未成年不许进入")
    private Integer age;
}

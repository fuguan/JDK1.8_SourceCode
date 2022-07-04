package com.ber.learn.arrayList.model;

import java.io.*;
import java.util.ArrayList;

/**
 * @author: ber
 * @date: 2022/7/4 0004 11:09
 * -------------------------------
 * Github：https://github.com/berbai
 * Blog：https://blog.csdn.net/Ber_Bai
 */
public class User implements Serializable {
    /**
     * 类的序列化由实现`java.io.Serializable`接口的类启用。
     * 不实现此接口的类将不会使任何状态序列化或反序列化。
     * 可序列化类的所有子类型都是可序列化的。
     * 序列化接口没有方法或字段，仅用于标识可串行化的语义。
     */
    public final long serialVersionUID = 1510141000893066237L;

    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append("name = ").append(this.name).append(", ").append("age = ").append(this.age).append("]");
        return sb.toString();
    }
}



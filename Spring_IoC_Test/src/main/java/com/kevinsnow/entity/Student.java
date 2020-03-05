package com.kevinsnow.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//@Data：作用于类上，是以下注解的集合：@ToString @EqualsAndHashCode @Getter @Setter @RequiredArgsConstructor

//@NoArgsConstructor：生成无参构造器；

//@RequiredArgsConstructor：生成包含final和@NonNull注解的成员变量的构造器；

//@AllArgsConstructor：生成全参构造器


@Data @NoArgsConstructor @AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private Address address;
    private List<Address> addresses;

//    构建一个不带List<Address> addresses的带参构造，满足springTest中  “2.通过有参构造创建 bean”  的测试需求
    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

package com.ZinKo.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
   private Integer id;
   private String name;
   private String phone;
   private String email;


   
}

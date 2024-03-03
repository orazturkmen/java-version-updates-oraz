package com.cydeo.review;

import lombok.*;
@Data
//@Getter
//@Setter
//@ToString
@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor
@Builder
public class Car {
    private final String brand;
    private int toSpeed;
    private int year;
}

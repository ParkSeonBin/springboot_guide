package com.springboot.valid_exception.data.dto;

import lombok.*;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ValidRequestDto {

    @NotBlank
    String name;

    @Email
    String email;

    @Pattern(regexp = "01(?:0|1|[6-9])[.-]?(\\d{3}|\\d{4})[.-]?(\\d{4})$")
    //@Telephone
    private String phoneNumber;

    // DecimalMin(value = "$numberString") : $numberString 이상의 값을 허용
    // DecimalMax(value = "$numberString") : $numberString 이하의 값을 허용
    // @Min(value = $number) : $number 이상의 값을 허용
    // @Max(value = $number) : $number 이하의 값을 허용
    @Min(value = 20)
    @Max(value = 40)
    private int age;

    // @Size(min = $minNumber, max = $maxNumber) : 문자열의 길이를 제한
    @Size(min = 0, max = 40)
    private String description;

    // @Positive : 양수를 허용
    // @PositiveOrZero : 0을 포함한 양수를 허용
    // @Negative : 음수를 허용
    // @NegativeOrZero : 0을 포함한 음수를 허용
    @Positive
    private int count;

    // @AssertTrue : true 체크, null 값은 체크하지 않음
    // @AssertFalse : false 체크, null 값은 체크하지 않음
    @AssertTrue
    private boolean booleanCheck;

    // @Future : 현재보다 미래의 날짜를 허용
    // @FutureOrPresent : 현재를 포함한 미래의 날짜를 허용
    // @Past : 현재보다 과거의 날짜를 허용
    // @PastOrPresent : 현재를 포함한 과거의 날짜를 허용
    // Date birthDay;

    // @Digits : 수치의 범위를 설정합니다.
    // private Integer digits;
}

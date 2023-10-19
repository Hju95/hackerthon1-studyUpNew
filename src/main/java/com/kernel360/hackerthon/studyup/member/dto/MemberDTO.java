package com.kernel360.hackerthon.studyup.member.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class MemberDTO {
    private Long memberId;
    private String email;
    private String name;
    private String nickname;
    private String phoneNumber;
    private Character gender;
    private String password;
    private String introduction;
    private Short profession;
    private Integer experienceYear;
    private LocalDateTime registrationDate;
    private LocalDateTime withdrawalDate;
    private String socialId;
    private String socialPlatform;

    // 기본 생성자
    public MemberDTO() {}

    // Hibernate가 요구하는 생성자
    public MemberDTO(long memberId, String email, String name) {
        this.memberId = memberId;
        this.email = email;
        this.name = name;
    }

    // 모든 필드를 파라미터로 갖는 생성자
    public MemberDTO(Long memberId, String email, String name, String nickname, String phoneNumber,
                     Character gender, String password, String introduction, Short profession,
                     Integer experienceYear, LocalDateTime registrationDate,
                     LocalDateTime withdrawalDate, String socialId, String socialPlatform) {
        this.memberId = memberId;
        this.email = email;
        this.name = name;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.password = password;
        this.introduction = introduction;
        this.profession = profession;
        this.experienceYear = experienceYear;
        this.registrationDate = registrationDate;
        this.withdrawalDate = withdrawalDate;
        this.socialId = socialId;
        this.socialPlatform = socialPlatform;
    }

    // getter와 setter는 Lombok 어노테이션을 통해 자동으로 생성됩니다.
}

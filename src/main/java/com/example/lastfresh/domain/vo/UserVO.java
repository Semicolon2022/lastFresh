package com.example.lastfresh.domain.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "tbl_user")
@Getter
@ToString
@NoArgsConstructor
public class UserVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userNum")
    private Long userNum;
    @Column(name = "userId")
    private String userId;
    @Column(name = "userPw")
    private String userPw;
    @Column(name = "userName")
    private String userName;
    @Column(name = "userEmail")
    private String userEmail;
    @Column(name = "userAddress")
    private String userAddress;
    @Column(name = "userAddressDetail")
    private String userAddressDetail;
    @Column(name = "userAddressPostNum")
    private String userAddressPostNum;
    @Column(name = "userKakao")
    private String userKakao;
    /* 1. 판매자, 2. 회원, 3. 라이더, -1. 탈퇴*/
    @Column(name = "userStatus")
    private String userStatus;

    @Builder
    public UserVO(Long userNum, String userId, String userPw, String userName, String userEmail, String userAddress, String userAddressDetail, String userAddressPostNum, String userKakao, String userStatus) {
        this.userNum = userNum;
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.userAddressDetail = userAddressDetail;
        this.userAddressPostNum = userAddressPostNum;
        this.userKakao = userKakao;
        this.userStatus = userStatus;
    }
}

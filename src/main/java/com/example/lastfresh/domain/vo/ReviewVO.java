package com.example.lastfresh.domain.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_review")
@Getter
@ToString
@NoArgsConstructor
public class ReviewVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reviewNum")
    private Long reviewNum;
    @Column(name = "reviewTitle")
    private String reviewTitle;
    @Column(name = "reviewContent")
    private String reviewContent;
    @Column(name = "reviewDate")
    private Date reviewDate;

    @ManyToOne // 다대일
    @JoinColumn(name = "reviewProductNum")
    private ProductVO productVO;

    @ManyToOne // 다대일
    @JoinColumn(name = "reviewUserNum")
    private UserVO userVO;

    @Builder
    public ReviewVO(Long reviewNum, String reviewTitle, String reviewContent, Date reviewDate) {
        this.reviewNum = reviewNum;
        this.reviewTitle = reviewTitle;
        this.reviewContent = reviewContent;
        this.reviewDate = reviewDate;
    }
}

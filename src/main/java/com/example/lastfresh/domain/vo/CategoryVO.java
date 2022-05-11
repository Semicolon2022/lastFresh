package com.example.lastfresh.domain.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "tbl_category_product")
@Getter
@ToString
@NoArgsConstructor
public class CategoryVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryProductNum")
    private Long categoryProductNum;
    @Column(name = "categoryName")
    private String categoryName;

    @Builder
    public CategoryVO(Long categoryProductNum, String categoryName) {
        this.categoryProductNum = categoryProductNum;
        this.categoryName = categoryName;
    }
}

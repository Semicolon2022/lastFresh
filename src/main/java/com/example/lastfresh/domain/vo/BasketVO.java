package com.example.lastfresh.domain.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "tbl_basket")
@Getter
@ToString
@NoArgsConstructor
public class BasketVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "basketNum")
    private Long basketNum;
    @Column(name = "basketQuantity")
    private Long basketQuantity;
    /*1픽업 2배달 3배송*/
    @Column(name = "basketDeliveryMethod")
    private String basketDeliveryMethod;

    @ManyToOne // 다대일
    @JoinColumn(name = "basketUserNum")
    private UserVO userVO;

    @ManyToOne // 다대일
    @JoinColumn(name = "basketProductNum")
    private ProductVO productVO;

    @Builder
    public BasketVO(Long basketNum, Long basketQuantity, String basketDeliveryMethod) {
        this.basketNum = basketNum;
        this.basketQuantity = basketQuantity;
        this.basketDeliveryMethod = basketDeliveryMethod;
    }
}

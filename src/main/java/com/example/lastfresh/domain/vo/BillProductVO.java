package com.example.lastfresh.domain.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "tbl_billsProductList")
@Getter
@ToString
@NoArgsConstructor
public class BillProductVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "billListNum")
    private Long billListNum;
    @Column(name = "billProductQuantity")
    private Long billProductQuantity;
    @Column(name = "billProductPrice")
    private Long billProductPrice;
    @Column(name = "billDeliveryMethod")
    /*1픽업 2배달 3배송*/
    private String billDeliveryMethod;
    @Column(name = "billCookingTime")
    private String billCookingTime;
    @Column(name = "billStatus")
    /*(0: 대기중  1:준비중(수락 시) 2:배송중 3:배송완료 -1:취소) */
    private String billStatus;

    @ManyToOne // 다대일
    @JoinColumn(name = "billProductNum")
    private ProductVO productVO;

    @ManyToOne // 다대일
    @JoinColumn(name = "billOrderNum")
    private BillVO billVO;

    @ManyToOne // 다대일
    @JoinColumn(name = "billRiderUserNum")
    private UserVO userVO;

    public BillProductVO(Long billListNum, Long billProductQuantity, Long billProductPrice, String billDeliveryMethod, String billCookingTime, String billStatus) {
        this.billListNum = billListNum;
        this.billProductQuantity = billProductQuantity;
        this.billProductPrice = billProductPrice;
        this.billDeliveryMethod = billDeliveryMethod;
        this.billCookingTime = billCookingTime;
        this.billStatus = billStatus;
    }
}

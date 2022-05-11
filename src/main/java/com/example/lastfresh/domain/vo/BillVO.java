package com.example.lastfresh.domain.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_bills")
@Getter
@ToString
@NoArgsConstructor
public class BillVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sellProductImageUuid")
    private Long billOrderNum;
    @Column(name = "sellProductImageUuid")
    private String billDeliveryAddress;
    @Column(name = "sellProductImageUuid")
    private String billDeliveryAddressDetail;
    @Column(name = "sellProductImageUuid")
    private String billDeliveryAddressPostNum;
    @Column(name = "sellProductImageUuid")
    private String billFoodReady;
    @Column(name = "sellProductImageUuid")
    private Long billTotalPrice;
    @Column(name = "sellProductImageUuid")
    private Date billOrderDate;

    @ManyToOne // 다대일
    @JoinColumn(name = "billUserNum")
    private UserVO userVO;

    @Builder
    public BillVO(Long billOrderNum, String billDeliveryAddress, String billDeliveryAddressDetail, String billDeliveryAddressPostNum, String billFoodReady, Long billTotalPrice, Date billOrderDate) {
        this.billOrderNum = billOrderNum;
        this.billDeliveryAddress = billDeliveryAddress;
        this.billDeliveryAddressDetail = billDeliveryAddressDetail;
        this.billDeliveryAddressPostNum = billDeliveryAddressPostNum;
        this.billFoodReady = billFoodReady;
        this.billTotalPrice = billTotalPrice;
        this.billOrderDate = billOrderDate;
    }
}

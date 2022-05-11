package com.example.lastfresh.domain.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_sellProduct")
@Getter
@ToString
@NoArgsConstructor
public class ProductVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sellProductNum")
    private Long sellProductNum;
    @Column(name = "sellProductCategory")
    private Long sellProductCategory;
    @Column(name = "sellProductName")
    private String sellProductName;
    @Column(name = "sellProductOriginPrice")
    private Long sellProductOriginPrice;
    @Column(name = "sellProductDiscountPrice")
    private Long sellProductDiscountPrice;
    @Column(name = "sellProductExpireDay")
    private Date sellProductExpireDay;
    @Column(name = "sellProductStock")
    private long sellProductStock;
    @Column(name = "sellProductStatus")
    private String sellProductStatus;
    @Column(name = "sellProductPickup")
    private String sellProductPickup;
    @Column(name = "sellProductDelivery")
    /*0배달x, 1프레쉬라이더, 2자가라이더*/
    private String sellProductDelivery;
    @Column(name = "sellProductDeliveryAddress1")
    private String sellProductDeliveryAddress1;
    @Column(name = "sellProductDeliveryAddress2")
    private String sellProductDeliveryAddress2;
    @Column(name = "sellProductDeliveryAddress3")
    private String sellProductDeliveryAddress3;
    @Column(name = "sellProductShipping")
    /*0배달x, 1프레쉬라이더, 2자가라이더*/
    private String sellProductShipping;
    @Column(name = "sellProductAddress")
    private String sellProductAddress;
    @Column(name = "sellProductAddressDetail")
    private String sellProductAddressDetail;
    @Column(name = "sellProductAddressPostNum")
    private String sellProductAddressPostNum;
    @Column(name = "sellProductDescription")
    private String sellProductDescription;
    @Column(name = "sellProductPhoneNum")
    private String sellProductPhoneNum;
    @Column(name = "sellProductThumbnail")
    private String sellProductThumbnail;
    @Column(name = "sellProductImage")
    private String sellProductImage;
    @Column(name = "sellProductImageUploadPath")
    private String sellProductImageUploadPath;
    @Column(name = "sellProductImageUuid")
    private String sellProductImageUuid;

    @ManyToOne // 다대일
    @JoinColumn(name = "sellProductUserNum")
    private UserVO userVO;

    @Builder
    public ProductVO(Long sellProductNum, Long sellProductCategory, String sellProductName, Long sellProductOriginPrice, Long sellProductDiscountPrice, Date sellProductExpireDay, long sellProductStock, String sellProductStatus, String sellProductPickup, String sellProductDelivery, String sellProductDeliveryAddress1, String sellProductDeliveryAddress2, String sellProductDeliveryAddress3, String sellProductShipping, String sellProductAddress, String sellProductAddressDetail, String sellProductAddressPostNum, String sellProductDescription, String sellProductPhoneNum, String sellProductThumbnail, String sellProductImage, String sellProductImageUploadPath, String sellProductImageUuid) {
        this.sellProductNum = sellProductNum;
        this.sellProductCategory = sellProductCategory;
        this.sellProductName = sellProductName;
        this.sellProductOriginPrice = sellProductOriginPrice;
        this.sellProductDiscountPrice = sellProductDiscountPrice;
        this.sellProductExpireDay = sellProductExpireDay;
        this.sellProductStock = sellProductStock;
        this.sellProductStatus = sellProductStatus;
        this.sellProductPickup = sellProductPickup;
        this.sellProductDelivery = sellProductDelivery;
        this.sellProductDeliveryAddress1 = sellProductDeliveryAddress1;
        this.sellProductDeliveryAddress2 = sellProductDeliveryAddress2;
        this.sellProductDeliveryAddress3 = sellProductDeliveryAddress3;
        this.sellProductShipping = sellProductShipping;
        this.sellProductAddress = sellProductAddress;
        this.sellProductAddressDetail = sellProductAddressDetail;
        this.sellProductAddressPostNum = sellProductAddressPostNum;
        this.sellProductDescription = sellProductDescription;
        this.sellProductPhoneNum = sellProductPhoneNum;
        this.sellProductThumbnail = sellProductThumbnail;
        this.sellProductImage = sellProductImage;
        this.sellProductImageUploadPath = sellProductImageUploadPath;
        this.sellProductImageUuid = sellProductImageUuid;
    }
}

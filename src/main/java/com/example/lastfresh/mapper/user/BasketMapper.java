package com.example.lastfresh.mapper.user;

import com.example.lastfresh.domain.vo.BasketVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BasketMapper {
//  장바구니에 상품 담기
    public void insert(BasketVO basketVO);

}


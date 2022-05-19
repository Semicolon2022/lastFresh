package com.example.lastfresh.domain.dao.user;


import com.example.lastfresh.domain.vo.BasketVO;
import com.example.lastfresh.mapper.user.BasketMapper;
import com.example.lastfresh.mapper.user.BillMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Slf4j
public class BasketDAO {
    private final BasketMapper basketMapper;
    //  장바구니에 상품 담기
    public void insert(BasketVO basketVO){basketMapper.insert(basketVO);}


}














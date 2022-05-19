package com.example.lastfresh.service.user;

import com.example.lastfresh.domain.dao.user.BasketDAO;
import com.example.lastfresh.domain.vo.BasketVO;
import com.example.lastfresh.domain.vo.ProductVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BasketService {
    private final BasketDAO basketDAO;
    //  장바구니에 상품 담기
    public void insert(BasketVO basketVO){basketDAO.insert(basketVO);}

}

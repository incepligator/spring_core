package com.guffy.spring;

import com.guffy.vo.OrderVO;
import com.guffy.vo.ProductVO;

public interface OrderService {

	ProductVO createOrder(final ProductVO vo);
}

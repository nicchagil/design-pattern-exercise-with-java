package handler;

public class GoodsOrderHandler implements OrderHandlerStrategy {

	@Override
	public void handle(Integer id) {
		System.out.println("商品订单策略");
	}

}

package handler;

public class TelephoneChargeOrderHandler implements OrderHandlerStrategy {

	@Override
	public void handle(Integer id) {
		System.out.println("话费订单策略");
	}

}

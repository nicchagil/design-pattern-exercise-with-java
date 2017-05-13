import org.junit.Test;

public class HowToUse {

	@Test
	public void tc1() {
		OrderHandler orderHandler = OrderHandlerFactory.getOrderHandler(OrderHandlerType.GOODS_ORDER);
		orderHandler.handle(1);
	}
	
	@Test
	public void tc2() {
		OrderHandler orderHandler = OrderHandlerFactory.getOrderHandler(OrderHandlerType.TELEPHONE_CHARGE_ORDER);
		orderHandler.handle(1);
	}

}


public class OrderHandlerFactory {

	public static OrderHandler getOrderHandler(OrderHandlerType orderHandlerType) {
		if (orderHandlerType == null) {
			return null;
		}

		switch (orderHandlerType) {
		case GOODS_ORDER:
			return new GoodsOrderHandler();
		case TELEPHONE_CHARGE_ORDER:
			return new TelephoneChargeOrderHandler();
		default:
			return null;
		}

	}

}

public class OrderHandlerFactory {

	public static OrderHandler getOrderHandler(OrderHandlerType orderHandlerType) {
		if (orderHandlerType == null) {
			return null;
		}

		try {
			return (OrderHandler)orderHandlerType.getHandlerClass().newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
}

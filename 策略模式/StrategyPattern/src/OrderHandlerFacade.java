import handler.OrderHandlerStrategy;

public class OrderHandlerFacade {

	/**
	 * 调用处理业务
	 */
	public static void handle(Integer orderType, Integer orderId) {
		if (orderType == null || orderId == null) {
			throw new RuntimeException();
		}

		/* 遍历枚举匹配对应的策略 */
		OrderHandlerStrategy strategy = chooseStrategy(orderType);
		strategy.handle(orderId);
	}
	
	/**
	 * 选择对应的策略
	 */
	public static OrderHandlerStrategy chooseStrategy(Integer orderType) {
		if (orderType == null) {
			return null;
		}
		
		OrderHandlerType[] orderHandlerTypes = OrderHandlerType.values();
		for (OrderHandlerType orderHandlerType : orderHandlerTypes) {
			if (orderHandlerType.getOrderType().equals(orderType)) {
				try {
					return (OrderHandlerStrategy)orderHandlerType.getHandlerClass().newInstance(); // 返回对应的策略
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		}
		
		return null;
	}

}

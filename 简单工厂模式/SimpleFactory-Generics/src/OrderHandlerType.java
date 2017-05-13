
public enum OrderHandlerType {
	
	GOODS_ORDER(GoodsOrderHandler.class),
	TELEPHONE_CHARGE_ORDER(TelephoneChargeOrderHandler.class);
	
	private Class handlerClass = null;

	private OrderHandlerType(Class handlerClass) {
		this.handlerClass = handlerClass;
	}

	public Class getHandlerClass() {
		return handlerClass;
	}
	
}

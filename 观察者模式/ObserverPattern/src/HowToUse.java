public class HowToUse {
	
	public static void main(String[] args) {
		PayService payService = new PayService();
        
		/* 注册观察者 */
        payService.addObserver(new TaxService());
        payService.addObserver(new SocialSecurityService());
        
        payService.update(1, 10000);
	}

}

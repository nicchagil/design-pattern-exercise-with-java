
public class PayService {
	
	public void update(Integer userId, Integer pay) {
        System.out.println("将数据库中用户" + userId + "的待遇更新为" + pay);
        
        /* 联动改变税额、社保费用 */
        new TaxService().update(userId, pay);
        new SocialSecurityService().update(userId, pay);
    }

}

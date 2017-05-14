
public class SocialSecurityService {
	
	/**
	 * 根据指定的待遇计算、持久化社保费用
	 */
	public void update(Integer userId, Integer pay) {
		System.out.println("将数据库中用户" + userId + "按照最新待遇" + pay + "更新社保费用");
    }

}

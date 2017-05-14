
import java.util.Observable;

public class SocialSecurityService implements PayObserver {
	
	@Override
	public void update(Observable observable, Object obj) {
		if (obj == null || !(obj instanceof Pay)) {
            return;
        }
        
        Pay pay = (Pay)obj;
		this.update(pay.getUserId(), pay.getPay());
	}

	/**
	 * 根据指定的待遇计算、持久化社保费用
	 */
	public void update(Integer userId, Integer pay) {
        System.out.println("将数据库中用户" + userId + "按照最新待遇" + pay + "更新社保费用");
    }

}

import java.util.Observable;

public class PayService extends Observable {
	
	public void update(Integer userId, Integer pay) {
        System.out.println("将数据库中用户" + userId + "的待遇更新为" + pay);
        this.setChanged();
        
        /* 联动改变其他与待遇有关的费用 */
        this.notifyObservers(new Pay(userId, pay));
    }

}

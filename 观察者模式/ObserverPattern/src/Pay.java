
public class Pay {

	private Integer userId;
	private Integer pay;

	public Pay(Integer userId, Integer pay) {
		super();
		this.userId = userId;
		this.pay = pay;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPay() {
		return pay;
	}

	public void setPay(Integer pay) {
		this.pay = pay;
	}

}

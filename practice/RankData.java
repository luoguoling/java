/**
 * @Description 奖牌数据
 * @author jingxiaobo
 * @date 2016年9月7日 上午11:47:53
 */
public class RankData {
	/**国家名称*/
	private String country;
	/**金牌数量*/
	private int gold;
	/**银牌数量*/
	private int silver;
	/**铜牌数量*/
	private int copper;
	
	/**
	 * @Description 无参构造函数
	 * @author jingxiaobo
	 * @date 2016年9月7日 上午11:50:03
	 */
	public RankData(){
		
	}
	
	/**
	 * @Description 构造函数
	 * @param country 国家名称
	 * @param gold 金牌数量
	 * @param silver 银牌数量
	 * @param copper 铜牌数量
	 * @author jingxiaobo
	 * @date 2016年9月7日 上午11:50:16
	 */
	public RankData(String country, int gold, int silver, int copper) {
		this.country = country;
		this.gold = gold;
		this.silver = silver;
		this.copper = copper;
	}

	/**获取国家名称*/
	public String getCountry() {
		return country;
	}
	/**设置国家名称*/
	public void setCountry(String country) {
		this.country = country;
	}
	/**获取金牌数量*/
	public int getGold() {
		return gold;
	}
	/**设置金牌数量*/
	public void setGold(int gold) {
		this.gold = gold;
	}
	/**获取银牌数量*/
	public int getSilver() {
		return silver;
	}
	/**设置银牌数量*/
	public void setSilver(int silver) {
		this.silver = silver;
	}
	/**获取铜牌数量*/
	public int getCopper() {
		return copper;
	}
	/**设置铜牌数量*/
	public void setCopper(int copper) {
		this.copper = copper;
	}
}

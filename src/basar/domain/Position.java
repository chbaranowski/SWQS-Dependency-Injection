package basar.domain;

import java.util.Date;


public class Position {
	
	private Date createTime;

	private String description;

	private PositionKey positionKey = new basar.domain.PositionKey();

	private PositionType positionType = PositionType.SALE;
	
	private Money price;

	private Seller seller;

	public Date getCreateTime() {
		return createTime;
	}

	public String getDescription() {
		return description;
	}

	public PositionKey getPositionKey() {
		return positionKey;
	}

	public PositionType getPositionType() {
		return positionType;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPositionKey(PositionKey positionKey) {
		this.positionKey = positionKey;
	}

	public void setPositionType(PositionType positionType) {
		this.positionType = positionType;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Money getPrice() {
		return price;
	}

	public void setPrice(Money price) {
		this.price = price;
	}

}

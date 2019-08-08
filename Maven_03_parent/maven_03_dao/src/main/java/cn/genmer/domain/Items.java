package cn.genmer.domain;

import java.io.Serializable;
import java.util.Date;

public class Items implements Serializable {
	private Integer id;
	private String name;
	private double price;
	private String pic;
	private Date datetime;
	private String detail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "domain{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				", pic='" + pic + '\'' +
				", datetime=" + datetime +
				", detail='" + detail + '\'' +
				'}';
	}
}

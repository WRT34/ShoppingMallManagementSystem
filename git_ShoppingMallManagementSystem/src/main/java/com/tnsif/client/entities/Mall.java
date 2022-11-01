package com.tnsif.client.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

@Entity
public class Mall {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		private String mallName;
		private String location;
		private String categories;
		
		@OneToOne(cascade = CascadeType.ALL)
		private MallAdmin mallAdmin;
		
//		@OneToMany(cascade = CascadeType.ALL)
//		@JoinColumn(referencedColumnName = "id")
//		private List<Shop> shopId;
		
		
		
		public Integer getId() {
			return id;
		}



		public void setId(Integer id) {
			this.id = id;
		}



		public String getMallName() {
			return mallName;
		}



		public void setMallName(String mallName) {
			this.mallName = mallName;
		}



		public String getLocation() {
			return location;
		}



		public void setLocation(String location) {
			this.location = location;
		}



		public String getCategories() {
			return categories;
		}



		public void setCategories(String categories) {
			this.categories = categories;
		}



		public MallAdmin getMallAdmin() {
			return mallAdmin;
		}



		public void setMallAdmin(MallAdmin mallAdmin) {
			this.mallAdmin = mallAdmin;
		}



//		public List<Shop> getShopId() {
//			return shopId;
//		}
//
//
//
//		public void setShopId(List<Shop> shopId) {
//			this.shopId = shopId;
//		}



		@Override
		public String toString() {
			return "Mall [id=" + id + ", mallName=" + mallName + ", location=" + location + ", categories=" + categories
					+ ", mallAdmin=" + mallAdmin + ", shopId=" + "]";
		}
		
		
		
		
		
}


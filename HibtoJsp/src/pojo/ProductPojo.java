package pojo;

public class ProductPojo 
{
		private int productId;
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getProductCost() {
			return productCost;
		}
		public void setProductCost(int productCost) {
			this.productCost = productCost;
		}
		public String getProductMdate() {
			return productMdate;
		}
		public void setProductMdate(String productMdate) {
			this.productMdate = productMdate;
		}
		private String productName;
		private int productCost;
		private String productMdate;
}

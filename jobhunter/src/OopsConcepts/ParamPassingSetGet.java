package OopsConcepts;

public class ParamPassingSetGet 
{
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

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}

	   private int productId;
	   private String productName;
	   private String productColor;
	   private int productCost;
	
	public ParamPassingSetGet(int productId,String productName,String productColor,int productCost)
	   {
		   this.productId=productId;
		   this.productName=productName;
 		   this.productColor=productColor;
		   this.productCost=productCost;
		   
	   }
}
	
	
/*int productid;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductColor() {
	return productColor;
}
public void setProductColor(String productColor) {
	this.productColor = productColor;
}
public int getProductCost() {
	return productCost;
}
public void setProductCost(int productCost) {
	this.productCost = productCost;
}
String productName;
String productColor;
int productCost;
}
*/
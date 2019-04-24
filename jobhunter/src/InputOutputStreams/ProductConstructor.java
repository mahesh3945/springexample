package InputOutputStreams;
import java.io.Serializable;

public class ProductConstructor implements Serializable
{
	private String productName;
	public String getProductName() 
	{
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
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	private int  productCost;
	private String productColor;

	
	public ProductConstructor(String productName,int productCost,String productColor)
	   {
		   this.productName=productName;
		   this.productColor=productColor;
		   this.productCost=productCost;
		   
	   }
		
}
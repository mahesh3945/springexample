	package InputOutputStreams;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.util.Scanner;
	import javax.tools.FileObject;
	public class ProductConsSerializable 
	{
	public static void main(String[] args)
			{
			int x;
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the no of records we want to store :");
			x= sc.nextInt();
			try(FileOutputStream fileoutputstream = new FileOutputStream("C:/Users/Mahi Gani/Desktop/Prodcutdetails.txt");
					ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileoutputstream);)
			{
				for(int i=0;i<x;i++)
				{
					ProductConstructor[] productdetails= new ProductConstructor[x];
					/*productdetails.setProductName("mahesh");
					productdetails.setProductColor("red");
					productdetails.setProductCost(15454);
					System.out.println("enter the product name :");
					productdetails.setProductName(sc.next());
					System.out.println("enter the product color :");
					productdetails.setProductColor(sc.next());
					System.out.println("enter the product cost :");
					productdetails.setProductCost(sc.nextInt());
					objectoutputstream.writeObject(productdetails);*/
					System.out.println("enter the product name:");
					String productName=sc.next();
					System.out.println("enter the product cost:");
					int productCost=sc.nextInt();
					System.out.println("enter the product color:");
					String productColor=sc.next();
					
					productdetails[i]= new ProductConstructor(productName,productCost,productColor);
					objectoutputstream.writeObject(productdetails[i]);
				  }
					System.out.println("file transfered");
				}
			catch (IOException e)
			{
			e.printStackTrace();
			}
			try(FileInputStream fileinputstream= new FileInputStream("C:/Users/Mahi Gani/Desktop/Prodcutdetails.txt");
					ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);)
			{
				for(int i=0;i<x;i++)
				{
					ProductConstructor productdetails1=(ProductConstructor)objectinputstream.readObject();
				System.out.println(productdetails1.getProductName()+"\t"+productdetails1.getProductColor()+"\t"+productdetails1.getProductCost());
				}
			}
			catch (IOException | ClassNotFoundException e)
			{
			e.printStackTrace();
			}
	}
	}


	
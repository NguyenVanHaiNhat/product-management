import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void writeDataToFile(String source, List<ProductManagment> products){
        try {
            FileOutputStream fos = new FileOutputStream(source);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            fos.close();
            oos.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    private static List<ProductManagment> readDataFromFile(String source){
        List<ProductManagment> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(source);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<ProductManagment>) ois.readObject();
            fis.close();
            ois.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
    public static void main(String[] args) {
        List<ProductManagment> products = new ArrayList<>();
        products.add(new ProductManagment("001", "product", 50000, "Hàng sản xuất", "Không có j"));
        products.add(new ProductManagment("002", "product", 60000, "Hàng sản xuất", "Không có j"));
        products.add(new ProductManagment("003", "product", 70000, "Hàng sản xuất", "Không có j"));
        products.add(new ProductManagment("004", "product", 80000, "Hàng sản xuất", "Không có j"));
        products.add(new ProductManagment("005", "product", 90000, "Hàng sản xuất", "Không có j"));
        writeDataToFile("product.txt", products);
        List<ProductManagment> productManagments = readDataFromFile("product.txt");
        for (ProductManagment productManagment: productManagments){
            System.out.println(productManagment);
        }
    }
}
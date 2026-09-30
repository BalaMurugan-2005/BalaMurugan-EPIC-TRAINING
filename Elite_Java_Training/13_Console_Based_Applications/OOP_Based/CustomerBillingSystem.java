import java.util.Scanner; 

class Customer{ 
    String cusName; 
    String cusPhNo; 
    int cusAge; 
    Customer[] cusArr = new Customer[100]; 
    int index = 0; 
     
    Customer(){ 
         
    } 
    
    Customer(String n,String p ,int a){ 
        this.cusName = n; 
        this.cusPhNo = p; 
        this.cusAge = a; 
    } 
         
    void createCustomer(){ 
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Enter the Cus name:"); 
        String name = in.nextLine(); 
        
        System.out.println("Enter the Cus phno:"); 
        String phno = in.nextLine(); 
        
        System.out.println("Enter the Cus age:"); 
        int age = in.nextInt(); 
        
        Customer cus = new Customer(name,phno,age); 
        cusArr[index] = cus; //Customer@303004 , Customer@33434354
        index++; 
        
        System.out.println("Customer Created Successfully"); 
    } 
     
    void displayCustomer(){ 
        for (int i = 0; i < index ;i++){ 
            System.out.println("Customer ID: " + i); 
            System.out.println("Name: "+cusArr[i]); //Customer@303004.cusname =bala , 
            System.out.println("Ph no: "+cusArr[i]); //Customer@303004.cusph = 968488
            System.out.println("Age: "+cusArr[i]); //Customer@303004.cusage = 34
        } 
    } 
                                                    // cusarr[Customer@303004,Customer@39434,Customer@3445454]
    void GetCusbyID(){ 
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Enter Customer ID :"); 
        int id = in.nextInt(); //0
        
        if (id >= 0 && id < index){ 
            System.out.println("Name: "+ cusArr[id].cusName); //cusArr[0].cusname
            System.out.println("Ph No: "+ cusArr[id].cusPhNo); 
            System.out.println("Age: "+ cusArr[id].cusAge); 
        }else{ 
            System.out.println("Customer not Found"); 
        } 
    } 
} 


class Product{ 
    String proName; 
    String proBrand; 
    int proPrice; 
    int proStock;
    Product[] proArr = new Product[100]; 
    int index = 0; 
     
    Product(){ 
         
    } 
    
    Product(String n,String b ,int p,int s){ 
        this.proName = n; 
        this.proBrand = b; 
        this.proPrice = p; 
        this.proStock = s;
    } 
         
    void createProduct(){ 
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Enter the  Pro name:"); 
        String name = in.nextLine(); 
        
        System.out.println("Enter the Pro brand:"); 
        String brand = in.nextLine(); 
        
        System.out.println("Enter the Pro price:"); 
        int price = in.nextInt(); 
        
        System.out.println("Enter the Pro stock:"); 
        int stock = in.nextInt(); 
        
        Product pro = new Product(name,brand,price,stock); 
        proArr[index] = pro; 
        index++; 
        
        System.out.println("Product Created Successfully"); 
    } 
     
    void displayProduct(){ 
        for (int i = 0; i < index ;i++){ 
            System.out.println("Product ID: " + i); 
            System.out.println("Name: "+proArr[i].proName); 
            System.out.println("Brand: "+proArr[i].proBrand); 
            System.out.println("Price: "+proArr[i].proPrice); 
            System.out.println("Price: "+proArr[i].proStock); 
        } 
    } 
     
    void GetProbyID(){ 
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Enter Product ID :"); 
        int id = in.nextInt(); 
        if(id >= 0 && id < index){ 
            System.out.println("Name: "+ proArr[id].proName); 
            System.out.println("Brand: "+ proArr[id].proBrand); 
            System.out.println("Price: "+ proArr[id].proPrice); 
        }else{ 
            System.out.println("Product not Found"); 
        } 
    } 
} 
class Bill{ 
    int billId; 
    int cusId; 
    BillProduct bpObj; 
    int noOfproduct; 
    Bill[] billArr = new Bill[100]; 
    int index=0; 
     
    Bill(){ 
         
    } 
     
    Bill(int billId,int cusId,BillProduct obj,int n){ 
        this.billId=billId; 
        this.cusId = cusId; 
        this.bpObj = obj; 
        this.noOfproduct=n; 
    } 
     
     
    void createBill(Product proObj){ 
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Enetr the customer id: "); 
        int id = in.nextInt(); 
        
        System.out.println("Enter the no of products: "); 
        int n = in.nextInt(); 
        
        BillProduct bp = new BillProduct(); 
        
        for(int i=0;i<n;i++){ 
            
            System.out.println("Enter the Product Id: "); 
            int proId = in.nextInt(); //0
            
            System.out.println("Enter the Product qua: "); 
            int proQua = in.nextInt(); //2
            
            proObj.proArr[proId].proStock-=proQua;
            
            BillProduct bplist = new BillProduct(proId,proQua); 
            bp.billproArr[i] = bplist; 
        } 
        
        Bill bill = new Bill(index,id,bp,n); 
        billArr[index] = bill; 
        index++; 
        
        System.out.println("Bill Created Successfully"); 
    } 
     
     
    void displayBill(Product pro,Customer cus){ 
        
        for(int i=0;i < index;i++){ 
           
            System.out.println("Bill ID: " + billArr[i].billId); 
            System.out.println("Customer ID: " + billArr[i].cusId);
            System.out.println("Customer Name " + cus.cusArr[billArr[i].cusId].cusName);
            
            for(int j=0;j<billArr[i].noOfproduct;j++){ 
                
                int productId = billArr[i].bpObj.billproArr[j].proId; 
                int quantity = billArr[i].bpObj.billproArr[j].proQua; 
                int total=0;
                if(productId >= 0 && productId < pro.index){ 
                    System.out.println("Product ID: " + productId); 
                    System.out.println("Product Name: " + pro.proArr[productId].proName);
                    System.out.println("Brand: " + pro.proArr[productId].proBrand); 
                    System.out.println("Price: " + pro.proArr[productId].proPrice); 
                    System.out.println("Quantity: " + quantity); 
                    
                     total = pro.proArr[productId].proPrice * quantity; 
                    
                    System.out.println("Total: " + total); 
                }else{ 
                    System.out.println("Product not Found"); 
                }
            } 
             
        } 
    } 
} 


class BillProduct{ 
    int proId; 
    int proQua; 
    BillProduct[] billproArr = new BillProduct[100]; 
    
    BillProduct(){ 
         
    } 
    
    BillProduct(int id,int qua){ 
        this.proId = id; 
        this.proQua = qua; 
    } 
     
} 


public class Main 
{ 
    public static void main(String[] args) { 
        
        Scanner in = new Scanner(System.in); 
        
        Product pro = new Product();//#5000 
        Customer cus = new Customer();//6000 
        Bill bill = new Bill(); //7000
        
        while(true){ 
            
            System.out.println("1)Create Customer \n2)Display Customer \n3)Get Customer by ID \n4)Create Product \n5)Display Product \n6)Get Product by ID \n7)Create Bill \n8)Display Bill"); 

            int n = in.nextInt(); 
            
            switch(n){ 
                
                case 1:{ 
                    cus.createCustomer(); 
                    break; 
                } 
                
                case 2:{ 
                    cus.displayCustomer(); 
                    break; 
                } 
                
                case 3:{ 
                    cus.GetCusbyID(); 
                    break; 
                } 
                
                case 4:{ 
                    pro.createProduct(); 
                    break; 
                }
                
                case 5:{ 
                    pro.displayProduct(); 
                    break; 
                } 
                
                case 6:{ 
                    pro.GetProbyID(); 
                    break; 
                } 
                
                case 7:{ 
                    bill.createBill(pro); 
                    break; 
                } 
                
                case 8:{ 
                    
                    bill.displayBill(pro,cus); 
                    break; 
                } 
                
                default:{ 
                    System.out.println("invalid"); 
                } 
            } 
        } 
    } 
}
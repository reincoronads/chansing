/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undang;

public class Products {
    
    int id;
    String name;
    int price, stocks;
    int tep;
    
    public void AddProduct(int pid, String pname, int pr, int st, int temp){
    
        this.id = pid;
        this.name = pname;
        this.price = pr;
        this.stocks = st;
        this.tep = temp;
        
    }
    
    public void viewProduct(){
        double total = this.price * this.stocks;
        String status = ( this.stocks == 0) ? "Out of Stuck " : "Available";
        
        
        System.out.printf("%-10d %-10s %-10d %-10d %-10s %-10.2f\n", this.id, this.name, this.price, this.stocks, status, total);
    }
    
}   

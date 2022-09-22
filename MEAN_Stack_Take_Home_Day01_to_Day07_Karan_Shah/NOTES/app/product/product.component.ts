import { Component, OnInit } from '@angular/core';
import { Subject } from 'rxjs';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  cartItems: any;
  products: any;


  constructor(private service:EmpService) { 
   
    this.cartItems = []
    this.products= [{"productId":1,"productName":"iPhone 14","Price":159500,"description":"No Cost EMI from ₹1499/month","imagePath":"../assets/images/1.jpg"},
                  {"productId":2,"productName":"One Plus","Price":33900,"description":"No Cost EMI from ₹1499/month","imagePath":"../assets/images/2.jpg"},
                  {"productId":3,"productName":"Realme 9 Pro","Price":22456,"description":"No Cost EMI from ₹1499/month","imagePath":"../assets/images/3.jpg"},
                  {"productId":4,"productName":"Samsung Galaxy S21","Price":49999,"description":"No Cost EMI from ₹1499/month","imagePath":"../assets/images/4.jpg"},
                  {"productId":5,"productName":"Vivo T1 44w","Price":15999,"description":"No Cost EMI from ₹1499/month","imagePath":"../assets/images/5.jpg"},
                  {"productId":6,"productName":"MI Note 10 pro","Price":15999,"description":"No Cost EMI from ₹1499/month","imagePath":"../assets/images/1.jpg"}]
  }

  ngOnInit(): void {

  }

  addToCart(product:any){
    this.service.addToCart(product)

    //this.cartItems.push(product)
    //localStorage.setItem('cartItems',JSON.stringify(this.cartItems))
    //console.log(this.cartItems)
  }

}

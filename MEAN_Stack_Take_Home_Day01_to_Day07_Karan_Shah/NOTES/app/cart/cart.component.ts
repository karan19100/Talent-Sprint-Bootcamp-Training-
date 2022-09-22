import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  cartToDisplay: any;
  itemsRecieved: any;
  constructor(private service: EmpService) { 
    this.cartToDisplay = [];
  }

  ngOnInit(): void {
    this.service.getFromCart().subscribe((data: any)=>{this.cartToDisplay.push(data)})
    //  this.itemsRecieved = localStorage.getItem("cartItems")
    //  this.cartToDisplay = JSON.parse(this.itemsRecieved)
    //  console.log('Inside Cart : ',this.cartToDisplay)
    }

}

import { ThisReceiver } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';
import { ProductComponent } from '../product/product.component';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  cartToDisplay: any;
  itemsRecieved: any;
  constructor(private service: EmpService) { 
    this.cartToDisplay = [];
  }

  ngOnInit(): void {
    this.service.getFromCart().subscribe((data: any)=>{this.cartToDisplay.push(data)})
    
    // this.itemsRecieved = localStorage.getItem("cartItems")
    //  this.cartToDisplay = JSON.parse(this.itemsRecieved)
    //  console.log('Inside Header : ',this.cartToDisplay)
    }
}

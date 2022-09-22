import { Component,Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  @Input() cartItems : any[] = [];

  constructor() {

  }
  removeBasket(cartItems:any) {
    this.cartItems.splice(0, this.cartItems.length);
  }

  ngOnInit(): void {

  }

}

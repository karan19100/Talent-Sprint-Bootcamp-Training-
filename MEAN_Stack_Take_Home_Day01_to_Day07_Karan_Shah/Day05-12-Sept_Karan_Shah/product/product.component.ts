import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  products:any;
  cartItems: any;
  show: any;

  constructor() {

    this.cartItems = [];

  }

  ngOnInit() {
    this.products=[
      {"productId":"1","productName":"Apple Watch series 8","price":69999.99,"description":"No cost EMI from ₹1,499/month","imagePath":"./assets/images/watch.jpeg"},
      {"productId":"2","productName":"One plus Nord N2","price":31499.99,"description":"No cost EMI from ₹1,499/month","imagePath":"./assets/images/one_plus.png"},
      {"productId":"3","productName":"Oppo V11","price":19999.99,"description":"No cost EMI from ₹1,499/month","imagePath":"./assets/images/oppo-b2.webp"},
      {"productId":"4","productName":"Samsung Galaxy Fold","price":79499.99,"description":"No cost EMI from ₹1,499/month","imagePath":"./assets/images/samsung.jpeg"},
      {"productId":"5","productName":"Samsung Galaxy S21","price":17999.99,"description":"No cost EMI from ₹1,499/month","imagePath":"./assets/images/s12.jpeg"},
      {"productId":"6","productName":"Vivo V11 Pro","price":21999.99,"description":"No cost EMI from ₹1,499/month","imagePath":"./assets/images/vivo.jpeg"}
    ];
  }

  addToCart(product: any) {
    this.cartItems.push(product);
    localStorage.setItem('cartItems', JSON.stringify(this.cartItems));
  }

  toggle() {
    this.show = !this.show;
  }

}

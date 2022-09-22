import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmpService {

  itemToBroadCast : Subject<any>;
  constructor() { 
    this.itemToBroadCast = new Subject();
  }

  getFromCart(){
    return this.itemToBroadCast.asObservable();
  }
  addToCart(product:any){
    console.log(product)
    this.itemToBroadCast.next(product)
  }
}

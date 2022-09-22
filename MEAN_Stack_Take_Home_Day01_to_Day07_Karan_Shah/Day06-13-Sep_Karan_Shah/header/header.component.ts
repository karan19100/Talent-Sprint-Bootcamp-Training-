import { Component, OnInit } from '@angular/core';
import { EmpServiceService } from '../services/emp-service.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css'],
})
export class HeaderComponent implements OnInit {
  cartToDisplay: any;
  itemsRecieved: any;
  constructor(private service: EmpServiceService) {
    this.cartToDisplay = [];
  }

  ngOnInit(): void {
    this.service.getFromCart().subscribe((data: any) => {
      this.cartToDisplay.push(data);
    });
  }

  // isUserLoggedIn(): boolean {
  //   if (JSON.parse(localStorage.getItem('userLoggedIn')!)) {
  //     return true;
  //   }
  //   return false;
  // }

  // logOut() {
  //   localStorage.removeItem('userLoggedIn');
  //   localStorage.clear();
  // }
}

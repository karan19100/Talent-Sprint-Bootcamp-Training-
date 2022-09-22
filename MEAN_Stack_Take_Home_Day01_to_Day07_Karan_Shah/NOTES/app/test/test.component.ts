import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  message: string;
  isMarried: boolean;
  salary:number;
  age: number;
  address :any;
  hobbies: any;

  constructor() { //depencency injection

    this.message = "BYE BYE..."
    this.isMarried = true;
    this.salary = 9999.99;
    this.age = 45;

    this.address = {'doorNo' : '10-10','street' : 'EAST','city': 'Hyd'};

    this.hobbies = ['CRICKET','CHATTING','EATING'];

   }

  ngOnInit(): void {
    // initialilzation code
  }
  showMessage(){
    alert('Hi Function executed....')
    console.log('Hi! Fuction is executed...');
  }

}

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-showemp',
  templateUrl: './showemp.component.html',
  styleUrls: ['./showemp.component.css']
})
export class ShowempComponent implements OnInit {
  retrievedData : any;
  loginForm : any;

  employees: any[];

  constructor() {
    this.loginForm=""

    this.employees =[{empId: 1,empName: 'PASHA',gender:'M',salary: 9999.99,doj:'01-02-2012',loginId:'PASHA123',password:'PASSWORD'},
    {empId: 2,empName: 'HARSHA',gender:'M',salary: 8787.88,doj:'04-19-2016',loginId:'HARSHA123',password:'PASSWORD'},
    {empId: 3,empName: 'INDIRA',gender:'F',salary: 9898.99,doj:'10-25-2017',loginId:'INDIRA123',password:'PASSWORD'},
    {empId: 4,empName: 'CHANDRA',gender:'M',salary: 77777.77,doj:'11-14-2014',loginId:'CHANDRA123',password:'PASSWORD'}];
   }

  ngOnInit(): void {
   
  }
  viewName(){
    this.retrievedData = localStorage.getItem("loginForm")
    this.loginForm = JSON.parse(this.retrievedData)
  }
}


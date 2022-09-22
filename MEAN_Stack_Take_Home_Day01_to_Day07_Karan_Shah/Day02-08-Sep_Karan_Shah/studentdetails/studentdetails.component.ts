import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-studentdetails',
  templateUrl: './studentdetails.component.html',
  styleUrls: ['./studentdetails.component.css']
})
export class StudentdetailsComponent implements OnInit {

  studentlist:any;

  constructor() {

    this.studentlist = [
      {
        Sid:1,
        Sname:'Karan Shah',
        dob:'10-19-2000',
        course:'Electronics',
        fees:'150000'
      },

      {
        Sid:2,
        Sname:'Param Shah',
        dob:'12-18-1998',
        course:'Mechanical',
        fees:'175000'
      },

      {
        Sid:3,
        Sname:'Rohit padia',
        dob:'08-01-1994',
        course:'Civil',
        fees:'200000'

      },

      {
        Sid:4,
        Sname:'Shreyans Suraliya',
        dob:'12-21-1996',
        course:'Computers',
        fees:'225000'

      }
    ]

  }

  ngOnInit(): void {

  }

}

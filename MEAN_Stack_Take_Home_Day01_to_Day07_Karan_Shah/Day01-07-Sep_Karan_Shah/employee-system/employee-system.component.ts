import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee-system',
  templateUrl: './employee-system.component.html',
  styleUrls: ['./employee-system.component.css']
})
export class EmployeeSystemComponent implements OnInit {

  employeeList:any;

  constructor() {

    this.employeeList=[

      {
        //attributes
        empNo:19,
        empName:'Karan Shah',
        empSal:'57,000',
        gender:'male',
        doj:'18-07-2022',
        loginId:'karanshah1910',
        password:'HR'
      },

      {
        //attributes
        empNo:13,
        empName:'Param Shah',
        empSal:'43,000',
        gender:'male',
        doj:'26-05-2022',
        loginId:'paramshah1812',
        password:'HR'
      },
      {
      empNo:15,
      empName:'Rohit Padia',
      empSal:'47,000',
      gender:'male',
      doj:'18-06-2022',
      loginId:'Rohit5321',
      password:'HR'
      },

      {

        empNo:21,
        empName:'shreyans suraliya',
        empSal:'41,000',
        gender:'male',
        doj:'01-08-2022',
        loginId:'shreyans.s.342',
        password:'HR'
      }
    ];

  }

  ngOnInit(): void {
  }

}

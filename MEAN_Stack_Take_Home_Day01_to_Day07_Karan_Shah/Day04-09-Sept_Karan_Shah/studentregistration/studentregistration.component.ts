import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-studentregistration',
  templateUrl: './studentregistration.component.html',
  styleUrls: ['./studentregistration.component.css']
})
export class StudentregistrationComponent implements OnInit {

  studentlist:any;
  student:any;
  flag:any;
  dt:any;

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
    ];
  }

  onSubmit(StudentRegistrationForm:any) {

    this.flag=0;
    this.studentlist.forEach((student:any) => {
      this.dt = new Date().getFullYear() - new Date(StudentRegistrationForm.dob).getFullYear();
      if(this.dt<18){
        this.flag=1;
      }
    });
    if(this.flag==1){
      alert("Your Age is less");
    }
    else {
    this.student = {"Sid":StudentRegistrationForm.Sid,"Sname":StudentRegistrationForm.Sname,"dob":StudentRegistrationForm.dob,"course":StudentRegistrationForm.course,"fees":StudentRegistrationForm.fees}
    this.studentlist.push(this.student);
    }
    console.log(this.studentlist);
  }

  ngOnInit(): void {

  }

}

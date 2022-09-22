import { Component, OnInit } from '@angular/core';
import { AuthGuard } from '../auth.guard';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  // loginId : string;
  // password : string;

  isTrue : boolean;

  employees : any;
  constructor(private guard: AuthGuard) { //Depencency Injection
    this.isTrue = false;
    // this.loginId = '';
    // this.password = '';

    
    this.employees =[{empId: 1,empName: 'PASHA',gender:'M',salary: 9999.99,doj:'01-02-2012',loginId:'PASHA123',password:'PASSWORD'},
    {empId: 2,empName: 'HARSHA',gender:'M',salary: 8787.88,doj:'04-19-2016',loginId:'HARSHA123',password:'PASSWORD'},
    {empId: 3,empName: 'INDIRA',gender:'F',salary: 9898.99,doj:'10-25-2017',loginId:'INDIRA123',password:'PASSWORD'},
    {empId: 4,empName: 'CHANDRA',gender:'M',salary: 77777.77,doj:'11-14-2014',loginId:'CHANDRA123',password:'PASSWORD'}];
   }

  ngOnInit(): void {
  }
  
  /* validateLogin(){
    if(this.loginId == 'HR' && this.password =='HR'){
      alert('HR Login Success...')
    } else {
        this.employees.forEach((employee: any) => {
            if(this.loginId === employee.loginId && this.password === employee.password){
              this.isTrue = true;
              alert('Employee Login Success...')
            }
        } )

    }
    if(!this.isTrue)
    alert('Invalid Credentials...')
  } */
  
  validateLogin(loginForm : any){

    localStorage.setItem("loginForm",JSON.stringify(loginForm))//it holds data so that we can use any where in your project
    if(loginForm.loginId == 'HR' && loginForm.password =='HR'){
      alert('HR Login Success...')
      this.guard.isUserLoggedIn = true;
    } else {
        this.employees.forEach((employee: any) => {
            if(loginForm.loginId === employee.loginId && loginForm.password === employee.password){
              this.isTrue = true;
              this.guard.isUserLoggedIn = true;
              alert('Employee Login Success...')
            }
        } )
    }
    if(!this.isTrue)
    alert('Invalid Credentials...')
  }
}

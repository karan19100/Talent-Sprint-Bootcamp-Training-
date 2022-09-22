import { Component, OnInit } from '@angular/core';
import { AuthGuard } from '../auth.guard';
import { Auth2Guard } from '../auth2.guard';
import Employee from '../showemp/Employee';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  Employees: Employee[] = [];

  constructor(private guard: AuthGuard, private guard2: Auth2Guard) {
    this.Employees = [
      new Employee(
        1,
        'karan Shah',
        57000,
        'Male',
        '07/18/2022',
        'karanshah1910',
        '1910'
      ),
      new Employee(
        2,
        'param shah',
        45000,
        'Male',
        '05/26/2022',
        'paramshah18',
        '1812'
      ),
      new Employee(
        3,
        'rohit padia',
        58000,
        'Male',
        '06/22/2022',
        'rohit06',
        'HR'
      ),
      new Employee(
        4,
        'Shreyans suraliya',
        42000,
        'Male',
        '09/02/2022',
        'shreyans22',
        'HR'
      ),
    ];
  }

  ngOnInit(): void {}

  onLogin(userLogin: any) {
    if (userLogin.value.username == 'HR' && userLogin.value.password == 'HR') {
      localStorage.setItem('user', JSON.stringify(userLogin.value));
      alert('HR Login Success');
    } else {
      let userExists = false;
      this.Employees.forEach((employee: any) => {
        if (
          employee.loginId == userLogin.value.username &&
          employee.password == userLogin.value.password
        ) {
          localStorage.setItem('user', JSON.stringify(userLogin.value));
          userExists = true;
        }
      });

      if (userExists) {
        this.guard.isUserLoggedin = true;
        this.guard2.isUserLoggedOut=true;
        // localStorage.setItem('userLoggedIn', JSON.stringify(true));
        alert('Employee Login Success');
      } else {
        alert('Invalid Credentials');
      }
    }
  }
}

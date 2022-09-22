import { Component, OnInit } from '@angular/core';
import { AuthGuard } from '../auth.guard';
import { Auth2Guard } from '../auth2.guard';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css'],
})

export class LogoutComponent implements OnInit {
  constructor(private guard: AuthGuard, private guard2: Auth2Guard) {}

  ngOnInit(): void {
    this.guard2.isUserLoggedOut = true;
    alert('User Logged out Successfully');
    this.guard.isUserLoggedin = false;
  }
}

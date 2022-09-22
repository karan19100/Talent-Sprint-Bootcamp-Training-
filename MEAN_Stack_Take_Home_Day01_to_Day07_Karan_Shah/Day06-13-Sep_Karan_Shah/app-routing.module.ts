import { GetEmployeeByIdComponent } from './get-employee-by-id/get-employee-by-id.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './auth.guard';
import { CartComponent } from './cart/cart.component';
import { LoginComponent } from './login/login.component';
import { ProductComponent } from './product/product.component';
import { RegisterComponent } from './register/register.component';
import { ShowempComponent } from './showemp/showemp.component';
import { LogoutComponent } from './logout/logout.component';
import { Auth2Guard } from './auth2.guard';

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'login', component: LoginComponent },
  { path: 'logOut', component: LogoutComponent, canActivate: [Auth2Guard] },
  { path: 'register', component: RegisterComponent },
  { path: 'showemp', component: ShowempComponent, canActivate: [AuthGuard] },
  { path: 'products', component: ProductComponent, canActivate: [AuthGuard] },
  { path: 'cart', component: CartComponent, canActivate: [AuthGuard] },
  { path: 'getempbyid', component: GetEmployeeByIdComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

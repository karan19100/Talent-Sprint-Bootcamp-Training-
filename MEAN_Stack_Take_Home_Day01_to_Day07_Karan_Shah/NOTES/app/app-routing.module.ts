import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './auth.guard';
import { CartComponent } from './cart/cart.component';
import { LoginComponent } from './login/login.component';
import { ProductComponent } from './product/product.component';
import { RegisterComponent } from './register/register.component';
import { ShowempComponent } from './showemp/showemp.component';

const routes: Routes = [{path:'',component:LoginComponent},
{path:'login',component:LoginComponent},
{path:'register',canActivate:[AuthGuard],component:RegisterComponent},
{path:'showemp',canActivate:[AuthGuard],component:ShowempComponent},
{path:'products',canActivate:[AuthGuard],component:ProductComponent},
{path:'cart',canActivate:[AuthGuard],component:CartComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }


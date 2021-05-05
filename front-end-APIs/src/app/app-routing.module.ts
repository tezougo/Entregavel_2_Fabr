import { Componente1Component } from './componente1/componente1.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Componente2Component } from './componente2/componente2.component';

const routes: Routes = [
  {path: 'componente1', component: Componente1Component},
  {path: 'componente2', component: Componente2Component}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ComponenteServicoComponent } from './componente-servico/componente-servico.component';
import { Componente1Component } from './componente1/componente1.component';
import { Componente2Component } from './componente2/componente2.component';

const routes: Routes = [
  {path: 'busca', component: Componente1Component},
  {path: 'albuns', component: Componente2Component},
  {path: 'servico', component: ComponenteServicoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

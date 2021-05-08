import { Component, OnInit } from '@angular/core';
import { Photos } from '../models/Photos.model';
import { Servico1Service } from '../services/servico1.service';

@Component({
  selector: 'app-componente-servico',
  templateUrl: './componente-servico.component.html',
  styleUrls: ['./componente-servico.component.css'],
})
export class ComponenteServicoComponent implements OnInit {
  photos: Photos;
  erro: any;

  constructor(private photoServico: Servico1Service) {

    this.getter();
  }

  ngOnInit(): void {}

  // tslint:disable-next-line:typedef
  getter() {
    this.photoServico.getPhotos().subscribe(
      (data: Photos) => {
        this.photos = data; // retorna de o que foi pego com o getPhotos para data
        console.log('Retorno na variavel data:', data);
        console.log('Variável photos:', this.photos);
      },
      (error: any) => {
        // caso haja algum erro na execução a cima
        this.erro = error;
        console.error('ERROR: ' + this.erro);
      }
    );
  }
}

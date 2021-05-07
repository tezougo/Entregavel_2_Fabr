import { Component, OnInit } from '@angular/core';
import { Album } from '../models/Album.model';
import { Pessoa } from '../models/Pessoa.model';

@Component({
  selector: 'app-componente1',
  templateUrl: './componente1.component.html',
  styleUrls: ['./componente1.component.css'],
})
export class Componente1Component implements OnInit {
  textocapturado?: string = null;
  albumselecionado = null;
  pessoas = [
    new Pessoa('wagner', 'genro'),
    new Pessoa('suelen', 'filha'),
    new Pessoa('paulo', 'pai'),
  ];

  albuns = [
    new Album('wagner', 'genro'),
    new Album('suelen', 'filha'),
    new Album('paulo', 'pai'),
  ];
  constructor() {}

  ngOnInit(): void {}
}

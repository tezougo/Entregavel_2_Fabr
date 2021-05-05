import { Component, OnInit } from '@angular/core';
import { Album } from '../models/Album.model';

@Component({
  selector: 'app-componente2',
  templateUrl: './componente2.component.html',
  styleUrls: ['./componente2.component.css'],
})
export class Componente2Component implements OnInit {
  // alguns = [
  //   { albumDo: 'wagner', papel: 'genro' },
  //   { albumDo: 'suelen', papel: 'filha' },
  //   { albumDo: 'paulo', papel: 'pai' },
  // ];
  albuns = [
    new Album('wagner', 'genro'),
    new Album('suelen', 'filha'),
    new Album('paulo', 'pai'),
  ];
  constructor() {}

  ngOnInit(): void {}

  // selecionar(album:Album){
  //       console.log('Album selecionado(id): ' + album.id);
  //       this.idAlbum = album.id;

  //     }
}

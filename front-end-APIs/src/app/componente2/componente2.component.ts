import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Album } from '../models/Album.model';
@Component({
  selector: 'app-componente2',
  templateUrl: './componente2.component.html',
  styleUrls: ['./componente2.component.css'],
})
export class Componente2Component implements OnInit {

  constructor() {}
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

  cadastro = new FormGroup({
    nome: new FormControl(''),
    papel: new FormControl('')
  });

  selecionado = null;

  // tslint:disable-next-line:typedef
  salvar(){

    const dados = new Album (this.cadastro.value.nome, this.cadastro.value.papel);
    this.albuns.push(dados);
  }

  // tslint:disable-next-line:typedef
  selecionar(album) {
    this.selecionado = album;
  }

  ngOnInit(): void {}

  // selecionar(album:Album){
  //       console.log('Album selecionado(id): ' + album.id);
  //       this.idAlbum = album.id;

  //     }
}

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
  editando = null;
  nome = null;
  papel = null;
  // tslint:disable-next-line:typedef
  salvar(){

    if (this.editando){

      this.editando.nome = this.nome;
      this.editando.papel = this.papel;
    }
    else{

      const dados = new Album(this.cadastro.value.nome, this.cadastro.value.papel);
      this.albuns.push(dados);
    }
    this.cancelar();
/*     const dados = new Album (this.cadastro.value.nome, this.cadastro.value.papel);
    this.albuns.push(dados); */
  }

  // tslint:disable-next-line:typedef
  excluir(album){

    if (this.editando == album){

      alert('Não pode excluir, em edição');

    }else{

      if (confirm('Deseja realmente excluir "' + album.albumDo + '"?')) {
        const i = this.albuns.indexOf(album); // inserir por indice
        this.albuns.splice(i, 1); // remover por indice
      }

    }


  }

  // tslint:disable-next-line:typedef
  cancelar(){

    this.nome = null;
    this.papel = null;
    this.editando = null;
  }

  // tslint:disable-next-line:typedef
  editar(album){

    this.editando = album;
    this.nome = album.albumDo;
    this.papel = album.papel;
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

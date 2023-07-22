import { Component, OnInit } from '@angular/core';
import { Persona } from './persona';
import { personaService } from './persona.service';

@Component({
  selector: 'app-personas',
  templateUrl: './personas.component.html',
  styleUrls: ['./personas.component.css']
})
export class PersonasComponent implements OnInit {

  personas:Persona[] | undefined;

  constructor(private personaService:personaService){}
  ngOnInit(): void {
    this.personaService.getAll().subscribe(
      person=> this.personas=person
    );
  }
}

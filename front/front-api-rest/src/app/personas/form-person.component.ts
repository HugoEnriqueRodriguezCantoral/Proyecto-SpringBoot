import { Component, OnInit } from '@angular/core';
import { Persona } from './persona';
import { personaService } from './persona.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-form-person',
  templateUrl: './form-person.component.html',
  styleUrls: ['./form-person.component.css']
})
export class FormPersonComponent implements OnInit{

  persona:Persona = new Persona();


  constructor(private personaService:personaService, private router:Router){}

ngOnInit(): void {
  
}
create():void{
  this.personaService.create(this.persona).subscribe(
    res=>this.router.navigate(['/personas'])
  );
}
}

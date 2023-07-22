import { Observable } from "rxjs";
import { Persona } from "./persona";
import {HttpClient} from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable({
    providedIn:'root'
})
export class personaService{
    private url:string="http://localhost:8080/api/personas";
    

    constructor(private http:HttpClient) {}

    getAll():Observable<Persona[]>{
        return this.http.get<Persona[]>(this.url);
    }

    create(persona:Persona):Observable<Persona>{
        return this.http.post<Persona>(this.url, persona);
    }

    getById(id:number):Observable<Persona>{
        return this.http.get<Persona>(this.url+"/"+id);
    }
    deleteById(id:number):Observable<Persona>{
        return this.http.delete<Persona>(this.url+"/"+id);
    }

}
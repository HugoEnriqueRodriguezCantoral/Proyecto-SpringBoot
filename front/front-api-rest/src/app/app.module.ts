import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { Routes, RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonasComponent } from './personas/personas.component';
import { FormPersonComponent } from './personas/form-person.component';

const routes:Routes=[
  {path:'',redirectTo:'/personas', pathMatch:'full'},
  {path:'personas',component:PersonasComponent},
  {path:'personas/formulario',component:FormPersonComponent},
  {path:'personas/formulario/:id',component:FormPersonComponent},
]

@NgModule({
  declarations: [
    AppComponent,
    PersonasComponent,
    FormPersonComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

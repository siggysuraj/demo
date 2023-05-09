import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BabyComponent } from './baby/baby.component';
import { WeatherComponent } from './weather/weather.component';

const routes: Routes = [
  { path: '', component: WeatherComponent },
  { path: 'baby', component: BabyComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

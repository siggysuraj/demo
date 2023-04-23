import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApixuService {

  constructor(private http: HttpClient) {}

  getWeather(location:any){
      return this.http.get(
          'http://api.weatherstack.com/current?access_key=9f4af526333c56ef5babf67f2f9d4650&query='+ location
      );
}
}

// http://api.weatherstack.com/current?access_key=9f4af526333c56ef5babf67f2f9d4650&query=New York
// mine   http://api.weatherstack.com/current?access_key=9f4af526333c56ef5babf67f2f9d4650&query=New York
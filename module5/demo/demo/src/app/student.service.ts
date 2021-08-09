import {Injectable} from '@angular/core';
import {IStudent} from './model/IStudent';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private  readonly  API_URL = 'http://localhost:3000/students';

  constructor(private httpClient: HttpClient) {
  }

  getAllStudent(): Observable<IStudent[]> {
    console.log(this.httpClient.get<IStudent[]>(this.API_URL));
    return this.httpClient.get<IStudent[]>(this.API_URL);
  }

  addNewStudent(student: IStudent): Observable<void>{
    return this.httpClient.post<void>(this.API_URL, student);
  }

  findById(id: number): Observable<IStudent>{
   return this.httpClient.get<IStudent>(this.API_URL + '/' + id) ;
  }
}

import { Component, OnInit } from '@angular/core';
import {IStudent} from '../model/IStudent';
import {studentDao} from '../repository/studentDao';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

   students: IStudent[] = studentDao ;
   ChaStudentDetail: IStudent;
  constructor() { }

  ngOnInit(): void {
  }

  getStudent(value){
   this.ChaStudentDetail = value ;
   console.log(this.ChaStudentDetail);
  }

}
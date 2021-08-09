import { Component, OnInit } from '@angular/core';
import {IStudent} from '../model/IStudent';
import {StudentService} from '../student.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

   students: IStudent[] = [] ;
   ChaStudentDetail: IStudent;
  constructor(private studentService: StudentService) { }

  ngOnInit(): void {
     this.studentService.getAllStudent().subscribe(
       (data) => {
         this.students = data;
       }
     );
  }

  getStudent(value){
   this.ChaStudentDetail = value ;
   console.log(this.ChaStudentDetail);
  }

  catchMarkFromCon(value) {
    console.log(value);
  }
}

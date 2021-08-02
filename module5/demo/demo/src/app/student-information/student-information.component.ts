import {Component, Input, OnInit} from '@angular/core';
import {IStudent} from '../model/IStudent';
import {studentDao} from '../repository/studentDao';

@Component({
  selector: 'app-student-information',
  templateUrl: './student-information.component.html',
  styleUrls: ['./student-information.component.css']
})
export class StudentInformationComponent implements OnInit {

  @Input()
  ConStudentDetail: IStudent ;
  constructor() { }

  ngOnInit(): void {

  }

  changeMark(mark: number) {
    this.ConStudentDetail.mark = mark;
  }
}

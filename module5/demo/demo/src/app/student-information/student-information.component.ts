import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IStudent} from '../model/IStudent';
import {StudentService} from '../student.service';
import {ActivatedRoute, ParamMap} from '@angular/router';

@Component({
  selector: 'app-student-information',
  templateUrl: './student-information.component.html',
  styleUrls: ['./student-information.component.css']
})
export class StudentInformationComponent implements OnInit {
  idStudent: number;
  studentDetail: IStudent;
  // @Input()
  // ConStudentDetail: IStudent ;
  // @Output()
  // throwCurentMark = new EventEmitter(); // khai bao mot su kien
  constructor(private  studentService: StudentService, private  activatedRouter: ActivatedRoute) { }

  ngOnInit(): void {
    this.activatedRouter.paramMap.subscribe((paramMap: ParamMap) =>{
      // tslint:disable-next-line:radix
      this.idStudent = parseInt(paramMap.get('id'));
      this.studentService.findById(this.idStudent).subscribe(
        (data) => {this.studentDetail = data;}
      );
    });
  }

  // changeMark(mark: number) {
  //   this.ConStudentDetail.mark = mark;
  //   this.throwCurentMark.emit(mark);
  // }
}

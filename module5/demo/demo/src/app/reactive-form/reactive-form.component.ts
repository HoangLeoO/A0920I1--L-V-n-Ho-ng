import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import validate = WebAssembly.validate;
import {StudentService} from '../student.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {

  createForm: FormGroup;
  constructor(private fb: FormBuilder , private studentService: StudentService , private  router: Router) {}
  ngOnInit(): void {
    this.createForm = this.fb.group({
      id: ['', Validators.required],
      name: ['', Validators.required],
      age: [''],
      mark: ['0'],
      avatar: ['']
    });
    this.createForm.patchValue({
      id: 5,
      name: 'Hoang',
      age: 20,
      mark: 5 ,
      avatar: ''
    });
  }


  onSubmit() {
    // studentDao.unshift(this.createForm.value);
    this.studentService.addNewStudent(this.createForm.value).subscribe(
      () =>{
        this.router.navigate(['/']);
      }
    );
  }
}

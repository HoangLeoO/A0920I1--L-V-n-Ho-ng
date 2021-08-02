import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  output: number;
  first: number ;
  second: number ;
  operator ;
  constructor() { }
  calculate(){
    switch (this.operator) {
      case '+' :
        this.output =  this.first + this.second ;
        break;
      case  '-' :
        this.output =  this.first - this.second ;
        break;
      case  '*' :
        this.output =  this.first * this.second ;
        break;
      case  '/' :
        this.output =  this.first / this.second ;
        break;
    }
  }
  ngOnInit(): void {
  }
  getFirst(first: number) {
    this.first = first ;
  }

  getSecond(second: number) {
    this.second = second;
  }

  getSelectOperator(value) {
    this.operator = value;
  }
}

import { Component, OnInit } from '@angular/core';
import emlopyees from './data/employees.json'
import { Employee } from './Employees.model';

@Component({
  selector: 'em-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.scss']
})
export class EmployeesComponent implements OnInit {

title:String="Employee Managment System";
employees:Employee[] = emlopyees;
filteredEmployees:any[]=emlopyees;
showIcon:boolean = false;
private _designationFilter:string='';
message:string='';

set designationFilter(value: string)
{
  this._designationFilter = value;
  this.filterByDesignation();
}

get designationFilter(): string{
  return this._designationFilter;
}

  constructor() { }

  ngOnInit(): void {
  }

  toggleIcon(){
    this.showIcon = !this.showIcon;
  }

  filterByDesignation()
  {
    this.filteredEmployees = this.employees.filter(employee=>employee.designation.includes(this.designationFilter))
  }

  onMessageRecived(value: string) {
    this.message = value;
  }
}

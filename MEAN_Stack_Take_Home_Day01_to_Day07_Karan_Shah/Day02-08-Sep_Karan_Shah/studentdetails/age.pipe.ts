import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'age'
})
export class AgePipe implements PipeTransform {
  presentYear:any;
  birthYear:any;
  age:any;

  transform(value: any): any {
    this.presentYear = new Date().getFullYear();
    this.birthYear = new Date(value).getFullYear();
    this.age = this.presentYear - this.birthYear;
    return this.age;
  }

}

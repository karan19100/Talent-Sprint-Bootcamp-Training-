import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'gender'
})
export class GenderPipe implements PipeTransform {

  transform(empName: any, gender : any): any {
    if(gender == 'M')
    return 'Mr. '+empName;
    else
    return 'Miss. '+empName;
  }
}

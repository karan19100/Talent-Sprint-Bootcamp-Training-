import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeSystemComponent } from './employee-system.component';

describe('EmployeeSystemComponent', () => {
  let component: EmployeeSystemComponent;
  let fixture: ComponentFixture<EmployeeSystemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmployeeSystemComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployeeSystemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

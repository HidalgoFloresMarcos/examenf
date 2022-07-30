import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrarappComponent } from './registrarapp.component';

describe('RegistrarappComponent', () => {
  let component: RegistrarappComponent;
  let fixture: ComponentFixture<RegistrarappComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegistrarappComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RegistrarappComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

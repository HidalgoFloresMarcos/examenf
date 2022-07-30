import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ActualizarindicadorComponent } from './actualizarindicador.component';

describe('ActualizarindicadorComponent', () => {
  let component: ActualizarindicadorComponent;
  let fixture: ComponentFixture<ActualizarindicadorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ActualizarindicadorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ActualizarindicadorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

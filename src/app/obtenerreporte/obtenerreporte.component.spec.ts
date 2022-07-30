import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ObtenerreporteComponent } from './obtenerreporte.component';

describe('ObtenerreporteComponent', () => {
  let component: ObtenerreporteComponent;
  let fixture: ComponentFixture<ObtenerreporteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ObtenerreporteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ObtenerreporteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

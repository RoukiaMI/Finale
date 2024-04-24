import { Component, OnInit } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { ActivatedRoute, RouterLink } from '@angular/router';
import { Qcm } from '../models/qcm';
import { NgFor, NgIf } from '@angular/common';
import { QcmService } from '../services/qcm.service';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-qcm',
  standalone: true,
  imports: [ReactiveFormsModule, NgFor, NgIf, HttpClientModule, RouterLink],
  providers: [QcmService],
  templateUrl: './qcm.component.html',
  styleUrls: ['./qcm.component.scss'],
})
export class QcmComponent implements OnInit {
  public qcm: Qcm | undefined;
  constructor(private route: ActivatedRoute, private qcmService: QcmService) {}

  ngOnInit() {
    this.getQcmById();
  }

  getQcmById(): void {
    var id = this.route.snapshot.params['id'];
    this.qcmService.getQcmById(id).subscribe((qcm) => (this.qcm = qcm));
  }

  validate(): void {
    alert('Vos réponses ont bien été enregistrés');
  }
}

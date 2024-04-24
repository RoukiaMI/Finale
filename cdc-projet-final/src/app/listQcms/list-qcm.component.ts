import { Component } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { Qcm } from '../models/qcm';
import { QcmService } from '../services/qcm.service';
import { NgFor } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-list-qcm',
  standalone: true,
  imports: [ReactiveFormsModule, RouterLink, NgFor, HttpClientModule],
  providers: [QcmService],
  templateUrl: './list-qcm.component.html',
  styleUrls: ['./list-qcm.component.scss'],
})
export class ListQcmComponent {
  qcms: Qcm[] = [];

  constructor(private qcmService: QcmService) {}

  ngOnInit(): void {
    this.getQcms();
  }

  getQcms(): void {
    this.qcmService.getQcms().subscribe((qcms) => (this.qcms = qcms));
  }
}

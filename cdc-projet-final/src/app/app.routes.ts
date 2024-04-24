import { Routes } from '@angular/router';
import { AuthenticationComponent } from './authentication/authentication.component';
import { QcmComponent } from './qcm/qcm.component';
import { HomeComponent } from './home/home.component';
import { ListQcmComponent } from './listQcms/list-qcm.component';

export const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
  },
  {
    path: 'authentication',
    component: AuthenticationComponent,
  },
  {
    path: 'qcms',
    component: ListQcmComponent,
  },
  {
    path: 'qcms/qcm/:id',
    component: QcmComponent,
  },
];

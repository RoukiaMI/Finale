import { Component } from '@angular/core';
import {
  FormControl,
  FormGroup,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';
import { ActivatedRoute, Router, RouterOutlet } from '@angular/router';
import { AuthenticationService } from '../services/authentication.service';
import { User } from '../models/user';
import { AuthenticationForm } from '../models/authenticationForm';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-authentication',
  standalone: true,
  imports: [ReactiveFormsModule, RouterOutlet, HttpClientModule],
  providers: [AuthenticationService],
  templateUrl: './authentication.component.html',
  styleUrls: ['./authentication.component.scss'],
})
export class AuthenticationComponent {
  title = 'Authentication';
  user: User | null = null;

  constructor(
    private authenticationService: AuthenticationService,
    private router: Router,
    private route: ActivatedRoute
  ) {}

  authenticate(authenticationForm: AuthenticationForm): void {
    this.authenticationService
      .authenticate(authenticationForm)
      .subscribe((user) => (this.user = user));
  }

  authenticationForm = new FormGroup({
    username: new FormControl('', [
      Validators.required,
      Validators.minLength(5),
    ]),
    password: new FormControl('', [
      Validators.required,
      Validators.minLength(6),
    ]),
  });

  onSubmit() {
    this.authenticate({
      username: this.authenticationForm.value.username!,
      password: this.authenticationForm.value.password!,
    });
    this.goToQcms(this.user!);
  }

  goToQcms(user: User) {
    this.router.navigate(['/qcms'], { relativeTo: this.route });
  }
}

import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { User } from '../user';

@Component({
  selector: 'app-baby',
  templateUrl: './baby.component.html',
  styleUrls: ['./baby.component.css']
})
export class BabyComponent {

  registrationForm: FormGroup;
  user!: User;

  constructor(private fb: FormBuilder) {
    this.registrationForm = this.fb.group({
      date: ['', Validators.required],
      text1: ['', [Validators.required]],
      text2: ['', [Validators.required, Validators.minLength(6)]],
      text3: ['', [Validators.required, Validators.minLength(6)]]
    });
  }
  onSubmit() {
   // Check if form is valid
   if (this.registrationForm.valid) {
    // Map form data to user object
    this.user = {
      date: this.registrationForm.value.date,
      text1: this.registrationForm.value.text1,
      text2: this.registrationForm.value.text2,
      text3: this.registrationForm.value.text3
    };
    // Submit user object to server
    console.log(this.user);
  }
  }
}

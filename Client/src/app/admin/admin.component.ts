import { Component, OnInit } from '@angular/core';
import { first } from 'rxjs/operators';
import { UserAuthService } from '../_services/user-auth.service';
import { UserService } from '../_services/user.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  message;
  constructor(  private userService: UserService,
    private userAuthService: UserAuthService
    ) { }

  ngOnInit(): void {
     this.forAdmin(); 
  }
  forAdmin() {
    this.userService.forAdmin().subscribe(
      (response) => {
        console.log(response);
        this.message = response;
      }, 
      (error)=>{
        console.log(error);
      }
    );
    }
    
  
}

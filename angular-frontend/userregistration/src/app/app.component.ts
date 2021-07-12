import {Component, OnInit} from '@angular/core';
import {User} from "./user";
import {UserService} from "./user.service";
import {HttpErrorResponse} from "@angular/common/http";
import {NgForm} from "@angular/forms";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'userregistration';
  public users: User[];
  public editUser: User;
  deleteUser: User;

  constructor (private userService: UserService){}

  ngOnInit() {
    this.getAllUsers();
  }

  public getAllUsers():void {
    this.userService.getAllUsers().subscribe(
      (response:User[]) =>{
        this.users = response;
      },
      (error: HttpErrorResponse) =>{
        alert(error.message);
    }
    );
  }

  public onAddUser(addForm: NgForm): void {
    document.getElementById('add-user-form').click();
    this.userService.addUser(addForm.value).subscribe(
      (response:User)=> {
        console.log(response);
        this.getAllUsers();
        addForm.reset();
      },
      (error:HttpErrorResponse)=>{
        alert(error.message);
        addForm.reset();
      }
    );

  }


  public onUpdateUser(user: User): void {
    this.userService.updateUser(user).subscribe(
      (response:User)=> {
        console.log(response);
        this.getAllUsers();
      },
      (error:HttpErrorResponse)=>{
        alert(error.message);
      }
    );

  }




  public onDeleteUser(id: number): void {
    this.userService.deleteUser(id).subscribe(
      (response:void)=> {
        console.log(response);
        this.getAllUsers();
      },
      (error:HttpErrorResponse)=>{
        alert(error.message);
      }
    );

  }


public searchUser(key: string): void{
    console.log(key);
    const results: User[] = [];
    for (const user of this.users){
      if (user.firstname.toLowerCase().indexOf(key.toLowerCase()) !== -1
      || user.email.toLowerCase().indexOf(key.toLowerCase()) !== -1
      ||user.nid !== -1
      || user.id !== -1
      ||user.contact_no !== -1){
        results.push(user);
      }
    }
    this.users = results;
    if(results.length === 0 || !key){
      this.getAllUsers();
    }
}




  public onOpenModal(user: User, mode: string): void{
    const container = document.getElementById('main-container');





    const button = document.createElement('button');
    button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle','modal');
    if (mode === 'add'){
      button.setAttribute('data-target','#addUserModal');
    }
    if (mode === 'edit'){
      this.editUser = user;
      button.setAttribute('data-target','#updateUserModal');
    }
    if (mode === 'delete'){
      this.deleteUser = user;
      button.setAttribute('data-target','#deleteUserModal');
    }
    container.appendChild(button);
    button.click();
  }

}

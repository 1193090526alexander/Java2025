import { Component, signal } from '@angular/core';
import { RouterOutlet, RouterLinkActive, RouterModule } from '@angular/router';


@Component({
  selector: 'app-root',
  imports: [RouterLinkActive, RouterOutlet, RouterModule],
  templateUrl: './app.html',
})
export class App {
  protected readonly title = signal('inventario-app');
}

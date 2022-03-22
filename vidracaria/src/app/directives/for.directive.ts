import { Directive, OnInit, /*Input, TemplateRef, ViewConatainerRef */} from '@angular/core';

@Directive({
  selector: '[myFor]'
})
export class ForDirective implements OnInit {
  /*@Input('myForEm') numbers: number[]; */

  constructor(
    /*private container: ViewConatainerRef,
     private template : TemplateRef<any>*/) {
  }

  ngOnInit(): void {
    /*for(let number of this.numbers) {
      this.container.createEmbededView(
        this.template,
         { $implicit : number}); */
    }

  }



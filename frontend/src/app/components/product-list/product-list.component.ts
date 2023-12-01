import { Component , OnInit } from '@angular/core';
import { Product } from '../../common/product';
import { ProductService } from '../../services/product.service';

@Component({
  selector: 'app-product-list',
  standalone: true,
  imports: [],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.css'
})
export class ProductListComponent implements OnInit {

  products: Product[] = [];

  constructor(private service: ProductService){

  }
  ngOnInit(): void {   
      this.listProducts();
  }

  listProducts(){
    this.service.getProducts().subscribe(
      data => {
        this.products = data;
      }
    )
  }

}

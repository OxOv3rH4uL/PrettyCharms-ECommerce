import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../common/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  baseURL: string = "http://localhost:8080/api/products";
  
  constructor(private httpcli: HttpClient) { }

  getProducts(): Observable<Product[]> {
    return this.httpcli.get<Product[]>(this.baseURL);
  }
}

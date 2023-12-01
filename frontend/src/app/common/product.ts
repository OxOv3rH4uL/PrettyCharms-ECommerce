export class Product {

    constructor(
        public sku:string,
        public name:string,
        public description:string,
        public unitPrice:number,
        public image_url:string,
        public active:boolean,
        public dateCreated:Date,
        public dateUpdated:Date,

    ){}
}

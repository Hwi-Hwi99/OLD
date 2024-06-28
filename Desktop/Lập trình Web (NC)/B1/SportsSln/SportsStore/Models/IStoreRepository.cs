namespace SportsStore.Models 
{ 
    public interface IStoreRepository 
    { 
        IQueryable<Product> Product { get; } 
        void SaveProduct(Product p); 
        void CreateProduct(Product p); 
        void DeleteProduct(Product p);
    } 
}
namespace SportsStore.Models.ViewModels 
{ 
    public class ProductsListViewModel 
    { 
        public IEnumerable<Product> Product { get; set; } = Enumerable.Empty<Product>(); 
        public PagingInfo PagingInfo { get; set; } = new();
        public string? CurrentCategory { get; set; } 
    } 
}
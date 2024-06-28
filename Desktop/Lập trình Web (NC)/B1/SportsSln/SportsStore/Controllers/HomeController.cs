using Microsoft.AspNetCore.Mvc;
using SportsStore.Models;
using SportsStore.Models.ViewModels;

namespace SportsStore.Controllers 
{
    public class HomeController: Controller 
    {
        private IStoreRepository repository;
        public int PageSize = 4;
        public HomeController(IStoreRepository repo) 
        { repository = repo; } 
        public ViewResult Index(string?category, int productPage = 1)
        => View(new ProductsListViewModel 
        {
            Product = repository.Product
            .Where(p => category == null || p.Category == category)
            .OrderBy(p => p.ProductID) 
            .Skip((productPage - 1) * PageSize) 
            .Take(PageSize),
            PagingInfo = new PagingInfo
            {
                CurrentPage = productPage, 
                ItemsPerPage = PageSize, 
                TotalItems = category == null 
                ? repository.Product.Count() : 
                repository.Product.Where(e => e.Category == category).Count()
            },
            CurrentCategory = category
        });
    }
}
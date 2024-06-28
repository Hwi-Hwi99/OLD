using Microsoft.EntityFrameworkCore; 

namespace SportsStore.Models 
{ 
    public class StoreDbContext: DbContext 
    { 
        public StoreDbContext(DbContextOptions<StoreDbContext> options) 
        : base(options) { } 
        public DbSet<Product> Product => Set<Product>();
        public DbSet<Order> Order => Set<Order>(); 
    } 
}
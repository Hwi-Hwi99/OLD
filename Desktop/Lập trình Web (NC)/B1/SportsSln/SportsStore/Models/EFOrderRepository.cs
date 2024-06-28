using Microsoft.EntityFrameworkCore; 

namespace SportsStore.Models 
{ 
    public class EFOrderRepository: IOrderRepository 
    { 
        private StoreDbContext context; 
        public EFOrderRepository(StoreDbContext ctx) { context = ctx; } 
        public IQueryable<Order> Order => context.Order 
        .Include(o => o.Lines) 
        .ThenInclude(l => l.Product); 
        public void SaveOrder(Order order) 
        { 
            context.AttachRange(order.Lines.Select(l => l.Product)); 
            if (order.OrderID == 0) { context.Order.Add(order); }
            context.SaveChanges(); 
        } 
    }
}
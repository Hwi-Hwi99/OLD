using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prototype
{
    class Program
    {
        static void Main(string[] args)
        {
            ConcretePrototype1 mConcretePrototype1 = new ConcretePrototype1();
            mConcretePrototype1.age = 10;
            ConcretePrototype1 cloneItem1 = (ConcretePrototype1) mConcretePrototype1.Clone();
            Console.WriteLine("Do tuoi cua clone item la: " + cloneItem1.age);

            mConcretePrototype1.age = 15;
            Console.WriteLine("Do tuoi cua mConcretePrototype1 la: " + mConcretePrototype1.age);
            Console.WriteLine("Do tuoi cua clone item la: " + cloneItem1.age);
        }
    }
}
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prototype
{
	class ConcretePrototype1: Prototype
	{
		public int age { get; set; }

		public override Prototype Clone()
		{
            return (Prototype)this.MemberwiseClone();
		}
	}
}


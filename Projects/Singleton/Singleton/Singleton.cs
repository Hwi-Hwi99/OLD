﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Singleton
{
    public sealed class Singleton
    {
        public static Singleton Instance { get; } = new Singleton();

        private Singleton() { }

        public string GetName()
        {
            return "Singleton Pattern";
        }
    }
}


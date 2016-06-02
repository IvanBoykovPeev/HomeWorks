using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using OpenTK.Graphics.OpenGL;

namespace DrawOpenGL
{
    public abstract class Shape
    {

        private List<Shape> shapeList = new List<Shape>();
        private bool isSelected = false;
        private int name;

        public int Name
        {
            get { return name; }
            set { name = value; }
        }

        public bool IsSelected
        {
            get { return isSelected; }
            set { isSelected = value; }
        }
        public List<Shape> ShapeList
        {
            get { return shapeList; }
            set { shapeList = value; }
        }
        public Shape()
        {            
        }

        public Shape(Shape shape)
        {
            this.IsSelected = shape.isSelected;
            this.Name = shape.Name;
        }

        internal virtual void DrawSelf()
        {            
        }

    }
}

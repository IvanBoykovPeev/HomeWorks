using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Drawing;
using OpenTK.Graphics.OpenGL;

namespace DrawOpenGL
{
    class Point : Shape
    {
        private int x;

        public int X
        {
            get { return x; }
            set { x = value; }
        }
        private int y;

        public int Y
        {
            get { return y; }
            set { y = value; }
        }

        public Point(int x, int y, int name)
        {
            this.X = x;
            this.Y = y;
            this.Name = name;
        }
        internal override void DrawSelf()
        {
            base.DrawSelf();
            
            GL.MatrixMode(MatrixMode.Modelview);
            GL.LoadIdentity();
            GL.PointSize(10);
            GL.Color3(Color.Tomato);
            //GL.Translate(X, 0, 0);
            GL.InitNames();
            GL.PushName(Name);
            GL.LoadName(Name);
            GL.Begin(BeginMode.Points);
            GL.Vertex2(X, Y);
            GL.End();
        }
    }
}

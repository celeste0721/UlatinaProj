using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Reflection.Emit;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ApGira
{

public partial class Form1 : Form
    {
        bool laRuedaEstaMoviendo;
        float vueltasDeRueda;
        Timer temporizadorDeRueda;
        LuckyCircle circuloDeLaSuerte;

        public Form1()
        {
            InitializeComponent();
            temporizadorDeRueda = new Timer();
            temporizadorDeRueda.Interval = 30; // speed
            temporizadorDeRueda.Tick += temporizadorDeRueda_Tick;
            circuloDeLaSuerte = new LuckyCircle();
        }

        public class LuckyCircle
        {
            public Bitmap imagen;
            public Bitmap imagenTemporal;
            public float angulo;
            public string[] valoresDeEstado;
            public int estado = 0;

            public LuckyCircle()
            {
                imagenTemporal = new Bitmap(Properties.Resources.lucky_Wheel);
                imagen = new Bitmap(Properties.Resources.lucky_Wheel);
                valoresDeEstado = new string[] { "State A Historia", "State B Ciencia", "State C Geografia", "State D", "State E", "State F Corona", "State G", "State H Entretenimiento", "State I Arte", "State J", "State K Deporte", "State L" };
                angulo = 0.0f;
            }
        }

        public static Bitmap RotarImagen(Image imagen, float angulo)
        {
            return RotarImagen(imagen, new PointF((float)imagen.Width / 2, (float)imagen.Height / 2), angulo);
        }

        public static Bitmap RotarImagen(Image imagen, PointF offset, float angulo)
        {
            if (imagen == null)
                throw new ArgumentNullException("imagen");

            Bitmap imagenRotada = new Bitmap(imagen.Width, imagen.Height);
            imagenRotada.SetResolution(imagen.HorizontalResolution, imagen.VerticalResolution);
            Graphics g = Graphics.FromImage(imagenRotada);
            g.TranslateTransform(offset.X, offset.Y);
            g.RotateTransform(angulo);
            g.TranslateTransform(-offset.X, -offset.Y);
            g.DrawImage(imagen, new PointF(0, 0));
            return imagenRotada;
        }

        private void RotarImagen(PictureBox pb, Image img, float angulo)
        {
            if (img == null || pb.Image == null)
                return;

            Image imagenAnterior = pb.Image;
            pb.Image = RotarImagen(img, angulo);
            if (imagenAnterior != null)
            {
                imagenAnterior.Dispose();
            }
        }

        private void temporizadorDeRueda_Tick(object sender, EventArgs e)
        {
            if (laRuedaEstaMoviendo && vueltasDeRueda > 0)
            {
                circuloDeLaSuerte.angulo += vueltasDeRueda / 10;
                circuloDeLaSuerte.angulo = circuloDeLaSuerte.angulo % 360;
                RotarImagen(pictureBox1, circuloDeLaSuerte.imagen, circuloDeLaSuerte.angulo);
                vueltasDeRueda--;
            }

            circuloDeLaSuerte.estado = Convert.ToInt32(Math.Ceiling(circuloDeLaSuerte.angulo / 30));

            if (circuloDeLaSuerte.estado == 0)
            {
                circuloDeLaSuerte.estado = 0;
            }
            else
            {
                circuloDeLaSuerte.estado -= 1;
            }
            label1.Text = circuloDeLaSuerte.valoresDeEstado[circuloDeLaSuerte.estado];
        }


        private void button1_Click(object sender, EventArgs e)
        {
            laRuedaEstaMoviendo = true;
            Random rand = new Random();
            vueltasDeRueda = rand.Next(150, 200); // número de vueltas al azar
            temporizadorDeRueda.Start();


        }

        private void label2_Click(object sender, EventArgs e)
        {

        }
    }
}



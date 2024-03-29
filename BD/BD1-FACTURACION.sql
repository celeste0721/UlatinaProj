USE [master]
GO
/****** Object:  Database [FACTURACION]    Script Date: 18/02/2023 0:03:50 ******/
CREATE DATABASE [FACTURACION]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'FACTURACION', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\FACTURACION.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'FACTURACION_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\FACTURACION_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [FACTURACION] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [FACTURACION].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [FACTURACION] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [FACTURACION] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [FACTURACION] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [FACTURACION] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [FACTURACION] SET ARITHABORT OFF 
GO
ALTER DATABASE [FACTURACION] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [FACTURACION] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [FACTURACION] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [FACTURACION] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [FACTURACION] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [FACTURACION] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [FACTURACION] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [FACTURACION] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [FACTURACION] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [FACTURACION] SET  ENABLE_BROKER 
GO
ALTER DATABASE [FACTURACION] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [FACTURACION] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [FACTURACION] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [FACTURACION] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [FACTURACION] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [FACTURACION] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [FACTURACION] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [FACTURACION] SET RECOVERY FULL 
GO
ALTER DATABASE [FACTURACION] SET  MULTI_USER 
GO
ALTER DATABASE [FACTURACION] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [FACTURACION] SET DB_CHAINING OFF 
GO
ALTER DATABASE [FACTURACION] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [FACTURACION] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [FACTURACION] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [FACTURACION] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'FACTURACION', N'ON'
GO
ALTER DATABASE [FACTURACION] SET QUERY_STORE = OFF
GO
USE [FACTURACION]
GO
/****** Object:  Table [dbo].[Articulo]    Script Date: 18/02/2023 0:03:50 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Articulo](
	[Id_Articulo] [int] NOT NULL,
	[Nombre_Articulo] [varchar](50) NULL,
	[Precio] [numeric](9, 2) NULL,
	[Id_Categoria] [int] NOT NULL,
 CONSTRAINT [PK_Articulo] PRIMARY KEY CLUSTERED 
(
	[Id_Articulo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Categoria]    Script Date: 18/02/2023 0:03:50 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Categoria](
	[Id_Categoria] [int] NOT NULL,
	[Nombre_Categoria] [varchar](50) NULL,
 CONSTRAINT [PK_Categoria] PRIMARY KEY CLUSTERED 
(
	[Id_Categoria] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Cliente]    Script Date: 18/02/2023 0:03:50 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cliente](
	[Id_Cliente] [int] NOT NULL,
	[Nombre] [varchar](30) NULL,
	[Apellido] [varchar](30) NULL,
	[Cod_Prov] [int] NULL,
 CONSTRAINT [PK_Cliente] PRIMARY KEY CLUSTERED 
(
	[Id_Cliente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DetalleFactura]    Script Date: 18/02/2023 0:03:50 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DetalleFactura](
	[Id_Factura] [int] NOT NULL,
	[Id_Articulo] [int] NOT NULL,
	[Cantidad] [numeric](7, 0) NOT NULL,
	[Precio] [numeric](9, 2) NOT NULL,
 CONSTRAINT [PK_Detalle_Factura] PRIMARY KEY CLUSTERED 
(
	[Id_Factura] ASC,
	[Id_Articulo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Factura]    Script Date: 18/02/2023 0:03:50 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Factura](
	[Id_Factura] [int] IDENTITY(1,1) NOT NULL,
	[Cliente] [int] NULL,
	[Fecha] [datetime] NOT NULL,
	[Tipo_Pago] [int] NOT NULL,
 CONSTRAINT [PK_Facturas] PRIMARY KEY CLUSTERED 
(
	[Id_Factura] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Provincia]    Script Date: 18/02/2023 0:03:50 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Provincia](
	[Cod_Provincia] [int] NOT NULL,
	[Nombre] [varchar](30) NULL,
 CONSTRAINT [PK_Provincia] PRIMARY KEY CLUSTERED 
(
	[Cod_Provincia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Articulo]  WITH CHECK ADD  CONSTRAINT [FK_Articulo_Categoria] FOREIGN KEY([Id_Categoria])
REFERENCES [dbo].[Categoria] ([Id_Categoria])
GO
ALTER TABLE [dbo].[Articulo] CHECK CONSTRAINT [FK_Articulo_Categoria]
GO
ALTER TABLE [dbo].[Cliente]  WITH CHECK ADD  CONSTRAINT [FK_Cliente_Provincia] FOREIGN KEY([Cod_Prov])
REFERENCES [dbo].[Provincia] ([Cod_Provincia])
GO
ALTER TABLE [dbo].[Cliente] CHECK CONSTRAINT [FK_Cliente_Provincia]
GO
ALTER TABLE [dbo].[DetalleFactura]  WITH CHECK ADD  CONSTRAINT [FK_DetalleFactura_Articulo] FOREIGN KEY([Id_Articulo])
REFERENCES [dbo].[Articulo] ([Id_Articulo])
GO
ALTER TABLE [dbo].[DetalleFactura] CHECK CONSTRAINT [FK_DetalleFactura_Articulo]
GO
ALTER TABLE [dbo].[DetalleFactura]  WITH CHECK ADD  CONSTRAINT [FK_DetalleFactura_Factura] FOREIGN KEY([Id_Factura])
REFERENCES [dbo].[Factura] ([Id_Factura])
GO
ALTER TABLE [dbo].[DetalleFactura] CHECK CONSTRAINT [FK_DetalleFactura_Factura]
GO
ALTER TABLE [dbo].[Factura]  WITH CHECK ADD  CONSTRAINT [CH_Tipo_Pago] CHECK  (([Tipo_Pago]>=(1) AND [Tipo_Pago]<=(3)))
GO
ALTER TABLE [dbo].[Factura] CHECK CONSTRAINT [CH_Tipo_Pago]
GO
USE [master]
GO
ALTER DATABASE [FACTURACION] SET  READ_WRITE 
GO

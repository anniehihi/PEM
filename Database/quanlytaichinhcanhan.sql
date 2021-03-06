USE [quanlytaichinhcanhan]
GO
/****** Object:  Table [dbo].[cashbalance]    Script Date: 8/13/2015 5:11:42 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[cashbalance](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[namemoney] [nvarchar](50) NULL,
	[money] [money] NULL,
	[Date] [date] NULL,
	[description] [ntext] NULL,
	[usersid] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[DailyMoney]    Script Date: 8/13/2015 5:11:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DailyMoney](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[namemoney] [nvarchar](100) NULL,
	[money] [money] NULL,
	[Date] [date] NULL,
	[description] [ntext] NULL,
	[usersid] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[incomemoney]    Script Date: 8/13/2015 5:11:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[incomemoney](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[namemoney] [nvarchar](50) NULL,
	[money] [money] NULL,
	[Date] [date] NULL,
	[description] [ntext] NULL,
	[usersid] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[moneyinvested]    Script Date: 8/13/2015 5:11:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[moneyinvested](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[typesofinvestments] [nvarchar](100) NULL,
	[nameinvestments] [nvarchar](100) NULL,
	[money] [money] NULL,
	[Date] [date] NULL,
	[description] [ntext] NULL,
	[usersid] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[MoneyShopping]    Script Date: 8/13/2015 5:11:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MoneyShopping](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[namemoney] [nvarchar](100) NULL,
	[money] [money] NULL,
	[Date] [date] NULL,
	[description] [ntext] NULL,
	[usersid] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[statistical]    Script Date: 8/13/2015 5:11:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[statistical](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[DailyMoney] [money] NULL,
	[MoneyShopping] [money] NULL,
	[incomemoney] [money] NULL,
	[cashbalance] [money] NULL,
	[date] [nvarchar](50) NULL,
	[usersid] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[users]    Script Date: 8/13/2015 5:11:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[users](
	[usersid] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](100) NULL,
	[username] [nvarchar](100) NULL,
	[password] [varchar](100) NULL,
	[dataofbrith] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[usersid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[cashbalance] ON 

INSERT [dbo].[cashbalance] ([id], [namemoney], [money], [Date], [description], [usersid]) VALUES (1, N'dscd', 1.0000, CAST(0x4E3A0B00 AS Date), N'csdc', 1)
INSERT [dbo].[cashbalance] ([id], [namemoney], [money], [Date], [description], [usersid]) VALUES (2, N'dscd', 1.0000, CAST(0x723A0B00 AS Date), N'csdc', 1)
INSERT [dbo].[cashbalance] ([id], [namemoney], [money], [Date], [description], [usersid]) VALUES (3, N'sdcs', 21212.0000, CAST(0x4E3A0B00 AS Date), N'', 1)
SET IDENTITY_INSERT [dbo].[cashbalance] OFF
SET IDENTITY_INSERT [dbo].[moneyinvested] ON 

INSERT [dbo].[moneyinvested] ([id], [typesofinvestments], [nameinvestments], [money], [Date], [description], [usersid]) VALUES (4, NULL, N'saxas', 212.0000, CAST(0x4E3A0B00 AS Date), N'', 2)
INSERT [dbo].[moneyinvested] ([id], [typesofinvestments], [nameinvestments], [money], [Date], [description], [usersid]) VALUES (5, NULL, N'saxas', 444.0000, CAST(0x4E3A0B00 AS Date), N'', 2)
SET IDENTITY_INSERT [dbo].[moneyinvested] OFF
SET IDENTITY_INSERT [dbo].[MoneyShopping] ON 

INSERT [dbo].[MoneyShopping] ([id], [namemoney], [money], [Date], [description], [usersid]) VALUES (3, N'scacsa', 31312.0000, CAST(0x4E3A0B00 AS Date), N'', 2)
INSERT [dbo].[MoneyShopping] ([id], [namemoney], [money], [Date], [description], [usersid]) VALUES (4, N'fgbfg', 6666.0000, CAST(0x4E3A0B00 AS Date), N'', 2)
SET IDENTITY_INSERT [dbo].[MoneyShopping] OFF
SET IDENTITY_INSERT [dbo].[users] ON 

INSERT [dbo].[users] ([usersid], [name], [username], [password], [dataofbrith]) VALUES (1, N'nguyen trong quyen', N'trongquyenafc', N'60601f0f2e448d1f8e91fd05dfc8ba25', CAST(0x411F0B00 AS Date))
INSERT [dbo].[users] ([usersid], [name], [username], [password], [dataofbrith]) VALUES (2, N'a', N'a', N'0cc175b9c0f1b6a831c399e269772661', CAST(0x4E3A0B00 AS Date))
SET IDENTITY_INSERT [dbo].[users] OFF
ALTER TABLE [dbo].[cashbalance]  WITH CHECK ADD FOREIGN KEY([usersid])
REFERENCES [dbo].[users] ([usersid])
GO
ALTER TABLE [dbo].[DailyMoney]  WITH CHECK ADD FOREIGN KEY([usersid])
REFERENCES [dbo].[users] ([usersid])
GO
ALTER TABLE [dbo].[incomemoney]  WITH CHECK ADD FOREIGN KEY([usersid])
REFERENCES [dbo].[users] ([usersid])
GO
ALTER TABLE [dbo].[moneyinvested]  WITH CHECK ADD FOREIGN KEY([usersid])
REFERENCES [dbo].[users] ([usersid])
GO
ALTER TABLE [dbo].[MoneyShopping]  WITH CHECK ADD FOREIGN KEY([usersid])
REFERENCES [dbo].[users] ([usersid])
GO
ALTER TABLE [dbo].[statistical]  WITH CHECK ADD FOREIGN KEY([usersid])
REFERENCES [dbo].[users] ([usersid])
GO

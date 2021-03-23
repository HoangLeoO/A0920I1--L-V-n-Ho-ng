drop database if exists thu_vien ;
create database if not exists thu_vien ;
use thu_vien;
create table Sach(
MaSach int not null unique ,
TenSach varchar(40) not null unique,
LoaiSach varchar(40) not null  ,
NhaXuatBan varchar(40) not null ,
NamXuatBan int not null ,
SoLanXuatBan int not null ,
TacGia varchar (40) not null ,
Gia float not null,
Anh text ,
constraint pk_MaSach primary key (MaSach) ,
constraint fk_LoaiSach foreign key (LoaiSach) references Loai_Sach (LoaiSach)
);
create table SinhVien(
MaThe int unique not null ,
MaSinhVien int unique not null ,
TenSinhVien varchar(40) not null ,
NgaySinh date not null ,
DiaChi varchar(250) not null ,
SoDienThoai int not null ,
Anh text ,
constraint pk_MaSinhVien primary key (MaSinhVien)
);
create table Loai_Sach(
MaSach int unique not null ,
LoaiSach varchar (40),
constraint pk_Loai_Sach primary key(LoaiSach)
);
create table PhieuMuon(
MaPhieu int unique not null ,
MaSinHVien int unique not null ,
MaSach int unique not null,
TenSinhVien varchar (40) not null,
SachMuon varchar(40) not null,
NgayMuon date not null ,
NgayTra date not null ,
TrangThaiTraSach varchar (40) not null ,
constraint pk_MaPhieu primary key(MaPhieu),
constraint pk_MaSinhVien foreign key(MaSinhVien) references SinhVien(MaSinhVien)
);
create database case_study;
use case_study;
create table LoaiKhach(
Id int primary key 
);
create table NhanVien(
IDNhanVien int primary key ,
HoTen varchar(255),
IDViTri int,
IDTrinhDo int,
IDBoPhan int ,
NgaySinh date,
DiaChi varchar(255),
Email varchar(255),
Luong varchar(255)
);
create table ViTri (
IDViTri int ,
TenViTri varchar(255)
);
create table TrinhDo (
IDTrinhDo int ,
LoaiTrinhDo varchar(255)
);
create table BoPhan (
IDBoPhan int ,
TenBoPhan varchar(255)
);
create table KhachHang(
IDKhachHang int ,
IDLoaiKhach int ,
HoTen varchar(255),
NgaySinh date ,
SoCMND 
);
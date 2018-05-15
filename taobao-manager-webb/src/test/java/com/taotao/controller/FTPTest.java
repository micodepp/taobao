package com.taotao.controller;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class FTPTest {
	@Test
	public void testFtpClient() throws Exception{
		
	//创建一个FtpClient对象
		FTPClient ftpClient=new FTPClient();
	//创建Ftp 连接
		ftpClient.connect("master", 21);
	//登陆Ftp服务器，使用用户名和密码
		ftpClient.login("master", "master");
	//上传文件
	//读取本地文件
		String str="D:\\page-0002.JPG";  
		//转义转义
		String location=str.replace("\\\\", "/");
		FileInputStream inputStream =new FileInputStream(new File(location));
	//设置上传路径
		ftpClient.changeWorkingDirectory("/home/master/www/images");
	//修改文件上传格式
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
	//第一个参数：服务器文档名
	//第二个参数：上传文档的inpuStream
		ftpClient.storeFile("hello.jpg", inputStream);
	//关闭连接	
		ftpClient.logout();
	}

}

package com.example.javadesignmode.singleton;

import java.util.Date;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		try {
			String imgurl = "http://localhost:9081/NMSP/highChartsImageServlet";
			URL url = new URL(imgurl);
			BufferedInputStream in = new BufferedInputStream(url.openStream());
			// 保存的图片文件名
			File img = new File("D:\\img.jpg");
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream(img));
			byte[] buf = new byte[2048];
			while (in.read(buf) != -1) {
				out.write(buf);
			}
			in.close();
			out.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		**/
		System.out.println(new Date().getTime()+""+(int)((Math.random()*9+1)*100000)+"");
		System.out.println((int)((Math.random()*9+1)*100000));
        System.out.println("this is a test commit in IDEA.");
	}

}

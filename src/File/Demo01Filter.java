package File;

import java.io.File;
import java.io.FilenameFilter;

public class Demo01Filter {
	public static void main(String[] args) {
		File file = new File("C:\\abc");
		getAllFile(file);
	}

	private static void getAllFile(File dir) {
//		// TODO Auto-generated method stub
//		System.out.println(dir);
//		File[] files = dir.listFiles(new FileFilterImpl());
//		for (File f : files) {
//			if (f.isDirectory()) {
//				getAllFile(f);
//			} else {
//				System.out.println(f);
//			}
//		}
		File[] files = dir.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir,name).isDirectory() || name.toLowerCase().endsWith("");
			}
		});
	}
}

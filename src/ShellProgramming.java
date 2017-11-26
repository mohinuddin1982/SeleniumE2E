


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Runtime;

import org.testng.annotations.Test;





public class ShellProgramming {
	
	
	@Test
	public void BackgroundCMD() throws Exception, InterruptedException {
		
		RunningBat("C:\\Users\\Mohin\\Desktop","KillExcel.Bat");
		
	}
	
//		@Test
	public void RunningBat(String FilePath, String FileName) throws IOException, InterruptedException {
		
		
		ProcessBuilder pb = new ProcessBuilder(FileName);
		pb.directory(new File(FilePath));
		Process p = pb.start();
		int exitStatus = p.waitFor();
		
	}
	
	



	        public static void main(String[] args) throws Exception {
	                try {
	                        String target = new String("/home/hagrawal/test.sh");
	// String target = new String("mkdir stackOver");
	                        Runtime rt = Runtime.getRuntime();
	                        Process proc = rt.exec(target);
	                        proc.waitFor();
	                        StringBuffer output = new StringBuffer();
	                        BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
	                        String line = "";                       
	                        while ((line = reader.readLine())!= null) {
	                                output.append(line + "\n");
	                        }
	                        System.out.println("### " + output);
	                } catch (Throwable t) {
	                        t.printStackTrace();
	                }
	        }
	}
	
	
	



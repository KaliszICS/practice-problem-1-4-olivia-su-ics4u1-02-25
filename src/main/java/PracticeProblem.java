import java.io.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}
	
	public static String getName(int Line, String file){
		BufferedReader inputStream = null;

		try{
			inputStream = new BufferedReader(new FileReader(file));
			String ln;
			int currentLine = 1;
			String result = "";

			while ((ln = inputStream.readLine()) != null){
					if (currentLine == Line){
						String[] arr = ln.split(" ");
						result += arr[0] +" ";
						result += arr[1];

						return result;
					}
					currentLine++;
			}
			return "";

		}catch (IOException e){
			return "There was an exception";

		}finally{
			try{
			if (inputStream != null){
				inputStream.close();

			}
		}catch (IOException e){
			return "There was an exception";
			}
		}	
	}
		public static int getAge(int Line, String file){
			BufferedReader inputStream = null;
	
			try{
				inputStream = new BufferedReader(new FileReader(file));
				String ln;
				int currentLine = 1;
	
				while ((ln = inputStream.readLine()) != null){
					if (currentLine == Line){
						String[] arr = ln.split(" ");
							return Integer.parseInt(arr[2]);
					}
					currentLine++;
				}
				return -1;
	
			}catch(IOException e){
				return -2;
	
			}finally{
				try{
					if(inputStream != null){
						inputStream.close();
					}
				}catch(IOException e){
				return -2;
				}
	
			}
	
		}

		public static int getNumber(int Line, String file){
			BufferedReader inputStream = null;
	
			try{
				inputStream = new BufferedReader(new FileReader(file));
				String ln;
				int currentLine = 1;
	
				while ((ln = inputStream.readLine()) != null){
					if (currentLine == Line){
						String[] arr = ln.split(" ");
							return Integer.parseInt(arr[3]);
					}
					currentLine++;
				}
				return -1;
	
			}catch(IOException e){
				return -2;
	
			}finally{
				try{
					if(inputStream != null){
						inputStream.close();
					}
				}catch(IOException e){
				return -2;
				}
	
			}
	
		}

	public static void fileAppend(String output, String filename){
		BufferedWriter bw = null;

		try{
			bw = new BufferedWriter(new FileWriter(filename, true));
			bw.write(output);

		}catch (IOException e){
			System.out.println(e);
			
		}finally{
			try{
				if (bw != null){
					bw.close();
				}
		}catch (IOException e){
			System.out.println(e);
			}
		}
		
	}
}

package homework07_03;

public class ReadScoresFromURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Scores.txt");
			//double score = new java.util.Scanner(url.openStream()).nextDouble();
			java.util.Scanner input = new java.util.Scanner(url.openStream());
			double summation = 0;
			int count = 0;
			while(input.hasNext()) {
				summation += input.nextDouble();
				count++;
			}
			double averageScore = (int)(summation / count * 100) / 100.0;
			System.out.println("Average score is " + averageScore);
		}
		catch(java.net.MalformedURLException ex){
			System.out.println("Invalid URL");
		}
		catch(java.io.IOException ex) {
			System.out.println("I/O Error: no such file.");
		}
	}

}

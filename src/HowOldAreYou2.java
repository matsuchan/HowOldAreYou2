import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowOldAreYou2 {

	public static void main(String[] args) { 

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
            while(true){
			System.out.println("何歳ですか?");
			String line = reader.readLine();
            for(int i=0; i< line.length();i++){
            if(Character.isDigit(line.charAt(i))){
            continue;
                }else{
            System.out.println("入力文字列が正しくありません\n再入力してください");
                main(args);
                }
            }
                if(line.equals("q")||line.equals("e")){
                System.out.println("入力文字がqまたはeです\nプログラムを終了します");
                break;
                    }else{
		                int age = Integer.parseInt(line);
                    if(age>=120){
                    System.out.println("数値が正しくありません(120オーバー)\n年齢を再入力してください");
                    }else if(age<0){
                    System.out.println("数値が正しくありません(負の数)\n年齢を再入力してください");
                    }else{
                    int birth = 2024 - age;
                    System.out.println(birth);
                    if(age >= 0 & age <= 5){
                        System.out.println("あなたは令和生まれです");
                    }else if(age >= 6 & age <= 35){
                        System.out.println("あなたは平成生まれです");
                    }else if(age >= 36 & age <= 98){
                        System.out.println("あなたは昭和生まれです");
                    }else if(age >= 99 & age <= 112){
                        System.out.println("あなたは大正生まれです");
                    }else if(age >= 113 & age <= 156){
                        System.out.println("あなたは明治生まれです");
                    }
                    System.out.println("あなたは2030年では" + (age + 6) + "歳ですね。\n");
                    }
                }
            }
        }
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
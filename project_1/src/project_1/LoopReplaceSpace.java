package project_1;

public class LoopReplaceSpace {

	public static void main(String[] args) {

		String str = "ram shaym kavi hhhhhhh  gfgdg fgfhf ", store="";
		char ch;

		System.out.println(str);
		System.out.println(str.length());

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == ' ') {
				store =store + '/';

			} else {
				store = store + ch;
			}

		}
		
		System.out.println(store);

	}

}

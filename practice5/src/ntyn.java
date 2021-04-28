
public class ntyn {

	public static void main(String[] args) {

	String name1[] = {"최경주", "김경태", "김비오", "배상문"};
	String name2[] = {"타이거 우즈","스티븐 스트리거","리키 파울러","이안 폴터","케빈 나"};
	
	System.arraycopy(name1,0,name2,0,name1.length);
	for(String name: name2) 
		System.out.print(name + " ");
	System.out.println();
	for(String name: name1) 
		System.out.print(name + " ");
}

}

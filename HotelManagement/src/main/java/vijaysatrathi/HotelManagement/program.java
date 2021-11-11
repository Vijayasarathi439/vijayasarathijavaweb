package vijaysatrathi.HotelManagement;

import java.util.Arrays;

public class program {
	public void sorter(int[]yet)
	{
		for(int sec=0;sec<yet.length;sec++)
		{
			for(int com=0;com<yet.length;com++)
			{
				if(yet[sec]>yet[com])
				{
					yet[sec]^=yet[com];
					yet[com]^=yet[sec];
					yet[sec]^=yet[com];
							
				}
			}
		}
	}
	public static void main(String[] args) {
		program s=new program();
		int[]num= {43,76,94,67,98,42,91,32};
		s.sorter(num);
		System.out.println(Arrays.toString(num));
		System.out.println("bouble\n"+Arrays.toString(num));
		
	}

}

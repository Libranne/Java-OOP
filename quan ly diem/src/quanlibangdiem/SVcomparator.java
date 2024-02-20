package quanlibangdiem;
import java.util.Comparator;
public class SVcomparator implements Comparator<SinhVien>{
	public int compare(SinhVien o1,SinhVien o2)
	{
		if (o1.diemhocphan() == o2.diemhocphan())
		return 0;
		else if ( o1.diemhocphan() > o2.diemhocphan())
			return 1;
		else return -1;
	}

}

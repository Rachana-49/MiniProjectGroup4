import java.sql.SQLException;

import com.cg.model.Claim;
import com.cg.services.ClaimSevicesImp;

public class Testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaimSevicesImp csi = new ClaimSevicesImp();
		Claim cm = new Claim(1,"Urgent","India","Hyderabad","Telangana",90,"Fire",123);
		Claim res = new Claim();
		try {
			res = csi.addClaim(cm);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(res);
		

	}

}

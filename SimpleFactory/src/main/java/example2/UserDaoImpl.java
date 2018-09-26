package example2;

public class UserDaoImpl implements UserDao {
	@Override
	public int findPermission(String userName, String userPassword) {
		if ("zhangsan" == userName && "123456" == userPassword) {
			return 2;
		} else {
			return -1;
		}
	}
}
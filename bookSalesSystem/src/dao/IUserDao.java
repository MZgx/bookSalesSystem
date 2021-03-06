package dao;

import java.util.List;

import vo.User;


public interface IUserDao extends IDAO<Integer,User> {
	/**
	 * 
	 * @param userName
	 * @param oldPassword
	 * @param newPassword
	 * @return true/false
	 * @throws Exception
	 */
	 public Boolean changePassword(int uid,String newPassword) throws Exception;
	 /**
	  * 
	  * @param phoneNumber
	  * @param validCode
	  * @return 返回一个结果
	  * @throws Exception
	  */
	 public List<User> validMessage(String phoneNumber,String validCode) throws Exception;
	 /**
	  * 
	  * @param userName
	  * @param phoneNumber
	  * @param password
	  * @return true/false
	  * @throws Exception
	  */
	 public Boolean register(String userName,String phoneNumber,String password) throws Exception;
	 /**
	  * 
	  * @param userName
	  * @param password
	  * @return true/false
	  * @throws Exception
	  */
	 public Boolean login(String userName,String password) throws Exception;
	 /**
	  * 
	  * @param userName
	  * @return	true/false
	  * @throws Exception
	  */
	 public Boolean DeleteUser(String userName) throws Exception;
	 /**
	  * 
	  * @param uid
	  * @return true/false
	  * @throws Exception
	  */
	 public Boolean isAdmin(Integer uid) throws Exception;

}

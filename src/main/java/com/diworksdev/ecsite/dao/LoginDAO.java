package com.diworksdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.diworksdev.ecsite.dto.LoginDTO;
import com.diworksdev.ecsite.util.DBConnector;

public class LoginDAO {
	
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private LoginDTO loginDTO = new LoginDTO();
	
	//指定されたログインIDとパスワードに対するユーザー情報を取得
	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword) {
		String sql = "SELECT * FROM login_user_transaction where login_id=? AND login_pass=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1,loginUserId);
			preparedStatement.setString(2,loginPassword);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			// 結果が存在する場合、ユーザー情報をDTOに格納
			if(resultSet.next()) {
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));
				
				// ログインIDがnullでない場合、ログインフラグをtrueに設定
				if(resultSet.getString("login_id")!= null) {
					loginDTO.setLoginFlg(true);
				}	
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return loginDTO;
	}

}

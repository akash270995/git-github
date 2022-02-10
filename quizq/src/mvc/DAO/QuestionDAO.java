package mvc.DAO;

import DB.util.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import mvc.bean.*;


public class QuestionDAO {

	public ArrayList<questions> viewquestions(String quiz_id)
	{ 
		System.out.println("inside dao");
		ArrayList<questions> a=new ArrayList<questions>();
		try
		{			
			JdbcConnection j=new JdbcConnection();
	        Connection con=j.createConnection();
			String query = "select question,option1,option2,option3,option4,answer from question where quiz_id='"+quiz_id+"'";
            Statement s=con.createStatement();
			ResultSet resultSet = s.executeQuery(query);
			System.out.println("hi");
			while(resultSet.next())
			{   System.out.println("hello");
				String question=resultSet.getString(("question"));
				String option1=resultSet.getString(("option1"));
				String option2=resultSet.getString(("option2"));
				String option3=resultSet.getString(("option3"));
				String option4=resultSet.getString(("option4"));
				String answer=resultSet.getString(("answer"));
				questions q=new questions(question,option1,option2,option3,option4,answer);
				a.add(q);
				//System.out.println(question+" "+option1+" "+answer);
			}
			
        }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return a;
	}
	
	
	
	
}	
		

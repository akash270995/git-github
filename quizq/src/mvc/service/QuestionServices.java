package mvc.service;

import mvc.bean.questions;
import mvc.service.*;

import java.util.*;

import mvc.DAO.*;

public class QuestionServices {

	QuestionDAO e=new QuestionDAO();
	
	public ArrayList<questions> viewquestions(String a)
	{
		
		return e.viewquestions(a);
	}
}

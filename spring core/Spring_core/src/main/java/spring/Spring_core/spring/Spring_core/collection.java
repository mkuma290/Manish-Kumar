package spring.Spring_core.spring.Spring_core;
import java.util.Map;
import java.util.Set;
public class collection
{
  int questionid;
  String question;
  Set<String> set;
  Map<Integer,String> que;
  public Set<String> getSet() {
	return set;
}
public void setSet(Set<String> set) {
	this.set = set;
}

  public int getQuestionid() {
	return questionid;
}
public void setQuestionid(int questionid) {
	this.questionid = questionid;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public Map<Integer, String> getQue() {
	return que;
}
public void setQue(Map<Integer, String> que) {
	this.que = que;
}

public collection() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "collection [questionid=" + questionid + ", question=" + question + ", set=" + set + ", que=" + que + "]";
}

  
}

package prob05;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException() {
		super("존재하지 않는 사용자 입니다.");
	}
}

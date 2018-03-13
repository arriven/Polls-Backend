package polls;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

public class Question {
	private static AtomicLong counter = new AtomicLong();
	private final long id;
	private String text;
	private List<Answer> answers = new ArrayList<Answer>();

	public Question(String text) {
		this.id = counter.incrementAndGet();
		this.text = text;
	}

	public void addAnswer(Answer answer) {
		answers.add(answer);
	}

	public String getText() {
		return text;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public long getId() {
		return id;
	}
}

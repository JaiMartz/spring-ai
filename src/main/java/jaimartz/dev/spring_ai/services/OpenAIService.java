package jaimartz.dev.spring_ai.services;

import jaimartz.dev.spring_ai.model.Answer;
import jaimartz.dev.spring_ai.model.GetCapitalRequest;
import jaimartz.dev.spring_ai.model.Question;

public interface OpenAIService {

    String getCapital(GetCapitalRequest stateOrCountry);

    Answer getAnswer(Question question);

    String getAnswer(String question);
}

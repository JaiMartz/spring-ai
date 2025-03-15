package jaimartz.dev.spring_ai.services;

import jaimartz.dev.spring_ai.model.*;

public interface OpenAIService {

    GetCapitalResponse getCapital(GetCapitalRequest stateOrCountry);

    Answer getAnswer(Question question);

    String getAnswer(String question);

    GetCapitalWithInfoResponse getCapitalWithInfo(GetCapitalRequest getCapitalRequest);
}

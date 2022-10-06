package com.doctors.service;

import com.doctors.model.DoctorModel;
import com.doctors.model.ScoreModel;
import com.doctors.repository.DoctorRepository;
import com.doctors.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ScoreService {


    @Autowired
    private ScoreRepository scoreRepository;

    public List<ScoreModel> getAllScores(){
        return scoreRepository.getAllScores();
    }
    public Optional<ScoreModel> getScore (Integer id){
        return scoreRepository.getScore(id);
    }
    public ScoreModel saveScore(ScoreModel scoreModel){
        return scoreRepository.saveScore(scoreModel);
    }
    public boolean deleteScore(Integer id){
        return scoreRepository.deleteScore(id);
    }
    public ScoreModel updateScore (ScoreModel scoreModel){
        return scoreRepository.updateScore(scoreModel);
    }

}
package com.doctors.repository;

import com.doctors.model.ScoreModel;
import com.doctors.repository.crudrepository.ScoreCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ScoreRepository {


    @Autowired
    private ScoreCrudRepository scoreCrudRepository;

    public List<ScoreModel> getAllScores() {
        return (List<ScoreModel>) scoreCrudRepository.findAll();
    }

    public Optional<ScoreModel> getScore(Integer id) {
        return scoreCrudRepository.findById(id);
    }
    public ScoreModel saveScore(ScoreModel scoreModel){
        return scoreCrudRepository.save(scoreModel);
    }
    public boolean deleteScore(Integer id){
        scoreCrudRepository.deleteById(id);
        return true;
    }
    public ScoreModel updateScore (ScoreModel scoreModel){
        return scoreCrudRepository.save(scoreModel);
    }

}
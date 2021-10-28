package com.usa.ciclo3.reto3.repository;
import java.util.List;
import java.util.Optional;

import com.usa.ciclo3.reto3.crudrepository.GameCrudRepository;
import com.usa.ciclo3.reto3.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 *
 * @author USUARIO
 */
@Repository
public class GameRepository {


        @Autowired
        private GameCrudRepository gameCrudRepository;

        public List<Game> getAll(){

            return (List<Game>) gameCrudRepository.findAll();
        }

        public Optional<Game> getGame(int id){

            return gameCrudRepository.findById(id);
        }

        public Game save(Game game){

            return gameCrudRepository.save(game);
        }
        public void delete(Game game){

            gameCrudRepository.delete(game);
        }

    }

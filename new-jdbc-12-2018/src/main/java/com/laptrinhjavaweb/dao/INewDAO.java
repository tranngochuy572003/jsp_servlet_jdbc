package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.paging.Pageble;

import java.util.List;

public interface INewDAO extends GenericDAO<NewModel> {
  List<NewModel> findByCategoryId(Long CategoryId);
  Long save(NewModel newModel);
  NewModel findOne(Long id);
  void update(NewModel updateNew);
  void delete (long id);
  List <NewModel> findAll(Pageble pageble);
  int getTotalItem();



}

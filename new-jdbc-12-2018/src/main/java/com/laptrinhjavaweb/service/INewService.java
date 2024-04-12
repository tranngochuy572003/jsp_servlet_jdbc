package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.paging.Pageble;

import javax.enterprise.inject.New;
import java.util.List;

public interface INewService {
  List<NewModel> findByCategoryId(Long categoryId);

  NewModel save(NewModel newModel);

  NewModel update(NewModel updateNew);

  void delete(long[] ids);

  List<NewModel> findAll(Pageble pageble);

  int getTotalItem();
  NewModel findOne(long id);

}




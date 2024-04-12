package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.mapper.NewMapper;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.paging.Pageble;
import org.apache.commons.lang.StringUtils;

import java.sql.*;
import java.util.List;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
  @Override
  public List<NewModel> findByCategoryId(Long categoryId) {
    String sql = "select * from news WHERE categoryId = ?";
    return query(sql, new NewMapper(), categoryId);

  }

  @Override
  public Long save(NewModel newModel) {
    StringBuilder sql = new StringBuilder("INSERT INTO NEWS (title,content,");

    sql.append("thumbnail,shortdescription,categoryid,createddate,createdby)");
    sql.append(" values (?,?,?,?,?,?,?)");

    return insert(sql.toString(), newModel.getTitle(), newModel.getContent(),
            newModel.getThumbnail(),newModel.getShortDescription(), newModel.getCategoryId(),
            newModel.getCreatedDate(),newModel.getCreatedBy());


  }

  @Override
  public NewModel findOne(Long id) {
    String sql="select * from news where id=?" ;
    List<NewModel> news = query(sql,new NewMapper(),id);
    return news.isEmpty() ? null :news.get(0);
  }

  @Override
  public void update(NewModel updateNew) {
    StringBuilder sql = new StringBuilder("UPDATE news SET title = ?, thumbnail = ?,");
    sql.append(" shortdescription = ?, content = ?, categoryid = ?,");
    sql.append(" createddate = ?, createdby = ?, modifieddate = ?, modifiedby = ? WHERE id = ?");
    update(sql.toString(), updateNew.getTitle(), updateNew.getThumbnail(), updateNew.getShortDescription(),
            updateNew.getContent(), updateNew.getCategoryId(), updateNew.getCreatedDate(),
            updateNew.getCreatedBy(), updateNew.getModifiedDate(),
            updateNew.getModifiedBy(), updateNew.getId());
  }

  @Override
  public void delete(long id) {
    String sql = "delete from news where id=?";
    update(sql,id);

  }

  @Override
  public List<NewModel> findAll(Pageble pageble) {
   // String sql = "select * from news limit ?,?";
    StringBuilder sql = new StringBuilder("select * from news");
   if(pageble.getSorter()!=null && StringUtils.isNotBlank(pageble.getSorter().getSortName()) && StringUtils.isNotBlank(pageble.getSorter().getSortBy())){
     sql.append(" ORDER BY "+pageble.getSorter().getSortName()+" "+pageble.getSorter().getSortBy()+"");
   }

    if(pageble.getOffset()!=null  && pageble.getLimit()!=null){
      sql.append(" limit "+pageble.getOffset()+", "+ pageble.getLimit()+"");

    }
    return query(sql.toString(), new NewMapper());




  }

  @Override
  public int getTotalItem() {
    String sql ="select count(*) from news";
    return count(sql);
  }
}


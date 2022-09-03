package org.example;

public interface IEntityRepo<T extends  IEntity> {
    public void Add(T entity);

    public void Remove(T entity);

}

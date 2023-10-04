package CaseStudy2.repository;

import java.util.List;

public interface IRepository<E> {
    void add(E e);
    List<E> getList();
}

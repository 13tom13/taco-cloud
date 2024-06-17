package org.tom13.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.tom13.tacocloud.entity.model.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long>, PagingAndSortingRepository<Taco, Long> {
}

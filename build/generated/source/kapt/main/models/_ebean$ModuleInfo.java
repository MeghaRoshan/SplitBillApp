package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Generated;

import io.ebean.config.ModuleInfo;
import io.ebean.config.ModuleInfoLoader;

@Generated("io.ebean.querybean.kotlin-generator")
@ModuleInfo(entities={"main.kotlin.models.models.Bill","models.User"})
public class _ebean$ModuleInfo implements ModuleInfoLoader {

  @Override
  public List<Class<?>> entityClasses() {
    List<Class<?>> entities = new ArrayList<>();
    entities.add(main.kotlin.models.models.Bill.class);
    entities.add(models.User.class);
    return entities;
  }

  @Override
  public List<Class<?>> entityClassesFor(String dbName) {

    return Collections.emptyList();
  }

}

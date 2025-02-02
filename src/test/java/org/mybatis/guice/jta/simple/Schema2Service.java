/*
 *    Copyright 2009-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.guice.jta.simple;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.guice.transactional.Transactional;

public class Schema2Service {
  @Inject
  private Schema2Mapper mapper;

  @Transactional
  public void createSchema2() {
    mapper.createSchema2Step1();
    mapper.createSchema2Step2();
    mapper.createSchema2Step3();
  }

  @Transactional
  public List<Name> getAllNames() {
    return mapper.getAllNames();
  }

  @Transactional
  public int insertName(Name name) {
    return mapper.insertName(name);
  }
}

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
package org.mybatis.guice.sample.service;

import org.mybatis.guice.sample.domain.User;

/**
 * FooService acts as a business service.
 *
 * All calls to any method of FooService are transactional.
 */
public interface FooService {

  User doSomeBusinessStuff(String userId);

  void brokenInsert(User user);

  void brokenInsert2(User user);

}

/*
 * Copyright (c) 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.webtrends.harness.service.test.config

import com.typesafe.config.{Config, ConfigFactory}

// This is a test configuration for you to add any additional configuration information
object TestConfig {

  def conf: Config = conf(ConfigFactory.parseString(""))

  def conf(confStr: String): Config = conf(ConfigFactory.parseString(confStr))

  def conf(config: Config): Config = config.withFallback(ConfigFactory.load()).resolve
}
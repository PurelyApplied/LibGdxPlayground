/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.patrhom.ykmm.actor.internal;

public class Stats {
  private static final int DEFAULT_VALUE = 10;

  private int wisdom = DEFAULT_VALUE;
  private int speed = DEFAULT_VALUE;
  private int strength = DEFAULT_VALUE;

  private Stats(){ }

  public static class Builder {
    private Stats thisStats;

    public Builder(){
      thisStats = new Stats();
    }

    public Builder withWisdom(int wis){
      thisStats.wisdom = wis;
      return this;
    }

    public Builder withSpeed(int spd){
      thisStats.speed = spd;
      return this;
    }

    public Builder withStrength(int str){
      thisStats.strength = str;
      return this;
    }

    public Stats build(){
      return thisStats;
    }
  }
}

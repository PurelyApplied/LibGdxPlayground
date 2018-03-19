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

package com.patrhom.tarokka;

public class Card {
  private final Suit suit;
  private final Integer commonValue;
  private final String highName;

  private static final Integer MASTER_VALUE = 10;
  /**
   * Use commonValue=10 for master.
   */
  public Card(Suit suit, Integer commonValue) {
    this.suit = suit;
    this.commonValue = commonValue;
    this.highName = null;
  }

  public Card(Suit suit) {
    this.suit = suit;
    this.commonValue = MASTER_VALUE;
    this.highName = null;
  }

  public Card(String highName) {
    this.suit = Suit.Highdeck;
    this.commonValue = null;
    this.highName = highName;
  }

  public boolean isHighDeck(){
    return this.highName != null;
  }

  public boolean isMaster(){
    return this.commonValue != null && this.commonValue.equals(MASTER_VALUE);
  }

  public Suit getSuit() {
    return suit;
  }

  public Integer getCommonValue() {
    return commonValue;
  }

  public String getHighName() {
    return highName;
  }
}

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {


  public static List<Card> buildDeck(){
    List<Card> deck = buildCommonDeck();
    deck.addAll(buildHighDeck());
    return deck;
  }

  public static List<Card> buildCommonDeck(){
    List<Card> deck = new ArrayList<Card>();
    for (Suit suit: Arrays.asList(Suit.Coins, Suit.Glyphs, Suit.Stars, Suit.Swords)){
      for (Integer value=0; value < 10 ; value++) {
        deck.add(new Card(suit, value));
      }
      deck.add(new Card(suit));
    }
    return deck;
  }

  public static List<Card> buildHighDeck(){
    List<Card> deck = new ArrayList<Card>();
    for (HighDeckValue value: HighDeckValue.values()){
      deck.add(new Card(value.toString()));
    }
    return deck;
  }
}

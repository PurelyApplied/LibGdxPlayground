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

import java.util.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class DeckGraphicLoader {
  private static Map<String, Texture> cardCache;
  private static final String assetLocation = "C:\\Users\\admin\\code\\YKMM\\tarokka\\assets\\tarokka";

  public static final int CARD_WIDTH = 50;
  public static final int CARD_HEIGHT = 75;


  static String getCardId(Card c){
    if (c.isHighDeck()){
      return "highdeck_" + c.getHighName().toLowerCase();
    }
    String suitAbbreviation = c.getSuit().name().toLowerCase().substring(0, 2);
    String value;
    if (c.isMaster()){
      value = "m";
    } else {
      value = c.getCommonValue().toString();
    }
    return suitAbbreviation + value;
  }

  static Texture getTexture(Card c){
    String cardId = getCardId(c);
    if (cardCache.containsKey(cardId)){
      return cardCache.get(cardId);
    }

    Texture texture = new Texture(Gdx.files.internal(assetLocation + "\\" + cardId + ".png"));
    cardCache.put(cardId, texture);
    return texture;
  }

  public static Map<String, Texture> getCardCache() {
    return cardCache;
  }

  public static void loadDeck(){
    for(Card c: Deck.buildDeck()){
      getTexture(c);
    }
  }

  static Texture getCardback(){
    return new Texture(Gdx.files.internal(assetLocation + "\\cardback.png"));
  }
}


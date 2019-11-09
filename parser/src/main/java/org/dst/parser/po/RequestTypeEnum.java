package org.dst.parser.po;

public enum RequestTypeEnum {
  STR_PUT,
  STR_GET,

  LIST_PUT,
  LIST_GET,
  LIST_LPUT,
  LIST_RPUT,
  LIST_LDEL,
  LIST_RDEL,

  SET_PUT,
  SET_GET,
  SET_DROP_BY_KEY,

  DICT_PUT,
  DICT_GET,
  DICT_PUT_ITEM,
  DICT_GET_ITEM,
  DICT_POP_ITEM,
  DICT_REMOVE_ITEM,
  DICT_DROP,
}

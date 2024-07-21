grammar ConfRoomScheduler;

prog: stat+ ;

stat: reserve NEWLINE                # reserveStat
    | cancel NEWLINE                 # cancelStat
    | NEWLINE                        # blank
    ;

reserve: 'RESERVAR' ID 'PARA' DATE 'DE' TIME 'A' TIME ('DESCRIPCION' DESCRIPTION)? ;

cancel: 'CANCELAR' ID 'PARA' DATE 'DE' TIME 'A' TIME ;

DATE: DIGIT DIGIT '/' DIGIT DIGIT '/' DIGIT DIGIT DIGIT DIGIT ;
TIME: DIGIT DIGIT ':' DIGIT DIGIT ;
ID  : [a-zA-Z0-9]+ ;
DESCRIPTION: '"' (~["\r\n])* '"' ;
COMMENT: '//' ~[\r\n]* -> skip ;
NEWLINE: '\r'? '\n' ;
WS  : [ \t]+ -> skip ;

fragment DIGIT : [0-9] ;

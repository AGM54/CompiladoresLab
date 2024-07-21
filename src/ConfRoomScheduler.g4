grammar ConfRoomScheduler;

prog: stat+ ;

stat: reserve NEWLINE                # reserveStat
    | cancel NEWLINE                 # cancelStat
    | reprogramar NEWLINE            # reprogramarStat
    | listar NEWLINE                 # listarStat
    | NEWLINE                        # blank
    ;

reserve: 'RESERVAR' TIPO_SALA ID 'PARA' DATE 'DE' TIME 'A' TIME ('DESCRIPCION' DESCRIPTION)? ;

cancel: 'CANCELAR' TIPO_SALA ID 'PARA' DATE 'DE' TIME 'A' TIME ;

reprogramar: 'REPROGRAMAR' TIPO_SALA ID 'DE' DATE 'DE' TIME 'A' TIME 'A' DATE 'DE' TIME 'A' TIME ;

listar: 'LISTAR' ;

TIPO_SALA: 'JUNTAS' | 'CAPACITACION' | 'REUNION' ;
DATE: DIGIT DIGIT '/' DIGIT DIGIT '/' DIGIT DIGIT DIGIT DIGIT ;
TIME: DIGIT DIGIT ':' DIGIT DIGIT ;
ID  : [a-zA-Z0-9]+ ;
DESCRIPTION: '"' (~["\r\n])* '"' ;
COMMENT: '//' ~[\r\n]* -> skip ;
NEWLINE: '\r'? '\n' ;
WS  : [ \t]+ -> skip ;

fragment DIGIT : [0-9] ;

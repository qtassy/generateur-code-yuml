grammar Yuml;

yuml : line+ ;    // one or more lines

line : box | connection ;

box : '[' yclass ']' ;  
role :  string ;   // String that has no ']' chars


connection : box end? card role? '-' role? card end? box ;

end : '<>' | '++' | '^' | '<' | '>';

card : (nb | '*') ('..' (nb | '*') )? ;

nb : INTEGER ; 

yclass : yclassname |
         yclassname '|' listyattributes |
         yclassname '|' listyattributes '|' listymethods;
        
// nom classe
yclassname : visibilite? string '(' string ')';  
        
// attributs 
listyattributes : yattributes ';' listyattributes | yattributes ;
yattributes : visibilite? string ':' string;

// methodes
listymethods : ymethod ';' listymethods | ymethod;
ymethod : visibilite? string '(' listyparameters? '):' string;
listyparameters : yparameter ',' listyparameters | yparameter;
yparameter : string ':' string;
	  	  
string : STRING ;
visibilite : '+' | '-' | '#';

STRING : [a-zA-Z]+ ;
INTEGER : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
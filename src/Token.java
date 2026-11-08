// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

// Enumerated type that defines the list of tokens
// TODO: add the following Tokens:
// - Token.TEXT -> Token.STRING
// - Token.ISOSCELES
// - Token.PARRALLELLOGRAM -> Token.OFFSET
// - Token.REGULAR_POLYGON -> Token.SIDES -> Token.RADIUS

enum Token {
    AT, COLOR, END, HEIGHT, RECTANGLE, RIGHT_TRIANGLE, SCENE, WIDTH, COMMA, SEMICOLON, PERIOD, LEFT_PAREN,
    RIGHT_PAREN, IDENTIFIER, NUMBER, EOF, TEXT, STRING, ISOSCELES, PARRALLELLOGRAM, OFFSET, REGULAR_POLYGON, SIDES,
    RADIUS
}

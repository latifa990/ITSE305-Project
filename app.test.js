const { add, subtract, multiply, divide, isEven } = require('./app');

// ADD tests
test('adds 2 + 3 to equal 5', () => {
  expect(add(2, 3)).toBe(5);
});

test('adds negative numbers', () => {
  expect(add(-1, -4)).toBe(-5);
});

// SUBTRACT tests
test('subtracts 10 - 4 to equal 6', () => {
  expect(subtract(10, 4)).toBe(6);
});

test('subtract returns negative when b > a', () => {
  expect(subtract(3, 7)).toBe(-4);
});

// MULTIPLY tests
test('multiplies 3 * 4 to equal 12', () => {
  expect(multiply(3, 4)).toBe(12);
});

test('multiply by zero returns 0', () => {
  expect(multiply(5, 0)).toBe(0);
});

// DIVIDE tests
test('divides 10 / 2 to equal 5', () => {
  expect(divide(10, 2)).toBe(5);
});

test('divide by zero returns null', () => {
  expect(divide(5, 0)).toBeNull();
});

// ISEVEN tests
test('4 is even', () => {
  expect(isEven(4)).toBe(true);
});

test('7 is not even', () => {
  expect(isEven(7)).toBe(false);
});

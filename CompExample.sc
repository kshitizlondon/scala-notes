0 to 9
val ints = Seq(0,1,2,3,4,5,6,7,8,9)

// generate 10 one-letter strings
val chars = ('a' to 'a' + 10).map(_.toString)

for (n <- ints) {
  n
}

for {
  n <- ints
} n

// generate "coordinates" like (int, char)
// that will generate cartesian products

val myPair = {
  for {
    n <- ints
    c <- chars
  } yield (n, c)
}

// how would you "zip" one element with another from two collections
ints.zip(chars)


val coords = ints.flatMap(n => chars.map(c => (n, c)))
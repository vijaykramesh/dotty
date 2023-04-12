@main
def Test: Unit = {
  for {
    a <- List(1)
    b <- List(2)
  } yield  {
    println(a)
    println(b)
    (a, b)
  }
}

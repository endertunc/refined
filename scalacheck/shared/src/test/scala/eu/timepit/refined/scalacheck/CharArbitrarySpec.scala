package eu.timepit.refined
package scalacheck

import eu.timepit.refined.char._
import eu.timepit.refined.scalacheck.TestUtils._
import eu.timepit.refined.scalacheck.booleanArbitrary._
import eu.timepit.refined.scalacheck.charArbitrary._
import org.scalacheck.Properties

class CharArbitrarySpec extends Properties("CharArbitrarySpec") {

  property("Digit") = checkArbitrary[Char, Digit]

  property("Letter") = checkArbitrary[Char, Letter]

  property("LowerCase") = checkArbitrary[Char, LowerCase]

  property("UpperCase") = checkArbitrary[Char, UpperCase]

  property("LetterOrDigit") = checkArbitrary[Char, LetterOrDigit]
}
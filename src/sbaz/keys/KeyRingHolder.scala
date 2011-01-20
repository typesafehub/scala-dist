/* SBaz -- Scala Bazaar
 * Copyright 2005-2011 LAMP/EPFL
 * @author  Lex Spoon
 */


package sbaz.keys

trait KeyRingHolder {
  val keyring: KeyRing
  def save: Unit
}

package com.javapractice.ocjp;

public class LegalIdentifiers {

	/*
	 * Legal Identifier: The rules the compiler uses to determine whether a name
	 * is legal. 1.0 Must start with a letter, a currency character($), or a
	 * connecting character such as the underscore _. 1.1Can not start with
	 * number! You can not use java keyword as Identifiers. 1.2 Identifiers in
	 * java are case sensitive.1.3 In practice there is no limit to the number
	 * of characters an identifier can contain.
	 * 
	 */

	// int 5$; illegal identifiers
	int $;
	int _$;
	// int .f; illegal identifiers
	int this_is_a_very_detailed_name_for_an_identifier;
	int java$;

	

}

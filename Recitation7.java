/*Every class extends something EXCEPT the object class

If there is no explicit super call, ava will autmatically insert a no-arg super call
*/

public class Recitation7 extends Recitation 6 {
	//subclass inherits super classes
	//covarient return type- you can return an object that extends the original and still return
	//will not compile if @override is written and doesnt actually override
	//when override, return type has to be the same
	//all abstract classes will have sublclasses that give it functionality
	//if extended class have an extended abstract class
	//if you cast to larger type, it will compile but will get run type error
	//don't call mehtod before casting
	//static methods are not synamicaly bound

}

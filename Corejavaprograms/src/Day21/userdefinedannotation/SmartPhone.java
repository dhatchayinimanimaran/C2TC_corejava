package Day21.userdefinedannotation;

public @interface SmartPhone {
	String os() default "Android";

	int version() default 1;
}
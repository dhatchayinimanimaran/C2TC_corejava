package Day20.userdefinedannotation;

public @interface SmartPhone {
	String os() default "Android";

	int version() default 1;
}

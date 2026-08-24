package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* renamed from: ev2  reason: default package */
/* loaded from: classes.dex */
public @interface ev2 {
    boolean hasBody() default false;

    java.lang.String method();

    java.lang.String path() default "";
}

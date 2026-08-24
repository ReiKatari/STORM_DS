package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: mt4  reason: default package */
/* loaded from: classes.dex */
public @interface mt4 {
    boolean encoded() default false;

    String value();
}

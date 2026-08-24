package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hd1  reason: default package */
/* loaded from: classes.dex */
public final class hd1 extends hb0 {
    public final Executor a;

    public hd1(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.hb0
    public final ib0 a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (ak7.c0(type) != gb0.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type Y = ak7.Y(0, (ParameterizedType) type);
            if (!ak7.l0(annotationArr, nj6.class)) {
                executor = this.a;
            }
            return new yc1(Y, executor);
        }
        i.h("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}

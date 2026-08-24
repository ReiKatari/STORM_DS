package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xu0  reason: default package */
/* loaded from: classes.dex */
public final class xu0 extends hb0 {
    @Override // defpackage.hb0
    public final ib0 a(Type type, Annotation[] annotationArr) {
        if (ak7.c0(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type Y = ak7.Y(0, (ParameterizedType) type);
            if (ak7.c0(Y) != vl5.class) {
                return new vu0(0, Y);
            }
            if (Y instanceof ParameterizedType) {
                return new vu0(1, ak7.Y(0, (ParameterizedType) Y));
            }
            i.m("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            return null;
        }
        i.m("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        return null;
    }
}

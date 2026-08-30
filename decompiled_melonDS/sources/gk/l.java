package gk;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends f {
    @Override // gk.f
    public final g a(Type type, Annotation[] annotationArr) {
        if (y0.h(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g10 = y0.g(0, (ParameterizedType) type);
            if (y0.h(g10) != r0.class) {
                return new j(0, g10);
            }
            if (g10 instanceof ParameterizedType) {
                return new j(1, y0.g(0, (ParameterizedType) g10));
            }
            a0.j.p("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            return null;
        }
        a0.j.p("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        return null;
    }
}

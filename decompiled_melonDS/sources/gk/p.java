package gk;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f5762a;

    public p(Executor executor) {
        this.f5762a = executor;
    }

    @Override // gk.f
    public final g a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (y0.h(type) != e.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g10 = y0.g(0, (ParameterizedType) type);
            if (!y0.l(annotationArr, t0.class)) {
                executor = this.f5762a;
            }
            return new a0.g(16, g10, executor);
        }
        a0.j.h("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}

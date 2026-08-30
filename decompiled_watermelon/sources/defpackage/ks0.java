package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ks0  reason: default package */
/* loaded from: classes.dex */
public final class ks0 extends z80 {
    @Override // defpackage.z80
    public final a90 a(Type type, Annotation[] annotationArr) {
        if (ct3.n0(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type m0 = ct3.m0(0, (ParameterizedType) type);
            if (ct3.n0(m0) != dc5.class) {
                return new is0(0, m0);
            }
            if (m0 instanceof ParameterizedType) {
                return new is0(1, ct3.m0(0, (ParameterizedType) m0));
            }
            i.n("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            return null;
        }
        i.n("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        return null;
    }
}

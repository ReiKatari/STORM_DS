package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m91  reason: default package */
/* loaded from: classes.dex */
public final class m91 extends z80 {
    public final Executor a;

    public m91(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.z80
    public final a90 a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (ct3.n0(type) != y80.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type m0 = ct3.m0(0, (ParameterizedType) type);
            if (!ct3.v0(annotationArr, y76.class)) {
                executor = this.a;
            }
            return new k91(m0, executor);
        }
        i.i("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}

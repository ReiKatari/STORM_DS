package hk;

import aj.g;
import gk.m;
import gk.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import od.c;
import pi.t;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: a  reason: collision with root package name */
    public final t f6592a;

    /* renamed from: b  reason: collision with root package name */
    public final d2.t f6593b;

    public a(t tVar, d2.t tVar2) {
        this.f6592a = tVar;
        this.f6593b = tVar2;
    }

    @Override // gk.m
    public final n a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, x0 x0Var) {
        type.getClass();
        annotationArr2.getClass();
        d2.t tVar = this.f6593b;
        return new a4.n(this.f6592a, g.X(((c) tVar.B).f10886b, type), tVar, 12);
    }

    @Override // gk.m
    public final n b(Type type, Annotation[] annotationArr, x0 x0Var) {
        annotationArr.getClass();
        d2.t tVar = this.f6593b;
        return new a0.g(22, g.X(((c) tVar.B).f10886b, type), tVar);
    }
}

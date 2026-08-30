package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: b  reason: collision with root package name */
    public static final na.f f1454b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f1455a;

    public c1(d1 d1Var, a1 a1Var, w6.c cVar) {
        d1Var.getClass();
        a1Var.getClass();
        cVar.getClass();
        this.f1455a = new b9.e(d1Var, a1Var, cVar);
    }

    public y0 a(nc.e eVar) {
        b9.e eVar2 = (b9.e) this.f1455a;
        String b10 = eVar.b();
        if (b10 != null) {
            return eVar2.B("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), eVar);
        }
        a0.j.h("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public c1() {
        this.f1455a = new AtomicReference(null);
    }

    public c1(k0 k0Var) {
        this.f1455a = k0Var;
    }
}

package e7;

import a7.k0;
import java.util.LinkedHashMap;
import java.util.List;
import m9.o;
import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends ij.a {

    /* renamed from: e  reason: collision with root package name */
    public final jd.a f4396e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f4397f;

    /* renamed from: g  reason: collision with root package name */
    public final k0.g f4398g = qd.a.f12509a;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashMap f4399h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public int f4400i = -1;

    public j(jd.a aVar, LinkedHashMap linkedHashMap) {
        this.f4396e = aVar;
        this.f4397f = linkedHashMap;
    }

    public final void B0(Object obj) {
        List x9;
        String e6 = this.f4396e.e().e(this.f4400i);
        k0 k0Var = (k0) this.f4397f.get(e6);
        if (k0Var != null) {
            if (k0Var instanceof a7.f) {
                x9 = ((a7.f) k0Var).h(obj);
            } else {
                x9 = t.x(k0Var.f(obj));
            }
            this.f4399h.put(e6, x9);
            return;
        }
        o.g(kc.a.g("Cannot find NavType for argument ", e6, ". Please provide NavType through typeMap."));
    }

    @Override // ij.a
    public final void F(ld.e eVar, int i2) {
        eVar.getClass();
        this.f4400i = i2;
    }

    @Override // ij.a
    public final void L(Object obj) {
        obj.getClass();
        B0(obj);
    }

    @Override // md.d
    public final k0.g c() {
        return this.f4398g;
    }

    @Override // ij.a, md.d
    public final md.d d(ld.e eVar) {
        eVar.getClass();
        if (d.e(eVar)) {
            this.f4400i = 0;
        }
        return this;
    }

    @Override // md.d
    public final void f() {
        B0(null);
    }

    @Override // md.d
    public final void n(jd.a aVar, Object obj) {
        aVar.getClass();
        B0(obj);
    }
}

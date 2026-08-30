package k0;

import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import fj.j;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends f0 {

    /* renamed from: l  reason: collision with root package name */
    public s.f f7948l;
    public final d0.e m;

    /* renamed from: n  reason: collision with root package name */
    public final j f7949n;

    /* renamed from: o  reason: collision with root package name */
    public d0 f7950o;

    public f(d0.e eVar) {
        j jVar = new j(22);
        this.f7948l = new s.f();
        this.m = eVar;
        this.f7949n = jVar;
    }

    @Override // androidx.lifecycle.d0
    public final Object c() {
        d0 d0Var = this.f7950o;
        if (d0Var == null) {
            return this.m;
        }
        Object c4 = d0Var.c();
        this.f7949n.getClass();
        return c4;
    }

    @Override // androidx.lifecycle.d0
    public final void e() {
        Iterator it = this.f7948l.iterator();
        while (true) {
            s.b bVar = (s.b) it;
            if (bVar.hasNext()) {
                e0 e0Var = (e0) ((Map.Entry) bVar.next()).getValue();
                e0Var.f1471a.d(e0Var);
            } else {
                return;
            }
        }
    }

    @Override // androidx.lifecycle.d0
    public final void f() {
        Iterator it = this.f7948l.iterator();
        while (true) {
            s.b bVar = (s.b) it;
            if (bVar.hasNext()) {
                e0 e0Var = (e0) ((Map.Entry) bVar.next()).getValue();
                e0Var.f1471a.g(e0Var);
            } else {
                return;
            }
        }
    }
}

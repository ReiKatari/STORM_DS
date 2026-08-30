package rg;

import a3.g;
import l4.i0;
import mc.l;
import n2.f1;
import n2.s;
import q4.x;
import u1.o0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final f1 f12716a = s.w(Boolean.FALSE);

    /* renamed from: b */
    public final f1 f12717b = s.w(new x((String) null, 7, 0));

    /* renamed from: c */
    public final f1 f12718c = s.w(new o0(0, 0, 7, 119));

    /* renamed from: d */
    public final f1 f12719d = s.w(null);

    /* renamed from: e */
    public final f1 f12720e = s.w(null);

    public static /* synthetic */ void d(d dVar, String str, l lVar) {
        dVar.c(str, lVar, new g(14), new o0(0, 0, 7, 119));
    }

    public final void a() {
        this.f12716a.setValue(Boolean.FALSE);
        f1 f1Var = this.f12720e;
        mc.a aVar = (mc.a) f1Var.getValue();
        if (aVar != null) {
            aVar.b();
        }
        this.f12719d.setValue(null);
        f1Var.setValue(null);
    }

    public final void b() {
        f1 f1Var = this.f12719d;
        l lVar = (l) f1Var.getValue();
        if (lVar != null) {
            lVar.k(((x) this.f12717b.getValue()).f12276a.B);
        }
        this.f12716a.setValue(Boolean.FALSE);
        f1Var.setValue(null);
        this.f12720e.setValue(null);
    }

    public final void c(String str, l lVar, mc.a aVar, o0 o0Var) {
        str.getClass();
        aVar.getClass();
        f1 f1Var = this.f12716a;
        if (((Boolean) f1Var.getValue()).booleanValue()) {
            return;
        }
        int length = str.length();
        this.f12717b.setValue(new x(str, 4, i0.b(length, length)));
        this.f12719d.setValue(lVar);
        this.f12720e.setValue(aVar);
        this.f12718c.setValue(o0Var);
        f1Var.setValue(Boolean.TRUE);
    }
}

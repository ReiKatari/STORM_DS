package d2;

import ai.c0;
import android.graphics.Rect;
import b4.q1;
import b4.r2;
import b4.s1;
import cd.e1;
import cd.w0;
import java.lang.ref.WeakReference;
import l4.o0;
import l4.q0;
import q4.x;
import zc.l1;
import zc.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements q4.s {

    /* renamed from: a  reason: collision with root package name */
    public o f3719a;

    /* renamed from: b  reason: collision with root package name */
    public l1 f3720b;

    /* renamed from: c  reason: collision with root package name */
    public u f3721c;

    /* renamed from: d  reason: collision with root package name */
    public e1 f3722d;

    @Override // q4.s
    public final void a(x xVar, q4.j jVar, c0 c0Var, u1.s sVar) {
        j(new a(xVar, this, jVar, c0Var, sVar, 0));
    }

    @Override // q4.s
    public final void b(x xVar, x xVar2) {
        boolean z10;
        int i2;
        int i10;
        int i11;
        u uVar = this.f3721c;
        if (uVar != null) {
            if (q0.b(uVar.f3780h.f12277b, xVar2.f12277b) && nc.k.a(uVar.f3780h.f12278c, xVar2.f12278c)) {
                z10 = false;
            } else {
                z10 = true;
            }
            uVar.f3780h = xVar2;
            int size = uVar.f3782j.size();
            for (int i12 = 0; i12 < size; i12++) {
                v vVar = (v) ((WeakReference) uVar.f3782j.get(i12)).get();
                if (vVar != null) {
                    vVar.f3791g = xVar2;
                }
            }
            q qVar = uVar.m;
            synchronized (qVar.f3757c) {
                qVar.f3764j = null;
                qVar.f3766l = null;
                qVar.f3765k = null;
                qVar.m = null;
                qVar.f3767n = null;
            }
            int i13 = -1;
            if (nc.k.a(xVar, xVar2)) {
                if (z10) {
                    m mVar = uVar.f3774b;
                    int f8 = q0.f(xVar2.f12277b);
                    int e6 = q0.e(xVar2.f12277b);
                    q0 q0Var = uVar.f3780h.f12278c;
                    if (q0Var != null) {
                        i11 = q0.f(q0Var.f8885a);
                    } else {
                        i11 = -1;
                    }
                    q0 q0Var2 = uVar.f3780h.f12278c;
                    if (q0Var2 != null) {
                        i13 = q0.e(q0Var2.f8885a);
                    }
                    mVar.a().updateSelection(mVar.f3747b, f8, e6, i11, i13);
                }
            } else if (xVar != null && (!nc.k.a(xVar.f12276a.B, xVar2.f12276a.B) || (q0.b(xVar.f12277b, xVar2.f12277b) && !nc.k.a(xVar.f12278c, xVar2.f12278c)))) {
                m mVar2 = uVar.f3774b;
                mVar2.a().restartInput(mVar2.f3747b);
            } else {
                int size2 = uVar.f3782j.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    v vVar2 = (v) ((WeakReference) uVar.f3782j.get(i14)).get();
                    if (vVar2 != null) {
                        x xVar3 = uVar.f3780h;
                        m mVar3 = uVar.f3774b;
                        if (vVar2.f3795k) {
                            vVar2.f3791g = xVar3;
                            if (vVar2.f3793i) {
                                mVar3.a().updateExtractedText(mVar3.f3747b, vVar2.f3792h, p.d(xVar3));
                            }
                            q0 q0Var3 = xVar3.f12278c;
                            long j2 = xVar3.f12277b;
                            if (q0Var3 != null) {
                                i2 = q0.f(q0Var3.f8885a);
                            } else {
                                i2 = -1;
                            }
                            q0 q0Var4 = xVar3.f12278c;
                            if (q0Var4 != null) {
                                i10 = q0.e(q0Var4.f8885a);
                            } else {
                                i10 = -1;
                            }
                            mVar3.a().updateSelection(mVar3.f3747b, q0.f(j2), q0.e(j2), i2, i10);
                        }
                    }
                }
            }
        }
    }

    @Override // q4.s
    public final void c() {
        j(null);
    }

    @Override // q4.s
    public final void d(h3.c cVar) {
        Rect rect;
        u uVar = this.f3721c;
        if (uVar != null) {
            uVar.f3784l = new Rect(pc.a.M(cVar.f6052a), pc.a.M(cVar.f6053b), pc.a.M(cVar.f6054c), pc.a.M(cVar.f6055d));
            if (uVar.f3782j.isEmpty() && (rect = uVar.f3784l) != null) {
                uVar.f3773a.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    @Override // q4.s
    public final void e() {
        r2 r2Var;
        o oVar = this.f3719a;
        if (oVar != null && (r2Var = (r2) a4.l.h(oVar, q1.f1926p)) != null) {
            ((s1) r2Var).b();
        }
    }

    @Override // q4.s
    public final void f() {
        r2 r2Var;
        o oVar = this.f3719a;
        if (oVar != null && (r2Var = (r2) a4.l.h(oVar, q1.f1926p)) != null) {
            ((s1) r2Var).a();
        }
    }

    @Override // q4.s
    public final void g(x xVar, q4.q qVar, o0 o0Var, bd.u uVar, h3.c cVar, h3.c cVar2) {
        u uVar2 = this.f3721c;
        if (uVar2 != null) {
            q qVar2 = uVar2.m;
            synchronized (qVar2.f3757c) {
                try {
                    qVar2.f3764j = xVar;
                    qVar2.f3766l = qVar;
                    qVar2.f3765k = o0Var;
                    qVar2.m = cVar;
                    qVar2.f3767n = cVar2;
                    if (!qVar2.f3759e) {
                        if (qVar2.f3758d) {
                        }
                    }
                    qVar2.a();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // q4.s
    public final void h() {
        l1 l1Var = this.f3720b;
        if (l1Var != null) {
            l1Var.i(null);
        }
        this.f3720b = null;
        w0 i2 = i();
        if (i2 != null) {
            ((e1) i2).m();
        }
    }

    public final w0 i() {
        e1 e1Var = this.f3722d;
        if (e1Var != null) {
            return e1Var;
        }
        if (!c2.e.f2556a) {
            return null;
        }
        e1 b10 = cd.q.b(1, 0, bd.a.DROP_LATEST, 2);
        this.f3722d = b10;
        return b10;
    }

    public final void j(a aVar) {
        o oVar = this.f3719a;
        if (oVar == null) {
            return;
        }
        l1 l1Var = null;
        a9.d dVar = new a9.d(aVar, this, oVar, (cc.c) null, 11);
        if (oVar.f1777h0) {
            l1Var = zc.x.v(oVar.C0(), null, w.UNDISPATCHED, new a5.o(oVar, dVar, null, 24), 1);
        }
        this.f3720b = l1Var;
    }

    public final void k(o oVar) {
        boolean z10;
        if (this.f3719a == oVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            k1.b.c("Expected textInputModifierNode to be " + oVar + " but was " + this.f3719a);
        }
        this.f3719a = null;
    }
}

package d2;

import a4.l2;
import android.os.Build;
import android.view.autofill.AutofillValue;
import f2.b1;
import g3.z;
import i4.w;
import l4.i0;
import l4.q0;
import q4.d0;
import q4.e0;
import q4.x;
import u1.p0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends a4.k implements l2 {

    /* renamed from: k0  reason: collision with root package name */
    public e0 f3732k0;

    /* renamed from: l0  reason: collision with root package name */
    public x f3733l0;

    /* renamed from: m0  reason: collision with root package name */
    public p0 f3734m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f3735n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f3736o0;
    public q4.q p0;

    /* renamed from: q0  reason: collision with root package name */
    public b1 f3737q0;

    /* renamed from: r0  reason: collision with root package name */
    public q4.j f3738r0;

    /* renamed from: s0  reason: collision with root package name */
    public z f3739s0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void R0(p0 p0Var, String str, boolean z10) {
        if (!z10) {
            return;
        }
        d0 d0Var = p0Var.f13383e;
        u1.s sVar = p0Var.f13399v;
        if (d0Var != null) {
            x q10 = p0Var.f13382d.q(p7.t.y(new Object(), new q4.a(str, 1)));
            d0Var.a(null, q10);
            sVar.k(q10);
            return;
        }
        int length = str.length();
        sVar.k(new x(str, 4, i0.b(length, length)));
    }

    @Override // a4.l2
    public final void f0(i4.x xVar) {
        c3.g gVar;
        AutofillValue forText;
        boolean z10 = this.f3736o0;
        l4.h hVar = this.f3733l0.f12276a;
        tc.c[] cVarArr = i4.v.f6808a;
        w wVar = i4.t.E;
        tc.c[] cVarArr2 = i4.v.f6808a;
        tc.c cVar = cVarArr2[18];
        xVar.a(wVar, hVar);
        l4.h hVar2 = this.f3732k0.f12244a;
        w wVar2 = i4.t.F;
        tc.c cVar2 = cVarArr2[19];
        xVar.a(wVar2, hVar2);
        long j2 = this.f3733l0.f12277b;
        w wVar3 = i4.t.G;
        tc.c cVar3 = cVarArr2[20];
        xVar.a(wVar3, new q0(j2));
        w wVar4 = i4.t.f6797r;
        tc.c cVar4 = cVarArr2[9];
        xVar.a(wVar4, c3.m.f2565a);
        l4.h hVar3 = this.f3733l0.f12276a;
        if (Build.VERSION.SDK_INT >= 26) {
            forText = AutofillValue.forText(hVar3);
            gVar = new c3.g(forText);
        } else {
            gVar = null;
        }
        if (gVar != null) {
            w wVar5 = i4.t.f6798s;
            tc.c cVar5 = cVarArr2[10];
            xVar.a(wVar5, gVar);
        }
        i4.v.b(xVar, new g(this, 0));
        int i2 = this.f3738r0.f12253d;
        if (i2 == 6) {
            c3.o.f2572a.getClass();
            i4.v.d(xVar, c3.n.f2570d);
        } else if (i2 == 7 || i2 == 8) {
            c3.o.f2572a.getClass();
            i4.v.d(xVar, c3.n.f2569c);
        } else if (i2 == 4) {
            c3.o.f2572a.getClass();
            i4.v.d(xVar, c3.n.f2571e);
        }
        boolean z11 = this.f3735n0;
        y yVar = y.f14813a;
        if (!z11) {
            xVar.a(i4.t.f6789i, yVar);
        }
        if (z10) {
            xVar.a(i4.t.K, yVar);
        }
        boolean z12 = this.f3735n0;
        w wVar6 = i4.t.N;
        tc.c cVar6 = cVarArr2[26];
        xVar.a(wVar6, Boolean.valueOf(z12));
        i4.v.a(xVar, new g(this, 1));
        if (z12) {
            xVar.a(i4.l.f6750k, new i4.a(null, new g(this, 2)));
            xVar.a(i4.l.f6753o, new i4.a(null, new g(this, xVar)));
        }
        xVar.a(i4.l.f6749j, new i4.a(null, new ai.q0(2, this)));
        int i10 = this.f3738r0.f12254e;
        f fVar = new f(this, 6);
        xVar.a(i4.t.H, new q4.i(i10));
        xVar.a(i4.l.f6754p, new i4.a(null, fVar));
        xVar.a(i4.l.f6741b, new i4.a(null, new f(this, 7)));
        xVar.a(i4.l.f6742c, new i4.a(null, new f(this, 1)));
        if (!q0.c(this.f3733l0.f12277b) && !z10) {
            xVar.a(i4.l.f6755q, new i4.a(null, new f(this, 2)));
            if (this.f3735n0) {
                xVar.a(i4.l.f6756r, new i4.a(null, new f(this, 3)));
            }
        }
        if (this.f3735n0) {
            xVar.a(i4.l.f6757s, new i4.a(null, new f(this, 5)));
        }
    }

    @Override // a4.l2
    public final boolean j0() {
        return true;
    }
}

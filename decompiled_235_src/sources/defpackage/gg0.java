package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gg0  reason: default package */
/* loaded from: classes.dex */
public final class gg0 implements eg0 {
    public final gj7 A;
    public final cg0 B;
    public final ve0 L;
    public final kj7 R;
    public final sh0 X;
    public final String Y;
    public oe0 Z;
    public final int d0;
    public final sw e0;

    public gg0(gr1 gr1Var, gj7 gj7Var, cg0 cg0Var, ve0 ve0Var, kj7 kj7Var, sh0 sh0Var) {
        gr1Var.getClass();
        gj7Var.getClass();
        cg0Var.getClass();
        ve0Var.getClass();
        kj7Var.getClass();
        sh0Var.getClass();
        this.A = gj7Var;
        this.B = cg0Var;
        this.L = ve0Var;
        this.R = kj7Var;
        this.X = sh0Var;
        String str = gr1Var.B;
        this.Y = str;
        qe0 qe0Var = re0.a;
        qe0Var.getClass();
        this.Z = qe0Var;
        uw uwVar = hg0.a;
        uwVar.getClass();
        this.d0 = uw.b.incrementAndGet(uwVar);
        this.e0 = g04.s(false);
        if (kj2.F("CXCP")) {
            Log.d("CXCP", "Created " + this + " for " + ((Object) xf0.b(str)));
        }
    }

    @Override // defpackage.ci7
    public final void b(di7 di7Var) {
        gj7 gj7Var = this.A;
        gj7Var.getClass();
        synchronized (gj7Var.k) {
            if (gj7Var.l.contains(di7Var)) {
                gj7Var.k(gj7Var.l);
            }
        }
    }

    @Override // defpackage.ci7
    public final void d(di7 di7Var) {
        this.A.a(di7Var);
    }

    @Override // defpackage.eg0
    public final ve0 e() {
        return this.L;
    }

    @Override // defpackage.eg0
    public final oe0 f() {
        return this.Z;
    }

    @Override // defpackage.ci7
    public final void g(di7 di7Var) {
        gj7 gj7Var = this.A;
        gj7Var.getClass();
        synchronized (gj7Var.k) {
            if (gj7Var.l.contains(di7Var)) {
                gj7Var.l();
            }
        }
    }

    @Override // defpackage.ci7
    public final void h(di7 di7Var) {
        gj7 gj7Var = this.A;
        gj7Var.getClass();
        synchronized (gj7Var.k) {
            if (gj7Var.m.remove(di7Var)) {
                gj7Var.l();
            }
        }
    }

    @Override // defpackage.eg0
    public final void i(oe0 oe0Var) {
        oe0 oe0Var2;
        if (oe0Var == null) {
            oe0Var2 = re0.a;
            oe0Var2.getClass();
        } else {
            oe0Var2 = oe0Var;
        }
        this.Z = oe0Var2;
        if (oe0Var != null) {
            oe0Var.z();
        }
        synchronized (this.A.k) {
        }
    }

    @Override // defpackage.eg0
    public final void j(boolean z) {
        gj7 gj7Var = this.A;
        synchronized (gj7Var.k) {
            gj7Var.n = z;
            ii7 h = gj7Var.h();
            if (h != null) {
                hv.L(h.b.f, null, null, new lo0((r41) null, h, z), 3);
            }
        }
    }

    @Override // defpackage.eg0
    public final boolean k() {
        return this.e0.b();
    }

    @Override // defpackage.eg0
    public final void l(Collection collection) {
        collection.getClass();
        this.A.d(gt0.k1(collection));
    }

    @Override // defpackage.eg0
    public final void m(ArrayList arrayList) {
        this.A.g(gt0.k1(arrayList));
    }

    @Override // defpackage.eg0
    public final void n() {
        if (kj2.F("CXCP")) {
            Log.d("CXCP", this + " received removed signal. Cleaning up.");
        }
        if (this.e0.a()) {
            hv.L(this.R.a, null, null, new fg0(this, null, 0), 3);
        }
    }

    @Override // defpackage.eg0
    public final void p(boolean z) {
        gj7 gj7Var = this.A;
        synchronized (gj7Var.k) {
            gj7Var.p = z;
        }
    }

    @Override // defpackage.eg0
    public final cg0 q() {
        return this.B;
    }

    @Override // defpackage.eg0
    public final gx3 release() {
        return ak7.W(new h61(hv.L(this.R.a, null, null, new fg0(this, null, 1), 3), 0));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInternalAdapter<");
        sb.append((Object) xf0.b(this.Y));
        sb.append('(');
        return lb1.o(sb, this.d0, ")>");
    }
}

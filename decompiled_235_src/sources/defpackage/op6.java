package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: op6  reason: default package */
/* loaded from: classes.dex */
public final class op6 implements gi7, fj7 {
    public final sg0 a;
    public final lx b;
    public final kj7 c;
    public final Object d;
    public li7 e;
    public final ArrayList f;
    public long g;
    public int h;
    public int i;
    public boolean j;
    public Integer k;

    public op6(sg0 sg0Var, lx lxVar, kj7 kj7Var) {
        sg0Var.getClass();
        kj7Var.getClass();
        this.a = sg0Var;
        this.b = lxVar;
        this.c = kj7Var;
        this.d = new Object();
        this.f = new ArrayList();
        this.h = 2;
        this.i = 1;
    }

    @Override // defpackage.fj7
    public final void a(LinkedHashSet linkedHashSet) {
        hv.L(this.c.f, null, null, new xy5((r41) null, gt0.p1(linkedHashSet), this, 3), 3);
    }

    @Override // defpackage.gi7
    public final void b(li7 li7Var) {
        this.e = li7Var;
        f();
    }

    public final void c(Exception exc) {
        List<tu0> k1;
        synchronized (this.d) {
            k1 = gt0.k1(this.f);
            this.f.clear();
        }
        for (tu0 tu0Var : k1) {
            tu0Var.v0(exc);
        }
    }

    public final int d(int i, boolean z, Integer num) {
        int j;
        if (num != null) {
            j = num.intValue();
        } else if (i != 0) {
            if (i != 1) {
                j = 1;
            } else {
                j = 3;
            }
        } else {
            j = this.b.j();
        }
        if (z && mb3.H(this.a.b)) {
            if (kj2.F("CXCP")) {
                Log.d("CXCP", "State3AControl.invalidate: trying external flash AE mode.");
            }
            j = 5;
        }
        if (kj2.F("CXCP")) {
            Log.d("CXCP", "State3AControl.getFinalPreferredAeMode: preferAeMode = " + j);
        }
        return j;
    }

    public final int e() {
        int F;
        synchronized (this.d) {
            F = mb3.F(this.a.b, d(this.h, this.j, this.k));
        }
        return F;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ch5, java.lang.Object] */
    public final tu0 f() {
        tu0 tu0Var = new tu0();
        ?? obj = new Object();
        synchronized (this.d) {
            this.f.add(tu0Var);
            long j = this.g + 1;
            this.g = j;
            obj.A = j;
        }
        hv.L(this.c.f, null, null, new xy5((r41) null, this, (Object) obj, 4), 3);
        return tu0Var;
    }

    @Override // defpackage.gi7
    public final void reset() {
        synchronized (this.d) {
            this.j = false;
            this.k = null;
            this.h = 2;
            this.i = 1;
        }
        f();
    }
}

package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zd6  reason: default package */
/* loaded from: classes.dex */
public final class zd6 implements i47, i57 {
    public final je0 a;
    public final y60 b;
    public final n57 c;
    public final Object d;
    public n47 e;
    public final ArrayList f;
    public long g;
    public int h;
    public int i;
    public boolean j;
    public Integer k;

    public zd6(je0 je0Var, y60 y60Var, n57 n57Var) {
        je0Var.getClass();
        n57Var.getClass();
        this.a = je0Var;
        this.b = y60Var;
        this.c = n57Var;
        this.d = new Object();
        this.f = new ArrayList();
        this.h = 2;
        this.i = 1;
    }

    @Override // defpackage.i57
    public final void a(LinkedHashSet linkedHashSet) {
        tq5.w(this.c.f, null, null, new zr5((j11) null, tq0.s1(linkedHashSet), this, 2), 3);
    }

    @Override // defpackage.i47
    public final void b(n47 n47Var) {
        this.e = n47Var;
        f();
    }

    public final void c(Exception exc) {
        List<gs0> n1;
        synchronized (this.d) {
            n1 = tq0.n1(this.f);
            this.f.clear();
        }
        for (gs0 gs0Var : n1) {
            gs0Var.v0(exc);
        }
    }

    public final int d(int i, boolean z, Integer num) {
        int i2;
        if (num != null) {
            i2 = num.intValue();
        } else if (i != 0) {
            if (i == 1) {
                i2 = 3;
            }
            i2 = 1;
        } else {
            switch (this.b.A) {
                case 2:
                    i2 = 1;
                    break;
                default:
                    i2 = 2;
                    break;
            }
        }
        if (z && se.H(this.a.b)) {
            if (ve2.D("CXCP")) {
                Log.d("CXCP", "State3AControl.invalidate: trying external flash AE mode.");
            }
            i2 = 5;
        }
        if (ve2.D("CXCP")) {
            Log.d("CXCP", "State3AControl.getFinalPreferredAeMode: preferAeMode = " + i2);
        }
        return i2;
    }

    public final int e() {
        int G;
        synchronized (this.d) {
            G = se.G(this.a.b, d(this.h, this.j, this.k));
        }
        return G;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, m75] */
    public final gs0 f() {
        gs0 gs0Var = new gs0();
        ?? obj = new Object();
        synchronized (this.d) {
            this.f.add(gs0Var);
            long j = this.g + 1;
            this.g = j;
            obj.A = j;
        }
        tq5.w(this.c.f, null, null, new zr5((j11) null, this, (Object) obj, 3), 3);
        return gs0Var;
    }

    @Override // defpackage.i47
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

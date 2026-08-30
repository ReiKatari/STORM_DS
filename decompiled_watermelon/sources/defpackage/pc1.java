package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pc1  reason: default package */
/* loaded from: classes.dex */
public final class pc1 implements n47 {
    public final fw4 a;
    public final n57 b;
    public volatile t47 c;
    public final AtomicBoolean d;

    public pc1(fw4 fw4Var, n57 n57Var) {
        fw4Var.getClass();
        n57Var.getClass();
        this.a = fw4Var;
        this.b = n57Var;
        this.d = new AtomicBoolean(false);
    }

    public static final t47 k(pc1 pc1Var) {
        if (!pc1Var.d.get()) {
            t47 t47Var = pc1Var.c;
            if (t47Var != null) {
                return t47Var;
            }
            t47 t47Var2 = (t47) pc1Var.a.get();
            if (!pc1Var.d.get()) {
                pc1Var.c = t47Var2;
                t47Var2.getClass();
                return t47Var2;
            }
            t47Var2.close();
            throw new CancellationException("UseCaseCameraRequestControl closed during initialization");
        }
        throw new CancellationException("UseCaseCameraRequestControl is closed");
    }

    @Override // defpackage.n47
    public final ic1 a(LinkedHashSet linkedHashSet, boolean z) {
        t47 t47Var = this.c;
        if (t47Var != null) {
            return t47Var.a(linkedHashSet, z);
        }
        return tq5.e(this.b.f, null, null, new oc1(this, (j11) null, z, linkedHashSet), 3);
    }

    @Override // defpackage.n47
    public final ic1 b(Map map, m47 m47Var, bw0 bw0Var) {
        m47Var.getClass();
        bw0Var.getClass();
        t47 t47Var = this.c;
        if (t47Var != null) {
            return t47Var.b(map, m47Var, bw0Var);
        }
        return tq5.e(this.b.f, null, null, new nc1(this, null, map, m47Var, bw0Var, 1), 3);
    }

    @Override // defpackage.n47
    public final ic1 c() {
        t47 t47Var = this.c;
        if (t47Var != null) {
            return t47Var.c();
        }
        return tq5.e(this.b.f, null, null, new mc1(this, null, 2), 3);
    }

    @Override // defpackage.n47
    public final void close() {
        if (this.d.getAndSet(true)) {
            return;
        }
        tq5.w(this.b.f, null, null, new x3((j11) null, this, 7), 3);
    }

    @Override // defpackage.n47
    public final ic1 e(Map map, m47 m47Var, bw0 bw0Var) {
        m47Var.getClass();
        bw0Var.getClass();
        t47 t47Var = this.c;
        if (t47Var != null) {
            return t47Var.e(map, m47Var, bw0Var);
        }
        return tq5.e(this.b.f, null, null, new nc1(this, null, map, m47Var, bw0Var, 0), 3);
    }

    @Override // defpackage.n47
    public final Object f(nk6 nk6Var) {
        t47 t47Var = this.c;
        if (t47Var != null) {
            return t47Var.f(nk6Var);
        }
        return tq5.G(w81.n(this.b.e), new mc1(this, null, 0), nk6Var);
    }

    @Override // defpackage.n47
    public final ic1 g() {
        t47 t47Var = this.c;
        if (t47Var != null) {
            return t47Var.g();
        }
        return tq5.e(this.b.f, null, null, new mc1(this, null, 1), 3);
    }

    @Override // defpackage.n47
    public final ic1 h(cb0 cb0Var, Map map) {
        t47 t47Var = this.c;
        if (t47Var != null) {
            return t47Var.h(cb0Var, map);
        }
        return tq5.e(this.b.f, null, null, new a0(this, (j11) null, cb0Var, map, 22), 3);
    }

    @Override // defpackage.n47
    public final ic1 i(int i) {
        t47 t47Var = this.c;
        if (t47Var != null) {
            return t47Var.i(i);
        }
        return tq5.e(this.b.f, null, null, new k7(this, null, i), 3);
    }

    @Override // defpackage.n47
    public final ic1 j(List list, m47 m47Var) {
        m47Var.getClass();
        t47 t47Var = this.c;
        if (t47Var != null) {
            return t47Var.j(list, m47Var);
        }
        return tq5.e(this.b.f, null, null, new a0(this, (j11) null, list, m47Var, 21), 3);
    }
}

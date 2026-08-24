package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ou0  reason: default package */
/* loaded from: classes.dex */
public final class ou0 implements jk5 {
    public final LinkedHashMap A = new LinkedHashMap();
    public volatile Map B = zt1.A;

    @Override // defpackage.jk5
    public final void A(yk5 yk5Var) {
        yk5Var.getClass();
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new ku0((jk5) entry.getKey(), yk5Var, 2));
        }
    }

    @Override // defpackage.jk5
    public final void D(yk5 yk5Var, long j, uh uhVar) {
        yk5Var.getClass();
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new lu0((jk5) entry.getKey(), yk5Var, j, uhVar, 1));
        }
    }

    @Override // defpackage.jk5
    public final void F(yk5 yk5Var, long j, wk5 wk5Var) {
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new lu0((jk5) entry.getKey(), yk5Var, j, wk5Var, 0));
        }
    }

    @Override // defpackage.jk5
    public final void J(yk5 yk5Var, long j, th thVar) {
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new ju0((jk5) entry.getKey(), yk5Var, j, thVar, 0));
        }
    }

    @Override // defpackage.jk5
    public final void N(kk5 kk5Var) {
        kk5Var.getClass();
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new mf(11, (jk5) entry.getKey(), kk5Var));
        }
    }

    public final void a(jk5 jk5Var, s37 s37Var) {
        s37Var.getClass();
        if (!this.B.containsKey(jk5Var)) {
            synchronized (this.A) {
                this.A.put(jk5Var, s37Var);
                this.B = c14.s0(this.A);
            }
            return;
        }
        throw new IllegalStateException((jk5Var + " was already registered!").toString());
    }

    public final void b(jk5 jk5Var) {
        jk5Var.getClass();
        synchronized (this.A) {
            this.A.remove(jk5Var);
            this.B = c14.s0(this.A);
        }
    }

    @Override // defpackage.jk5
    public final void e(final yk5 yk5Var, final long j, final int i, final int i2) {
        for (Map.Entry entry : this.B.entrySet()) {
            final jk5 jk5Var = (jk5) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: mu0
                @Override // java.lang.Runnable
                public final void run() {
                    jk5.this.e(yk5Var, j, i, i2);
                }
            });
        }
    }

    @Override // defpackage.jk5
    public final void k(yk5 yk5Var) {
        yk5Var.getClass();
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new ku0((jk5) entry.getKey(), yk5Var, 1));
        }
    }

    @Override // defpackage.jk5
    public final void n(yk5 yk5Var, long j) {
        yk5Var.getClass();
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new zd0((jk5) entry.getKey(), yk5Var, j, 1));
        }
    }

    @Override // defpackage.jk5
    public final void r(yk5 yk5Var) {
        yk5Var.getClass();
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new ku0((jk5) entry.getKey(), yk5Var, 0));
        }
    }

    @Override // defpackage.jk5
    public final void u(final yk5 yk5Var, final long j, final long j2) {
        yk5Var.getClass();
        for (Map.Entry entry : this.B.entrySet()) {
            final jk5 jk5Var = (jk5) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: nu0
                @Override // java.lang.Runnable
                public final void run() {
                    jk5.this.u(yk5Var, j, j2);
                }
            });
        }
    }

    @Override // defpackage.jk5
    public final void x(yk5 yk5Var, long j, th thVar) {
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new ju0((jk5) entry.getKey(), yk5Var, j, thVar, 1));
        }
    }
}

package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bs0  reason: default package */
/* loaded from: classes.dex */
public final class bs0 implements ra5 {
    public final LinkedHashMap A = new LinkedHashMap();
    public volatile Map B = qp1.A;

    @Override // defpackage.ra5
    public final void B(gb5 gb5Var, long j) {
        gb5Var.getClass();
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new qb0((ra5) entry.getKey(), gb5Var, j, 1));
        }
    }

    @Override // defpackage.ra5
    public final void C(gb5 gb5Var) {
        gb5Var.getClass();
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new xr0((ra5) entry.getKey(), gb5Var, 2));
        }
    }

    @Override // defpackage.ra5
    public final void D(gb5 gb5Var) {
        gb5Var.getClass();
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new xr0((ra5) entry.getKey(), gb5Var, 0));
        }
    }

    @Override // defpackage.ra5
    public final void F(final gb5 gb5Var, final long j, final long j2) {
        gb5Var.getClass();
        for (Map.Entry entry : this.B.entrySet()) {
            final ra5 ra5Var = (ra5) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: as0
                @Override // java.lang.Runnable
                public final void run() {
                    ra5.this.F(gb5Var, j, j2);
                }
            });
        }
    }

    @Override // defpackage.ra5
    public final void I(gb5 gb5Var, long j, ih ihVar) {
        gb5Var.getClass();
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new yr0((ra5) entry.getKey(), gb5Var, j, ihVar, 1));
        }
    }

    @Override // defpackage.ra5
    public final void J(gb5 gb5Var, long j, eb5 eb5Var) {
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new yr0((ra5) entry.getKey(), gb5Var, j, eb5Var, 0));
        }
    }

    @Override // defpackage.ra5
    public final void K(gb5 gb5Var, long j, hh hhVar) {
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new wr0((ra5) entry.getKey(), gb5Var, j, hhVar, 0));
        }
    }

    @Override // defpackage.ra5
    public final void N(sa5 sa5Var) {
        sa5Var.getClass();
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new we(11, (ra5) entry.getKey(), sa5Var));
        }
    }

    public final void a(ra5 ra5Var, dr6 dr6Var) {
        dr6Var.getClass();
        if (!this.B.containsKey(ra5Var)) {
            synchronized (this.A) {
                this.A.put(ra5Var, dr6Var);
                this.B = zt3.r0(this.A);
            }
            return;
        }
        throw new IllegalStateException((ra5Var + " was already registered!").toString());
    }

    public final void b(ra5 ra5Var) {
        ra5Var.getClass();
        synchronized (this.A) {
            this.A.remove(ra5Var);
            this.B = zt3.r0(this.A);
        }
    }

    @Override // defpackage.ra5
    public final void i(gb5 gb5Var, long j, hh hhVar) {
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new wr0((ra5) entry.getKey(), gb5Var, j, hhVar, 1));
        }
    }

    @Override // defpackage.ra5
    public final void p(final gb5 gb5Var, final long j, final int i, final int i2) {
        for (Map.Entry entry : this.B.entrySet()) {
            final ra5 ra5Var = (ra5) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: zr0
                @Override // java.lang.Runnable
                public final void run() {
                    ra5.this.p(gb5Var, j, i, i2);
                }
            });
        }
    }

    @Override // defpackage.ra5
    public final void x(gb5 gb5Var) {
        gb5Var.getClass();
        for (Map.Entry entry : this.B.entrySet()) {
            ((Executor) entry.getValue()).execute(new xr0((ra5) entry.getKey(), gb5Var, 1));
        }
    }
}

package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u12  reason: default package */
/* loaded from: classes.dex */
public abstract class u12 extends g31 {
    public static final /* synthetic */ int Y = 0;
    public long L;
    public boolean R;
    public xt X;

    @Override // defpackage.g31
    public final g31 m0(int i) {
        jk2.m(1);
        return this;
    }

    public final void n0(boolean z) {
        long j;
        long j2 = this.L;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.L = j3;
        if (j3 <= 0 && this.R) {
            shutdown();
        }
    }

    public final void o0(mg1 mg1Var) {
        xt xtVar = this.X;
        if (xtVar == null) {
            xtVar = new xt();
            this.X = xtVar;
        }
        xtVar.addLast(mg1Var);
    }

    public final void p0(boolean z) {
        long j;
        long j2 = this.L;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.L = j + j2;
        if (!z) {
            this.R = true;
        }
    }

    public abstract long q0();

    public final boolean r0() {
        Object removeFirst;
        xt xtVar = this.X;
        if (xtVar != null) {
            if (xtVar.isEmpty()) {
                removeFirst = null;
            } else {
                removeFirst = xtVar.removeFirst();
            }
            mg1 mg1Var = (mg1) removeFirst;
            if (mg1Var == null) {
                return false;
            }
            mg1Var.run();
            return true;
        }
        return false;
    }

    public abstract void shutdown();
}

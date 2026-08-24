package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l62  reason: default package */
/* loaded from: classes.dex */
public abstract class l62 extends n61 {
    public static final /* synthetic */ int Y = 0;
    public long L;
    public boolean R;
    public pu X;

    @Override // defpackage.n61
    public final n61 m0(int i) {
        kn2.u(1);
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

    public final void o0(qk1 qk1Var) {
        pu puVar = this.X;
        if (puVar == null) {
            puVar = new pu();
            this.X = puVar;
        }
        puVar.addLast(qk1Var);
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
        pu puVar = this.X;
        if (puVar != null) {
            if (puVar.isEmpty()) {
                removeFirst = null;
            } else {
                removeFirst = puVar.removeFirst();
            }
            qk1 qk1Var = (qk1) removeFirst;
            if (qk1Var == null) {
                return false;
            }
            qk1Var.run();
            return true;
        }
        return false;
    }

    public abstract void shutdown();
}

package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l0 extends q {
    public static final /* synthetic */ int Y = 0;
    public long L;
    public boolean R;
    public zb.j X;

    @Override // zc.q
    public final q a0(int i2) {
        ed.b.a(1);
        return this;
    }

    public final void b0(boolean z10) {
        long j2;
        long j10 = this.L;
        if (z10) {
            j2 = 4294967296L;
        } else {
            j2 = 1;
        }
        long j11 = j10 - j2;
        this.L = j11;
        if (j11 <= 0 && this.R) {
            shutdown();
        }
    }

    public final void c0(e0 e0Var) {
        zb.j jVar = this.X;
        if (jVar == null) {
            jVar = new zb.j();
            this.X = jVar;
        }
        jVar.addLast(e0Var);
    }

    public final void d0(boolean z10) {
        long j2;
        long j10 = this.L;
        if (z10) {
            j2 = 4294967296L;
        } else {
            j2 = 1;
        }
        this.L = j2 + j10;
        if (!z10) {
            this.R = true;
        }
    }

    public abstract long e0();

    public final boolean f0() {
        Object removeFirst;
        zb.j jVar = this.X;
        if (jVar != null) {
            if (jVar.isEmpty()) {
                removeFirst = null;
            } else {
                removeFirst = jVar.removeFirst();
            }
            e0 e0Var = (e0) removeFirst;
            if (e0Var == null) {
                return false;
            }
            e0Var.run();
            return true;
        }
        return false;
    }

    public abstract void shutdown();
}

package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xd6  reason: default package */
/* loaded from: classes.dex */
public final class xd6 implements r56 {
    public final long A;
    public final long B;

    public xd6(long j, long j2) {
        this.A = j;
        this.B = j2;
        if (j >= 0) {
            if (j2 >= 0) {
                return;
            }
            vd6.f("replayExpiration(", j2, " ms) cannot be negative");
            throw null;
        }
        vd6.f("stopTimeout(", j, " ms) cannot be negative");
        throw null;
    }

    @Override // defpackage.r56
    public final u92 c(gi6 gi6Var) {
        return se.q(new la2(se.X(gi6Var, new wd6(this, null)), new l8(2, 9, null), 1));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xd6) {
            xd6 xd6Var = (xd6) obj;
            if (this.A == xd6Var.A && this.B == xd6Var.B) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.B) + (Long.hashCode(this.A) * 31);
    }

    public final String toString() {
        ip3 ip3Var = new ip3(2);
        long j = this.A;
        if (j > 0) {
            ip3Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.B;
        if (j2 < Long.MAX_VALUE) {
            ip3Var.add("replayExpiration=" + j2 + "ms");
        }
        return wh1.o(new StringBuilder("SharingStarted.WhileSubscribed("), tq0.S0(l07.t(ip3Var), null, null, null, null, 63), ')');
    }
}

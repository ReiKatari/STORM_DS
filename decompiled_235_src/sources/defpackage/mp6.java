package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mp6  reason: default package */
/* loaded from: classes.dex */
public final class mp6 implements eh6 {
    public final long A;
    public final long B;

    public mp6(long j, long j2) {
        this.A = j;
        this.B = j2;
        if (j >= 0) {
            if (j2 >= 0) {
                return;
            }
            i.f(lb1.i(j2, "replayExpiration(", " ms) cannot be negative"));
            throw null;
        }
        i.f(lb1.i(j, "stopTimeout(", " ms) cannot be negative"));
        throw null;
    }

    @Override // defpackage.eh6
    public final le2 d(yt6 yt6Var) {
        return f04.z(new cf2(f04.V(yt6Var, new lp6(this, null)), new m8(2, null, 9), 1));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mp6) {
            mp6 mp6Var = (mp6) obj;
            if (this.A == mp6Var.A && this.B == mp6Var.B) {
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
        kw3 kw3Var = new kw3(2);
        long j = this.A;
        if (j > 0) {
            kw3Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.B;
        if (j2 < Long.MAX_VALUE) {
            kw3Var.add("replayExpiration=" + j2 + "ms");
        }
        return lb1.q(new StringBuilder("SharingStarted.WhileSubscribed("), gt0.P0(hf.A(kw3Var), null, null, null, null, 63), ')');
    }
}

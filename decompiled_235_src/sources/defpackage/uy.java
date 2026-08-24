package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uy  reason: default package */
/* loaded from: classes.dex */
public final class uy {
    public final wr0 a;
    public final HashMap b;

    public uy(wr0 wr0Var, HashMap hashMap) {
        this.a = wr0Var;
        this.b = hashMap;
    }

    public final long a(b35 b35Var, long j, int i) {
        long j2;
        long a = j - this.a.a();
        vy vyVar = (vy) this.b.get(b35Var);
        long j3 = vyVar.a;
        int i2 = i - 1;
        if (j3 > 1) {
            j2 = j3;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j3 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2))), a), vyVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof uy) {
                uy uyVar = (uy) obj;
                if (this.a.equals(uyVar.a) && this.b.equals(uyVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}

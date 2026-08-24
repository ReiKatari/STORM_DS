package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dk4  reason: default package */
/* loaded from: classes.dex */
public final class dk4 {
    public final long a;
    public final String b;
    public final Long c;
    public final Long d;
    public final Long e;

    public dk4(long j, String str, Long l, Long l2, Long l3) {
        str.getClass();
        this.a = j;
        this.b = str;
        this.c = l;
        this.d = l2;
        this.e = l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk4)) {
            return false;
        }
        dk4 dk4Var = (dk4) obj;
        if (this.a == dk4Var.a && nb3.k(this.b, dk4Var.b) && nb3.k(this.c, dk4Var.c) && nb3.k(this.d, dk4Var.d) && nb3.k(this.e, dk4Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int d = xg6.d(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        Long l = this.c;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (d + hashCode) * 31;
        Long l2 = this.d;
        if (l2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l3 = this.e;
        if (l3 != null) {
            i = l3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "OfflineSessionEvent(seq=" + this.a + ", sessionId=" + this.b + ", startedAtEpochMs=" + this.c + ", endedAtEpochMs=" + this.d + ", estimatedPlayDurationMs=" + this.e + ")";
    }
}

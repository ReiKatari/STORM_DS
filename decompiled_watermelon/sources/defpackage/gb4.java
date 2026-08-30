package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gb4  reason: default package */
/* loaded from: classes.dex */
public final class gb4 {
    public final long a;
    public final String b;
    public final Long c;
    public final Long d;
    public final Long e;

    public gb4(long j, String str, Long l, Long l2, Long l3) {
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
        if (!(obj instanceof gb4)) {
            return false;
        }
        gb4 gb4Var = (gb4) obj;
        if (this.a == gb4Var.a && b53.x(this.b, gb4Var.b) && b53.x(this.c, gb4Var.c) && b53.x(this.d, gb4Var.d) && b53.x(this.e, gb4Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int b = ej6.b(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        Long l = this.c;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (b + hashCode) * 31;
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

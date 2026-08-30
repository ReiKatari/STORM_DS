package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: bb4  reason: default package */
/* loaded from: classes.dex */
public final class bb4 {
    public static final ab4 Companion = new Object();
    public final long a;
    public final String b;
    public final String c;

    public /* synthetic */ bb4(int i, long j, String str, String str2) {
        this.a = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb4)) {
            return false;
        }
        bb4 bb4Var = (bb4) obj;
        if (this.a == bb4Var.a && b53.x(this.b, bb4Var.b) && b53.x(this.c, bb4Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ej6.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "OfflinePrefetchCacheLeaderboard(id=" + this.a + ", memoryAddress=" + this.b + ", format=" + this.c + ")";
    }

    public bb4(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
    }
}

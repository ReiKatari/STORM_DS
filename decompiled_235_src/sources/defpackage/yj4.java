package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: yj4  reason: default package */
/* loaded from: classes.dex */
public final class yj4 {
    public static final xj4 Companion = new Object();
    public final long a;
    public final String b;
    public final String c;

    public /* synthetic */ yj4(int i, long j, String str, String str2) {
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
        if (!(obj instanceof yj4)) {
            return false;
        }
        yj4 yj4Var = (yj4) obj;
        if (this.a == yj4Var.a && nb3.k(this.b, yj4Var.b) && nb3.k(this.c, yj4Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + xg6.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "OfflinePrefetchCacheLeaderboard(id=" + this.a + ", memoryAddress=" + this.b + ", format=" + this.c + ")";
    }

    public yj4(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
    }
}

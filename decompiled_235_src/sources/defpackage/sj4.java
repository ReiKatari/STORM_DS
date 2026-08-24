package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: sj4  reason: default package */
/* loaded from: classes.dex */
public final class sj4 {
    public static final rj4 Companion = new Object();
    public final long a;
    public final String b;

    public /* synthetic */ sj4(String str, int i, long j) {
        this.a = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj4)) {
            return false;
        }
        sj4 sj4Var = (sj4) obj;
        if (this.a == sj4Var.a && nb3.k(this.b, sj4Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OfflinePrefetchCacheAchievement(id=" + this.a + ", memoryAddress=" + this.b + ")";
    }

    public sj4(long j, String str) {
        str.getClass();
        this.a = j;
        this.b = str;
    }
}

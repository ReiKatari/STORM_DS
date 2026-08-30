package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: va4  reason: default package */
/* loaded from: classes.dex */
public final class va4 {
    public static final ua4 Companion = new Object();
    public final long a;
    public final String b;

    public /* synthetic */ va4(String str, int i, long j) {
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
        if (!(obj instanceof va4)) {
            return false;
        }
        va4 va4Var = (va4) obj;
        if (this.a == va4Var.a && b53.x(this.b, va4Var.b)) {
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

    public va4(long j, String str) {
        str.getClass();
        this.a = j;
        this.b = str;
    }
}

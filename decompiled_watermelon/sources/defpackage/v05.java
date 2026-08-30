package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v05  reason: default package */
/* loaded from: classes.dex */
public final class v05 {
    public final String a;
    public final long b;

    public v05(long j, String str) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v05)) {
            return false;
        }
        v05 v05Var = (v05) obj;
        if (b53.x(this.a, v05Var.a) && this.b == v05Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RAGameHashEntity(gameHash=" + this.a + ", gameId=" + this.b + ")";
    }
}

package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ph1  reason: default package */
/* loaded from: classes.dex */
public final class ph1 {
    public final mh1 a;
    public final long b;
    public final long c;

    public ph1(mh1 mh1Var, long j, long j2) {
        mh1Var.getClass();
        this.a = mh1Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph1)) {
            return false;
        }
        ph1 ph1Var = (ph1) obj;
        if (this.a == ph1Var.a && this.b == ph1Var.b && this.c == ph1Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + b31.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncEntryState(kind=");
        sb.append(this.a);
        sb.append(", lastModified=");
        sb.append(this.b);
        return wh1.p(sb, ", length=", this.c, ")");
    }
}

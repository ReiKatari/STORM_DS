package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qy5  reason: default package */
/* loaded from: classes.dex */
public final class qy5 {
    public final rb5 a;
    public final int b;
    public final long c;

    public qy5(rb5 rb5Var, int i, long j) {
        this.a = rb5Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy5)) {
            return false;
        }
        qy5 qy5Var = (qy5) obj;
        if (this.a == qy5Var.a && this.b == qy5Var.b && this.c == qy5Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + wh1.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
    }
}

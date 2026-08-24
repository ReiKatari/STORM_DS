package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pb5  reason: default package */
/* loaded from: classes.dex */
public final class pb5 implements tb5 {
    public final int a;
    public final boolean b;

    public pb5(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb5)) {
            return false;
        }
        pb5 pb5Var = (pb5) obj;
        if (this.a == pb5Var.a && this.b == pb5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PendingChanged(pendingTotal=" + this.a + ", networkAvailable=" + this.b + ")";
    }
}

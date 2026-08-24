package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: to5  reason: default package */
/* loaded from: classes.dex */
public final class to5 implements vo5 {
    public final int a;
    public final int b;

    public to5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to5)) {
            return false;
        }
        to5 to5Var = (to5) obj;
        if (this.a == to5Var.a && this.b == to5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xg6.m(this.a, this.b, "Extracting(entriesDone=", ", entriesTotal=", ")");
    }
}

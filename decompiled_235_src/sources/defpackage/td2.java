package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td2  reason: default package */
/* loaded from: classes.dex */
public final class td2 {
    public final float a;
    public final float b;
    public final long c;

    public td2(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td2)) {
            return false;
        }
        td2 td2Var = (td2) obj;
        if (Float.compare(this.a, td2Var.a) == 0 && Float.compare(this.b, td2Var.b) == 0 && this.c == td2Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + xg6.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}

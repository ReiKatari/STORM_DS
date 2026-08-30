package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b92  reason: default package */
/* loaded from: classes.dex */
public final class b92 {
    public final float a;
    public final float b;
    public final long c;

    public b92(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b92)) {
            return false;
        }
        b92 b92Var = (b92) obj;
        if (Float.compare(this.a, b92Var.a) == 0 && Float.compare(this.b, b92Var.b) == 0 && this.c == b92Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ej6.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}

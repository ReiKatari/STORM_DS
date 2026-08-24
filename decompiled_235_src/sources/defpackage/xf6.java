package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xf6  reason: default package */
/* loaded from: classes.dex */
public final class xf6 {
    public final boolean a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public xf6(boolean z, float f, float f2, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf6)) {
            return false;
        }
        xf6 xf6Var = (xf6) obj;
        if (this.a == xf6Var.a && Float.compare(this.b, xf6Var.b) == 0 && Float.compare(this.c, xf6Var.c) == 0 && this.d == xf6Var.d && this.e == xf6Var.e && this.f == xf6Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xg6.e(xg6.e(xg6.a(this.c, xg6.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        return "CoverageFixConfigurationInputs(enabled=" + this.a + ", coveragePx=" + this.b + ", depthBias=" + this.c + ", applyRepeat=" + this.d + ", applyClamp=" + this.e + ", debugClearMagenta=" + this.f + ")";
    }
}

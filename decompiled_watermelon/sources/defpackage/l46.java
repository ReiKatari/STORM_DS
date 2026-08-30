package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l46  reason: default package */
/* loaded from: classes.dex */
public final class l46 {
    public final boolean a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public l46(boolean z, float f, float f2, boolean z2, boolean z3, boolean z4) {
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
        if (!(obj instanceof l46)) {
            return false;
        }
        l46 l46Var = (l46) obj;
        if (this.a == l46Var.a && Float.compare(this.b, l46Var.b) == 0 && Float.compare(this.c, l46Var.c) == 0 && this.d == l46Var.d && this.e == l46Var.e && this.f == l46Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ej6.c(ej6.c(ej6.a(this.c, ej6.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        return "CoverageFixConfigurationInputs(enabled=" + this.a + ", coveragePx=" + this.b + ", depthBias=" + this.c + ", applyRepeat=" + this.d + ", applyClamp=" + this.e + ", debugClearMagenta=" + this.f + ")";
    }
}

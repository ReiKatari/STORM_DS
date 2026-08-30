package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wx2  reason: default package */
/* loaded from: classes.dex */
public final class wx2 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public wx2(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx2)) {
            return false;
        }
        wx2 wx2Var = (wx2) obj;
        if (this.a == wx2Var.a && this.b == wx2Var.b && this.c == wx2Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ej6.c(Boolean.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "InGameRomSettingsOverrides(controllerMapping=" + this.a + ", controllerLayout=" + this.b + ", videoFiltering=" + this.c + ")";
    }
}

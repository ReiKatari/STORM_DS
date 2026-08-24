package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a43  reason: default package */
/* loaded from: classes.dex */
public final class a43 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public a43(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a43)) {
            return false;
        }
        a43 a43Var = (a43) obj;
        if (this.a == a43Var.a && this.b == a43Var.b && this.c == a43Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xg6.e(Boolean.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InGameRomSettingsOverrides(controllerMapping=");
        sb.append(this.a);
        sb.append(", controllerLayout=");
        sb.append(this.b);
        sb.append(", videoFiltering=");
        return i61.o(sb, this.c, ")");
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: my1  reason: default package */
/* loaded from: classes.dex */
public final class my1 extends ny1 {
    public final a43 a;
    public final boolean b;
    public final boolean c;

    public my1(a43 a43Var, boolean z, boolean z2) {
        this.a = a43Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof my1) {
                my1 my1Var = (my1) obj;
                if (!this.a.equals(my1Var.a) || this.b != my1Var.b || this.c != my1Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xg6.e(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsScreen(romSettingsOverrides=");
        sb.append(this.a);
        sb.append(", retroAchievementsRuntimeIdentityLocked=");
        sb.append(this.b);
        sb.append(", retroAchievementsInGameLogoutSupported=");
        return i61.o(sb, this.c, ")");
    }
}

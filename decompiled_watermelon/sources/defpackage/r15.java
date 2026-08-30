package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r15  reason: default package */
/* loaded from: classes.dex */
public final class r15 {
    public final u15 a;
    public final int b;
    public final int c;

    public r15(u15 u15Var, int i, int i2) {
        u15Var.getClass();
        this.a = u15Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r15)) {
            return false;
        }
        r15 r15Var = (r15) obj;
        if (b53.x(this.a, r15Var.a) && this.b == r15Var.b && this.c == r15Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wh1.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RARuntimeUserAchievement(userAchievement=");
        sb.append(this.a);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", target=");
        return wh1.m(sb, this.c, ")");
    }
}

package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bs6  reason: default package */
/* loaded from: classes.dex */
public final class bs6 {
    public final String a;
    public String b;
    public boolean c = false;
    public zi4 d = null;

    public bs6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs6)) {
            return false;
        }
        bs6 bs6Var = (bs6) obj;
        if (b53.x(this.a, bs6Var.a) && b53.x(this.b, bs6Var.b) && this.c == bs6Var.c && b53.x(this.d, bs6Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = ej6.c(ej6.b(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        zi4 zi4Var = this.d;
        if (zi4Var == null) {
            hashCode = 0;
        } else {
            hashCode = zi4Var.hashCode();
        }
        return c + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.d);
        sb.append(", isShowingSubstitution=");
        return ej6.h(sb, this.c, ')');
    }
}

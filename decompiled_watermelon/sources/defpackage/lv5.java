package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lv5  reason: default package */
/* loaded from: classes.dex */
public final class lv5 {
    public final String a;
    public final String b;
    public final z55 c;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: lv5$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public lv5(String str, String str2, z55 z55Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z55Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lv5) {
                lv5 lv5Var = (lv5) obj;
                if (!b53.x(this.a, lv5Var.a) || !b53.x(this.b, lv5Var.b) || !this.c.equals(lv5Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ej6.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b31.v("ScreenFoldDto(orientation=", this.a, ", type=", this.b, ", foldBounds=");
        v.append(this.c);
        v.append(")");
        return v.toString();
    }
}

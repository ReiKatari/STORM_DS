package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ud3  reason: default package */
/* loaded from: classes.dex */
public final class ud3 {
    public final int a;
    public final td3 b;
    public final int c;
    public final int d;

    public ud3(int i, td3 td3Var, int i2, int i3) {
        td3Var.getClass();
        this.a = i;
        this.b = td3Var;
        this.c = i2;
        this.d = i3;
    }

    public static ud3 a(ud3 ud3Var) {
        td3 td3Var = ud3Var.b;
        int i = ud3Var.c;
        int i2 = ud3Var.d;
        ud3Var.getClass();
        td3Var.getClass();
        return new ud3(-1, td3Var, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud3)) {
            return false;
        }
        ud3 ud3Var = (ud3) obj;
        if (this.a == ud3Var.a && this.b == ud3Var.b && this.c == ud3Var.c && this.d == ud3Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Integer.hashCode(this.d) + wh1.a(this.c, (hashCode + (Integer.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "LayoutDisplay(id=" + this.a + ", type=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }
}

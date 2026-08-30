package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hx2  reason: default package */
/* loaded from: classes.dex */
public final class hx2 {
    public static final hx2 g = new hx2(false, 0, true, 1, 1, fr3.L);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final fr3 f;

    public hx2(boolean z, int i, boolean z2, int i2, int i3, fr3 fr3Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = fr3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hx2) {
                hx2 hx2Var = (hx2) obj;
                if (this.a == hx2Var.a && this.b == hx2Var.b && this.c == hx2Var.c && this.d == hx2Var.d && this.e == hx2Var.e && b53.x(this.f, hx2Var.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f.A.hashCode() + wh1.a(this.e, wh1.a(this.d, ej6.c(wh1.a(this.b, Boolean.hashCode(this.a) * 31, 31), this.c, 31), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) eb3.a(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) gb3.a(this.d)) + ", imeAction=" + ((Object) gx2.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}

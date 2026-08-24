package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l33  reason: default package */
/* loaded from: classes.dex */
public final class l33 {
    public static final l33 g = new l33(false, 0, true, 1, 1, gy3.L);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final gy3 f;

    public l33(boolean z, int i, boolean z2, int i2, int i3, gy3 gy3Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = gy3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l33) {
                l33 l33Var = (l33) obj;
                if (this.a == l33Var.a && this.b == l33Var.b && this.c == l33Var.c && this.d == l33Var.d && this.e == l33Var.e && nb3.k(this.f, l33Var.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f.A.hashCode() + lb1.a(this.e, lb1.a(this.d, xg6.e(lb1.a(this.b, Boolean.hashCode(this.a) * 31, 31), this.c, 31), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) wh3.a(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) yh3.a(this.d)) + ", imeAction=" + ((Object) k33.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}

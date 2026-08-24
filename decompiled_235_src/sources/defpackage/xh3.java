package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xh3  reason: default package */
/* loaded from: classes.dex */
public final class xh3 {
    public static final xh3 e = new xh3(0, 0, 0, 127);
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;

    public xh3(int i, int i2, int i3, int i4) {
        Boolean bool = Boolean.FALSE;
        i = (i4 & 1) != 0 ? -1 : i;
        bool = (i4 & 2) != 0 ? null : bool;
        i2 = (i4 & 4) != 0 ? 0 : i2;
        i3 = (i4 & 8) != 0 ? -1 : i3;
        this.a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
    }

    public final l33 a(boolean z) {
        int i;
        boolean z2;
        int i2;
        int i3 = this.a;
        wh3 wh3Var = new wh3(i3);
        k33 k33Var = null;
        if (i3 == -1) {
            wh3Var = null;
        }
        if (wh3Var != null) {
            i = wh3Var.a;
        } else {
            i = 0;
        }
        int i4 = i;
        int i5 = 1;
        Boolean bool = this.b;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        int i6 = this.c;
        yh3 yh3Var = new yh3(i6);
        if (i6 == 0) {
            yh3Var = null;
        }
        if (yh3Var != null) {
            i2 = yh3Var.a;
        } else {
            i2 = 1;
        }
        int i7 = this.d;
        k33 k33Var2 = new k33(i7);
        if (i7 != -1) {
            k33Var = k33Var2;
        }
        if (k33Var != null) {
            i5 = k33Var.a;
        }
        return new l33(z, i4, z2, i2, i5, gy3.L);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xh3) {
                xh3 xh3Var = (xh3) obj;
                if (this.a == xh3Var.a && nb3.k(this.b, xh3Var.b) && this.c == xh3Var.c && this.d == xh3Var.d) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        return lb1.a(this.d, lb1.a(this.c, (hashCode + i) * 31, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) wh3.a(this.a)) + ", autoCorrectEnabled=" + this.b + ", keyboardType=" + ((Object) yh3.a(this.c)) + ", imeAction=" + ((Object) k33.a(this.d)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}

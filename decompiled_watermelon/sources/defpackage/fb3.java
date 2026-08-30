package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fb3  reason: default package */
/* loaded from: classes.dex */
public final class fb3 {
    public static final fb3 e = new fb3(0, 0, 0, 127);
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;

    public fb3(int i, int i2, int i3, int i4) {
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

    public final hx2 a(boolean z) {
        int i;
        boolean z2;
        int i2;
        int i3 = this.a;
        eb3 eb3Var = new eb3(i3);
        gx2 gx2Var = null;
        if (i3 == -1) {
            eb3Var = null;
        }
        if (eb3Var != null) {
            i = eb3Var.a;
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
        gb3 gb3Var = new gb3(i6);
        if (i6 == 0) {
            gb3Var = null;
        }
        if (gb3Var != null) {
            i2 = gb3Var.a;
        } else {
            i2 = 1;
        }
        int i7 = this.d;
        gx2 gx2Var2 = new gx2(i7);
        if (i7 != -1) {
            gx2Var = gx2Var2;
        }
        if (gx2Var != null) {
            i5 = gx2Var.a;
        }
        return new hx2(z, i4, z2, i2, i5, fr3.L);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fb3) {
                fb3 fb3Var = (fb3) obj;
                if (this.a == fb3Var.a && b53.x(this.b, fb3Var.b) && this.c == fb3Var.c && this.d == fb3Var.d) {
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
        return wh1.a(this.d, wh1.a(this.c, (hashCode + i) * 31, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) eb3.a(this.a)) + ", autoCorrectEnabled=" + this.b + ", keyboardType=" + ((Object) gb3.a(this.c)) + ", imeAction=" + ((Object) gx2.a(this.d)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}

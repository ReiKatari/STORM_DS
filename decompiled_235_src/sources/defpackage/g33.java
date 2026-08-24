package defpackage;

import android.content.res.Resources;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g33  reason: default package */
/* loaded from: classes.dex */
public final class g33 {
    public final Resources.Theme a;
    public final int b;

    public g33(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g33)) {
            return false;
        }
        g33 g33Var = (g33) obj;
        if (nb3.k(this.a, g33Var.a) && this.b == g33Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.a);
        sb.append(", id=");
        return xg6.q(sb, this.b, ')');
    }
}

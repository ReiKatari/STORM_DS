package defpackage;

import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t26  reason: default package */
/* loaded from: classes.dex */
public final class t26 {
    public static final t26 c = new t26(null, BackgroundMode.STRETCH);
    public final n00 a;
    public final BackgroundMode b;

    public t26(n00 n00Var, BackgroundMode backgroundMode) {
        backgroundMode.getClass();
        this.a = n00Var;
        this.b = backgroundMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t26)) {
            return false;
        }
        t26 t26Var = (t26) obj;
        if (nb3.k(this.a, t26Var.a) && this.b == t26Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        n00 n00Var = this.a;
        if (n00Var == null) {
            hashCode = 0;
        } else {
            hashCode = n00Var.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "RuntimeBackground(background=" + this.a + ", mode=" + this.b + ")";
    }
}

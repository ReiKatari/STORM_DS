package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hd6  reason: default package */
/* loaded from: classes.dex */
public final class hd6 {
    public final String a;
    public final String b;
    public final Drawable c;

    public hd6(String str, String str2, Drawable drawable) {
        this.a = str;
        this.b = str2;
        this.c = drawable;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hd6) {
                hd6 hd6Var = (hd6) obj;
                if (!this.a.equals(hd6Var.a) || !nb3.k(this.b, hd6Var.b) || !nb3.k(this.c, hd6Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Drawable drawable = this.c;
        if (drawable != null) {
            i = drawable.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder u = i61.u("FocusedPref(title=", this.a, ", summary=", this.b, ", icon=");
        u.append(this.c);
        u.append(")");
        return u.toString();
    }
}

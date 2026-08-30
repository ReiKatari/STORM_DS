package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t16  reason: default package */
/* loaded from: classes.dex */
public final class t16 {
    public final String a;
    public final String b;
    public final Drawable c;

    public t16(String str, String str2, Drawable drawable) {
        this.a = str;
        this.b = str2;
        this.c = drawable;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t16) {
                t16 t16Var = (t16) obj;
                if (!this.a.equals(t16Var.a) || !b53.x(this.b, t16Var.b) || !b53.x(this.c, t16Var.c)) {
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
        StringBuilder v = b31.v("FocusedPref(title=", this.a, ", summary=", this.b, ", icon=");
        v.append(this.c);
        v.append(")");
        return v.toString();
    }
}

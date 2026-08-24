package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s15  reason: default package */
/* loaded from: classes.dex */
public final class s15 {
    public final int a;
    public final int b;
    public final String c;

    public s15(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.getLayoutResource();
        this.b = preference.getWidgetLayoutResource();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s15) {
            s15 s15Var = (s15) obj;
            if (this.a == s15Var.a && this.b == s15Var.b && TextUtils.equals(this.c, s15Var.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((527 + this.a) * 31) + this.b) * 31);
    }
}

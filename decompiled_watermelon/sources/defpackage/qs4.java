package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qs4  reason: default package */
/* loaded from: classes.dex */
public final class qs4 {
    public final int a;
    public final int b;
    public final String c;

    public qs4(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.getLayoutResource();
        this.b = preference.getWidgetLayoutResource();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qs4) {
            qs4 qs4Var = (qs4) obj;
            if (this.a == qs4Var.a && this.b == qs4Var.b && TextUtils.equals(this.c, qs4Var.c)) {
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

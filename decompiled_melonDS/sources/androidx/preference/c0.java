package androidx.preference;

import android.text.TextUtils;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f1532a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1533b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1534c;

    public c0(Preference preference) {
        this.f1534c = preference.getClass().getName();
        this.f1532a = preference.getLayoutResource();
        this.f1533b = preference.getWidgetLayoutResource();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (this.f1532a == c0Var.f1532a && this.f1533b == c0Var.f1533b && TextUtils.equals(this.f1534c, c0Var.f1534c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1534c.hashCode() + ((((527 + this.f1532a) * 31) + this.f1533b) * 31);
    }
}

package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zg1  reason: default package */
/* loaded from: classes.dex */
public final class zg1 implements q76 {
    public final Context a;

    public zg1(Context context) {
        this.a = context;
    }

    @Override // defpackage.q76
    public final Object c(b55 b55Var) {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        lf1 lf1Var = new lf1(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new h76(lf1Var, lf1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zg1) {
            if (b53.x(this.a, ((zg1) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

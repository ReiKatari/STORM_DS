package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dl1  reason: default package */
/* loaded from: classes.dex */
public final class dl1 implements fj6 {
    public final Context a;

    public dl1(Context context) {
        this.a = context;
    }

    @Override // defpackage.fj6
    public final Object e(oe5 oe5Var) {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        pj1 pj1Var = new pj1(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new wi6(pj1Var, pj1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dl1) {
            if (nb3.k(this.a, ((dl1) obj).a)) {
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

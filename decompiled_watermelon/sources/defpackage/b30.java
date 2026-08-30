package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b30  reason: default package */
/* loaded from: classes.dex */
public final class b30 {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public b30(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            zc.h();
            porterDuffColorFilter = zc.d(mh7.h0(j), pu.J(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(mh7.h0(j), pu.M(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b30)) {
            return false;
        }
        b30 b30Var = (b30) obj;
        if (xq0.c(this.b, b30Var.b) && this.c == b30Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = xq0.i;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "BlendModeColorFilter(color=" + ((Object) xq0.i(this.b)) + ", blendMode=" + ((Object) iq2.D(this.c)) + ')';
    }
}

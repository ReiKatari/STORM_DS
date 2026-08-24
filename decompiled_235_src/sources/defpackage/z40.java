package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z40  reason: default package */
/* loaded from: classes.dex */
public final class z40 {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public z40(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            od.g();
            porterDuffColorFilter = od.c(hv.b0(j), f04.S(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(hv.b0(j), f04.T(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z40)) {
            return false;
        }
        z40 z40Var = (z40) obj;
        if (kt0.d(this.b, z40Var.b) && this.c == z40Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = kt0.i;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "BlendModeColorFilter(color=" + ((Object) kt0.j(this.b)) + ", blendMode=" + ((Object) u24.J(this.c)) + ')';
    }
}

package defpackage;

import android.os.Build;
import android.view.DisplayCutout;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yk1  reason: default package */
/* loaded from: classes.dex */
public final class yk1 {
    public final DisplayCutout a;

    public yk1(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final e83 a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return e83.d(q2.g(this.a));
        }
        return e83.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yk1.class == obj.getClass()) {
            return this.a.equals(((yk1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}

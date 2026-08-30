package defpackage;

import android.os.Build;
import android.view.DisplayCutout;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ug1  reason: default package */
/* loaded from: classes.dex */
public final class ug1 {
    public final DisplayCutout a;

    public ug1(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final x13 a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return x13.d(o2.g(this.a));
        }
        return x13.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ug1.class == obj.getClass()) {
            return this.a.equals(((ug1) obj).a);
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

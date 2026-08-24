package defpackage;

import android.graphics.Rect;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lv7  reason: default package */
/* loaded from: classes.dex */
public final class lv7 {
    public final w60 a;
    public final float b;

    public lv7(Rect rect, float f) {
        this.a = new w60(rect);
        this.b = f;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!lv7.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        lv7 lv7Var = (lv7) obj;
        if (nb3.k(this.a, lv7Var.a) && this.b == lv7Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return xg6.p(sb, this.b, ')');
    }

    public lv7(w60 w60Var, float f) {
        this.a = w60Var;
        this.b = f;
    }
}

package defpackage;

import android.graphics.Rect;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lg7  reason: default package */
/* loaded from: classes.dex */
public final class lg7 {
    public final t40 a;
    public final float b;

    public lg7(Rect rect, float f) {
        this.a = new t40(rect);
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
        if (!lg7.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        lg7 lg7Var = (lg7) obj;
        if (b53.x(this.a, lg7Var.a) && this.b == lg7Var.b) {
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
        return ej6.f(sb, this.b, ')');
    }

    public lg7(t40 t40Var, float f) {
        this.a = t40Var;
        this.b = f;
    }
}

package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rq6  reason: default package */
/* loaded from: classes.dex */
public final class rq6 {
    public static final rq6 c = new rq6(1.0f, RecyclerView.A1);
    public final float a;
    public final float b;

    public rq6(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq6)) {
            return false;
        }
        rq6 rq6Var = (rq6) obj;
        if (this.a == rq6Var.a && this.b == rq6Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return ej6.f(sb, this.b, ')');
    }
}

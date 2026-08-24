package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f37  reason: default package */
/* loaded from: classes.dex */
public final class f37 {
    public static final f37 c = new f37(1.0f, RecyclerView.B1);
    public final float a;
    public final float b;

    public f37(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f37)) {
            return false;
        }
        f37 f37Var = (f37) obj;
        if (this.a == f37Var.a && this.b == f37Var.b) {
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
        return xg6.p(sb, this.b, ')');
    }
}

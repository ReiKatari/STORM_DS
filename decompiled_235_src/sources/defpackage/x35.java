package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x35  reason: default package */
/* loaded from: classes.dex */
public final class x35 {
    public static final x35 d = new x35(RecyclerView.B1, new bs0(RecyclerView.B1, RecyclerView.B1), 0);
    public final float a;
    public final bs0 b;
    public final int c;

    public x35(float f, bs0 bs0Var, int i) {
        this.a = f;
        this.b = bs0Var;
        this.c = i;
        if (!Float.isNaN(f)) {
            return;
        }
        i.h("current must not be NaN");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x35) {
                x35 x35Var = (x35) obj;
                if (this.a == x35Var.a && this.b.equals(x35Var.b) && this.c == x35Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return xg6.q(sb, this.c, ')');
    }
}

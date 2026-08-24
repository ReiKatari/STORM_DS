package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ge6  reason: default package */
/* loaded from: classes.dex */
public final class ge6 {
    public static final ge6 d = new ge6(RecyclerView.B1, hv.c(4278190080L), 0);
    public final long a;
    public final long b;
    public final float c;

    public ge6(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ge6) {
                ge6 ge6Var = (ge6) obj;
                if (kt0.d(this.a, ge6Var.a) && jk4.c(this.b, ge6Var.b) && this.c == ge6Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = kt0.i;
        return Float.hashCode(this.c) + i61.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        sb.append((Object) kt0.j(this.a));
        sb.append(", offset=");
        sb.append((Object) jk4.h(this.b));
        sb.append(", blurRadius=");
        return xg6.p(sb, this.c, ')');
    }
}

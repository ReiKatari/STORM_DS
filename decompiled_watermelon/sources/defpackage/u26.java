package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u26  reason: default package */
/* loaded from: classes.dex */
public final class u26 {
    public static final u26 d = new u26(mh7.d(4278190080L), 0, RecyclerView.A1);
    public final long a;
    public final long b;
    public final float c;

    public u26(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u26) {
                u26 u26Var = (u26) obj;
                if (xq0.c(this.a, u26Var.a) && mb4.b(this.b, u26Var.b) && this.c == u26Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = xq0.i;
        return Float.hashCode(this.c) + b31.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        sb.append((Object) xq0.i(this.a));
        sb.append(", offset=");
        sb.append((Object) mb4.g(this.b));
        sb.append(", blurRadius=");
        return ej6.f(sb, this.c, ')');
    }
}

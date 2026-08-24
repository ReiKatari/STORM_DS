package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vp4  reason: default package */
/* loaded from: classes.dex */
public final class vp4 {
    public final long a;
    public final pq4 b;

    public vp4() {
        long c = hv.c(4284900966L);
        pq4 i = ge7.i(3, RecyclerView.B1);
        this.a = c;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (vp4.class.equals(cls)) {
                obj.getClass();
                vp4 vp4Var = (vp4) obj;
                if (!kt0.d(this.a, vp4Var.a) || !nb3.k(this.b, vp4Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = kt0.i;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) kt0.j(this.a)) + ", drawPadding=" + this.b + ')';
    }
}

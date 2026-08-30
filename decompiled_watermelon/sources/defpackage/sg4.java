package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sg4  reason: default package */
/* loaded from: classes.dex */
public final class sg4 {
    public final long a;
    public final mh4 b;

    public sg4() {
        long d = mh7.d(4284900966L);
        mh4 q = b53.q(3, RecyclerView.A1);
        this.a = d;
        this.b = q;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (sg4.class.equals(cls)) {
                obj.getClass();
                sg4 sg4Var = (sg4) obj;
                if (!xq0.c(this.a, sg4Var.a) || !b53.x(this.b, sg4Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = xq0.i;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) xq0.i(this.a)) + ", drawPadding=" + this.b + ')';
    }
}

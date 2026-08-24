package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i92  reason: default package */
/* loaded from: classes.dex */
public final class i92 {
    public final rc2 a;

    public i92(rc2 rc2Var) {
        this.a = rc2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i92) {
                i92 i92Var = (i92) obj;
                if (Float.compare(RecyclerView.B1, RecyclerView.B1) != 0 || !nb3.k(this.a, i92Var.a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Float.hashCode(RecyclerView.B1) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.a + ')';
    }
}

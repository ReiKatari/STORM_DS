package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p42  reason: default package */
/* loaded from: classes.dex */
public final class p42 {
    public final y72 a;

    public p42(y72 y72Var) {
        this.a = y72Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p42) {
                p42 p42Var = (p42) obj;
                if (Float.compare(RecyclerView.A1, RecyclerView.A1) != 0 || !b53.x(this.a, p42Var.a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Float.hashCode(RecyclerView.A1) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.a + ')';
    }
}

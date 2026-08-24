package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ye6  reason: default package */
/* loaded from: classes.dex */
public final class ye6 {
    public final y16 a;
    public final y16 b;
    public final y16 c;

    public ye6() {
        y16 b = z16.b(4.0f);
        y16 b2 = z16.b(4.0f);
        y16 b3 = z16.b(RecyclerView.B1);
        this.a = b;
        this.b = b2;
        this.c = b3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ye6) {
                ye6 ye6Var = (ye6) obj;
                if (!nb3.k(this.a, ye6Var.a) || !nb3.k(this.b, ye6Var.b) || !nb3.k(this.c, ye6Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }
}

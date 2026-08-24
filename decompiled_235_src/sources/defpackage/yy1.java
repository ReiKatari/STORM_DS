package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yy1  reason: default package */
/* loaded from: classes.dex */
public final class yy1 extends az1 {
    public final List a;
    public final xy1 b;

    public yy1(List list, xy1 xy1Var) {
        list.getClass();
        xy1Var.getClass();
        this.a = list;
        this.b = xy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy1)) {
            return false;
        }
        yy1 yy1Var = (yy1) obj;
        if (nb3.k(this.a, yy1Var.a) && this.b == yy1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowRomSaveStates(saveStates=" + this.a + ", reason=" + this.b + ")";
    }
}

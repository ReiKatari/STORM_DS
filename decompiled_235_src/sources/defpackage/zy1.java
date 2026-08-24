package defpackage;

import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zy1  reason: default package */
/* loaded from: classes.dex */
public final class zy1 extends az1 {
    public final pq5 a;
    public final VideoRenderer b;
    public final z33 c;

    public zy1(pq5 pq5Var, VideoRenderer videoRenderer, z33 z33Var) {
        pq5Var.getClass();
        videoRenderer.getClass();
        z33Var.getClass();
        this.a = pq5Var;
        this.b = videoRenderer;
        this.c = z33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy1)) {
            return false;
        }
        zy1 zy1Var = (zy1) obj;
        if (nb3.k(this.a, zy1Var.a) && this.b == zy1Var.b && nb3.k(this.c, zy1Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ShowRomSettings(rom=" + this.a + ", renderer=" + this.b + ", menuState=" + this.c + ")";
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iy2  reason: default package */
/* loaded from: classes.dex */
public final class iy2 implements hm3 {
    public final i27 a;
    public final int b;
    public final p97 c;
    public final on2 d;

    public iy2(i27 i27Var, int i, p97 p97Var, on2 on2Var) {
        this.a = i27Var;
        this.b = i;
        this.c = p97Var;
        this.d = on2Var;
    }

    @Override // defpackage.hm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        long j2;
        if (x24Var.u(q21.g(j)) < q21.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = q21.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        dx4 y = x24Var.y(j);
        int min = Math.min(y.A, q21.h(j2));
        return g34Var.K(min, y.B, zt1.A, new gi1(this, g34Var, y, min, 1));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iy2) {
                iy2 iy2Var = (iy2) obj;
                if (this.a == iy2Var.a && this.b == iy2Var.b && this.c.equals(iy2Var.c) && nb3.k(this.d, iy2Var.d)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int a = lb1.a(this.b, this.a.hashCode() * 31, 31);
        return this.d.hashCode() + ((this.c.hashCode() + a) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}

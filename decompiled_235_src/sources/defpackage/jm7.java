package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jm7  reason: default package */
/* loaded from: classes.dex */
public final class jm7 implements hm3 {
    public final i27 a;
    public final int b;
    public final p97 c;
    public final on2 d;

    public jm7(i27 i27Var, int i, p97 p97Var, on2 on2Var) {
        this.a = i27Var;
        this.b = i;
        this.c = p97Var;
        this.d = on2Var;
    }

    @Override // defpackage.hm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        dx4 y = x24Var.y(q21.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(y.B, q21.g(j));
        return g34Var.K(y.A, min, zt1.A, new zu1(this, y, min));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jm7) {
                jm7 jm7Var = (jm7) obj;
                if (this.a == jm7Var.a && this.b == jm7Var.b && this.c.equals(jm7Var.c) && nb3.k(this.d, jm7Var.d)) {
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
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}

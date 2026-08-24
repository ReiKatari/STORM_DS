package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sc7  reason: default package */
/* loaded from: classes.dex */
public final class sc7 implements pq1 {
    public final int a;
    public final int b;
    public final hr1 c;

    public sc7(int i, hr1 hr1Var, int i2) {
        this(i, 0, (i2 & 4) != 0 ? ir1.a : hr1Var);
    }

    @Override // defpackage.to
    public final il7 a(wc7 wc7Var) {
        return new r90(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sc7) {
            sc7 sc7Var = (sc7) obj;
            if (sc7Var.a == this.a && sc7Var.b == this.b && nb3.k(sc7Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    public sc7(int i, int i2, hr1 hr1Var) {
        this.a = i;
        this.b = i2;
        this.c = hr1Var;
    }

    @Override // defpackage.pq1, defpackage.to
    public final kl7 a(wc7 wc7Var) {
        return new r90(this.a, this.b, this.c);
    }
}

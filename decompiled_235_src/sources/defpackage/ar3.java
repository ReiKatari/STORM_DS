package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar3  reason: default package */
/* loaded from: classes.dex */
public final class ar3 implements tp3 {
    public final pr3 a;

    public ar3(pr3 pr3Var) {
        this.a = pr3Var;
    }

    @Override // defpackage.tp3
    public final int a() {
        return this.a.j().n;
    }

    @Override // defpackage.tp3
    public final int b() {
        return Math.min(a() - 1, ((kr3) gt0.Q0(this.a.j().k)).a);
    }

    @Override // defpackage.tp3
    public final int c() {
        long e;
        int i;
        pr3 pr3Var = this.a;
        if (pr3Var.j().k.isEmpty()) {
            return 0;
        }
        jr3 j = pr3Var.j();
        if (j.o == lo4.Vertical) {
            e = j.e() & 4294967295L;
        } else {
            e = j.e() >> 32;
        }
        int i2 = (int) e;
        int P = yh2.P(pr3Var.j());
        if (P == 0 || (i = i2 / P) < 1) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.tp3
    public final boolean d() {
        return !this.a.j().k.isEmpty();
    }

    @Override // defpackage.tp3
    public final int e() {
        return Math.max(0, this.a.h());
    }
}

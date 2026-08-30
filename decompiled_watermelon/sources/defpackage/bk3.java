package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bk3  reason: default package */
/* loaded from: classes.dex */
public final class bk3 implements vi3 {
    public final pk3 a;

    public bk3(pk3 pk3Var) {
        this.a = pk3Var;
    }

    @Override // defpackage.vi3
    public final int a() {
        return this.a.j().n;
    }

    @Override // defpackage.vi3
    public final int b() {
        return Math.min(a() - 1, ((kk3) tq0.T0(this.a.j().k)).a);
    }

    @Override // defpackage.vi3
    public final boolean c() {
        return !this.a.j().k.isEmpty();
    }

    @Override // defpackage.vi3
    public final int d() {
        long g;
        int i;
        pk3 pk3Var = this.a;
        if (pk3Var.j().k.isEmpty()) {
            return 0;
        }
        jk3 j = pk3Var.j();
        if (j.o == jf4.Vertical) {
            g = j.g() & 4294967295L;
        } else {
            g = j.g() >> 32;
        }
        int i2 = (int) g;
        int v0 = io2.v0(pk3Var.j());
        if (v0 == 0 || (i = i2 / v0) < 1) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.vi3
    public final int e() {
        return Math.max(0, this.a.h());
    }
}

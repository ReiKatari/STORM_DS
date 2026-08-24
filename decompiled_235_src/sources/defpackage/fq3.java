package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fq3  reason: default package */
/* loaded from: classes.dex */
public final class fq3 implements g34 {
    public final bq3 A;
    public final qt6 B;
    public final cq3 L;
    public final p94 R;

    public fq3(bq3 bq3Var, qt6 qt6Var) {
        this.A = bq3Var;
        this.B = qt6Var;
        this.L = (cq3) bq3Var.b.c();
        h93.a();
        this.R = new p94();
    }

    @Override // defpackage.g34
    public final f34 K(int i, int i2, Map map, qn2 qn2Var) {
        return this.B.K(i, i2, map, qn2Var);
    }

    @Override // defpackage.qh1
    public final long M(float f) {
        return this.B.M(f);
    }

    @Override // defpackage.qh1
    public final float Q(int i) {
        return this.B.Q(i);
    }

    @Override // defpackage.qh1
    public final float T(float f) {
        return this.B.T(f);
    }

    @Override // defpackage.qh1
    public final float Y() {
        return this.B.Y();
    }

    @Override // defpackage.qh1
    public final float a() {
        return this.B.a();
    }

    @Override // defpackage.eb3
    public final boolean a0() {
        return this.B.a0();
    }

    public final List b(int i) {
        p94 p94Var = this.R;
        List list = (List) p94Var.b(i);
        if (list != null) {
            return list;
        }
        cq3 cq3Var = this.L;
        Object c = cq3Var.c(i);
        List v = this.B.v(this.A.a(i, c, cq3Var.d(i)), c);
        p94Var.i(i, v);
        return v;
    }

    @Override // defpackage.qh1
    public final float e0(float f) {
        return this.B.e0(f);
    }

    @Override // defpackage.eb3
    public final kk3 getLayoutDirection() {
        return this.B.getLayoutDirection();
    }

    @Override // defpackage.qh1
    public final int k0(long j) {
        return this.B.k0(j);
    }

    @Override // defpackage.g34
    public final f34 o0(int i, int i2, Map map, qn2 qn2Var, qn2 qn2Var2) {
        return this.B.o0(i, i2, map, qn2Var, qn2Var2);
    }

    @Override // defpackage.qh1
    public final long p(float f) {
        return this.B.p(f);
    }

    @Override // defpackage.qh1
    public final long q(long j) {
        return this.B.q(j);
    }

    @Override // defpackage.qh1
    public final int r0(float f) {
        return this.B.r0(f);
    }

    @Override // defpackage.qh1
    public final long v0(long j) {
        return this.B.v0(j);
    }

    @Override // defpackage.qh1
    public final float x(long j) {
        return this.B.x(j);
    }

    @Override // defpackage.qh1
    public final float y0(long j) {
        return this.B.y0(j);
    }
}

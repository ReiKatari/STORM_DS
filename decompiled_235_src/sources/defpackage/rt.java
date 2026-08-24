package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rt  reason: default package */
/* loaded from: classes.dex */
public final class rt implements st, pt {
    public final /* synthetic */ pt A;
    public final kk3 B;

    public rt(pt ptVar, kk3 kk3Var) {
        this.A = ptVar;
        this.B = kk3Var;
    }

    @Override // defpackage.qh1
    public final long M(float f) {
        return this.A.M(f);
    }

    @Override // defpackage.qh1
    public final float Q(int i) {
        return this.A.Q(i);
    }

    @Override // defpackage.qh1
    public final float T(float f) {
        return this.A.T(f);
    }

    @Override // defpackage.qh1
    public final float Y() {
        return this.A.Y();
    }

    @Override // defpackage.qh1
    public final float a() {
        return this.A.a();
    }

    @Override // defpackage.eb3
    public final boolean a0() {
        return this.A.a0();
    }

    @Override // defpackage.qh1
    public final float e0(float f) {
        return this.A.e0(f);
    }

    @Override // defpackage.eb3
    public final kk3 getLayoutDirection() {
        return this.B;
    }

    @Override // defpackage.qh1
    public final int k0(long j) {
        return this.A.k0(j);
    }

    @Override // defpackage.g34
    public final f34 o0(int i, int i2, Map map, qn2 qn2Var, qn2 qn2Var2) {
        int i3;
        int i4;
        if (i < 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if (i2 < 0) {
            i4 = 0;
        } else {
            i4 = i2;
        }
        if ((i3 & (-16777216)) != 0 || ((-16777216) & i4) != 0) {
            p53.c("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new qt(i3, i4, map, qn2Var, 0);
    }

    @Override // defpackage.qh1
    public final long p(float f) {
        return this.A.p(f);
    }

    @Override // defpackage.qh1
    public final long q(long j) {
        return this.A.q(j);
    }

    @Override // defpackage.qh1
    public final int r0(float f) {
        return this.A.r0(f);
    }

    @Override // defpackage.qh1
    public final long v0(long j) {
        return this.A.v0(j);
    }

    @Override // defpackage.qh1
    public final float x(long j) {
        return this.A.x(j);
    }

    @Override // defpackage.qh1
    public final float y0(long j) {
        return this.A.y0(j);
    }
}

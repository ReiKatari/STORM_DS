package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gj3  reason: default package */
/* loaded from: classes.dex */
public final class gj3 implements vv3 {
    public final dj3 A;
    public final zh6 B;
    public final ej3 L;
    public final j14 R;

    public gj3(dj3 dj3Var, zh6 zh6Var) {
        this.A = dj3Var;
        this.B = zh6Var;
        this.L = (ej3) dj3Var.b.c();
        z23.a();
        this.R = new j14();
    }

    @Override // defpackage.od1
    public final float A0(int i) {
        return this.B.A0(i);
    }

    @Override // defpackage.od1
    public final long B(long j) {
        return this.B.B(j);
    }

    @Override // defpackage.od1
    public final float C(float f) {
        return this.B.C(f);
    }

    @Override // defpackage.od1
    public final float D0(float f) {
        return this.B.D0(f);
    }

    @Override // defpackage.od1
    public final float P(long j) {
        return this.B.P(j);
    }

    @Override // defpackage.vv3
    public final uv3 V(int i, int i2, Map map, mi2 mi2Var, mi2 mi2Var2) {
        return this.B.V(i, i2, map, mi2Var, mi2Var2);
    }

    @Override // defpackage.od1
    public final int Y(float f) {
        return this.B.Y(f);
    }

    public final List a(int i) {
        j14 j14Var = this.R;
        List list = (List) j14Var.b(i);
        if (list != null) {
            return list;
        }
        ej3 ej3Var = this.L;
        Object c = ej3Var.c(i);
        List N = this.B.N(this.A.a(i, c, ej3Var.d(i)), c);
        j14Var.i(i, N);
        return N;
    }

    @Override // defpackage.od1
    public final float b() {
        return this.B.b();
    }

    @Override // defpackage.s43
    public final sd3 getLayoutDirection() {
        return this.B.getLayoutDirection();
    }

    @Override // defpackage.od1
    public final long i0(long j) {
        return this.B.i0(j);
    }

    @Override // defpackage.od1
    public final float n0(long j) {
        return this.B.n0(j);
    }

    @Override // defpackage.od1
    public final float o() {
        return this.B.o();
    }

    @Override // defpackage.vv3
    public final uv3 s0(int i, int i2, Map map, mi2 mi2Var) {
        return this.B.s0(i, i2, map, mi2Var);
    }

    @Override // defpackage.od1
    public final long v0(float f) {
        return this.B.v0(f);
    }

    @Override // defpackage.s43
    public final boolean w() {
        return this.B.w();
    }

    @Override // defpackage.od1
    public final long z(float f) {
        return this.B.z(f);
    }
}

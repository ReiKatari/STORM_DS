package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bt  reason: default package */
/* loaded from: classes.dex */
public final class bt implements ct, zs {
    public final /* synthetic */ zs A;
    public final sd3 B;

    public bt(zs zsVar, sd3 sd3Var) {
        this.A = zsVar;
        this.B = sd3Var;
    }

    @Override // defpackage.od1
    public final float A0(int i) {
        return this.A.A0(i);
    }

    @Override // defpackage.od1
    public final long B(long j) {
        return this.A.B(j);
    }

    @Override // defpackage.od1
    public final float C(float f) {
        return this.A.C(f);
    }

    @Override // defpackage.od1
    public final float D0(float f) {
        return this.A.D0(f);
    }

    @Override // defpackage.od1
    public final float P(long j) {
        return this.A.P(j);
    }

    @Override // defpackage.vv3
    public final uv3 V(int i, int i2, Map map, mi2 mi2Var, mi2 mi2Var2) {
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
            mz2.c("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new at(i3, i4, map, mi2Var, 0);
    }

    @Override // defpackage.od1
    public final int Y(float f) {
        return this.A.Y(f);
    }

    @Override // defpackage.od1
    public final float b() {
        return this.A.b();
    }

    @Override // defpackage.s43
    public final sd3 getLayoutDirection() {
        return this.B;
    }

    @Override // defpackage.od1
    public final long i0(long j) {
        return this.A.i0(j);
    }

    @Override // defpackage.od1
    public final float n0(long j) {
        return this.A.n0(j);
    }

    @Override // defpackage.od1
    public final float o() {
        return this.A.o();
    }

    @Override // defpackage.od1
    public final long v0(float f) {
        return this.A.v0(f);
    }

    @Override // defpackage.s43
    public final boolean w() {
        return this.A.w();
    }

    @Override // defpackage.od1
    public final long z(float f) {
        return this.A.z(f);
    }
}

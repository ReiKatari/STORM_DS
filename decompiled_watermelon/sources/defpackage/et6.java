package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: et6  reason: default package */
/* loaded from: classes.dex */
public final class et6 {
    public final j14 a;
    public dt6 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public et6() {
        j14 j14Var = z23.a;
        this.a = new j14();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(dt6 dt6Var, long j, long j2, float[] fArr, long j3) {
        boolean z;
        long j4 = dt6Var.g;
        if (j3 - j4 <= 0 && j4 != Long.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            dt6Var.g = j3;
            dt6Var.a(dt6Var.e, dt6Var.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (!a33.a(j2, this.d)) {
            this.d = j2;
            z = true;
        } else {
            z = false;
        }
        if (!a33.a(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 != this.f) {
            this.f = j3;
            return true;
        }
        return z;
    }
}

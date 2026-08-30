package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m92  reason: default package */
/* loaded from: classes.dex */
public final class m92 implements f92 {
    public final int a;
    public final bn1 b;
    public final long c;
    public final long d;

    public m92(int i, int i2, bn1 bn1Var) {
        this.a = i;
        this.b = bn1Var;
        this.c = i * 1000000;
        this.d = i2 * 1000000;
    }

    @Override // defpackage.f92
    public final float b(long j, float f, float f2, float f3) {
        float f4;
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        if (this.a == 0) {
            f4 = 1.0f;
        } else {
            f4 = ((float) j2) / ((float) j3);
        }
        float b = this.b.b(f4);
        return (f2 * b) + ((1.0f - b) * f);
    }

    @Override // defpackage.f92
    public final float c(long j, float f, float f2, float f3) {
        long j2;
        long j3 = j - this.d;
        if (j3 < 0) {
            j3 = 0;
        }
        long j4 = this.c;
        if (j3 > j4) {
            j2 = j4;
        } else {
            j2 = j3;
        }
        if (j2 == 0) {
            return f3;
        }
        return (b(j2, f, f2, f3) - b(j2 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.f92
    public final long d(float f, float f2, float f3) {
        return this.d + this.c;
    }
}

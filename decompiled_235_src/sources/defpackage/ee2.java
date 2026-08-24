package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ee2  reason: default package */
/* loaded from: classes.dex */
public final class ee2 implements xd2 {
    public final int a;
    public final hr1 b;
    public final long c;
    public final long d;

    public ee2(int i, int i2, hr1 hr1Var) {
        this.a = i;
        this.b = hr1Var;
        this.c = i * 1000000;
        this.d = i2 * 1000000;
    }

    @Override // defpackage.xd2
    public final float b(long j, float f, float f2, float f3) {
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
        return (e(j2, f, f2, f3) - e(j2 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.xd2
    public final long c(float f, float f2, float f3) {
        return this.d + this.c;
    }

    @Override // defpackage.xd2
    public final float e(long j, float f, float f2, float f3) {
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
}

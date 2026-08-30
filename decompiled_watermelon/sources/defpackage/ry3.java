package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ry3  reason: default package */
/* loaded from: classes.dex */
public final class ry3 {
    public static ry3 h;
    public final sd3 a;
    public final ds6 b;
    public final rd1 c;
    public final od2 d;
    public final ds6 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public ry3(sd3 sd3Var, ds6 ds6Var, rd1 rd1Var, od2 od2Var) {
        this.a = sd3Var;
        this.b = ds6Var;
        this.c = rd1Var;
        this.d = od2Var;
        this.e = cg2.T(ds6Var, sd3Var);
    }

    public final long a(int i, long j) {
        float f = this.g;
        float f2 = this.f;
        int i2 = 0;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = sy3.a;
            long b = nz0.b(0, 0, 0, 0, 15);
            ds6 ds6Var = this.e;
            rd1 rd1Var = this.c;
            float b2 = yf2.a(str, ds6Var, b, rd1Var, this.d, 1, 96).b();
            float b3 = yf2.a(sy3.b, this.e, nz0.b(0, 0, 0, 0, 15), rd1Var, this.d, 2, 96).b() - b2;
            this.g = b2;
            this.f = b3;
            f2 = b3;
            f = b2;
        }
        if (i != 1) {
            int round = Math.round((f2 * (i - 1)) + f);
            if (round >= 0) {
                i2 = round;
            }
            int g = lz0.g(j);
            if (i2 > g) {
                i2 = g;
            }
        } else {
            i2 = lz0.i(j);
        }
        return nz0.a(lz0.j(j), lz0.h(j), i2, lz0.g(j));
    }
}

package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k21  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class k21 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ bq6 B;

    public /* synthetic */ k21(bq6 bq6Var, int i) {
        this.A = i;
        this.B = bq6Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        y55 y55Var;
        hm3 hm3Var;
        rd3 c;
        long j;
        char c2;
        long j2;
        float f;
        rd3 c3;
        float f2;
        rd3 c4;
        float f3;
        rd3 c5;
        rd3 c6;
        int i = this.A;
        bq6 bq6Var = this.B;
        switch (i) {
            case 0:
                ch1 ch1Var = (ch1) obj;
                return new y3(8, bq6Var);
            case 1:
                mb4 mb4Var = (mb4) obj;
                bq6Var.r();
                return o27.a;
            default:
                rd3 rd3Var = (rd3) obj;
                hm3 hm3Var2 = bq6Var.d;
                y55 y55Var2 = y55.e;
                if (hm3Var2 != null) {
                    if (hm3Var2.p) {
                        hm3Var2 = null;
                    }
                    if (hm3Var2 != null) {
                        pb4 pb4Var = bq6Var.b;
                        long j3 = bq6Var.n().b;
                        int i2 = vr6.c;
                        int r = pb4Var.r((int) (j3 >> 32));
                        int r2 = bq6Var.b.r((int) (bq6Var.n().b & 4294967295L));
                        hm3 hm3Var3 = bq6Var.d;
                        long j4 = 0;
                        if (hm3Var3 != null && (c6 = hm3Var3.c()) != null) {
                            j = c6.Q(bq6Var.l(true));
                        } else {
                            j = 0;
                        }
                        hm3 hm3Var4 = bq6Var.d;
                        if (hm3Var4 != null && (c5 = hm3Var4.c()) != null) {
                            j4 = c5.Q(bq6Var.l(false));
                        }
                        hm3 hm3Var5 = bq6Var.d;
                        float f4 = RecyclerView.A1;
                        if (hm3Var5 != null && (c4 = hm3Var5.c()) != null) {
                            mr6 d = hm3Var2.d();
                            if (d != null) {
                                f3 = d.a.c(r).b;
                            } else {
                                f3 = 0.0f;
                            }
                            c2 = ' ';
                            j2 = j4;
                            f = Float.intBitsToFloat((int) (c4.Q((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(RecyclerView.A1) << 32)) & 4294967295L));
                        } else {
                            c2 = ' ';
                            j2 = j4;
                            f = 0.0f;
                        }
                        hm3 hm3Var6 = bq6Var.d;
                        if (hm3Var6 != null && (c3 = hm3Var6.c()) != null) {
                            mr6 d2 = hm3Var2.d();
                            if (d2 != null) {
                                f2 = d2.a.c(r2).b;
                            } else {
                                f2 = 0.0f;
                            }
                            f4 = Float.intBitsToFloat((int) (c3.Q((Float.floatToRawIntBits(RecyclerView.A1) << c2) | (Float.floatToRawIntBits(f2) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (j >> c2);
                        int i4 = (int) (j2 >> c2);
                        y55Var = new y55(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(f, f4), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (hm3Var2.a.g.b() * 25.0f) + Math.max(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L))));
                        hm3Var = bq6Var.d;
                        if (hm3Var == null && (c = hm3Var.c()) != null) {
                            if (c.c0() && rd3Var.c0()) {
                                return yf2.b(rd3Var.y(me2.s(c), y55Var.d()), y55Var.c());
                            }
                            return y55Var2;
                        }
                        return null;
                    }
                }
                y55Var = y55Var2;
                hm3Var = bq6Var.d;
                if (hm3Var == null) {
                }
                return null;
        }
    }
}

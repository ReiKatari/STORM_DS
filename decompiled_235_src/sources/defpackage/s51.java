package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s51  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s51 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ p27 B;

    public /* synthetic */ s51(p27 p27Var, int i) {
        this.A = i;
        this.B = p27Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        of5 of5Var;
        jt3 jt3Var;
        jk3 c;
        long j;
        char c2;
        long j2;
        float f;
        jk3 c3;
        float f2;
        jk3 c4;
        float f3;
        jk3 c5;
        jk3 c6;
        int i = this.A;
        p27 p27Var = this.B;
        switch (i) {
            case 0:
                gl1 gl1Var = (gl1) obj;
                return new z3(p27Var, 8);
            case 1:
                jk4 jk4Var = (jk4) obj;
                p27Var.r();
                return jg7.a;
            default:
                jk3 jk3Var = (jk3) obj;
                jt3 jt3Var2 = p27Var.d;
                of5 of5Var2 = of5.e;
                if (jt3Var2 != null) {
                    if (jt3Var2.p) {
                        jt3Var2 = null;
                    }
                    if (jt3Var2 != null) {
                        mk4 mk4Var = p27Var.b;
                        long j3 = p27Var.n().b;
                        int i2 = k47.c;
                        int s = mk4Var.s((int) (j3 >> 32));
                        int s2 = p27Var.b.s((int) (p27Var.n().b & 4294967295L));
                        jt3 jt3Var3 = p27Var.d;
                        long j4 = 0;
                        if (jt3Var3 != null && (c6 = jt3Var3.c()) != null) {
                            j = c6.P(p27Var.l(true));
                        } else {
                            j = 0;
                        }
                        jt3 jt3Var4 = p27Var.d;
                        if (jt3Var4 != null && (c5 = jt3Var4.c()) != null) {
                            j4 = c5.P(p27Var.l(false));
                        }
                        jt3 jt3Var5 = p27Var.d;
                        float f4 = RecyclerView.B1;
                        if (jt3Var5 != null && (c4 = jt3Var5.c()) != null) {
                            b47 d = jt3Var2.d();
                            if (d != null) {
                                f3 = d.a.c(s).b;
                            } else {
                                f3 = 0.0f;
                            }
                            c2 = ' ';
                            j2 = j4;
                            f = Float.intBitsToFloat((int) (c4.P((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(RecyclerView.B1) << 32)) & 4294967295L));
                        } else {
                            c2 = ' ';
                            j2 = j4;
                            f = 0.0f;
                        }
                        jt3 jt3Var6 = p27Var.d;
                        if (jt3Var6 != null && (c3 = jt3Var6.c()) != null) {
                            b47 d2 = jt3Var2.d();
                            if (d2 != null) {
                                f2 = d2.a.c(s2).b;
                            } else {
                                f2 = 0.0f;
                            }
                            f4 = Float.intBitsToFloat((int) (c3.P((Float.floatToRawIntBits(RecyclerView.B1) << c2) | (Float.floatToRawIntBits(f2) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (j >> c2);
                        int i4 = (int) (j2 >> c2);
                        of5Var = new of5(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(f, f4), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (jt3Var2.a.g.a() * 25.0f) + Math.max(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L))));
                        jt3Var = p27Var.d;
                        if (jt3Var == null && (c = jt3Var.c()) != null) {
                            if (c.t() && jk3Var.t()) {
                                return kj2.b(jk3Var.J(ej2.w(c), of5Var.d()), of5Var.c());
                            }
                            return of5Var2;
                        }
                        return null;
                    }
                }
                of5Var = of5Var2;
                jt3Var = p27Var.d;
                if (jt3Var == null) {
                }
                return null;
        }
    }
}

package defpackage;

import android.content.Context;
import me.magnum.melonds.MelonRomDecryptor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zu5  reason: default package */
/* loaded from: classes.dex */
public abstract class zu5 {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final e33 e33Var, final long j, final String str, boolean z, final on2 on2Var, px0 px0Var, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        final boolean z2;
        int i6;
        boolean z3;
        cf5 t;
        a74 a74Var;
        long j2;
        long j3;
        oj2 oj2Var;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-64805549);
        if (xq2Var.f(e33Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i3 | i;
        if (xq2Var.e(j)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (xq2Var.f(str)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i9 | i5;
        int i11 = i2 & 8;
        if (i11 != 0) {
            i10 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            if (xq2Var.g(z2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i10 |= i6;
            if ((i & 24576) == 0) {
                if (xq2Var.h(on2Var)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i10 |= i7;
            }
            if ((i10 & 9363) == 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!xq2Var.S(i10 & 1, z3)) {
                if (i11 != 0) {
                    z2 = true;
                }
                es7 F = bl2.F(xq2Var);
                d40 d40Var = d90.i0;
                x64 x64Var = x64.a;
                a74 c = dj6.c(x64Var, 1.0f);
                if (z2) {
                    a74Var = mb3.u(x64Var, false, null, on2Var, 15);
                } else {
                    a74Var = x64Var;
                }
                a74 P = ge7.P(c.d(a74Var), 18.0f, 12.0f);
                l26 a = k26.a(ju.a, d40Var, xq2Var, 48);
                int hashCode = Long.hashCode(xq2Var.T);
                xv4 l = xq2Var.l();
                a74 E = l.E(xq2Var, P);
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2Var.f0();
                int i12 = i10;
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, ix0.f, a);
                yh2.K(xq2Var, ix0.e, l);
                yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                yh2.F(xq2Var, ix0.h);
                yh2.K(xq2Var, ix0.d, E);
                if (z2) {
                    j2 = j;
                } else {
                    j2 = F.l;
                }
                i13.a(e33Var, null, dj6.i(x64Var, 20.0f), j2, xq2Var, (i12 & 14) | 432, 0);
                gi2.h(xq2Var, dj6.l(x64Var, 14.0f));
                if (z2) {
                    j3 = F.g;
                } else {
                    j3 = F.l;
                }
                long j4 = j3;
                long E2 = hi2.E(14);
                if (z2) {
                    oj2Var = oj2.Z;
                } else {
                    oj2Var = oj2.d0;
                }
                x37.b(str, null, j4, E2, oj2Var, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, (14 & (i12 >> 6)) | 3072, 0, 131026);
                xq2Var = xq2Var;
                xq2Var.p(true);
            } else {
                xq2Var.V();
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new eo2() { // from class: wu5
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        zu5.a(e33.this, j, str, z2, on2Var, (px0) obj, ii2.a0(i | 1), i2);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if ((i10 & 9363) == 9362) {
        }
        if (!xq2Var.S(i10 & 1, z3)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final void b(final pq5 pq5Var, final on2 on2Var, final qn2 qn2Var, final qn2 qn2Var2, final qn2 qn2Var3, final qn2 qn2Var4, final qn2 qn2Var5, final qn2 qn2Var6, px0 px0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        xq2 xq2Var;
        cf5 t;
        eo2 eo2Var;
        on2Var.getClass();
        qn2Var.getClass();
        qn2Var2.getClass();
        qn2Var3.getClass();
        qn2Var4.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-152537623);
        if (xq2Var2.h(pq5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (xq2Var2.h(qn2Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i9 = i8 | i3;
        if (xq2Var2.h(qn2Var2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i10 = i9 | i4;
        if (xq2Var2.h(qn2Var3)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i11 = i10 | i5;
        if (xq2Var2.h(qn2Var4)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i12 = i11 | i6;
        if (xq2Var2.h(qn2Var5)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i13 = i12 | i7;
        boolean z2 = true;
        if ((4793491 & i13) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i13 & 1, z)) {
            if (pq5Var == null) {
                t = xq2Var2.t();
                if (t != null) {
                    eo2Var = new eo2(pq5Var, on2Var, qn2Var, qn2Var2, qn2Var3, qn2Var4, qn2Var5, qn2Var6, i, 0) { // from class: uu5
                        public final /* synthetic */ int A;
                        public final /* synthetic */ pq5 B;
                        public final /* synthetic */ on2 L;
                        public final /* synthetic */ qn2 R;
                        public final /* synthetic */ qn2 X;
                        public final /* synthetic */ qn2 Y;
                        public final /* synthetic */ qn2 Z;
                        public final /* synthetic */ qn2 d0;
                        public final /* synthetic */ qn2 e0;

                        {
                            this.A = r10;
                        }

                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            int i14 = this.A;
                            jg7 jg7Var = jg7.a;
                            switch (i14) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int a0 = ii2.a0(12582961);
                                    zu5.b(this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, (px0) obj, a0);
                                    return jg7Var;
                                default:
                                    ((Integer) obj2).getClass();
                                    int a02 = ii2.a0(12582961);
                                    zu5.b(this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, (px0) obj, a02);
                                    return jg7Var;
                            }
                        }
                    };
                    t.d = eo2Var;
                }
                return;
            }
            es7 F = bl2.F(xq2Var2);
            Context context = (Context) xq2Var2.j(kf.b);
            boolean f = xq2Var2.f(pq5Var);
            Object P = xq2Var2.P();
            if (f || P == ox0.a) {
                if (pq5Var.c() || !pq5Var.h || MelonRomDecryptor.a.a(context, pq5Var.d) != MelonRomDecryptor.b.MODCRYPT_ENCRYPTED) {
                    z2 = false;
                }
                P = Boolean.valueOf(z2);
                xq2Var2.l0(P);
            }
            xq2Var = xq2Var2;
            nw7.o(on2Var, null, n16.I(621242752, new xu5(F, qn2Var5, pq5Var, on2Var, ((Boolean) P).booleanValue(), qn2Var6, qn2Var, qn2Var2, qn2Var3, qn2Var4, 0), xq2Var2), xq2Var, 390, 2);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        t = xq2Var.t();
        if (t != null) {
            eo2Var = new eo2(pq5Var, on2Var, qn2Var, qn2Var2, qn2Var3, qn2Var4, qn2Var5, qn2Var6, i, 1) { // from class: uu5
                public final /* synthetic */ int A;
                public final /* synthetic */ pq5 B;
                public final /* synthetic */ on2 L;
                public final /* synthetic */ qn2 R;
                public final /* synthetic */ qn2 X;
                public final /* synthetic */ qn2 Y;
                public final /* synthetic */ qn2 Z;
                public final /* synthetic */ qn2 d0;
                public final /* synthetic */ qn2 e0;

                {
                    this.A = r10;
                }

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    int i14 = this.A;
                    jg7 jg7Var = jg7.a;
                    switch (i14) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int a0 = ii2.a0(12582961);
                            zu5.b(this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, (px0) obj, a0);
                            return jg7Var;
                        default:
                            ((Integer) obj2).getClass();
                            int a02 = ii2.a0(12582961);
                            zu5.b(this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, (px0) obj, a02);
                            return jg7Var;
                    }
                }
            };
            t.d = eo2Var;
        }
    }
}

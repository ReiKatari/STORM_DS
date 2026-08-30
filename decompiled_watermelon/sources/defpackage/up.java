package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: up  reason: default package */
/* loaded from: classes.dex */
public abstract class up {
    public static final zy3 a;
    public static final zy3 b;
    public static final o82 c;

    /* JADX WARN: Type inference failed for: r0v5, types: [o82, java.lang.Object] */
    static {
        wy3 wy3Var = wy3.a;
        a = o76.k(wy3Var, 12.0f);
        b = o76.k(o76.b(wy3Var, 1.0f), 68.0f);
        c = new Object();
    }

    public static final void a(long j, long j2, float f, ih4 ih4Var, re7 re7Var, zy3 zy3Var, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        zy3 zy3Var2;
        boolean z;
        sk2 sk2Var;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        is2 is2Var = iq2.g;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(1222317265);
        if ((i & 6) == 0) {
            if (sk2Var2.e(j)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var2.e(j2)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var2.c(f)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (sk2Var2.f(ih4Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (sk2Var2.f(is2Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (sk2Var2.f(re7Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((i & 1572864) == 0) {
            zy3Var2 = zy3Var;
            if (sk2Var2.f(zy3Var2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        } else {
            zy3Var2 = zy3Var;
        }
        if ((12582912 & i) == 0) {
            if (sk2Var2.h(et0Var)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        if ((4793491 & i2) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i2 & 1, z)) {
            int i11 = i2 << 6;
            sk2Var = sk2Var2;
            mj2.f(zy3Var2, is2Var, j, j2, f, ct3.H0(-1628734195, new qp(re7Var, ih4Var, et0Var, 0), sk2Var2), sk2Var, ((i2 >> 18) & 14) | 1572864 | ((i2 >> 9) & 112) | (i11 & 896) | (i11 & 7168) | ((i2 << 9) & 458752), 16);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new rp(j, j2, f, ih4Var, re7Var, zy3Var, et0Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.et0 r19, final defpackage.re7 r20, defpackage.zy3 r21, final defpackage.aj2 r22, defpackage.bj2 r23, final long r24, long r26, float r28, defpackage.tu0 r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up.b(et0, re7, zy3, aj2, bj2, long, long, float, tu0, int, int):void");
    }

    public static final void c(final zy3 zy3Var, final aj2 aj2Var, bj2 bj2Var, final long j, final long j2, final float f, tu0 tu0Var, final int i) {
        boolean z;
        sk2 sk2Var;
        final bj2 bj2Var2;
        et0 et0Var;
        et0 et0Var2 = f34.b;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-350082398);
        int i2 = i | 3072;
        if ((599187 & i2) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i2 & 1, z)) {
            sk2Var2.T();
            if ((i & 1) != 0 && !sk2Var2.y()) {
                sk2Var2.R();
                et0Var = bj2Var;
            } else {
                et0Var = dt3.L;
            }
            sk2Var2.q();
            sk2Var = sk2Var2;
            b(et0Var2, c, zy3Var, aj2Var, et0Var, j, j2, f, sk2Var, 14380470, 0);
            bj2Var2 = et0Var;
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
            bj2Var2 = bj2Var;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(aj2Var, bj2Var2, j, j2, f, i) { // from class: op
                public final /* synthetic */ aj2 B;
                public final /* synthetic */ bj2 L;
                public final /* synthetic */ long R;
                public final /* synthetic */ long X;
                public final /* synthetic */ float Y;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(1794487);
                    up.c(zy3.this, this.B, this.L, this.R, this.X, this.Y, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }
}

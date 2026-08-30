package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q10  reason: default package */
/* loaded from: classes.dex */
public abstract class q10 {
    public static final /* synthetic */ int a = 0;

    static {
        dk7.c(40.0f, 40.0f);
    }

    public static final void a(oq6 oq6Var, mi2 mi2Var, zy3 zy3Var, boolean z, ds6 ds6Var, fb3 fb3Var, db3 db3Var, boolean z2, int i, int i2, uc7 uc7Var, mi2 mi2Var2, l14 l14Var, mb6 mb6Var, et0 et0Var, tu0 tu0Var, int i3, int i4) {
        int i5;
        boolean z3;
        int i6;
        int i7;
        mi2 mi2Var3;
        mi2 mi2Var4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-971111025);
        if ((i3 & 6) == 0) {
            i5 = (sk2Var.f(oq6Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= sk2Var.h(mi2Var) ? 32 : 16;
        }
        if ((i3 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i5 |= sk2Var.f(zy3Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            z3 = z;
            i5 |= sk2Var.g(z3) ? 2048 : 1024;
        } else {
            z3 = z;
        }
        if ((i3 & 24576) == 0) {
            i5 |= sk2Var.g(false) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 = 196608;
            i5 |= sk2Var.f(ds6Var) ? 131072 : 65536;
        } else {
            i6 = 196608;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= sk2Var.f(fb3Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= sk2Var.f(db3Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= sk2Var.g(z2) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= sk2Var.d(i) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i7 = i4 | (sk2Var.d(i2) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= sk2Var.f(uc7Var) ? 32 : 16;
        }
        int i8 = i7 | RendererDebugBridge.CAPTURE_HEIGHT;
        if ((i4 & 3072) == 0) {
            i8 |= sk2Var.f(l14Var) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i8 |= sk2Var.f(mb6Var) ? 16384 : 8192;
        }
        if ((i4 & i6) == 0) {
            i8 |= sk2Var.h(et0Var) ? 131072 : 65536;
        }
        if (sk2Var.O(i5 & 1, ((i5 & 306783379) == 306783378 && (74899 & i8) == 74898) ? false : true)) {
            sk2Var.T();
            int i9 = i3 & 1;
            sn1 sn1Var = su0.a;
            if (i9 != 0 && !sk2Var.y()) {
                sk2Var.R();
                mi2Var4 = mi2Var2;
            } else {
                Object L = sk2Var.L();
                if (L == sn1Var) {
                    L = new k4(19);
                    sk2Var.h0(L);
                }
                mi2Var4 = (mi2) L;
            }
            sk2Var.q();
            hx2 a2 = fb3Var.a(z2);
            boolean z4 = !z2;
            int i10 = z2 ? 1 : i2;
            int i11 = z2 ? 1 : i;
            boolean z5 = ((i5 & 14) == 4) | ((i5 & 112) == 32);
            Object L2 = sk2Var.L();
            if (z5 || L2 == sn1Var) {
                L2 = new x(7, oq6Var, mi2Var);
                sk2Var.h0(L2);
            }
            int i12 = i8 << 9;
            mi2 mi2Var5 = mi2Var4;
            l07.b(oq6Var, (mi2) L2, zy3Var, ds6Var, uc7Var, mi2Var5, l14Var, mb6Var, z4, i11, i10, a2, db3Var, z3, et0Var, sk2Var, (i5 & 910) | ((i5 >> 6) & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128), (i5 & 7168) | ((i5 >> 15) & 896) | (i5 & 57344) | (i8 & 458752));
            mi2Var3 = mi2Var5;
        } else {
            sk2Var.R();
            mi2Var3 = mi2Var2;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new p10(oq6Var, mi2Var, zy3Var, z, ds6Var, fb3Var, db3Var, z2, i, i2, uc7Var, mi2Var3, l14Var, mb6Var, et0Var, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r32, final defpackage.mi2 r33, final defpackage.zy3 r34, boolean r35, final defpackage.ds6 r36, final defpackage.fb3 r37, defpackage.db3 r38, final boolean r39, int r40, int r41, defpackage.uc7 r42, defpackage.mi2 r43, defpackage.l14 r44, final defpackage.mb6 r45, final defpackage.et0 r46, defpackage.tu0 r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q10.b(java.lang.String, mi2, zy3, boolean, ds6, fb3, db3, boolean, int, int, uc7, mi2, l14, mb6, et0, tu0, int, int, int):void");
    }
}

package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i13  reason: default package */
/* loaded from: classes.dex */
public abstract class i13 {
    public static final a74 a = dj6.i(x64.a, 24.0f);

    public static final void a(e33 e33Var, String str, a74 a74Var, long j, px0 px0Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            a74Var = x64.a;
        }
        a74 a74Var2 = a74Var;
        if ((i2 & 8) != 0) {
            xq2 xq2Var = (xq2) px0Var;
            j = kt0.c(((Number) xq2Var.j(g31.a)).floatValue(), ((kt0) xq2Var.j(j31.a)).a);
        }
        b(kn2.Z(e33Var, px0Var), str, a74Var2, j, px0Var, (i & 112) | 8 | (i & 896) | (i & 7168), 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
        if ((r23 & 8) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0150, code lost:
        if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (r3 & 4294967295L))) != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final sr4 sr4Var, final String str, a74 a74Var, long j, px0 px0Var, final int i, final int i2) {
        int i3;
        a74 a74Var2;
        int i4;
        long j2;
        boolean z;
        final a74 a74Var3;
        final long j3;
        cf5 t;
        boolean z2;
        a74 a74Var4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1142959010);
        if ((i & 6) == 0) {
            if (xq2Var.h(sr4Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.f(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            a74Var2 = a74Var;
            if (xq2Var.f(a74Var2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
            if ((i & 3072) != 0) {
                j2 = j;
                if ((i2 & 8) == 0 && xq2Var.e(j2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) == 1170) {
                z = true;
            } else {
                z = false;
            }
            if (!xq2Var.S(i3 & 1, z)) {
                xq2Var.X();
                int i9 = i & 1;
                a74 a74Var5 = x64.a;
                if (i9 != 0 && !xq2Var.B()) {
                    xq2Var.V();
                } else {
                    if (i8 != 0) {
                        a74Var2 = a74Var5;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = kt0.c(((Number) xq2Var.j(g31.a)).floatValue(), ((kt0) xq2Var.j(j31.a)).a);
                        i3 &= -7169;
                    }
                    xq2Var.q();
                    if ((((i3 & 7168) ^ 3072) > 2048 && xq2Var.e(j2)) || (i3 & 3072) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object P = xq2Var.P();
                    vs0 vs0Var = ox0.a;
                    if (z2 || P == vs0Var) {
                        if (kt0.d(j2, kt0.h)) {
                            P = null;
                        } else {
                            P = new z40(5, j2);
                        }
                        xq2Var.l0(P);
                    }
                    z40 z40Var = (z40) P;
                    if (str != null) {
                        xq2Var.b0(609219782);
                        if ((i3 & 112) == 32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Object P2 = xq2Var.P();
                        if (z3 || P2 == vs0Var) {
                            P2 = new c70(str, 11);
                            xq2Var.l0(P2);
                        }
                        a74Var4 = ua6.a(a74Var5, false, (qn2) P2);
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(609378564);
                        xq2Var.p(false);
                        a74Var4 = a74Var5;
                    }
                    if (!xi6.b(sr4Var.h(), 9205357640488583168L)) {
                        long h = sr4Var.h();
                        if (Float.isInfinite(Float.intBitsToFloat((int) (h >> 32)))) {
                        }
                        h70.a(ak7.u0(a74Var2.d(a74Var5), sr4Var, null, y31.b, RecyclerView.B1, z40Var, 22).d(a74Var4), xq2Var, 0);
                        a74Var3 = a74Var2;
                        j3 = j2;
                    }
                    a74Var5 = a;
                    h70.a(ak7.u0(a74Var2.d(a74Var5), sr4Var, null, y31.b, RecyclerView.B1, z40Var, 22).d(a74Var4), xq2Var, 0);
                    a74Var3 = a74Var2;
                    j3 = j2;
                }
            } else {
                xq2Var.V();
                a74Var3 = a74Var2;
                j3 = j2;
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new eo2() { // from class: h13
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        i13.b(sr4.this, str, a74Var3, j3, (px0) obj, ii2.a0(i | 1), i2);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        a74Var2 = a74Var;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        if (!xq2Var.S(i3 & 1, z)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }
}

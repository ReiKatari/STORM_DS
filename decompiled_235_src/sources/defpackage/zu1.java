package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zu1 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ zu1(jm7 jm7Var, dx4 dx4Var, int i) {
        this.A = 4;
        this.L = jm7Var;
        this.R = dx4Var;
        this.B = i;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i;
        int i2;
        yx0 yx0Var;
        yx0 yx0Var2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        a47 a47Var;
        int i5 = this.A;
        int i6 = 0;
        jg7 jg7Var = jg7.a;
        int i7 = this.B;
        Object obj2 = this.R;
        Object obj3 = this.L;
        switch (i5) {
            case 0:
                nj5 nj5Var = (nj5) obj3;
                on2 on2Var = (on2) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i8 = EmulatorActivity.Z1;
                int i9 = nj5Var.m;
                if (booleanValue) {
                    i = i9 | i7;
                } else {
                    i = (~i7) & i9;
                }
                nj5Var.m = i;
                on2Var.c();
                return jg7Var;
            case 1:
                rj5 rj5Var = (rj5) obj3;
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj2;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                int i10 = EmulatorActivity.Z1;
                int i11 = rj5Var.a;
                if (booleanValue2) {
                    i2 = i11 | i7;
                } else {
                    i2 = (~i7) & i11;
                }
                rj5Var.a = i2;
                if (emulatorActivity.Y()) {
                    RendererDebugBridge.INSTANCE.setRenderer3DDebugControls(rj5Var.a);
                    emulatorActivity.a0();
                }
                return jg7Var;
            case 2:
                cf5 cf5Var = (cf5) obj3;
                y94 y94Var = (y94) obj2;
                yx0 yx0Var3 = (yx0) obj;
                if (cf5Var.e == i7 && nb3.k(y94Var, cf5Var.f) && (yx0Var3 instanceof ey0)) {
                    long[] jArr = y94Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j = jArr[i12];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = 8;
                                int i14 = 8 - ((~(i12 - length)) >>> 31);
                                int i15 = i6;
                                while (i15 < i14) {
                                    if ((255 & j) < 128) {
                                        int i16 = (i12 << 3) + i15;
                                        Object obj4 = y94Var.b[i16];
                                        if (y94Var.c[i16] != i7) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            i3 = i13;
                                            ey0 ey0Var = (ey0) yx0Var3;
                                            yx0Var2 = yx0Var3;
                                            ja4 ja4Var = ey0Var.Z;
                                            mp2.U(ja4Var, obj4, cf5Var);
                                            z2 = z;
                                            if (obj4 instanceof ii1) {
                                                ii1 ii1Var = (ii1) obj4;
                                                if (!ja4Var.c(ii1Var)) {
                                                    mp2.W(ey0Var.f0, ii1Var);
                                                }
                                                ja4 ja4Var2 = cf5Var.g;
                                                if (ja4Var2 != null) {
                                                    ja4Var2.k(obj4);
                                                }
                                            }
                                        } else {
                                            yx0Var2 = yx0Var3;
                                            z2 = z;
                                            i3 = i13;
                                        }
                                        if (z2) {
                                            y94Var.f(i16);
                                        }
                                    } else {
                                        yx0Var2 = yx0Var3;
                                        i3 = i13;
                                    }
                                    j >>= i3;
                                    i15++;
                                    i13 = i3;
                                    yx0Var3 = yx0Var2;
                                }
                                yx0Var = yx0Var3;
                                if (i14 != i13) {
                                }
                            } else {
                                yx0Var = yx0Var3;
                            }
                            if (i12 != length) {
                                i12++;
                                yx0Var3 = yx0Var;
                                i6 = 0;
                            }
                        }
                    }
                }
                return jg7Var;
            case 3:
                n76 n76Var = (n76) obj3;
                dx4 dx4Var = (dx4) obj2;
                cx4 cx4Var = (cx4) obj;
                int h = n76Var.k0.a.h();
                if (h < 0) {
                    h = 0;
                }
                if (h <= i7) {
                    i7 = h;
                }
                int i17 = -i7;
                boolean z3 = n76Var.l0;
                if (z3) {
                    i4 = 0;
                } else {
                    i4 = i17;
                }
                if (!z3) {
                    i17 = 0;
                }
                cx4Var.A = true;
                cx4.m(cx4Var, dx4Var, i4, i17);
                cx4Var.A = false;
                return jg7Var;
            default:
                jm7 jm7Var = (jm7) obj3;
                dx4 dx4Var2 = (dx4) obj2;
                cx4 cx4Var2 = (cx4) obj;
                int i18 = jm7Var.b;
                i27 i27Var = jm7Var.a;
                p97 p97Var = jm7Var.c;
                b47 b47Var = (b47) jm7Var.d.c();
                if (b47Var != null) {
                    a47Var = b47Var.a;
                } else {
                    a47Var = null;
                }
                i27Var.a(lo4.Vertical, xk2.f(cx4Var2, i18, p97Var, a47Var, false, dx4Var2.A), i7, dx4Var2.B);
                cx4.l(cx4Var2, dx4Var2, 0, Math.round(-i27Var.a.h()));
                return jg7Var;
        }
    }

    public /* synthetic */ zu1(Object obj, int i, int i2, Object obj2) {
        this.A = i2;
        this.L = obj;
        this.B = i;
        this.R = obj2;
    }
}

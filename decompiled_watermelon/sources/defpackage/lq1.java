package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lq1 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ lq1(k87 k87Var, yn4 yn4Var, int i) {
        this.A = 4;
        this.L = k87Var;
        this.R = yn4Var;
        this.B = i;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i;
        int i2;
        cv0 cv0Var;
        cv0 cv0Var2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        lr6 lr6Var;
        int i5 = this.A;
        int i6 = 0;
        o27 o27Var = o27.a;
        int i7 = this.B;
        Object obj2 = this.R;
        Object obj3 = this.L;
        switch (i5) {
            case 0:
                v95 v95Var = (v95) obj3;
                ki2 ki2Var = (ki2) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i8 = EmulatorActivity.P1;
                int i9 = v95Var.m;
                if (booleanValue) {
                    i = i9 | i7;
                } else {
                    i = (~i7) & i9;
                }
                v95Var.m = i;
                ki2Var.c();
                return o27Var;
            case 1:
                z95 z95Var = (z95) obj3;
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj2;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                int i10 = EmulatorActivity.P1;
                int i11 = z95Var.a;
                if (booleanValue2) {
                    i2 = i11 | i7;
                } else {
                    i2 = (~i7) & i11;
                }
                z95Var.a = i2;
                if (emulatorActivity.W()) {
                    RendererDebugBridge.INSTANCE.setRenderer3DDebugControls(z95Var.a);
                    emulatorActivity.Y();
                }
                return o27Var;
            case 2:
                m55 m55Var = (m55) obj3;
                s14 s14Var = (s14) obj2;
                cv0 cv0Var3 = (cv0) obj;
                if (m55Var.e == i7 && b53.x(s14Var, m55Var.f) && (cv0Var3 instanceof iv0)) {
                    long[] jArr = s14Var.a;
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
                                        Object obj4 = s14Var.b[i16];
                                        if (s14Var.c[i16] != i7) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            i3 = i13;
                                            iv0 iv0Var = (iv0) cv0Var3;
                                            cv0Var2 = cv0Var3;
                                            d24 d24Var = iv0Var.Z;
                                            oo2.Q(d24Var, obj4, m55Var);
                                            z2 = z;
                                            if (obj4 instanceof ee1) {
                                                ee1 ee1Var = (ee1) obj4;
                                                if (!d24Var.c(ee1Var)) {
                                                    oo2.R(iv0Var.e0, ee1Var);
                                                }
                                                d24 d24Var2 = m55Var.g;
                                                if (d24Var2 != null) {
                                                    d24Var2.k(obj4);
                                                }
                                            }
                                        } else {
                                            cv0Var2 = cv0Var3;
                                            z2 = z;
                                            i3 = i13;
                                        }
                                        if (z2) {
                                            s14Var.f(i16);
                                        }
                                    } else {
                                        cv0Var2 = cv0Var3;
                                        i3 = i13;
                                    }
                                    j >>= i3;
                                    i15++;
                                    i13 = i3;
                                    cv0Var3 = cv0Var2;
                                }
                                cv0Var = cv0Var3;
                                if (i14 != i13) {
                                }
                            } else {
                                cv0Var = cv0Var3;
                            }
                            if (i12 != length) {
                                i12++;
                                cv0Var3 = cv0Var;
                                i6 = 0;
                            }
                        }
                    }
                }
                return o27Var;
            case 3:
                bw5 bw5Var = (bw5) obj3;
                yn4 yn4Var = (yn4) obj2;
                xn4 xn4Var = (xn4) obj;
                int h = bw5Var.j0.a.h();
                if (h < 0) {
                    h = 0;
                }
                if (h <= i7) {
                    i7 = h;
                }
                int i17 = -i7;
                boolean z3 = bw5Var.k0;
                if (z3) {
                    i4 = 0;
                } else {
                    i4 = i17;
                }
                if (!z3) {
                    i17 = 0;
                }
                xn4Var.A = true;
                xn4.n(xn4Var, yn4Var, i4, i17);
                xn4Var.A = false;
                return o27Var;
            default:
                k87 k87Var = (k87) obj3;
                yn4 yn4Var2 = (yn4) obj2;
                xn4 xn4Var2 = (xn4) obj;
                int i18 = k87Var.b;
                up6 up6Var = k87Var.a;
                uw6 uw6Var = k87Var.c;
                mr6 mr6Var = (mr6) k87Var.d.c();
                if (mr6Var != null) {
                    lr6Var = mr6Var.a;
                } else {
                    lr6Var = null;
                }
                up6Var.a(jf4.Vertical, nl2.o(xn4Var2, i18, uw6Var, lr6Var, false, yn4Var2.A), i7, yn4Var2.B);
                xn4.m(xn4Var2, yn4Var2, 0, Math.round(-up6Var.a.h()));
                return o27Var;
        }
    }

    public /* synthetic */ lq1(int i, int i2, Object obj, Object obj2) {
        this.A = i2;
        this.L = obj;
        this.B = i;
        this.R = obj2;
    }
}

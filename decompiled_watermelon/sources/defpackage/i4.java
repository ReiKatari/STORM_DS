package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import me.magnum.melonds.ui.inputsetup.b;
import me.magnum.melonds.ui.layouts.LayoutListActivity;
import me.magnum.melonds.ui.layouts.LayoutSelectorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i4 extends lj2 implements ki2 {
    public final /* synthetic */ int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.c0 = i4;
    }

    @Override // defpackage.ki2
    public final Object c() {
        ContentCaptureSession c;
        zc0 zc0Var;
        boolean Y0;
        int i = this.c0;
        o27 o27Var = o27.a;
        Object obj = this.B;
        switch (i) {
            case 0:
                ct1 ct1Var = (ct1) obj;
                ee6 ee6Var = ct1Var.d;
                ee6Var.getClass();
                ee6Var.l(null, lp5.a);
                ct1Var.m();
                return o27Var;
            case 1:
                View view = (View) obj;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    o2.j(view);
                }
                if (i2 < 29 || (c = fp.c(view)) == null) {
                    return null;
                }
                return new q03(27, c, view, false);
            case 2:
                w61 w61Var = (w61) obj;
                ee6 ee6Var2 = w61Var.e;
                ee6Var2.getClass();
                ee6Var2.l(null, p61.a);
                w61Var.f();
                return o27Var;
            case 3:
                return ((ao6) obj).B0();
            case 4:
                gc2 gc2Var = (gc2) obj;
                e24 e24Var = gc2Var.c;
                e24 e24Var2 = gc2Var.d;
                nc2 nc2Var = gc2Var.a;
                ed2 f = nc2Var.f();
                if (f == null) {
                    Object[] objArr = e24Var2.b;
                    long[] jArr = e24Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        ((ac2) objArr[(i3 << 3) + i5]).e0(bd2.Inactive);
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                }
                            }
                            if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                } else if (f.i0) {
                    if (e24Var.c(f)) {
                        f.X0();
                    }
                    bd2 W0 = f.W0();
                    if (!f.A.i0) {
                        mz2.c("visitAncestors called on an unattached node");
                    }
                    yy3 yy3Var = f.A;
                    vf3 P = l.P(f);
                    int i6 = 0;
                    while (P != null) {
                        if ((((yy3) P.A0.g).R & 5120) != 0) {
                            while (yy3Var != null) {
                                int i7 = yy3Var.L;
                                if ((i7 & 5120) != 0) {
                                    if ((i7 & 1024) != 0) {
                                        i6++;
                                    }
                                    if ((yy3Var instanceof ac2) && e24Var2.c(yy3Var)) {
                                        if (i6 <= 1) {
                                            ((ac2) yy3Var).e0(W0);
                                        } else {
                                            ((ac2) yy3Var).e0(bd2.ActiveParent);
                                        }
                                        e24Var2.l(yy3Var);
                                    }
                                }
                                yy3Var = yy3Var.X;
                            }
                        }
                        P = P.u();
                        if (P != null && (zc0Var = P.A0) != null) {
                            yy3Var = (lm6) zc0Var.f;
                        } else {
                            yy3Var = null;
                        }
                    }
                    Object[] objArr2 = e24Var2.b;
                    long[] jArr2 = e24Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j2 = jArr2[i8];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((j2 & 255) < 128) {
                                        ((ac2) objArr2[(i8 << 3) + i10]).e0(bd2.Inactive);
                                    }
                                    j2 >>= 8;
                                }
                                if (i9 != 8) {
                                }
                            }
                            if (i8 != length2) {
                                i8++;
                            }
                        }
                    }
                }
                if (nc2Var.f() == null || nc2Var.c.W0() == bd2.Inactive) {
                    nc2Var.c();
                }
                e24Var.b();
                e24Var2.b();
                gc2Var.e = false;
                return o27Var;
            case 5:
                Y0 = ((kd2) obj).q0.Y0(7);
                return Boolean.valueOf(Y0);
            case ig7.b /* 6 */:
                b bVar = (b) obj;
                bVar.i.k(null);
                bVar.k.k(null);
                return o27Var;
            case 7:
                ((LayoutListActivity) obj).finish();
                return o27Var;
            case 8:
                ((LayoutSelectorActivity) obj).finish();
                return o27Var;
            case 9:
                sq5 sq5Var = (sq5) obj;
                g11 g11Var = sq5Var.a;
                if (g11Var != null) {
                    iq2.f(g11Var, null);
                    sq5Var.g();
                    wd1 wd1Var = sq5Var.e;
                    if (wd1Var != null) {
                        ((tw0) wd1Var.g).close();
                        vi6 vi6Var = (vi6) wd1Var.h;
                        if (vi6Var != null) {
                            vi6Var.close();
                        }
                        return o27Var;
                    }
                    b53.g0("connectionManager");
                    throw null;
                }
                b53.g0("coroutineScope");
                throw null;
            default:
                ((uq6) obj).a();
                return o27Var;
        }
    }
}

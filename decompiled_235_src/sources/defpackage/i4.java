package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import me.magnum.melonds.ui.inputsetup.b;
import me.magnum.melonds.ui.layouts.LayoutListActivity;
import me.magnum.melonds.ui.layouts.LayoutSelectorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i4 extends po2 implements on2 {
    public final /* synthetic */ int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.d0 = i4;
    }

    @Override // defpackage.on2
    public final Object c() {
        ContentCaptureSession c;
        if0 if0Var;
        boolean Y0;
        int i = this.d0;
        jg7 jg7Var = jg7.a;
        Object obj = this.B;
        switch (i) {
            case 0:
                nx1 nx1Var = (nx1) obj;
                tp6 tp6Var = nx1Var.d;
                tp6Var.getClass();
                tp6Var.m(null, f06.a);
                nx1Var.m();
                return jg7Var;
            case 1:
                View view = (View) obj;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    q2.j(view);
                }
                if (i2 < 29 || (c = rp.c(view)) == null) {
                    return null;
                }
                return new u63(27, c, view, false);
            case 2:
                la1 la1Var = (la1) obj;
                tp6 tp6Var2 = la1Var.g;
                tp6Var2.getClass();
                tp6Var2.m(null, da1.a);
                la1Var.f();
                return jg7Var;
            case 3:
                return ((m07) obj).R();
            case 4:
                xg2 xg2Var = (xg2) obj;
                ka4 ka4Var = xg2Var.c;
                ka4 ka4Var2 = xg2Var.d;
                eh2 eh2Var = xg2Var.a;
                vh2 f = eh2Var.f();
                if (f == null) {
                    Object[] objArr = ka4Var2.b;
                    long[] jArr = ka4Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        ((rg2) objArr[(i3 << 3) + i5]).D(sh2.Inactive);
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
                } else if (f.j0) {
                    if (ka4Var.c(f)) {
                        f.X0();
                    }
                    sh2 W0 = f.W0();
                    if (!f.A.j0) {
                        p53.c("visitAncestors called on an unattached node");
                    }
                    z64 z64Var = f.A;
                    sm3 f0 = nc1.f0(f);
                    int i6 = 0;
                    while (f0 != null) {
                        if ((((z64) f0.B0.g).R & 5120) != 0) {
                            while (z64Var != null) {
                                int i7 = z64Var.L;
                                if ((i7 & 5120) != 0) {
                                    if ((i7 & 1024) != 0) {
                                        i6++;
                                    }
                                    if ((z64Var instanceof rg2) && ka4Var2.c(z64Var)) {
                                        if (i6 <= 1) {
                                            ((rg2) z64Var).D(W0);
                                        } else {
                                            ((rg2) z64Var).D(sh2.ActiveParent);
                                        }
                                        ka4Var2.l(z64Var);
                                    }
                                }
                                z64Var = z64Var.X;
                            }
                        }
                        f0 = f0.v();
                        if (f0 != null && (if0Var = f0.B0) != null) {
                            z64Var = (vy6) if0Var.f;
                        } else {
                            z64Var = null;
                        }
                    }
                    Object[] objArr2 = ka4Var2.b;
                    long[] jArr2 = ka4Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j2 = jArr2[i8];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((j2 & 255) < 128) {
                                        ((rg2) objArr2[(i8 << 3) + i10]).D(sh2.Inactive);
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
                if (eh2Var.f() == null || eh2Var.c.W0() == sh2.Inactive) {
                    eh2Var.c();
                }
                ka4Var.b();
                ka4Var2.b();
                xg2Var.e = false;
                return jg7Var;
            case 5:
                Y0 = ((di2) obj).r0.Y0(7);
                return Boolean.valueOf(Y0);
            case 6:
                b bVar = (b) obj;
                bVar.i.l(null);
                bVar.k.l(null);
                return jg7Var;
            case 7:
                ((LayoutListActivity) obj).finish();
                return jg7Var;
            case 8:
                ((LayoutSelectorActivity) obj).finish();
                return jg7Var;
            case 9:
                m16 m16Var = (m16) obj;
                o41 o41Var = m16Var.a;
                if (o41Var != null) {
                    g04.x(o41Var, null);
                    m16Var.g();
                    ai1 ai1Var = m16Var.e;
                    if (ai1Var != null) {
                        ((qz0) ai1Var.g).close();
                        pu6 pu6Var = (pu6) ai1Var.h;
                        if (pu6Var != null) {
                            pu6Var.close();
                        }
                        return jg7Var;
                    }
                    nb3.a0("connectionManager");
                    throw null;
                }
                nb3.a0("coroutineScope");
                throw null;
            default:
                ((j37) obj).a();
                return jg7Var;
        }
    }
}

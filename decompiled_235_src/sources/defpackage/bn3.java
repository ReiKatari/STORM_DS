package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bn3  reason: default package */
/* loaded from: classes.dex */
public final class bn3 implements f34 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f34 b;
    public final /* synthetic */ gn3 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ f34 e;

    public /* synthetic */ bn3(f34 f34Var, gn3 gn3Var, int i, f34 f34Var2, int i2) {
        this.a = i2;
        this.c = gn3Var;
        this.d = i;
        this.e = f34Var2;
        this.b = f34Var;
    }

    @Override // defpackage.f34
    public final void a() {
        int i = this.a;
        f34 f34Var = this.e;
        int i2 = this.d;
        gn3 gn3Var = this.c;
        switch (i) {
            case 0:
                gn3Var.X = i2;
                f34Var.a();
                ua4 ua4Var = gn3Var.i0;
                ja4 ja4Var = gn3Var.h0;
                long[] jArr = ja4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = ja4Var.b[i6];
                                    nt6 nt6Var = (nt6) ja4Var.c[i6];
                                    int i7 = ua4Var.i(obj);
                                    if (i7 < 0 || i7 >= gn3Var.X) {
                                        if (i7 >= 0) {
                                            Object[] objArr = ua4Var.A;
                                            Object obj2 = objArr[i7];
                                            objArr[i7] = mt6.b;
                                        }
                                        if (gn3Var.f0.b(obj)) {
                                            nt6Var.dispose();
                                        }
                                        ja4Var.l(i6);
                                    }
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
                gn3Var.g(gn3Var.R);
                return;
            default:
                gn3Var.R = i2;
                f34Var.a();
                if (gn3Var.A.e0 == null) {
                    gn3Var.g(gn3Var.R);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.f34
    public final Map b() {
        switch (this.a) {
            case 0:
                return this.b.b();
            default:
                return this.b.b();
        }
    }

    @Override // defpackage.f34
    public final qn2 c() {
        switch (this.a) {
            case 0:
                return this.b.c();
            default:
                return this.b.c();
        }
    }

    @Override // defpackage.f34
    public final int getHeight() {
        switch (this.a) {
            case 0:
                return this.b.getHeight();
            default:
                return this.b.getHeight();
        }
    }

    @Override // defpackage.f34
    public final int getWidth() {
        switch (this.a) {
            case 0:
                return this.b.getWidth();
            default:
                return this.b.getWidth();
        }
    }
}

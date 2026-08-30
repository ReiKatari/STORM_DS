package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eg3  reason: default package */
/* loaded from: classes.dex */
public final class eg3 implements uv3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uv3 b;
    public final /* synthetic */ jg3 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ uv3 e;

    public /* synthetic */ eg3(uv3 uv3Var, jg3 jg3Var, int i, uv3 uv3Var2, int i2) {
        this.a = i2;
        this.c = jg3Var;
        this.d = i;
        this.e = uv3Var2;
        this.b = uv3Var;
    }

    @Override // defpackage.uv3
    public final int a() {
        switch (this.a) {
            case 0:
                return this.b.a();
            default:
                return this.b.a();
        }
    }

    @Override // defpackage.uv3
    public final void b() {
        int i = this.a;
        uv3 uv3Var = this.e;
        int i2 = this.d;
        jg3 jg3Var = this.c;
        switch (i) {
            case 0:
                jg3Var.X = i2;
                uv3Var.b();
                o24 o24Var = jg3Var.h0;
                d24 d24Var = jg3Var.g0;
                long[] jArr = d24Var.a;
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
                                    Object obj = d24Var.b[i6];
                                    wh6 wh6Var = (wh6) d24Var.c[i6];
                                    int j2 = o24Var.j(obj);
                                    if (j2 < 0 || j2 >= jg3Var.X) {
                                        if (j2 >= 0) {
                                            Object[] objArr = o24Var.A;
                                            Object obj2 = objArr[j2];
                                            objArr[j2] = vh6.b;
                                        }
                                        if (jg3Var.e0.b(obj)) {
                                            wh6Var.dispose();
                                        }
                                        d24Var.l(i6);
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
                jg3Var.g(jg3Var.R);
                return;
            default:
                jg3Var.R = i2;
                uv3Var.b();
                if (jg3Var.A.d0 == null) {
                    jg3Var.g(jg3Var.R);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.uv3
    public final int c() {
        switch (this.a) {
            case 0:
                return this.b.c();
            default:
                return this.b.c();
        }
    }

    @Override // defpackage.uv3
    public final mi2 d() {
        switch (this.a) {
            case 0:
                return this.b.d();
            default:
                return this.b.d();
        }
    }

    @Override // defpackage.uv3
    public final Map e() {
        switch (this.a) {
            case 0:
                return this.b.e();
            default:
                return this.b.e();
        }
    }
}

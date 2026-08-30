package defpackage;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l80  reason: default package */
/* loaded from: classes.dex */
public final class l80 {
    public final gh3 a;
    public final gh3 b;
    public final long c;
    public final long d;
    public final boolean e;
    public final xq2 f;

    public l80(s45 s45Var) {
        wk3 wk3Var = wk3.NONE;
        this.a = yf2.H(wk3Var, new ki2(this) { // from class: k80
            public final /* synthetic */ l80 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                l80 l80Var = this.B;
                switch (i) {
                    case 0:
                        e80 e80Var = e80.n;
                        return w81.C(l80Var.f);
                    default:
                        String b = l80Var.f.b("Content-Type");
                        if (b == null) {
                            return null;
                        }
                        h85 h85Var = cw3.d;
                        try {
                            return hi2.n(b);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.b = yf2.H(wk3Var, new ki2(this) { // from class: k80
            public final /* synthetic */ l80 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                l80 l80Var = this.B;
                switch (i) {
                    case 0:
                        e80 e80Var = e80.n;
                        return w81.C(l80Var.f);
                    default:
                        String b = l80Var.f.b("Content-Type");
                        if (b == null) {
                            return null;
                        }
                        h85 h85Var = cw3.d;
                        try {
                            return hi2.n(b);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.c = Long.parseLong(s45Var.O(Long.MAX_VALUE));
        this.d = Long.parseLong(s45Var.O(Long.MAX_VALUE));
        this.e = Integer.parseInt(s45Var.O(Long.MAX_VALUE)) > 0;
        int parseInt = Integer.parseInt(s45Var.O(Long.MAX_VALUE));
        vq2 vq2Var = new vq2(0, (byte) 0);
        for (int i = 0; i < parseInt; i++) {
            String O = s45Var.O(Long.MAX_VALUE);
            Bitmap.Config[] configArr = k.a;
            int y0 = zg6.y0(':', 0, 6, O);
            if (y0 != -1) {
                vq2Var.e(zg6.Z0(O.substring(0, y0)).toString(), O.substring(y0 + 1));
            } else {
                i.g("Unexpected header: ".concat(O));
                throw null;
            }
        }
        this.f = vq2Var.f();
    }

    public final void a(r45 r45Var) {
        long j;
        r45Var.d0(this.c);
        r45Var.writeByte(10);
        r45Var.d0(this.d);
        r45Var.writeByte(10);
        if (this.e) {
            j = 1;
        } else {
            j = 0;
        }
        r45Var.d0(j);
        r45Var.writeByte(10);
        xq2 xq2Var = this.f;
        r45Var.d0(xq2Var.size());
        r45Var.writeByte(10);
        int size = xq2Var.size();
        for (int i = 0; i < size; i++) {
            r45Var.c0(xq2Var.c(i));
            r45Var.c0(": ");
            r45Var.c0(xq2Var.i(i));
            r45Var.writeByte(10);
        }
    }

    public l80(ec5 ec5Var) {
        wk3 wk3Var = wk3.NONE;
        this.a = yf2.H(wk3Var, new ki2(this) { // from class: k80
            public final /* synthetic */ l80 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                l80 l80Var = this.B;
                switch (i) {
                    case 0:
                        e80 e80Var = e80.n;
                        return w81.C(l80Var.f);
                    default:
                        String b = l80Var.f.b("Content-Type");
                        if (b == null) {
                            return null;
                        }
                        h85 h85Var = cw3.d;
                        try {
                            return hi2.n(b);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.b = yf2.H(wk3Var, new ki2(this) { // from class: k80
            public final /* synthetic */ l80 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                l80 l80Var = this.B;
                switch (i) {
                    case 0:
                        e80 e80Var = e80.n;
                        return w81.C(l80Var.f);
                    default:
                        String b = l80Var.f.b("Content-Type");
                        if (b == null) {
                            return null;
                        }
                        h85 h85Var = cw3.d;
                        try {
                            return hi2.n(b);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.c = ec5Var.g0;
        this.d = ec5Var.h0;
        this.e = ec5Var.X != null;
        this.f = ec5Var.Y;
    }
}

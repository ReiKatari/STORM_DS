package defpackage;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ta0  reason: default package */
/* loaded from: classes.dex */
public final class ta0 {
    public final go3 a;
    public final go3 b;
    public final long c;
    public final long d;
    public final boolean e;
    public final yw2 f;

    public ta0(fe5 fe5Var) {
        xr3 xr3Var = xr3.NONE;
        this.a = kj2.M(xr3Var, new on2(this) { // from class: sa0
            public final /* synthetic */ ta0 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                ta0 ta0Var = this.B;
                switch (i) {
                    case 0:
                        ma0 ma0Var = ma0.n;
                        return u24.C(ta0Var.f);
                    default:
                        String a = ta0Var.f.a("Content-Type");
                        if (a == null) {
                            return null;
                        }
                        xh5 xh5Var = n34.d;
                        try {
                            return xk2.k(a);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.b = kj2.M(xr3Var, new on2(this) { // from class: sa0
            public final /* synthetic */ ta0 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                ta0 ta0Var = this.B;
                switch (i) {
                    case 0:
                        ma0 ma0Var = ma0.n;
                        return u24.C(ta0Var.f);
                    default:
                        String a = ta0Var.f.a("Content-Type");
                        if (a == null) {
                            return null;
                        }
                        xh5 xh5Var = n34.d;
                        try {
                            return xk2.k(a);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.c = Long.parseLong(fe5Var.y(Long.MAX_VALUE));
        this.d = Long.parseLong(fe5Var.y(Long.MAX_VALUE));
        this.e = Integer.parseInt(fe5Var.y(Long.MAX_VALUE)) > 0;
        int parseInt = Integer.parseInt(fe5Var.y(Long.MAX_VALUE));
        ww2 ww2Var = new ww2(0, (byte) 0);
        for (int i = 0; i < parseInt; i++) {
            String y = fe5Var.y(Long.MAX_VALUE);
            Bitmap.Config[] configArr = k.a;
            int s0 = qs6.s0(':', 0, 6, y);
            if (s0 != -1) {
                ww2Var.e(qs6.T0(y.substring(0, s0)).toString(), y.substring(s0 + 1));
            } else {
                i.f("Unexpected header: ".concat(y));
                throw null;
            }
        }
        this.f = ww2Var.f();
    }

    public final void a(ee5 ee5Var) {
        long j;
        ee5Var.h0(this.c);
        ee5Var.writeByte(10);
        ee5Var.h0(this.d);
        ee5Var.writeByte(10);
        if (this.e) {
            j = 1;
        } else {
            j = 0;
        }
        ee5Var.h0(j);
        ee5Var.writeByte(10);
        yw2 yw2Var = this.f;
        ee5Var.h0(yw2Var.size());
        ee5Var.writeByte(10);
        int size = yw2Var.size();
        for (int i = 0; i < size; i++) {
            ee5Var.H(yw2Var.b(i));
            ee5Var.H(": ");
            ee5Var.H(yw2Var.d(i));
            ee5Var.writeByte(10);
        }
    }

    public ta0(wl5 wl5Var) {
        xr3 xr3Var = xr3.NONE;
        this.a = kj2.M(xr3Var, new on2(this) { // from class: sa0
            public final /* synthetic */ ta0 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                ta0 ta0Var = this.B;
                switch (i) {
                    case 0:
                        ma0 ma0Var = ma0.n;
                        return u24.C(ta0Var.f);
                    default:
                        String a = ta0Var.f.a("Content-Type");
                        if (a == null) {
                            return null;
                        }
                        xh5 xh5Var = n34.d;
                        try {
                            return xk2.k(a);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.b = kj2.M(xr3Var, new on2(this) { // from class: sa0
            public final /* synthetic */ ta0 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                ta0 ta0Var = this.B;
                switch (i) {
                    case 0:
                        ma0 ma0Var = ma0.n;
                        return u24.C(ta0Var.f);
                    default:
                        String a = ta0Var.f.a("Content-Type");
                        if (a == null) {
                            return null;
                        }
                        xh5 xh5Var = n34.d;
                        try {
                            return xk2.k(a);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.c = wl5Var.h0;
        this.d = wl5Var.i0;
        this.e = wl5Var.X != null;
        this.f = wl5Var.Y;
    }
}

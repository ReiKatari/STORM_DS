package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qt2  reason: default package */
/* loaded from: classes.dex */
public final class qt2 implements e22 {
    public static final List g = ik7.j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = ik7.j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final x45 a;
    public final fi3 b;
    public final pt2 c;
    public volatile wt2 d;
    public final dw4 e;
    public volatile boolean f;

    public qt2(zb4 zb4Var, x45 x45Var, fi3 fi3Var, pt2 pt2Var) {
        zb4Var.getClass();
        pt2Var.getClass();
        this.a = x45Var;
        this.b = fi3Var;
        this.c = pt2Var;
        List list = zb4Var.s;
        dw4 dw4Var = dw4.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(dw4Var) ? dw4Var : dw4.HTTP_2;
    }

    @Override // defpackage.e22
    public final sb6 a(ec5 ec5Var) {
        wt2 wt2Var = this.d;
        wt2Var.getClass();
        return wt2Var.c0;
    }

    @Override // defpackage.e22
    public final void b() {
        wt2 wt2Var = this.d;
        wt2Var.getClass();
        wt2Var.d0.close();
    }

    @Override // defpackage.e22
    public final boolean c() {
        boolean z;
        wt2 wt2Var = this.d;
        if (wt2Var != null) {
            synchronized (wt2Var) {
                ut2 ut2Var = wt2Var.c0;
                if (ut2Var.B) {
                    if (ut2Var.R.C()) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.e22
    public final void cancel() {
        this.f = true;
        wt2 wt2Var = this.d;
        if (wt2Var != null) {
            wt2Var.e(l12.CANCEL);
        }
    }

    @Override // defpackage.e22
    public final void d() {
        this.c.flush();
    }

    @Override // defpackage.e22
    public final cb6 e() {
        wt2 wt2Var = this.d;
        wt2Var.getClass();
        return wt2Var;
    }

    @Override // defpackage.e22
    public final d22 f() {
        return this.a;
    }

    @Override // defpackage.e22
    public final long g(ec5 ec5Var) {
        if (!yt2.a(ec5Var)) {
            return 0L;
        }
        return ik7.d(ec5Var);
    }

    @Override // defpackage.e22
    public final void h(ka kaVar) {
        boolean z;
        int i;
        wt2 wt2Var;
        kaVar.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = false;
        if (((ua5) kaVar.X) != null) {
            z = true;
        } else {
            z = false;
        }
        xq2 xq2Var = (xq2) kaVar.R;
        ArrayList arrayList = new ArrayList(xq2Var.size() + 4);
        arrayList.add(new tq2(tq2.f, (String) kaVar.L));
        w70 w70Var = tq2.g;
        hu2 hu2Var = (hu2) kaVar.B;
        hu2Var.getClass();
        String b = hu2Var.b();
        String d = hu2Var.d();
        if (d != null) {
            b = b + '?' + d;
        }
        arrayList.add(new tq2(w70Var, b));
        String b2 = xq2Var.b("Host");
        if (b2 != null) {
            arrayList.add(new tq2(tq2.i, b2));
        }
        arrayList.add(new tq2(tq2.h, hu2Var.a));
        int size = xq2Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String c = xq2Var.c(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = c.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && xq2Var.i(i2).equals("trailers"))) {
                arrayList.add(new tq2(lowerCase, xq2Var.i(i2)));
            }
        }
        pt2 pt2Var = this.c;
        pt2Var.getClass();
        boolean z3 = !z;
        synchronized (pt2Var.r0) {
            synchronized (pt2Var) {
                if (pt2Var.X > 1073741823) {
                    pt2Var.w(l12.REFUSED_STREAM);
                }
                if (!pt2Var.Y) {
                    i = pt2Var.X;
                    pt2Var.X = i + 2;
                    wt2Var = new wt2(i, pt2Var, z3, false, null);
                    z2 = (!z || pt2Var.o0 >= pt2Var.p0 || wt2Var.R >= wt2Var.X) ? true : true;
                    if (wt2Var.h()) {
                        pt2Var.B.put(Integer.valueOf(i), wt2Var);
                    }
                } else {
                    throw new IOException();
                }
            }
            pt2Var.r0.x(z3, i, arrayList);
        }
        if (z2) {
            pt2Var.r0.flush();
        }
        this.d = wt2Var;
        boolean z4 = this.f;
        wt2 wt2Var2 = this.d;
        if (!z4) {
            wt2Var2.getClass();
            wt2Var2.e0.g(this.b.d);
            wt2 wt2Var3 = this.d;
            wt2Var3.getClass();
            wt2Var3.f0.g(this.b.e);
            return;
        }
        wt2Var2.getClass();
        wt2Var2.e(l12.CANCEL);
        f81.j("Canceled");
    }

    @Override // defpackage.e22
    public final g76 i(ka kaVar, long j) {
        kaVar.getClass();
        wt2 wt2Var = this.d;
        wt2Var.getClass();
        return wt2Var.d0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (r4 == false) goto L18;
     */
    @Override // defpackage.e22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cc5 j(boolean r11) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt2.j(boolean):cc5");
    }
}

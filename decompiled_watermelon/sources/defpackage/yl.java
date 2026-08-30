package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yl  reason: default package */
/* loaded from: classes.dex */
public final class yl extends TextPaint {
    public oi a;
    public qo6 b;
    public int c;
    public u26 d;
    public xq0 e;
    public b60 f;
    public ee1 g;
    public i76 h;
    public ik1 i;

    public final oi a() {
        oi oiVar = this.a;
        if (oiVar != null) {
            return oiVar;
        }
        oi oiVar2 = new oi(this);
        this.a = oiVar2;
        return oiVar2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().k(i);
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r1 == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final defpackage.b60 r4, final long r5, float r7) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Ld
            r3.g = r0
            r3.f = r0
            r3.h = r0
            r3.setShader(r0)
            return
        Ld:
            boolean r1 = r4 instanceof defpackage.mb6
            if (r1 == 0) goto L1d
            mb6 r4 = (defpackage.mb6) r4
            long r4 = r4.a
            long r4 = defpackage.mj2.L(r7, r4)
            r3.d(r4)
            return
        L1d:
            boolean r1 = r4 instanceof defpackage.l26
            if (r1 == 0) goto L6d
            b60 r1 = r3.f
            boolean r1 = defpackage.b53.x(r1, r4)
            if (r1 == 0) goto L37
            i76 r1 = r3.h
            if (r1 != 0) goto L2f
            r1 = 0
            goto L35
        L2f:
            long r1 = r1.a
            boolean r1 = defpackage.i76.b(r1, r5)
        L35:
            if (r1 != 0) goto L54
        L37:
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L54
            r3.f = r4
            i76 r1 = new i76
            r1.<init>(r5)
            r3.h = r1
            xl r1 = new xl
            r1.<init>()
            ee1 r4 = defpackage.me2.q(r1)
            r3.g = r4
        L54:
            oi r4 = r3.a()
            ee1 r5 = r3.g
            if (r5 == 0) goto L63
            java.lang.Object r5 = r5.getValue()
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            goto L64
        L63:
            r5 = r0
        L64:
            r4.p(r5)
            r3.e = r0
            defpackage.w81.D(r3, r7)
            return
        L6d:
            defpackage.i.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl.c(b60, long, float):void");
    }

    public final void d(long j) {
        boolean c;
        xq0 xq0Var = this.e;
        if (xq0Var == null) {
            c = false;
        } else {
            c = xq0.c(xq0Var.a, j);
        }
        if (!c && j != 16) {
            this.e = new xq0(j);
            setColor(mh7.h0(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        }
    }

    public final void e(ik1 ik1Var) {
        if (ik1Var != null && !b53.x(this.i, ik1Var)) {
            this.i = ik1Var;
            if (ik1Var.equals(r72.a)) {
                setStyle(Paint.Style.FILL);
            } else if (ik1Var instanceof hh6) {
                a().t(1);
                hh6 hh6Var = (hh6) ik1Var;
                a().s(hh6Var.a);
                oi a = a();
                ((Paint) a.L).setStrokeMiter(hh6Var.b);
                a().r(hh6Var.d);
                a().q(hh6Var.c);
                a().o(null);
            } else {
                i.c();
            }
        }
    }

    public final void f(u26 u26Var) {
        if (u26Var != null && !b53.x(this.d, u26Var)) {
            this.d = u26Var;
            if (u26Var.equals(u26.d)) {
                clearShadowLayer();
                return;
            }
            u26 u26Var2 = this.d;
            float f = u26Var2.c;
            if (f == RecyclerView.A1) {
                f = Float.MIN_VALUE;
            }
            setShadowLayer(f, Float.intBitsToFloat((int) (u26Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), mh7.h0(this.d.a));
        }
    }

    public final void g(qo6 qo6Var) {
        boolean z;
        if (qo6Var != null && !b53.x(this.b, qo6Var)) {
            this.b = qo6Var;
            int i = qo6Var.a;
            boolean z2 = false;
            if ((i | 1) == i) {
                z = true;
            } else {
                z = false;
            }
            setUnderlineText(z);
            int i2 = this.b.a;
            if ((i2 | 2) == i2) {
                z2 = true;
            }
            setStrikeThruText(z2);
        }
    }
}

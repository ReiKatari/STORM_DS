package t4;

import android.graphics.Paint;
import android.text.TextPaint;
import cd.h1;
import i3.m0;
import i3.o;
import i3.s;
import i3.z;
import n2.e0;
import w4.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends TextPaint {

    /* renamed from: a  reason: collision with root package name */
    public h1 f13118a;

    /* renamed from: b  reason: collision with root package name */
    public l f13119b;

    /* renamed from: c  reason: collision with root package name */
    public int f13120c;

    /* renamed from: d  reason: collision with root package name */
    public m0 f13121d;

    /* renamed from: e  reason: collision with root package name */
    public s f13122e;

    /* renamed from: f  reason: collision with root package name */
    public o f13123f;

    /* renamed from: g  reason: collision with root package name */
    public e0 f13124g;

    /* renamed from: h  reason: collision with root package name */
    public h3.e f13125h;

    /* renamed from: i  reason: collision with root package name */
    public k3.e f13126i;

    public final h1 a() {
        h1 h1Var = this.f13118a;
        if (h1Var != null) {
            return h1Var;
        }
        h1 h1Var2 = new h1(this);
        this.f13118a = h1Var2;
        return h1Var2;
    }

    public final void b(int i2) {
        if (i2 == this.f13120c) {
            return;
        }
        a().i(i2);
        this.f13120c = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (r1 == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final i3.o r6, final long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.f13124g = r0
            r5.f13123f = r0
            r5.f13125h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof i3.p0
            if (r1 == 0) goto L1d
            i3.p0 r6 = (i3.p0) r6
            long r6 = r6.f6676a
            long r6 = p7.t.z(r6, r9)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof i3.l0
            if (r1 == 0) goto L71
            i3.o r1 = r5.f13123f
            boolean r1 = nc.k.a(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            h3.e r1 = r5.f13125h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.f6064a
            boolean r1 = h3.e.b(r3, r7)
        L36:
            if (r1 != 0) goto L58
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L58
            r5.f13123f = r6
            h3.e r1 = new h3.e
            r1.<init>(r7)
            r5.f13125h = r1
            t4.d r1 = new t4.d
            r1.<init>()
            n2.e0 r6 = n2.s.q(r1)
            r5.f13124g = r6
        L58:
            cd.h1 r6 = r5.a()
            n2.e0 r7 = r5.f13124g
            if (r7 == 0) goto L67
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L68
        L67:
            r7 = r0
        L68:
            r6.m(r7)
            r5.f13122e = r0
            t4.j.c(r5, r9)
            return
        L71:
            m9.o.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.e.c(i3.o, long, float):void");
    }

    public final void d(long j2) {
        boolean c4;
        s sVar = this.f13122e;
        boolean z10 = false;
        if (sVar == null) {
            c4 = false;
        } else {
            c4 = s.c(sVar.f6689a, j2);
        }
        if (!c4) {
            if (j2 != 16) {
                z10 = true;
            }
            if (z10) {
                this.f13122e = new s(j2);
                setColor(z.y(j2));
                this.f13124g = null;
                this.f13123f = null;
                this.f13125h = null;
                setShader(null);
            }
        }
    }

    public final void e(k3.e eVar) {
        if (eVar != null && !nc.k.a(this.f13126i, eVar)) {
            this.f13126i = eVar;
            if (eVar.equals(k3.g.f7961a)) {
                setStyle(Paint.Style.FILL);
            } else if (eVar instanceof k3.h) {
                a().q(1);
                k3.h hVar = (k3.h) eVar;
                a().p(hVar.f7962a);
                h1 a10 = a();
                ((Paint) a10.B).setStrokeMiter(hVar.f7963b);
                a().o(hVar.f7965d);
                a().n(hVar.f7964c);
                ((Paint) a().B).setPathEffect(null);
            } else {
                m9.o.o();
            }
        }
    }

    public final void f(m0 m0Var) {
        if (m0Var != null && !nc.k.a(this.f13121d, m0Var)) {
            this.f13121d = m0Var;
            if (m0Var.equals(m0.f6659d)) {
                clearShadowLayer();
                return;
            }
            m0 m0Var2 = this.f13121d;
            float f8 = m0Var2.f6662c;
            if (f8 == 0.0f) {
                f8 = Float.MIN_VALUE;
            }
            setShadowLayer(f8, Float.intBitsToFloat((int) (m0Var2.f6661b >> 32)), Float.intBitsToFloat((int) (this.f13121d.f6661b & 4294967295L)), z.y(this.f13121d.f6660a));
        }
    }

    public final void g(l lVar) {
        boolean z10;
        if (lVar != null && !nc.k.a(this.f13119b, lVar)) {
            this.f13119b = lVar;
            int i2 = lVar.f14146a;
            boolean z11 = false;
            if ((i2 | 1) == i2) {
                z10 = true;
            } else {
                z10 = false;
            }
            setUnderlineText(z10);
            int i10 = this.f13119b.f14146a;
            if ((i10 | 2) == i10) {
                z11 = true;
            }
            setStrikeThruText(z11);
        }
    }
}

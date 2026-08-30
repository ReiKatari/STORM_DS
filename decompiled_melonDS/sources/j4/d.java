package j4;

import a1.x;
import a4.l;
import a4.n1;
import a4.o0;
import a4.r1;
import a4.s0;
import he.g;
import p7.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f7434a;

    /* renamed from: b  reason: collision with root package name */
    public final p1.c f7435b;

    /* renamed from: c  reason: collision with root package name */
    public final g f7436c;

    /* renamed from: d  reason: collision with root package name */
    public d f7437d;

    /* renamed from: e  reason: collision with root package name */
    public long f7438e;

    /* renamed from: f  reason: collision with root package name */
    public long f7439f;

    /* renamed from: g  reason: collision with root package name */
    public long f7440g = Long.MIN_VALUE;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e f7441h;

    public d(e eVar, int i2, p1.c cVar, g gVar) {
        this.f7441h = eVar;
        this.f7434a = i2;
        this.f7435b = cVar;
        this.f7436c = gVar;
    }

    public final void a(long j2, long j10, long j11, long j12, float[] fArr) {
        c cVar;
        c cVar2;
        long u4;
        long j13 = this.f7441h.f7447f;
        p1.c cVar3 = this.f7435b;
        r1 r5 = l.r(cVar3, 2);
        o0 t5 = l.t(cVar3);
        boolean I = t5.I();
        n1 n1Var = t5.A0;
        if (!I) {
            cVar2 = null;
        } else {
            if (n1Var.f266d != r5) {
                long floatToRawIntBits = Float.floatToRawIntBits((int) (j2 >> 32));
                long j14 = r5.L;
                r1 r1Var = n1Var.f266d;
                r1Var.getClass();
                cVar = new c(n.u(r1Var.F(r5, (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (floatToRawIntBits << 32), true)), (4294967295L & (((int) (u4 & 4294967295L)) + ((int) (j14 & 4294967295L)))) | ((((int) (u4 >> 32)) + ((int) (j14 >> 32))) << 32), j11, j12, j13, fArr, cVar3);
            } else {
                cVar = new c(j2, j10, j11, j12, j13, fArr, cVar3);
            }
            cVar2 = cVar;
        }
        if (cVar2 == null) {
            return;
        }
        this.f7436c.k(cVar2);
    }

    public final void b() {
        d dVar;
        e eVar = this.f7441h;
        x xVar = eVar.f7442a;
        int i2 = this.f7434a;
        d dVar2 = (d) xVar.g(i2);
        if (dVar2 != null) {
            if (dVar2.equals(this)) {
                d dVar3 = this.f7437d;
                this.f7437d = null;
                if (dVar3 != null) {
                    int d4 = xVar.d(i2);
                    Object[] objArr = xVar.f63c;
                    Object obj = objArr[d4];
                    xVar.f62b[d4] = i2;
                    objArr[d4] = dVar3;
                    return;
                }
                o0 t5 = l.t(this.f7435b.A);
                if (t5.f278b0) {
                    ((b4.x) s0.a(t5)).getRectManager().f7417a.m(t5.B, false);
                    return;
                }
                return;
            }
            int d10 = xVar.d(i2);
            Object[] objArr2 = xVar.f63c;
            Object obj2 = objArr2[d10];
            xVar.f62b[d10] = i2;
            objArr2[d10] = dVar2;
            while (true) {
                d dVar4 = dVar2.f7437d;
                if (dVar4 == null) {
                    break;
                } else if (dVar4 == this) {
                    dVar2.f7437d = this.f7437d;
                    this.f7437d = null;
                    return;
                } else {
                    dVar2 = dVar4;
                }
            }
        }
        d dVar5 = eVar.f7443b;
        if (dVar5 == this) {
            eVar.f7443b = dVar5.f7437d;
            this.f7437d = null;
            return;
        }
        if (dVar5 != null) {
            dVar = dVar5.f7437d;
        } else {
            dVar = null;
        }
        while (true) {
            d dVar6 = dVar5;
            dVar5 = dVar;
            if (dVar5 != null) {
                if (dVar5 == this) {
                    if (dVar6 != null) {
                        dVar6.f7437d = dVar5.f7437d;
                    }
                    this.f7437d = null;
                    return;
                }
                dVar = dVar5.f7437d;
            } else {
                return;
            }
        }
    }
}

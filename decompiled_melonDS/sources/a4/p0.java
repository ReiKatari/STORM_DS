package a4;

import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final y3.i1 f305a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f307c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f308d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f309e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f310f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f311g;

    /* renamed from: h  reason: collision with root package name */
    public b f312h;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f314j;

    /* renamed from: b  reason: collision with root package name */
    public boolean f306b = true;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f313i = new HashMap();

    public p0(b bVar, int i2) {
        this.f314j = i2;
        this.f305a = (y3.i1) bVar;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [nc.i, mc.p] */
    /* JADX WARN: Type inference failed for: r3v8, types: [a4.b, y3.i1] */
    public static final void a(p0 p0Var, y3.q qVar, int i2, r1 r1Var) {
        float intBitsToFloat;
        float f8;
        HashMap hashMap = p0Var.f313i;
        float f10 = i2;
        long floatToRawIntBits = Float.floatToRawIntBits(f10) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f10) & 4294967295L;
        while (true) {
            long j2 = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (p0Var.f314j) {
                    case 0:
                        b2 b2Var = r1Var.H0;
                        if (b2Var != null) {
                            b4.y1 y1Var = (b4.y1) b2Var;
                            float[] b10 = y1Var.b();
                            if (!y1Var.f2025m0) {
                                j2 = i3.e0.b(j2, b10);
                            }
                        }
                        j2 = p7.n.p(j2, r1Var.f327v0);
                        break;
                    default:
                        y0 V0 = r1Var.V0();
                        V0.getClass();
                        long j10 = V0.f372j0;
                        j2 = h3.b.e((Float.floatToRawIntBits((int) (j10 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j10 >> 32)) << 32), j2);
                        break;
                }
                r1Var = r1Var.f319m0;
                r1Var.getClass();
                if (r1Var.equals(p0Var.f305a.z())) {
                    if (qVar instanceof y3.q) {
                        intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                    }
                    int round = Math.round(intBitsToFloat);
                    if (hashMap.containsKey(qVar)) {
                        int intValue = ((Number) zb.v.D(qVar, hashMap)).intValue();
                        y3.q qVar2 = y3.c.f14665a;
                        round = ((Number) qVar.f14728a.j(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(qVar, Integer.valueOf(round));
                    return;
                }
            } while (!p0Var.b(r1Var).containsKey(qVar));
            long floatToRawIntBits3 = Float.floatToRawIntBits(p0Var.c(r1Var, qVar));
            floatToRawIntBits = Float.floatToRawIntBits(f8) << 32;
            floatToRawIntBits2 = floatToRawIntBits3 & 4294967295L;
        }
    }

    public final Map b(r1 r1Var) {
        switch (this.f314j) {
            case 0:
                return r1Var.F0().d();
            default:
                y0 V0 = r1Var.V0();
                V0.getClass();
                return V0.F0().d();
        }
    }

    public final int c(r1 r1Var, y3.q qVar) {
        switch (this.f314j) {
            case 0:
                return r1Var.i0(qVar);
            default:
                y0 V0 = r1Var.V0();
                V0.getClass();
                return V0.i0(qVar);
        }
    }

    public final boolean d() {
        if (!this.f307c && !this.f309e && !this.f310f && !this.f311g) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        h();
        if (this.f312h != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [a4.b, y3.i1] */
    public final void f() {
        this.f306b = true;
        ?? r02 = this.f305a;
        b K = r02.K();
        if (K == null) {
            return;
        }
        if (this.f307c) {
            K.f0();
        } else if (this.f309e || this.f308d) {
            K.requestLayout();
        }
        if (this.f310f) {
            r02.f0();
        }
        if (this.f311g) {
            r02.requestLayout();
        }
        K.d().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [a4.b, y3.i1] */
    public final void g() {
        HashMap hashMap = this.f313i;
        hashMap.clear();
        a aVar = new a(0, this);
        ?? r22 = this.f305a;
        r22.B(aVar);
        hashMap.putAll(b(r22.z()));
        this.f306b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r0 != false) goto L28;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [a4.b, y3.i1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r2 = this;
            boolean r0 = r2.d()
            y3.i1 r1 = r2.f305a
            if (r0 == 0) goto L9
            goto L51
        L9:
            a4.b r0 = r1.K()
            if (r0 != 0) goto L10
            goto L53
        L10:
            a4.p0 r0 = r0.d()
            a4.b r1 = r0.f312h
            if (r1 == 0) goto L23
            a4.p0 r0 = r1.d()
            boolean r0 = r0.d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            a4.b r0 = r2.f312h
            if (r0 == 0) goto L53
            a4.p0 r1 = r0.d()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            a4.b r1 = r0.K()
            if (r1 == 0) goto L41
            a4.p0 r1 = r1.d()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            a4.b r0 = r0.K()
            if (r0 == 0) goto L50
            a4.p0 r0 = r0.d()
            if (r0 == 0) goto L50
            a4.b r1 = r0.f312h
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f312h = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.p0.h():void");
    }
}

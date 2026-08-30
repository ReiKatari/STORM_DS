package o1;

import h1.n1;
import java.util.List;
import java.util.Map;
import y3.w0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements w0 {

    /* renamed from: a  reason: collision with root package name */
    public final p f10542a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10543b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10544c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10545d;

    /* renamed from: e  reason: collision with root package name */
    public final w0 f10546e;

    /* renamed from: f  reason: collision with root package name */
    public final float f10547f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10548g;

    /* renamed from: h  reason: collision with root package name */
    public final zc.u f10549h;

    /* renamed from: i  reason: collision with root package name */
    public final x4.c f10550i;

    /* renamed from: j  reason: collision with root package name */
    public final int f10551j;

    /* renamed from: k  reason: collision with root package name */
    public final mc.l f10552k;

    /* renamed from: l  reason: collision with root package name */
    public final mc.l f10553l;
    public final Object m;

    /* renamed from: n  reason: collision with root package name */
    public final int f10554n;

    /* renamed from: o  reason: collision with root package name */
    public final int f10555o;

    /* renamed from: p  reason: collision with root package name */
    public final int f10556p;

    /* renamed from: q  reason: collision with root package name */
    public final n1 f10557q;

    /* renamed from: r  reason: collision with root package name */
    public final int f10558r;

    /* renamed from: s  reason: collision with root package name */
    public final int f10559s;

    public n(p pVar, int i2, boolean z10, float f8, w0 w0Var, float f10, boolean z11, zc.u uVar, x4.c cVar, int i10, mc.l lVar, mc.l lVar2, List list, int i11, int i12, int i13, n1 n1Var, int i14, int i15) {
        this.f10542a = pVar;
        this.f10543b = i2;
        this.f10544c = z10;
        this.f10545d = f8;
        this.f10546e = w0Var;
        this.f10547f = f10;
        this.f10548g = z11;
        this.f10549h = uVar;
        this.f10550i = cVar;
        this.f10551j = i10;
        this.f10552k = lVar;
        this.f10553l = lVar2;
        this.m = list;
        this.f10554n = i11;
        this.f10555o = i12;
        this.f10556p = i13;
        this.f10557q = n1Var;
        this.f10558r = i14;
        this.f10559s = i15;
    }

    @Override // y3.w0
    public final int a() {
        return this.f10546e.a();
    }

    @Override // y3.w0
    public final void b() {
        this.f10546e.b();
    }

    @Override // y3.w0
    public final int c() {
        return this.f10546e.c();
    }

    @Override // y3.w0
    public final Map d() {
        return this.f10546e.d();
    }

    @Override // y3.w0
    public final mc.l e() {
        return this.f10546e.e();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public final n f(int i2, boolean z10) {
        p pVar;
        if (!this.f10548g) {
            ?? r22 = this.m;
            if (!r22.isEmpty() && (pVar = this.f10542a) != null) {
                int i10 = pVar.f10583g;
                int i11 = this.f10543b - i2;
                if (i11 >= 0 && i11 < i10) {
                    o oVar = (o) zb.l.R(r22);
                    o oVar2 = (o) zb.l.Z(r22);
                    if (!oVar.f10576r && !oVar2.f10576r) {
                        int i12 = this.f10555o;
                        int i13 = this.f10554n;
                        n1 n1Var = this.f10557q;
                        if (i2 < 0) {
                            if (Math.min((q8.r.J(oVar, n1Var) + oVar.f10571l) - i13, (q8.r.J(oVar2, n1Var) + oVar2.f10571l) - i12) <= (-i2)) {
                                return null;
                            }
                        } else if (Math.min(i13 - q8.r.J(oVar, n1Var), i12 - q8.r.J(oVar2, n1Var)) <= i2) {
                            return null;
                        }
                        int size = r22.size();
                        boolean z11 = false;
                        for (int i14 = 0; i14 < size; i14++) {
                            o oVar3 = (o) r22.get(i14);
                            oVar3.getClass();
                            if (!oVar3.f10576r) {
                                long j2 = oVar3.f10573o;
                                oVar3.f10573o = (((int) (j2 >> 32)) << 32) | ((((int) (j2 & 4294967295L)) + i2) & 4294967295L);
                                if (z10) {
                                    int size2 = oVar3.f10564e.size();
                                    for (int i15 = 0; i15 < size2; i15++) {
                                        oVar3.f10567h.a(i15, oVar3.f10561b);
                                    }
                                }
                            }
                        }
                        return new n(this.f10542a, i11, (this.f10544c || i2 > 0) ? true : true, i2, this.f10546e, this.f10547f, this.f10548g, this.f10549h, this.f10550i, this.f10551j, this.f10552k, this.f10553l, r22, this.f10554n, this.f10555o, this.f10556p, this.f10557q, this.f10558r, this.f10559s);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long g() {
        w0 w0Var = this.f10546e;
        return (w0Var.c() << 32) | (w0Var.a() & 4294967295L);
    }
}

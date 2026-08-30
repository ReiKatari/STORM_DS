package n1;

import h1.n1;
import java.util.List;
import java.util.Map;
import y3.w0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p implements w0 {

    /* renamed from: a  reason: collision with root package name */
    public final q f9800a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9801b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9802c;

    /* renamed from: d  reason: collision with root package name */
    public final float f9803d;

    /* renamed from: e  reason: collision with root package name */
    public final w0 f9804e;

    /* renamed from: f  reason: collision with root package name */
    public final float f9805f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9806g;

    /* renamed from: h  reason: collision with root package name */
    public final zc.u f9807h;

    /* renamed from: i  reason: collision with root package name */
    public final x4.c f9808i;

    /* renamed from: j  reason: collision with root package name */
    public final long f9809j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f9810k;

    /* renamed from: l  reason: collision with root package name */
    public final int f9811l;
    public final int m;

    /* renamed from: n  reason: collision with root package name */
    public final int f9812n;

    /* renamed from: o  reason: collision with root package name */
    public final n1 f9813o;

    /* renamed from: p  reason: collision with root package name */
    public final int f9814p;

    /* renamed from: q  reason: collision with root package name */
    public final int f9815q;

    public p(q qVar, int i2, boolean z10, float f8, w0 w0Var, float f10, boolean z11, zc.u uVar, x4.c cVar, long j2, List list, int i10, int i11, int i12, n1 n1Var, int i13, int i14) {
        this.f9800a = qVar;
        this.f9801b = i2;
        this.f9802c = z10;
        this.f9803d = f8;
        this.f9804e = w0Var;
        this.f9805f = f10;
        this.f9806g = z11;
        this.f9807h = uVar;
        this.f9808i = cVar;
        this.f9809j = j2;
        this.f9810k = list;
        this.f9811l = i10;
        this.m = i11;
        this.f9812n = i12;
        this.f9813o = n1Var;
        this.f9814p = i13;
        this.f9815q = i14;
    }

    @Override // y3.w0
    public final int a() {
        return this.f9804e.a();
    }

    @Override // y3.w0
    public final void b() {
        this.f9804e.b();
    }

    @Override // y3.w0
    public final int c() {
        return this.f9804e.c();
    }

    @Override // y3.w0
    public final Map d() {
        return this.f9804e.d();
    }

    @Override // y3.w0
    public final mc.l e() {
        return this.f9804e.e();
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public final p f(int i2, boolean z10) {
        q qVar;
        if (!this.f9806g) {
            ?? r15 = this.f9810k;
            if (!r15.isEmpty() && (qVar = this.f9800a) != null) {
                int i10 = qVar.f9828n;
                int i11 = this.f9801b - i2;
                if (i11 >= 0 && i11 < i10) {
                    q qVar2 = (q) zb.l.R(r15);
                    q qVar3 = (q) zb.l.Z(r15);
                    if (!qVar2.f9830p && !qVar3.f9830p) {
                        int i12 = qVar2.f9827l;
                        int i13 = this.m;
                        int i14 = this.f9811l;
                        if (i2 < 0) {
                            if (Math.min((i12 + qVar2.f9828n) - i14, (qVar3.f9827l + qVar3.f9828n) - i13) <= (-i2)) {
                                return null;
                            }
                        } else if (Math.min(i14 - i12, i13 - qVar3.f9827l) <= i2) {
                            return null;
                        }
                        int size = r15.size();
                        boolean z11 = false;
                        for (int i15 = 0; i15 < size; i15++) {
                            q qVar4 = (q) r15.get(i15);
                            boolean z12 = qVar4.f9818c;
                            int[] iArr = qVar4.f9832r;
                            if (!qVar4.f9830p) {
                                qVar4.f9827l += i2;
                                int length = iArr.length;
                                for (int i16 = 0; i16 < length; i16++) {
                                    int i17 = i16 & 1;
                                    if ((z12 && i17 != 0) || (!z12 && i17 == 0)) {
                                        iArr[i16] = iArr[i16] + i2;
                                    }
                                }
                                if (z10) {
                                    int size2 = qVar4.f9817b.size();
                                    for (int i18 = 0; i18 < size2; i18++) {
                                        qVar4.f9826k.a(i18, qVar4.f9824i);
                                    }
                                }
                            }
                        }
                        return new p(this.f9800a, i11, (this.f9802c || i2 > 0) ? true : true, i2, this.f9804e, this.f9805f, this.f9806g, this.f9807h, this.f9808i, this.f9809j, r15, this.f9811l, this.m, this.f9812n, this.f9813o, this.f9814p, this.f9815q);
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
        w0 w0Var = this.f9804e;
        return (w0Var.c() << 32) | (w0Var.a() & 4294967295L);
    }
}

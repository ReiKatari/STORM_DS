package o1;

import java.util.List;
import p1.g0;
import p1.w;
import y3.h1;
import y3.i1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f10560a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10561b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10562c;

    /* renamed from: d  reason: collision with root package name */
    public final x4.m f10563d;

    /* renamed from: e  reason: collision with root package name */
    public final List f10564e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10565f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f10566g;

    /* renamed from: h  reason: collision with root package name */
    public final w f10567h;

    /* renamed from: i  reason: collision with root package name */
    public final int f10568i;

    /* renamed from: j  reason: collision with root package name */
    public final int f10569j;

    /* renamed from: k  reason: collision with root package name */
    public final int f10570k;

    /* renamed from: l  reason: collision with root package name */
    public final int f10571l;
    public int m = Integer.MIN_VALUE;

    /* renamed from: n  reason: collision with root package name */
    public final long f10572n;

    /* renamed from: o  reason: collision with root package name */
    public long f10573o;

    /* renamed from: p  reason: collision with root package name */
    public int f10574p;

    /* renamed from: q  reason: collision with root package name */
    public int f10575q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f10576r;

    public o(int i2, Object obj, int i10, int i11, x4.m mVar, int i12, int i13, List list, long j2, Object obj2, w wVar, long j10, int i14, int i15) {
        this.f10560a = i2;
        this.f10561b = obj;
        this.f10562c = i10;
        this.f10563d = mVar;
        this.f10564e = list;
        this.f10565f = j2;
        this.f10566g = obj2;
        this.f10567h = wVar;
        this.f10568i = i14;
        this.f10569j = i15;
        int size = list.size();
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            i16 = Math.max(i16, ((i1) list.get(i17)).B);
        }
        this.f10570k = i16;
        int i18 = i11 + i16;
        this.f10571l = i18 >= 0 ? i18 : 0;
        this.f10572n = (this.f10562c << 32) | (i16 & 4294967295L);
        this.f10573o = 0L;
        this.f10574p = -1;
        this.f10575q = -1;
    }

    @Override // p1.g0
    public final int a() {
        return this.f10564e.size();
    }

    @Override // p1.g0
    public final boolean b() {
        return true;
    }

    @Override // p1.g0
    public final void c() {
        this.f10576r = true;
    }

    @Override // p1.g0
    public final void d(int i2, int i10, int i11) {
        k(i2, 0, i10, i11, -1, -1);
    }

    @Override // p1.g0
    public final int e() {
        return this.f10571l;
    }

    @Override // p1.g0
    public final long f(int i2) {
        return this.f10573o;
    }

    @Override // p1.g0
    public final int g() {
        return this.f10569j;
    }

    @Override // p1.g0
    public final int getIndex() {
        return this.f10560a;
    }

    @Override // p1.g0
    public final Object getKey() {
        return this.f10561b;
    }

    @Override // p1.g0
    public final Object h(int i2) {
        return ((i1) this.f10564e.get(i2)).n();
    }

    @Override // p1.g0
    public final int i() {
        return this.f10568i;
    }

    public final void j(h1 h1Var) {
        if (this.m == Integer.MIN_VALUE) {
            k1.b.a("position() should be called first");
        }
        List list = this.f10564e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            i1 i1Var = (i1) list.get(i2);
            int i10 = i1Var.B;
            long j2 = this.f10573o;
            this.f10567h.a(i2, this.f10561b);
            h1.w(h1Var, i1Var, x4.j.c(j2, this.f10565f));
        }
    }

    public final void k(int i2, int i10, int i11, int i12, int i13, int i14) {
        this.m = i12;
        if (this.f10563d == x4.m.Rtl) {
            i10 = (i11 - i10) - this.f10562c;
        }
        this.f10573o = (i10 << 32) | (i2 & 4294967295L);
        this.f10574p = i13;
        this.f10575q = i14;
    }
}

package q1;

import h1.n1;
import java.util.List;
import java.util.Map;
import y3.w0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s implements w0 {

    /* renamed from: a  reason: collision with root package name */
    public final List f12173a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12174b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12175c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12176d;

    /* renamed from: e  reason: collision with root package name */
    public final n1 f12177e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12178f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12179g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12180h;

    /* renamed from: i  reason: collision with root package name */
    public final g f12181i;

    /* renamed from: j  reason: collision with root package name */
    public final g f12182j;

    /* renamed from: k  reason: collision with root package name */
    public final float f12183k;

    /* renamed from: l  reason: collision with root package name */
    public final int f12184l;
    public final boolean m;

    /* renamed from: n  reason: collision with root package name */
    public final i1.k f12185n;

    /* renamed from: o  reason: collision with root package name */
    public final w0 f12186o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f12187p;

    /* renamed from: q  reason: collision with root package name */
    public final List f12188q;

    /* renamed from: r  reason: collision with root package name */
    public final List f12189r;

    /* renamed from: s  reason: collision with root package name */
    public final zc.u f12190s;

    /* renamed from: t  reason: collision with root package name */
    public final x4.c f12191t;

    /* renamed from: u  reason: collision with root package name */
    public final long f12192u;

    public s(List list, int i2, int i10, int i11, n1 n1Var, int i12, int i13, int i14, g gVar, g gVar2, float f8, int i15, boolean z10, i1.k kVar, w0 w0Var, boolean z11, List list2, List list3, zc.u uVar, x4.c cVar, long j2) {
        this.f12173a = list;
        this.f12174b = i2;
        this.f12175c = i10;
        this.f12176d = i11;
        this.f12177e = n1Var;
        this.f12178f = i12;
        this.f12179g = i13;
        this.f12180h = i14;
        this.f12181i = gVar;
        this.f12182j = gVar2;
        this.f12183k = f8;
        this.f12184l = i15;
        this.m = z10;
        this.f12185n = kVar;
        this.f12186o = w0Var;
        this.f12187p = z11;
        this.f12188q = list2;
        this.f12189r = list3;
        this.f12190s = uVar;
        this.f12191t = cVar;
        this.f12192u = j2;
    }

    @Override // y3.w0
    public final int a() {
        return this.f12186o.a();
    }

    @Override // y3.w0
    public final void b() {
        this.f12186o.b();
    }

    @Override // y3.w0
    public final int c() {
        return this.f12186o.c();
    }

    @Override // y3.w0
    public final Map d() {
        return this.f12186o.d();
    }

    @Override // y3.w0
    public final mc.l e() {
        return this.f12186o.e();
    }

    public final s f(int i2) {
        int i10;
        float f8;
        int i11 = this.f12174b + this.f12175c;
        if (!this.f12187p) {
            List list = this.f12173a;
            if (!list.isEmpty() && this.f12181i != null && (i10 = this.f12184l - i2) >= 0 && i10 < i11) {
                if (i11 != 0) {
                    f8 = i2 / i11;
                } else {
                    f8 = 0.0f;
                }
                float f10 = this.f12183k - f8;
                if (this.f12182j != null && f10 < 0.5f && f10 > -0.5f) {
                    g gVar = (g) zb.l.R(list);
                    g gVar2 = (g) zb.l.Z(list);
                    int i12 = this.f12179g;
                    int i13 = this.f12178f;
                    if (i2 < 0) {
                        if (Math.min((gVar.f12142j + i11) - i13, (gVar2.f12142j + i11) - i12) <= (-i2)) {
                            return null;
                        }
                    } else if (Math.min(i13 - gVar.f12142j, i12 - gVar2.f12142j) <= i2) {
                        return null;
                    }
                    int size = list.size();
                    boolean z10 = false;
                    for (int i14 = 0; i14 < size; i14++) {
                        ((g) list.get(i14)).a(i2);
                    }
                    List list2 = this.f12188q;
                    int size2 = list2.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        ((g) list2.get(i15)).a(i2);
                    }
                    List list3 = this.f12189r;
                    int size3 = list3.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        ((g) list3.get(i16)).a(i2);
                    }
                    return new s(this.f12173a, this.f12174b, this.f12175c, this.f12176d, this.f12177e, this.f12178f, this.f12179g, this.f12180h, this.f12181i, this.f12182j, f10, i10, (this.m || i2 > 0) ? true : true, this.f12185n, this.f12186o, this.f12187p, this.f12188q, this.f12189r, this.f12190s, this.f12191t, this.f12192u);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long g() {
        w0 w0Var = this.f12186o;
        return (w0Var.c() << 32) | (w0Var.a() & 4294967295L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ s(int r24, int r25, int r26, h1.n1 r27, int r28, int r29, int r30, i1.k r31, y3.w0 r32, zc.u r33, x4.c r34, long r35) {
        /*
            r23 = this;
            r13 = 0
            r16 = 0
            zb.q r1 = zb.q.A
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r17 = r1
            r18 = r1
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r14 = r31
            r15 = r32
            r19 = r33
            r20 = r34
            r21 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.s.<init>(int, int, int, h1.n1, int, int, int, i1.k, y3.w0, zc.u, x4.c, long):void");
    }
}

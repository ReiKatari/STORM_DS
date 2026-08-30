package e2;

import a4.j1;
import b3.o;
import i3.t;
import l4.r0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f4227a;

    /* renamed from: b  reason: collision with root package name */
    public final r0 f4228b;

    /* renamed from: c  reason: collision with root package name */
    public final p4.d f4229c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4230d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4231e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4232f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4233g;

    /* renamed from: h  reason: collision with root package name */
    public final t f4234h;

    public j(String str, r0 r0Var, p4.d dVar, int i2, boolean z10, int i10, int i11, t tVar) {
        this.f4227a = str;
        this.f4228b = r0Var;
        this.f4229c = dVar;
        this.f4230d = i2;
        this.f4231e = z10;
        this.f4232f = i10;
        this.f4233g = i11;
        this.f4234h = tVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.m, b3.o] */
    @Override // a4.j1
    public final o e() {
        ?? oVar = new o();
        oVar.f4239i0 = this.f4227a;
        oVar.f4240j0 = this.f4228b;
        oVar.f4241k0 = this.f4229c;
        oVar.f4242l0 = this.f4230d;
        oVar.f4243m0 = this.f4231e;
        oVar.f4244n0 = this.f4232f;
        oVar.f4245o0 = this.f4233g;
        oVar.p0 = this.f4234h;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (nc.k.a(this.f4234h, jVar.f4234h) && nc.k.a(this.f4227a, jVar.f4227a) && nc.k.a(this.f4228b, jVar.f4228b) && nc.k.a(this.f4229c, jVar.f4229c) && this.f4230d == jVar.f4230d && this.f4231e == jVar.f4231e && this.f4232f == jVar.f4232f && this.f4233g == jVar.f4233g) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r3.f8887a.b(r0.f8887a) != false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // a4.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(b3.o r12) {
        /*
            r11 = this;
            e2.m r12 = (e2.m) r12
            i3.t r0 = r12.p0
            i3.t r1 = r11.f4234h
            boolean r0 = nc.k.a(r1, r0)
            r12.p0 = r1
            r1 = 0
            r2 = 1
            l4.r0 r3 = r11.f4228b
            if (r0 == 0) goto L26
            l4.r0 r0 = r12.f4240j0
            if (r3 == r0) goto L21
            l4.j0 r4 = r3.f8887a
            l4.j0 r0 = r0.f8887a
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L26
            goto L24
        L21:
            r3.getClass()
        L24:
            r0 = r1
            goto L27
        L26:
            r0 = r2
        L27:
            java.lang.String r4 = r12.f4239i0
            java.lang.String r5 = r11.f4227a
            boolean r4 = nc.k.a(r4, r5)
            if (r4 == 0) goto L32
            goto L38
        L32:
            r12.f4239i0 = r5
            r1 = 0
            r12.f4249t0 = r1
            r1 = r2
        L38:
            l4.r0 r4 = r12.f4240j0
            boolean r4 = r4.c(r3)
            r4 = r4 ^ r2
            r12.f4240j0 = r3
            int r3 = r12.f4245o0
            int r5 = r11.f4233g
            if (r3 == r5) goto L4a
            r12.f4245o0 = r5
            r4 = r2
        L4a:
            int r3 = r12.f4244n0
            int r5 = r11.f4232f
            if (r3 == r5) goto L53
            r12.f4244n0 = r5
            r4 = r2
        L53:
            boolean r3 = r12.f4243m0
            boolean r5 = r11.f4231e
            if (r3 == r5) goto L5c
            r12.f4243m0 = r5
            r4 = r2
        L5c:
            p4.d r3 = r12.f4241k0
            p4.d r5 = r11.f4229c
            boolean r3 = nc.k.a(r3, r5)
            if (r3 != 0) goto L69
            r12.f4241k0 = r5
            r4 = r2
        L69:
            int r3 = r12.f4242l0
            int r5 = r11.f4230d
            if (r3 != r5) goto L71
            r2 = r4
            goto L73
        L71:
            r12.f4242l0 = r5
        L73:
            if (r1 != 0) goto L77
            if (r2 == 0) goto La3
        L77:
            e2.e r3 = r12.O0()
            java.lang.String r4 = r12.f4239i0
            l4.r0 r5 = r12.f4240j0
            p4.d r6 = r12.f4241k0
            int r7 = r12.f4242l0
            boolean r8 = r12.f4243m0
            int r9 = r12.f4244n0
            int r10 = r12.f4245o0
            r3.f4178a = r4
            r3.f4179b = r5
            r3.f4180c = r6
            r3.f4181d = r7
            r3.f4182e = r8
            r3.f4183f = r9
            r3.f4184g = r10
            long r4 = r3.f4195s
            r6 = 2
            long r4 = r4 << r6
            r6 = 2
            long r4 = r4 | r6
            r3.f4195s = r4
            r3.c()
        La3:
            boolean r3 = r12.f1777h0
            if (r3 != 0) goto La8
            goto Lc2
        La8:
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto Lb3
            e2.k r3 = r12.f4248s0
            if (r3 == 0) goto Lb3
        Lb0:
            a4.l.l(r12)
        Lb3:
            if (r1 != 0) goto Lb7
            if (r2 == 0) goto Lbd
        Lb7:
            a4.l.k(r12)
            a4.l.j(r12)
        Lbd:
            if (r0 == 0) goto Lc2
            a4.l.j(r12)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.j.g(b3.o):void");
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.f4228b.hashCode();
        int hashCode2 = this.f4229c.hashCode();
        int e6 = (((w.d.e(w.d.c(this.f4230d, (hashCode2 + ((hashCode + (this.f4227a.hashCode() * 31)) * 31)) * 31, 31), this.f4231e, 31) + this.f4232f) * 31) + this.f4233g) * 31;
        t tVar = this.f4234h;
        if (tVar != null) {
            i2 = tVar.hashCode();
        } else {
            i2 = 0;
        }
        return e6 + i2;
    }
}

package f5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class t implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f4890a;

    /* renamed from: b  reason: collision with root package name */
    public e5.g f4891b;

    /* renamed from: c  reason: collision with root package name */
    public n f4892c;

    /* renamed from: d  reason: collision with root package name */
    public e5.f f4893d;

    /* renamed from: e  reason: collision with root package name */
    public final h f4894e = new h(this);

    /* renamed from: f  reason: collision with root package name */
    public int f4895f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4896g = false;

    /* renamed from: h  reason: collision with root package name */
    public final g f4897h = new g(this);

    /* renamed from: i  reason: collision with root package name */
    public final g f4898i = new g(this);

    /* renamed from: j  reason: collision with root package name */
    public s f4899j = s.NONE;

    public t(e5.g gVar) {
        this.f4891b = gVar;
    }

    public static void b(g gVar, g gVar2, int i2) {
        gVar.f4874l.add(gVar2);
        gVar.f4868f = i2;
        gVar2.f4873k.add(gVar);
    }

    public static g h(e5.d dVar) {
        e5.d dVar2 = dVar.f4283f;
        if (dVar2 != null) {
            e5.g gVar = dVar2.f4281d;
            int i2 = r.f4889a[dVar2.f4282e.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return null;
                            }
                            return gVar.f4296e.f4898i;
                        }
                        return gVar.f4296e.f4881k;
                    }
                    return gVar.f4296e.f4897h;
                }
                return gVar.f4294d.f4898i;
            }
            return gVar.f4294d.f4897h;
        }
        return null;
    }

    public static g i(e5.d dVar, int i2) {
        t tVar;
        e5.d dVar2 = dVar.f4283f;
        if (dVar2 != null) {
            e5.g gVar = dVar2.f4281d;
            if (i2 == 0) {
                tVar = gVar.f4294d;
            } else {
                tVar = gVar.f4296e;
            }
            int i10 = r.f4889a[dVar2.f4282e.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            return null;
                        }
                    }
                }
                return tVar.f4898i;
            }
            return tVar.f4897h;
        }
        return null;
    }

    public final void c(g gVar, g gVar2, int i2, h hVar) {
        gVar.f4874l.add(gVar2);
        gVar.f4874l.add(this.f4894e);
        gVar.f4870h = i2;
        gVar.f4871i = hVar;
        gVar2.f4873k.add(gVar);
        hVar.f4873k.add(gVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i10) {
        e5.g gVar = this.f4891b;
        if (i10 == 0) {
            int i11 = gVar.f4326v;
            int max = Math.max(gVar.f4325u, i2);
            if (i11 > 0) {
                max = Math.min(i11, i2);
            }
            if (max != i2) {
                return max;
            }
        } else {
            int i12 = gVar.f4329y;
            int max2 = Math.max(gVar.f4328x, i2);
            if (i12 > 0) {
                max2 = Math.min(i12, i2);
            }
            if (max2 != i2) {
                return max2;
            }
        }
        return i2;
    }

    public long j() {
        h hVar = this.f4894e;
        if (hVar.f4872j) {
            return hVar.f4869g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r10.f4890a == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(e5.d r13, e5.d r14, int r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.t.l(e5.d, e5.d, int):void");
    }
}

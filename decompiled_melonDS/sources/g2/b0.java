package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final l1.h1 f5046a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f5047b = 64;

    /* renamed from: c  reason: collision with root package name */
    public static final float f5048c = 36;

    /* renamed from: d  reason: collision with root package name */
    public static final l1.h1 f5049d;

    static {
        float f8 = 16;
        float f10 = 8;
        f5046a = new l1.h1(f8, f10, f8, f10);
        f5049d = new l1.h1(f10, f10, f10, f10);
    }

    public static r0 a(long j2, long j10, n2.m mVar, int i2, int i10) {
        if ((i10 & 1) != 0) {
            j2 = ((l0) ((n2.r) mVar).j(m0.f5257a)).g();
        }
        long j11 = j2;
        if ((i10 & 2) != 0) {
            j10 = m0.b(j11, mVar);
        }
        long j12 = j10;
        n2.t2 t2Var = m0.f5257a;
        n2.r rVar = (n2.r) mVar;
        long j13 = i3.z.j(i3.s.b(((l0) rVar.j(t2Var)).f(), 0.12f), ((l0) rVar.j(t2Var)).j());
        n2.r rVar2 = (n2.r) mVar;
        long f8 = ((l0) rVar2.j(t2Var)).f();
        long j14 = ((i3.s) rVar2.j(q0.f5361a)).f6689a;
        if (((l0) rVar2.j(t2Var)).k()) {
            i3.z.r(j14);
        } else {
            i3.z.r(j14);
        }
        return new r0(j11, j12, j13, i3.s.b(f8, 0.38f));
    }

    public static r0 b(long j2, n2.m mVar, int i2) {
        long j10 = i3.s.f6686g;
        if ((i2 & 2) != 0) {
            j2 = ((l0) ((n2.r) mVar).j(m0.f5257a)).g();
        }
        long j11 = j2;
        n2.t2 t2Var = m0.f5257a;
        n2.r rVar = (n2.r) mVar;
        long f8 = ((l0) rVar.j(t2Var)).f();
        long j12 = ((i3.s) rVar.j(q0.f5361a)).f6689a;
        if (((l0) rVar.j(t2Var)).k()) {
            i3.z.r(j12);
        } else {
            i3.z.r(j12);
        }
        return new r0(j10, j11, j10, i3.s.b(f8, 0.38f));
    }
}

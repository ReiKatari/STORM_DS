package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final n2.t2 f5257a = new n2.n1(new a3.g(23));

    public static final long a(l0 l0Var, long j2) {
        if (i3.s.c(j2, l0Var.g())) {
            return l0Var.d();
        }
        if (i3.s.c(j2, l0Var.h())) {
            return l0Var.d();
        }
        if (i3.s.c(j2, l0Var.i())) {
            return l0Var.e();
        }
        if (i3.s.c(j2, ((i3.s) l0Var.f5232d.getValue()).f6689a)) {
            return l0Var.e();
        }
        if (i3.s.c(j2, l0Var.a())) {
            return l0Var.c();
        }
        if (i3.s.c(j2, l0Var.j())) {
            return l0Var.f();
        }
        if (i3.s.c(j2, l0Var.b())) {
            return ((i3.s) l0Var.f5240l.getValue()).f6689a;
        }
        return i3.s.f6687h;
    }

    public static final long b(long j2, n2.m mVar) {
        n2.r rVar = (n2.r) mVar;
        rVar.X(-583917585);
        long a10 = a((l0) rVar.j(f5257a), j2);
        if (a10 == 16) {
            a10 = ((i3.s) rVar.j(q0.f5361a)).f6689a;
        }
        rVar.p(false);
        return a10;
    }

    public static l0 c(long j2, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, int i2) {
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        if ((i2 & 1) != 0) {
            j19 = i3.z.d(4284612846L);
        } else {
            j19 = j2;
        }
        if ((i2 & 2) != 0) {
            j20 = i3.z.d(4281794739L);
        } else {
            j20 = j10;
        }
        if ((i2 & 4) != 0) {
            j21 = i3.z.d(4278442694L);
        } else {
            j21 = j11;
        }
        if ((i2 & 8) != 0) {
            j22 = i3.z.d(4278290310L);
        } else {
            j22 = j12;
        }
        if ((i2 & 16) != 0) {
            j23 = i3.s.f6683d;
        } else {
            j23 = j13;
        }
        if ((i2 & 32) != 0) {
            j24 = i3.s.f6683d;
        } else {
            j24 = j14;
        }
        long d4 = i3.z.d(4289724448L);
        if ((i2 & 128) != 0) {
            j25 = i3.s.f6683d;
        } else {
            j25 = j15;
        }
        if ((i2 & 256) != 0) {
            j26 = i3.s.f6681b;
        } else {
            j26 = j16;
        }
        if ((i2 & 512) != 0) {
            j27 = i3.s.f6681b;
        } else {
            j27 = j17;
        }
        if ((i2 & 1024) != 0) {
            j28 = i3.s.f6681b;
        } else {
            j28 = j18;
        }
        return new l0(j19, j20, j21, j22, j23, j24, d4, j25, j26, j27, j28, i3.s.f6683d, true);
    }
}

package l1;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements y3.v0 {

    /* renamed from: b  reason: collision with root package name */
    public static final o f8589b = new o(0);

    /* renamed from: c  reason: collision with root package name */
    public static final o f8590c = new o(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8591a;

    public /* synthetic */ o(int i2) {
        this.f8591a = i2;
    }

    @Override // y3.v0
    public final y3.w0 a(y3.x0 x0Var, List list, long j2) {
        int i2;
        switch (this.f8591a) {
            case 0:
                return x0Var.u0(x4.a.j(j2), x4.a.i(j2), zb.r.A, new d1.x1(13));
            default:
                int i10 = 0;
                if (x4.a.f(j2)) {
                    i2 = x4.a.h(j2);
                } else {
                    i2 = 0;
                }
                if (x4.a.e(j2)) {
                    i10 = x4.a.g(j2);
                }
                return x0Var.u0(i2, i10, zb.r.A, new d1.x1(13));
        }
    }
}

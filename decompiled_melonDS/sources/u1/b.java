package u1;

import d1.x1;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements y3.v0 {

    /* renamed from: b  reason: collision with root package name */
    public static final b f13280b = new b(0);

    /* renamed from: c  reason: collision with root package name */
    public static final b f13281c = new b(1);

    /* renamed from: d  reason: collision with root package name */
    public static final x1 f13282d = new x1(13);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13283a;

    public /* synthetic */ b(int i2) {
        this.f13283a = i2;
    }

    @Override // y3.v0
    public final y3.w0 a(y3.x0 x0Var, List list, long j2) {
        switch (this.f13283a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(((y3.u0) list.get(i2)).e(j2));
                }
                return x0Var.u0(x4.a.h(j2), x4.a.g(j2), zb.r.A, new f2.m0(3, arrayList));
            default:
                return x0Var.u0(x4.a.h(j2), x4.a.g(j2), zb.r.A, f13282d);
        }
    }
}

package he;

import java.util.ArrayList;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends ec.j implements mc.l {
    public int X;
    public final /* synthetic */ t Y;
    public final /* synthetic */ je.d Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ ArrayList f6479b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ ArrayList f6480c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ ArrayList f6481d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, je.d dVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, cc.c cVar) {
        super(1, cVar);
        this.Y = tVar;
        this.Z = dVar;
        this.f6479b0 = arrayList;
        this.f6480c0 = arrayList2;
        this.f6481d0 = arrayList3;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        ArrayList arrayList = this.f6480c0;
        ArrayList arrayList2 = this.f6481d0;
        return new r(this.Y, this.Z, this.f6479b0, arrayList, arrayList2, (cc.c) obj).v(y.f14813a);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 == 1) {
                p7.j.I(obj);
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            this.X = 1;
            if (n.z(this.Y, this.Z, this.f6479b0, this.f6480c0, this.f6481d0, this) == aVar) {
                return aVar;
            }
        }
        return y.f14813a;
    }
}

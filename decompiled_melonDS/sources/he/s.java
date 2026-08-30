package he;

import java.util.ArrayList;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends ec.j implements mc.l {
    public int X;
    public final /* synthetic */ t Y;
    public final /* synthetic */ long Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ ArrayList f6482b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, long j2, ArrayList arrayList, cc.c cVar) {
        super(1, cVar);
        this.Y = tVar;
        this.Z = j2;
        this.f6482b0 = arrayList;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        long j2 = this.Z;
        ArrayList arrayList = this.f6482b0;
        return new s(this.Y, j2, arrayList, (cc.c) obj).v(y.f14813a);
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
            if (n.D(this.Y, this.Z, this.f6482b0, this) == aVar) {
                return aVar;
            }
        }
        return y.f14813a;
    }
}

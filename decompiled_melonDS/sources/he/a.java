package he;

import java.util.ArrayList;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ e B;
    public final /* synthetic */ ArrayList L;

    public /* synthetic */ a(e eVar, ArrayList arrayList, int i2) {
        this.A = i2;
        this.B = eVar;
        this.L = arrayList;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                t7.a aVar = (t7.a) obj;
                aVar.getClass();
                return this.B.f6464c.M(aVar, this.L);
            default:
                ArrayList arrayList = this.L;
                t7.a aVar2 = (t7.a) obj;
                aVar2.getClass();
                d dVar = this.B.f6465d;
                t7.c T = aVar2.T("UPDATE OR ABORT `cheat` SET `id` = ?,`enabled` = ? WHERE `id` = ?");
                try {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (obj2 != null) {
                            dVar.j(T, obj2);
                            T.N();
                            T.reset();
                            p7.l.u(aVar2);
                        }
                    }
                    q8.r.q(T, null);
                    return y.f14813a;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        q8.r.q(T, th2);
                        throw th3;
                    }
                }
        }
    }
}

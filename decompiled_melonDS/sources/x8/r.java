package x8;

import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ String L;

    public /* synthetic */ r(String str, int i2, long j2) {
        this.A = i2;
        this.B = j2;
        this.L = str;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        t7.c T;
        switch (this.A) {
            case 0:
                long j2 = this.B;
                String str = this.L;
                t7.a aVar = (t7.a) obj;
                aVar.getClass();
                T = aVar.T("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    T.g(1, j2);
                    T.C(2, str);
                    T.N();
                    int u4 = p7.l.u(aVar);
                    T.close();
                    return Integer.valueOf(u4);
                } finally {
                }
            default:
                long j10 = this.B;
                String str2 = this.L;
                t7.a aVar2 = (t7.a) obj;
                aVar2.getClass();
                T = aVar2.T("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    T.g(1, j10);
                    T.C(2, str2);
                    T.N();
                    T.close();
                    return y.f14813a;
                } finally {
                }
        }
    }
}

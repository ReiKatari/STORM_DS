package x8;

import me.magnum.melonds.common.camera.DSiCameraSource;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int L;

    public /* synthetic */ g(int i2, String str) {
        this.A = 2;
        this.L = i2;
        this.B = str;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        t7.c T;
        f fVar;
        switch (this.A) {
            case 0:
                String str = this.B;
                int i2 = this.L;
                t7.a aVar = (t7.a) obj;
                aVar.getClass();
                T = aVar.T("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    T.C(1, str);
                    T.g(2, i2);
                    int t5 = p7.m.t(T, "work_spec_id");
                    int t10 = p7.m.t(T, "generation");
                    int t11 = p7.m.t(T, "system_id");
                    if (T.N()) {
                        fVar = new f(T.n(t5), (int) T.getLong(t10), (int) T.getLong(t11));
                    } else {
                        fVar = null;
                    }
                    return fVar;
                } finally {
                }
            case DSiCameraSource.FrontCamera /* 1 */:
                String str2 = this.B;
                int i10 = this.L;
                t7.a aVar2 = (t7.a) obj;
                aVar2.getClass();
                T = aVar2.T("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    T.C(1, str2);
                    T.g(2, i10);
                    T.N();
                    T.close();
                    break;
                } finally {
                }
            default:
                int i11 = this.L;
                String str3 = this.B;
                t7.a aVar3 = (t7.a) obj;
                aVar3.getClass();
                T = aVar3.T("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    T.g(1, i11);
                    T.C(2, str3);
                    T.N();
                    break;
                } finally {
                }
        }
        return y.f14813a;
    }

    public /* synthetic */ g(String str, int i2, int i10) {
        this.A = i10;
        this.B = str;
        this.L = i2;
    }
}

package g1;

import android.database.SQLException;
import cd.e1;
import cd.w0;
import mc.l;
import me.magnum.melonds.common.camera.DSiCameraSource;
import yb.y;
import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;

    public /* synthetic */ g(Object obj, boolean z10, int i2) {
        this.A = i2;
        this.L = obj;
        this.B = z10;
    }

    @Override // mc.a
    public final Object b() {
        String str;
        w0 i2;
        switch (this.A) {
            case 0:
                mc.a aVar = (mc.a) this.L;
                if (this.B) {
                    aVar.b();
                }
                return y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                m7.e eVar = (m7.e) this.L;
                if (this.B) {
                    str = "reader";
                } else {
                    str = "writer";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Timed out attempting to acquire a " + str + " connection.");
                sb2.append("\n\nWriter pool:\n");
                eVar.B.d(sb2);
                sb2.append("Reader pool:");
                sb2.append('\n');
                eVar.A.d(sb2);
                try {
                    k.L(5, sb2.toString());
                    throw null;
                } catch (SQLException e6) {
                    int i10 = eVar.Z;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            e6.printStackTrace();
                        }
                        return y.f14813a;
                    }
                    throw e6;
                }
            case 2:
                d2.c cVar = (d2.c) this.L;
                boolean z10 = this.B;
                y yVar = y.f14813a;
                if (z10 && (i2 = cVar.i()) != null) {
                    ((e1) i2).p(yVar);
                }
                return yVar;
            default:
                ((l) this.L).k(Boolean.valueOf(!this.B));
                return y.f14813a;
        }
    }

    public /* synthetic */ g(boolean z10, Object obj, int i2) {
        this.A = i2;
        this.B = z10;
        this.L = obj;
    }
}

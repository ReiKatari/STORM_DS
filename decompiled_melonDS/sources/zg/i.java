package zg;

import android.net.Uri;
import androidx.lifecycle.s0;
import cd.q1;
import me.magnum.melonds.domain.model.DSiWareTitle;
import yb.y;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class i extends nc.i implements mc.q {

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ int f15096b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i2, Object obj, Class cls, String str, String str2, int i10, int i11, int i12) {
        super(i2, obj, cls, str, str2, i10, i11);
        this.f15096b0 = i12;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f15096b0) {
            case 0:
                DSiWareTitle dSiWareTitle = (DSiWareTitle) obj;
                re.a aVar = (re.a) obj2;
                Uri uri = (Uri) obj3;
                dSiWareTitle.getClass();
                aVar.getClass();
                uri.getClass();
                xg.h hVar = (xg.h) this.B;
                hVar.getClass();
                q1 q1Var = hVar.f14612g;
                Boolean bool = Boolean.TRUE;
                q1Var.getClass();
                q1Var.k(null, bool);
                x.v(s0.h(hVar), null, null, new xg.e(hVar, dSiWareTitle, aVar, uri, null, 1), 3);
                return y.f14813a;
            default:
                DSiWareTitle dSiWareTitle2 = (DSiWareTitle) obj;
                re.a aVar2 = (re.a) obj2;
                Uri uri2 = (Uri) obj3;
                dSiWareTitle2.getClass();
                aVar2.getClass();
                uri2.getClass();
                xg.h hVar2 = (xg.h) this.B;
                hVar2.getClass();
                q1 q1Var2 = hVar2.f14612g;
                Boolean bool2 = Boolean.TRUE;
                q1Var2.getClass();
                q1Var2.k(null, bool2);
                x.v(s0.h(hVar2), null, null, new xg.e(hVar2, dSiWareTitle2, aVar2, uri2, null, 3), 3);
                return y.f14813a;
        }
    }
}

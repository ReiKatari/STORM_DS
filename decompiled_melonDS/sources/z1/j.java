package z1;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import i3.s;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.r;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements mc.q {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ j(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i2;
        boolean z11;
        boolean z12;
        Icon icon;
        switch (this.A) {
            case 0:
                long j2 = ((s) obj).f6689a;
                n2.m mVar = (n2.m) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (((r) mVar).e(j2)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    k.b(((x1.d) this.B).f14326c, (intValue << 3) & 112, j2, rVar);
                } else {
                    rVar.R();
                }
                return y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                long j10 = ((s) obj).f6689a;
                n2.m mVar2 = (n2.m) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    p.f14881a.a((Drawable) this.B, rVar2, 48);
                } else {
                    rVar2.R();
                }
                return y.f14813a;
            default:
                long j11 = ((s) obj).f6689a;
                n2.m mVar3 = (n2.m) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 17) != 16) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                r rVar3 = (r) mVar3;
                if (rVar3.O(intValue3 & 1, z12)) {
                    icon = ((RemoteAction) this.B).getIcon();
                    p.f14881a.b(icon, rVar3, 48);
                } else {
                    rVar3.R();
                }
                return y.f14813a;
        }
    }
}

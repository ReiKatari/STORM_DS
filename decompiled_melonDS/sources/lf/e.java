package lf;

import android.widget.Toast;
import ec.j;
import mc.p;
import me.magnum.melonds.R;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends j implements p {
    public final /* synthetic */ int X;
    public final /* synthetic */ f Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Y = fVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        u uVar = (u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                y yVar = y.f14813a;
                ((e) t(cVar, uVar)).v(yVar);
                return yVar;
            default:
                y yVar2 = y.f14813a;
                ((e) t(cVar, uVar)).v(yVar2);
                return yVar2;
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new e(this.Y, cVar, 0);
            default:
                return new e(this.Y, cVar, 1);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        y yVar = y.f14813a;
        f fVar = this.Y;
        switch (i2) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                Toast.makeText(fVar.f9085a, (int) R.string.no_image_selected, 0).show();
                return yVar;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                Toast.makeText(fVar.f9085a, (int) R.string.failed_to_load_image, 0).show();
                return yVar;
        }
    }
}

package pf;

import android.net.Uri;
import me.magnum.melonds.MelonEmulator;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public final /* synthetic */ Uri Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Uri uri, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Y = uri;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        u uVar = (u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((g) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((g) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new g(this.Y, cVar, 0);
            default:
                return new g(this.Y, cVar, 1);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        Uri uri = this.Y;
        MelonEmulator melonEmulator = MelonEmulator.f9466a;
        switch (i2) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                return Boolean.valueOf(melonEmulator.c(uri));
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                return Boolean.valueOf(melonEmulator.f(uri));
        }
    }
}

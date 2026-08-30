package a6;

import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 extends ec.i implements mc.p {
    public final /* synthetic */ int L;
    public int R;
    public /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(int i2, cc.c cVar, Object obj) {
        super(2, cVar);
        this.L = i2;
        this.Y = obj;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.L) {
            case 0:
                return ((b1) t((cc.c) obj2, (uc.g) obj)).v(yb.y.f14813a);
            default:
                return ((b1) t((cc.c) obj2, (v3.f0) obj)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.L) {
            case 0:
                b1 b1Var = new b1(0, cVar, (View) this.Y);
                b1Var.X = obj;
                return b1Var;
            default:
                b1 b1Var2 = new b1(1, cVar, (f1.i) this.Y);
                b1Var2.X = obj;
                return b1Var2;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0055 -> B:18:0x0058). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.b1.v(java.lang.Object):java.lang.Object");
    }
}

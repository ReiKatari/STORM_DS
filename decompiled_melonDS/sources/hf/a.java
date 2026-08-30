package hf;

import ec.c;
import yb.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends c {
    public /* synthetic */ Object R;
    public final /* synthetic */ b X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.X = bVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        Object a10 = this.X.a(this);
        if (a10 == dc.a.COROUTINE_SUSPENDED) {
            return a10;
        }
        return new l(a10);
    }
}

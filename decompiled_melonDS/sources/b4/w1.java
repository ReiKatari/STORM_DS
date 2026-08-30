package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w1 extends nc.l implements mc.a {
    public final /* synthetic */ boolean B;
    public final /* synthetic */ q7.d L;
    public final /* synthetic */ String R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(boolean z10, q7.d dVar, String str) {
        super(0);
        this.B = z10;
        this.L = dVar;
        this.R = str;
    }

    @Override // mc.a
    public final Object b() {
        if (this.B) {
            q7.d dVar = this.L;
            String str = this.R;
            s7.a aVar = dVar.f12310a;
            synchronized (aVar.f12837c) {
                q7.c cVar = (q7.c) aVar.f12838d.remove(str);
            }
        }
        return yb.y.f14813a;
    }
}

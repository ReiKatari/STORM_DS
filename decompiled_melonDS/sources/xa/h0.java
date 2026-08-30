package xa;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class h0 extends ua.u {
    @Override // ua.u
    public final Object b(cb.a aVar) {
        cb.b d02 = aVar.d0();
        if (d02 == cb.b.NULL) {
            aVar.Z();
            return null;
        } else if (d02 == cb.b.BOOLEAN) {
            return Boolean.toString(aVar.I());
        } else {
            return aVar.b0();
        }
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        cVar.Y((String) obj);
    }
}

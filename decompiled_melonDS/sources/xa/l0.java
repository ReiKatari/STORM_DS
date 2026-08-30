package xa;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class l0 extends ua.u {
    @Override // ua.u
    public final Object b(cb.a aVar) {
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        return new StringBuilder(aVar.b0());
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        String sb2;
        StringBuilder sb3 = (StringBuilder) obj;
        if (sb3 == null) {
            sb2 = null;
        } else {
            sb2 = sb3.toString();
        }
        cVar.Y(sb2);
    }
}

package xa;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class d1 extends ua.u {
    @Override // ua.u
    public final Object b(cb.a aVar) {
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        try {
            return Integer.valueOf(aVar.K());
        } catch (NumberFormatException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            cVar.F();
        } else {
            cVar.L(number.intValue());
        }
    }
}

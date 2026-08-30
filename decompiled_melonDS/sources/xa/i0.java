package xa;

import java.math.BigDecimal;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class i0 extends ua.u {
    @Override // ua.u
    public final Object b(cb.a aVar) {
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        String b02 = aVar.b0();
        try {
            return wa.i.i(b02);
        } catch (NumberFormatException e6) {
            StringBuilder u4 = w.d.u("Failed parsing '", b02, "' as BigDecimal; at path ");
            u4.append(aVar.B(true));
            throw new RuntimeException(u4.toString(), e6);
        }
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        cVar.X((BigDecimal) obj);
    }
}

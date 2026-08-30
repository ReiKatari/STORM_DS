package xa;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class g0 extends ua.u {
    @Override // ua.u
    public final Object b(cb.a aVar) {
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        String b02 = aVar.b0();
        if (b02.length() == 1) {
            return Character.valueOf(b02.charAt(0));
        }
        StringBuilder u4 = w.d.u("Expecting character, got: ", b02, "; at ");
        u4.append(aVar.B(true));
        throw new RuntimeException(u4.toString());
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        String valueOf;
        Character ch2 = (Character) obj;
        if (ch2 == null) {
            valueOf = null;
        } else {
            valueOf = String.valueOf(ch2);
        }
        cVar.Y(valueOf);
    }
}

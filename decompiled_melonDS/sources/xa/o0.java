package xa;

import java.net.URL;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class o0 extends ua.u {
    @Override // ua.u
    public final Object b(cb.a aVar) {
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        String b02 = aVar.b0();
        if (b02.equals("null")) {
            return null;
        }
        return new URL(b02);
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        String externalForm;
        URL url = (URL) obj;
        if (url == null) {
            externalForm = null;
        } else {
            externalForm = url.toExternalForm();
        }
        cVar.Y(externalForm);
    }
}

package xa;

import java.net.URI;
import java.net.URISyntaxException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class p0 extends ua.u {
    @Override // ua.u
    public final Object b(cb.a aVar) {
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        try {
            String b02 = aVar.b0();
            if (b02.equals("null")) {
                return null;
            }
            return new URI(b02);
        } catch (URISyntaxException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        String aSCIIString;
        URI uri = (URI) obj;
        if (uri == null) {
            aSCIIString = null;
        } else {
            aSCIIString = uri.toASCIIString();
        }
        cVar.Y(aSCIIString);
    }
}

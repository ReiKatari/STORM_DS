package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od7  reason: default package */
/* loaded from: classes.dex */
public class od7 extends yc7 {
    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        if (hf3Var.n0() == jf3.NULL) {
            hf3Var.j0();
            return null;
        }
        try {
            String l0 = hf3Var.l0();
            if (l0.equals("null")) {
                return null;
            }
            return new URI(l0);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        String aSCIIString;
        URI uri = (URI) obj;
        if (uri == null) {
            aSCIIString = null;
        } else {
            aSCIIString = uri.toASCIIString();
        }
        vf3Var.c0(aSCIIString);
    }
}

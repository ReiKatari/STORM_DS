package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tz6  reason: default package */
/* loaded from: classes.dex */
public class tz6 extends dz6 {
    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        if (o83Var.n0() == q83.NULL) {
            o83Var.j0();
            return null;
        }
        try {
            String l0 = o83Var.l0();
            if (l0.equals("null")) {
                return null;
            }
            return new URI(l0);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        String aSCIIString;
        URI uri = (URI) obj;
        if (uri == null) {
            aSCIIString = null;
        } else {
            aSCIIString = uri.toASCIIString();
        }
        b93Var.Z(aSCIIString);
    }
}

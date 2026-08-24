package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rs0  reason: default package */
/* loaded from: classes.dex */
public final class rs0 extends j0 {
    public final n b;

    public rs0(n nVar) {
        super(new Class[0]);
        this.b = nVar;
    }

    @Override // defpackage.j0
    public final InputStream a(String str, InputStream inputStream, long j, ps0 ps0Var, byte[] bArr, int i) {
        try {
            n nVar = this.b;
            nVar.getClass();
            return nVar.a(inputStream, mu.a);
        } catch (AssertionError e) {
            throw new IOException(lb1.A("BCJ filter used in ", str, " needs XZ for Java > 1.4 - see https://commons.apache.org/proper/commons-compress/limitations.html#7Z"), e);
        }
    }
}

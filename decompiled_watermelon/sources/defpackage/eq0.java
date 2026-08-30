package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eq0  reason: default package */
/* loaded from: classes.dex */
public final class eq0 extends i0 {
    public final n b;

    public eq0(n nVar) {
        super(new Class[0]);
        this.b = nVar;
    }

    @Override // defpackage.i0
    public final InputStream a(String str, InputStream inputStream, long j, cq0 cq0Var, byte[] bArr, int i) {
        try {
            n nVar = this.b;
            nVar.getClass();
            return nVar.a(inputStream, ut.a);
        } catch (AssertionError e) {
            throw new IOException(wh1.A("BCJ filter used in ", str, " needs XZ for Java > 1.4 - see https://commons.apache.org/proper/commons-compress/limitations.html#7Z"), e);
        }
    }
}

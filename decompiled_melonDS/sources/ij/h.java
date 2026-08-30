package ij;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: b  reason: collision with root package name */
    public final zj.a f7093b;

    public h(zj.a aVar) {
        super(new Class[0]);
        this.f7093b = aVar;
    }

    @Override // ij.d
    public final InputStream a(String str, InputStream inputStream, long j2, f fVar, byte[] bArr, int i2) {
        try {
            zj.a aVar = this.f7093b;
            aVar.getClass();
            return aVar.a(inputStream, zj.b.f15153a);
        } catch (AssertionError e6) {
            throw new IOException(kc.a.g("BCJ filter used in ", str, " needs XZ for Java > 1.4 - see https://commons.apache.org/proper/commons-compress/limitations.html#7Z"), e6);
        }
    }
}

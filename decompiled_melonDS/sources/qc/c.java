package qc;

import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends d implements Serializable {
    @Override // qc.d
    public final int a(int i2) {
        return d.A.a(i2);
    }

    @Override // qc.d
    public final byte[] b(int i2, byte[] bArr) {
        d.A.b(i2, bArr);
        return bArr;
    }

    @Override // qc.d
    public final byte[] c(byte[] bArr) {
        a aVar = d.A;
        aVar.getClass();
        aVar.e().nextBytes(bArr);
        return bArr;
    }

    @Override // qc.d
    public final int d() {
        return d.A.d();
    }
}

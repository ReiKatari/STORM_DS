package qc;

import java.util.Random;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a extends d {
    @Override // qc.d
    public final int a(int i2) {
        return ((-i2) >> 31) & (e().nextInt() >>> (32 - i2));
    }

    @Override // qc.d
    public final byte[] c(byte[] bArr) {
        e().nextBytes(bArr);
        return bArr;
    }

    @Override // qc.d
    public final int d() {
        return e().nextInt();
    }

    public abstract Random e();
}

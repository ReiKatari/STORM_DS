package ud;

import java.io.FilterInputStream;
import java.io.InputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends FilterInputStream {
    public int A;

    public a(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i10) {
        int read = super.read(bArr, i2, i10);
        this.A += read;
        return read;
    }
}

package ij;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends FilterInputStream {
    public s(v vVar, BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((FilterInputStream) this).in.read(bArr, i2, i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        return ((FilterInputStream) this).in.read();
    }
}

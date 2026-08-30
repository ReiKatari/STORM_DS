package ij;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends FilterInputStream {
    public final /* synthetic */ int A;
    public final Object B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(InputStream inputStream, Object obj, int i2) {
        super(inputStream);
        this.A = i2;
        this.B = obj;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.A) {
            case 0:
                Inflater inflater = (Inflater) this.B;
                try {
                    super.close();
                    return;
                } finally {
                    inflater.end();
                }
            default:
                super.close();
                return;
        }
    }
}

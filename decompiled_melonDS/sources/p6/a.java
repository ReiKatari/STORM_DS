package p6;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends MediaDataSource {
    public long A;
    public final /* synthetic */ f B;

    public a(f fVar) {
        this.B = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j2, byte[] bArr, int i2, int i10) {
        f fVar = this.B;
        DataInputStream dataInputStream = fVar.A;
        if (i10 == 0) {
            return 0;
        }
        if (j2 >= 0) {
            try {
                long j10 = this.A;
                if (j10 != j2) {
                    if (j10 < 0 || j2 < j10 + dataInputStream.available()) {
                        fVar.i(j2);
                        this.A = j2;
                    }
                }
                if (i10 > dataInputStream.available()) {
                    i10 = dataInputStream.available();
                }
                int read = fVar.read(bArr, i2, i10);
                if (read >= 0) {
                    this.A += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.A = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

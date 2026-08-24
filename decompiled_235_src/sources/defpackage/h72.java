package defpackage;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h72  reason: default package */
/* loaded from: classes.dex */
public final class h72 extends MediaDataSource {
    public long A;
    public final /* synthetic */ q72 B;

    public h72(q72 q72Var) {
        this.B = q72Var;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        q72 q72Var = this.B;
        DataInputStream dataInputStream = q72Var.A;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.A;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + dataInputStream.available()) {
                        q72Var.h(j);
                        this.A = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int read = q72Var.read(bArr, i, i2);
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

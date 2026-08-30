package defpackage;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p22  reason: default package */
/* loaded from: classes.dex */
public final class p22 extends MediaDataSource {
    public long A;
    public final /* synthetic */ y22 B;

    public p22(y22 y22Var) {
        this.B = y22Var;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        y22 y22Var = this.B;
        DataInputStream dataInputStream = y22Var.A;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.A;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + dataInputStream.available()) {
                        y22Var.i(j);
                        this.A = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int read = y22Var.read(bArr, i, i2);
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

package defpackage;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d26  reason: default package */
/* loaded from: classes.dex */
public final class d26 extends FilterInputStream {
    public d26(g26 g26Var, BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        return ((FilterInputStream) this).in.read(bArr, i, i2);
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

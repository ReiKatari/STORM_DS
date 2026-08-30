package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zu4  reason: default package */
/* loaded from: classes.dex */
public final class zu4 extends FilterInputStream {
    public int A;

    public zu4(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        this.A += read;
        return read;
    }
}

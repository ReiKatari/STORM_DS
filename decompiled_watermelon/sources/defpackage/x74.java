package defpackage;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x74  reason: default package */
/* loaded from: classes.dex */
public abstract class x74 implements gg6 {
    @Override // defpackage.gg6
    public final InputStream a(InputStream inputStream, byte[] bArr) {
        return new ig6(this, inputStream, bArr);
    }

    @Override // defpackage.gg6
    public final OutputStream b(FileOutputStream fileOutputStream, byte[] bArr) {
        return new jg6(this, fileOutputStream, bArr);
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract wf6 g();

    public abstract xf6 h(byte[] bArr);
}

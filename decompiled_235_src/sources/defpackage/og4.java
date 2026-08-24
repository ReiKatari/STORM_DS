package defpackage;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: og4  reason: default package */
/* loaded from: classes.dex */
public abstract class og4 implements xr6 {
    @Override // defpackage.xr6
    public final InputStream a(InputStream inputStream, byte[] bArr) {
        return new zr6(this, inputStream, bArr);
    }

    @Override // defpackage.xr6
    public final OutputStream b(FileOutputStream fileOutputStream, byte[] bArr) {
        return new as6(this, fileOutputStream, bArr);
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract mr6 g();

    public abstract nr6 h(byte[] bArr);
}

package defpackage;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bs6  reason: default package */
/* loaded from: classes.dex */
public final class bs6 implements xr6 {
    public m44 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [z73, java.io.InputStream] */
    @Override // defpackage.xr6
    public final InputStream a(InputStream inputStream, byte[] bArr) {
        m44 m44Var = this.a;
        ?? inputStream2 = new InputStream();
        inputStream2.A = false;
        inputStream2.B = null;
        inputStream2.R = m44Var;
        if (inputStream.markSupported()) {
            inputStream2.L = inputStream;
        } else {
            inputStream2.L = new BufferedInputStream(inputStream);
        }
        inputStream2.L.mark(Integer.MAX_VALUE);
        inputStream2.X = (byte[]) bArr.clone();
        return inputStream2;
    }

    @Override // defpackage.xr6
    public final OutputStream b(FileOutputStream fileOutputStream, byte[] bArr) {
        return ((xr6) ((y25) this.a.L).a).b(fileOutputStream, bArr);
    }
}

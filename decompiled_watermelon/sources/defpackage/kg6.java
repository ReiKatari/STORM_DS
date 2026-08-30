package defpackage;

import androidx.preference.Preference;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kg6  reason: default package */
/* loaded from: classes.dex */
public final class kg6 implements gg6 {
    public os a;

    /* JADX WARN: Type inference failed for: r0v0, types: [s13, java.io.InputStream] */
    @Override // defpackage.gg6
    public final InputStream a(InputStream inputStream, byte[] bArr) {
        os osVar = this.a;
        ?? inputStream2 = new InputStream();
        inputStream2.A = false;
        inputStream2.B = null;
        inputStream2.R = osVar;
        if (inputStream.markSupported()) {
            inputStream2.L = inputStream;
        } else {
            inputStream2.L = new BufferedInputStream(inputStream);
        }
        inputStream2.L.mark(Preference.DEFAULT_ORDER);
        inputStream2.X = (byte[]) bArr.clone();
        return inputStream2;
    }

    @Override // defpackage.gg6
    public final OutputStream b(FileOutputStream fileOutputStream, byte[] bArr) {
        return ((gg6) ((wt4) this.a.L).a).b(fileOutputStream, bArr);
    }
}

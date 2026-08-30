package defpackage;

import android.util.Log;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fq0  reason: default package */
/* loaded from: classes.dex */
public final class fq0 extends FilterInputStream {
    public final /* synthetic */ int A;
    public final Object B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fq0(InputStream inputStream, Object obj, int i) {
        super(inputStream);
        this.A = i;
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
            case 1:
            default:
                super.close();
                return;
            case 2:
                g26 g26Var = (g26) this.B;
                try {
                    super.close();
                    try {
                        g26Var.close();
                        return;
                    } catch (Exception e) {
                        Log.w("SevenZRomProcessor", "Failed to close 7z archive", e);
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        g26Var.close();
                    } catch (Exception e2) {
                        Log.w("SevenZRomProcessor", "Failed to close 7z archive", e2);
                    }
                    throw th;
                }
        }
    }
}

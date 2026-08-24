package defpackage;

import android.util.Log;
import com.github.junrar.Archive;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ss0  reason: default package */
/* loaded from: classes.dex */
public final class ss0 extends FilterInputStream {
    public final /* synthetic */ int A;
    public final Object B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss0(InputStream inputStream, Object obj, int i) {
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
                super.close();
                try {
                    ((Archive) this.B).close();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                sd6 sd6Var = (sd6) this.B;
                try {
                    super.close();
                    try {
                        sd6Var.close();
                        return;
                    } catch (Exception e) {
                        Log.w("SevenZRomProcessor", "Failed to close 7z archive", e);
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        sd6Var.close();
                    } catch (Exception e2) {
                        Log.w("SevenZRomProcessor", "Failed to close 7z archive", e2);
                    }
                    throw th;
                }
        }
    }
}

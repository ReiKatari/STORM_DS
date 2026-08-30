package defpackage;

import androidx.preference.Preference;
import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y22  reason: default package */
/* loaded from: classes.dex */
public final class y22 extends q22 {
    public y22(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.A.mark(Preference.DEFAULT_ORDER);
        } else {
            i.i("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void i(long j) {
        int i = this.B;
        if (i > j) {
            this.B = 0;
            this.A.reset();
        } else {
            j -= i;
        }
        d((int) j);
    }

    public y22(byte[] bArr) {
        super(bArr);
        this.A.mark(Preference.DEFAULT_ORDER);
    }
}

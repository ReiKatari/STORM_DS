package p6;

import a0.j;
import androidx.preference.Preference;
import java.io.InputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends b {
    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.A.mark(Preference.DEFAULT_ORDER);
        } else {
            j.h("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void i(long j2) {
        int i2 = this.B;
        if (i2 > j2) {
            this.B = 0;
            this.A.reset();
        } else {
            j2 -= i2;
        }
        d((int) j2);
    }

    public f(byte[] bArr) {
        super(bArr);
        this.A.mark(Preference.DEFAULT_ORDER);
    }
}

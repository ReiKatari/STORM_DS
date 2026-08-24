package defpackage;

import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q72  reason: default package */
/* loaded from: classes.dex */
public final class q72 extends i72 {
    public q72(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.A.mark(Integer.MAX_VALUE);
        } else {
            i.h("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void h(long j) {
        int i = this.B;
        if (i > j) {
            this.B = 0;
            this.A.reset();
        } else {
            j -= i;
        }
        e((int) j);
    }

    public q72(byte[] bArr) {
        super(bArr);
        this.A.mark(Integer.MAX_VALUE);
    }
}

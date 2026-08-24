package defpackage;

import java.io.Closeable;
import java.util.zip.Deflater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f54  reason: default package */
/* loaded from: classes.dex */
public final class f54 implements Closeable {
    public final /* synthetic */ int A;
    public final boolean B;
    public final k80 L;
    public Object R;
    public Closeable X;

    /* JADX WARN: Type inference failed for: r3v1, types: [k80, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [k80, java.lang.Object] */
    public f54(boolean z, int i) {
        this.A = i;
        switch (i) {
            case 1:
                this.B = z;
                this.L = new Object();
                return;
            default:
                this.B = z;
                ?? obj = new Object();
                this.L = obj;
                Deflater deflater = new Deflater(-1, true);
                this.R = deflater;
                this.X = new tg1(obj, deflater);
                return;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.A) {
            case 0:
                ((tg1) this.X).close();
                return;
            default:
                h53 h53Var = (h53) this.X;
                if (h53Var != null) {
                    h53Var.close();
                }
                this.X = null;
                this.R = null;
                return;
        }
    }
}

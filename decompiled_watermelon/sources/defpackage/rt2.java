package defpackage;

import androidx.preference.Preference;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rt2  reason: default package */
/* loaded from: classes.dex */
public final class rt2 implements sb6 {
    public final u60 A;
    public int B;
    public int L;
    public int R;
    public int X;
    public int Y;

    public rt2(u60 u60Var) {
        u60Var.getClass();
        this.A = u60Var;
    }

    @Override // defpackage.sb6
    public final long L(f60 f60Var, long j) {
        int i;
        int readInt;
        f60Var.getClass();
        do {
            int i2 = this.X;
            u60 u60Var = this.A;
            if (i2 == 0) {
                u60Var.skip(this.Y);
                this.Y = 0;
                if ((this.L & 4) == 0) {
                    i = this.R;
                    int n = gk7.n(u60Var);
                    this.X = n;
                    this.B = n;
                    int readByte = u60Var.readByte() & 255;
                    this.L = u60Var.readByte() & 255;
                    Logger logger = st2.R;
                    if (logger.isLoggable(Level.FINE)) {
                        w70 w70Var = it2.a;
                        logger.fine(it2.b(true, this.R, this.B, readByte, this.L));
                    }
                    readInt = u60Var.readInt() & Preference.DEFAULT_ORDER;
                    this.R = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long L = u60Var.L(f60Var, Math.min(j, i2));
                if (L != -1) {
                    this.X -= (int) L;
                    return L;
                }
            }
            return -1L;
        } while (readInt == i);
        f81.j("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // defpackage.sb6
    public final kt6 f() {
        return this.A.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

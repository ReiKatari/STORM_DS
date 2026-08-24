package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sz2  reason: default package */
/* loaded from: classes.dex */
public final class sz2 implements in6 {
    public final z80 A;
    public int B;
    public int L;
    public int R;
    public int X;
    public int Y;

    public sz2(z80 z80Var) {
        z80Var.getClass();
        this.A = z80Var;
    }

    @Override // defpackage.in6
    public final b67 b() {
        return this.A.b();
    }

    @Override // defpackage.in6
    public final long b0(k80 k80Var, long j) {
        int i;
        int readInt;
        k80Var.getClass();
        do {
            int i2 = this.X;
            z80 z80Var = this.A;
            if (i2 == 0) {
                z80Var.skip(this.Y);
                this.Y = 0;
                if ((this.L & 4) == 0) {
                    i = this.R;
                    int o = yy7.o(z80Var);
                    this.X = o;
                    this.B = o;
                    int readByte = z80Var.readByte() & 255;
                    this.L = z80Var.readByte() & 255;
                    Logger logger = tz2.R;
                    if (logger.isLoggable(Level.FINE)) {
                        da0 da0Var = iz2.a;
                        logger.fine(iz2.b(true, this.R, this.B, readByte, this.L));
                    }
                    readInt = z80Var.readInt() & Integer.MAX_VALUE;
                    this.R = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long b0 = z80Var.b0(k80Var, Math.min(j, i2));
                if (b0 != -1) {
                    this.X -= (int) b0;
                    return b0;
                }
            }
            return -1L;
        } while (readInt == i);
        e41.i("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

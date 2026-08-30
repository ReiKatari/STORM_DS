package wi;

import androidx.preference.Preference;
import fj.g0;
import fj.i0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s implements g0 {
    public final fj.g A;
    public int B;
    public int L;
    public int R;
    public int X;
    public int Y;

    public s(fj.g gVar) {
        gVar.getClass();
        this.A = gVar;
    }

    @Override // fj.g0
    public final i0 f() {
        return this.A.f();
    }

    @Override // fj.g0
    public final long k(fj.e eVar, long j2) {
        int i2;
        int readInt;
        eVar.getClass();
        do {
            int i10 = this.X;
            fj.g gVar = this.A;
            if (i10 == 0) {
                gVar.skip(this.Y);
                this.Y = 0;
                if ((this.L & 4) == 0) {
                    i2 = this.R;
                    int n10 = qi.e.n(gVar);
                    this.X = n10;
                    this.B = n10;
                    int readByte = gVar.readByte() & 255;
                    this.L = gVar.readByte() & 255;
                    Logger logger = t.R;
                    if (logger.isLoggable(Level.FINE)) {
                        fj.h hVar = i.f14253a;
                        logger.fine(i.b(true, this.R, this.B, readByte, this.L));
                    }
                    readInt = gVar.readInt() & Preference.DEFAULT_ORDER;
                    this.R = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long k10 = gVar.k(eVar, Math.min(j2, i10));
                if (k10 != -1) {
                    this.X -= (int) k10;
                    return k10;
                }
            }
            return -1L;
        } while (readInt == i2);
        fj.j.h("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

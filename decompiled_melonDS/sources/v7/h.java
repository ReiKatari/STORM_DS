package v7;

import android.content.Context;
import kf.s0;
import yb.n;
import yb.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements u7.c {
    public final Context A;
    public final String B;
    public final bk.a L;
    public final boolean R;
    public final boolean X;
    public final n Y;
    public boolean Z;

    public h(Context context, String str, bk.a aVar, boolean z10, boolean z11) {
        context.getClass();
        aVar.getClass();
        this.A = context;
        this.B = str;
        this.L = aVar;
        this.R = z10;
        this.X = z11;
        this.Y = new n(new s0(18, this));
    }

    @Override // u7.c
    public final b R() {
        return ((g) this.Y.getValue()).d(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.Y.B != v.f14812a) {
            ((g) this.Y.getValue()).close();
        }
    }

    @Override // u7.c
    public final String getDatabaseName() {
        return this.B;
    }

    @Override // u7.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.Y.B != v.f14812a) {
            ((g) this.Y.getValue()).setWriteAheadLoggingEnabled(z10);
        }
        this.Z = z10;
    }
}

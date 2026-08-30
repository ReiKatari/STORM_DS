package ih;

import android.view.Choreographer;
import java.util.Arrays;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements a, Choreographer.FrameCallback {
    public final x0 A;
    public int L;
    public long R;
    public long B = 16666666;
    public final long[] X = new long[11];

    public b(x0 x0Var) {
        this.A = x0Var;
    }

    @Override // ih.a
    public final void a() {
        Choreographer.getInstance().removeFrameCallback(this);
    }

    @Override // ih.a
    public final void b() {
        this.B = 16666666L;
        this.R = 0L;
        Choreographer.getInstance().postFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        long j10 = this.R;
        if (j10 > 0) {
            int i2 = this.L;
            int i10 = i2 + 1;
            this.L = i10;
            long[] jArr = this.X;
            jArr[i2] = j2 - j10;
            if (i10 == jArr.length) {
                if (jArr.length > 1) {
                    Arrays.sort(jArr);
                }
                this.B = jArr[jArr.length / 2];
                this.L = 0;
            }
        }
        this.R = j2;
        long j11 = this.B;
        Long valueOf = Long.valueOf(j11);
        Long l10 = null;
        if (j11 <= 13333333) {
            valueOf = null;
        }
        if (valueOf != null) {
            l10 = Long.valueOf(valueOf.longValue() + j2);
        }
        this.A.p(l10);
        Choreographer.getInstance().postFrameCallback(this);
    }
}

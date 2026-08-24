package defpackage;

import android.view.Choreographer;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pq0  reason: default package */
/* loaded from: classes.dex */
public final class pq0 implements oq0, Choreographer.FrameCallback {
    public final om2 A;
    public boolean B;
    public int R;
    public long X;
    public long L = 16666666;
    public final long[] Y = new long[11];

    public pq0(om2 om2Var) {
        this.A = om2Var;
    }

    @Override // defpackage.oq0
    public final void a() {
        this.B = false;
        Choreographer.getInstance().removeFrameCallback(this);
    }

    @Override // defpackage.oq0
    public final void b() {
        if (this.B) {
            return;
        }
        this.B = true;
        this.L = 16666666L;
        this.X = 0L;
        Choreographer.getInstance().postFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.B) {
            long j2 = this.X;
            if (j2 > 0) {
                int i = this.R;
                int i2 = i + 1;
                this.R = i2;
                long[] jArr = this.Y;
                jArr[i] = j - j2;
                if (i2 == jArr.length) {
                    if (jArr.length > 1) {
                        Arrays.sort(jArr);
                    }
                    this.L = jArr[jArr.length / 2];
                    this.R = 0;
                }
            }
            this.X = j;
            long j3 = this.L;
            Long valueOf = Long.valueOf(j3);
            Long l = null;
            if (j3 <= 13333333) {
                valueOf = null;
            }
            if (valueOf != null) {
                l = Long.valueOf(valueOf.longValue() + j);
            }
            this.A.a(l);
            if (this.B) {
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    }
}

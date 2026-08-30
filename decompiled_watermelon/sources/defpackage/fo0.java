package defpackage;

import android.view.Choreographer;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fo0  reason: default package */
/* loaded from: classes.dex */
public final class fo0 implements eo0, Choreographer.FrameCallback {
    public final oh2 A;
    public boolean B;
    public int R;
    public long X;
    public long L = 16666666;
    public final long[] Y = new long[11];

    public fo0(oh2 oh2Var) {
        this.A = oh2Var;
    }

    @Override // defpackage.eo0
    public final void a() {
        this.B = false;
        Choreographer.getInstance().removeFrameCallback(this);
    }

    @Override // defpackage.eo0
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

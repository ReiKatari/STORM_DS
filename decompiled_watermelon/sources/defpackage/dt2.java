package defpackage;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dt2  reason: default package */
/* loaded from: classes.dex */
public final class dt2 extends bt2 {
    public long X;
    public boolean Y;
    public final /* synthetic */ ht2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt2(ht2 ht2Var, hu2 hu2Var) {
        super(ht2Var, hu2Var);
        hu2Var.getClass();
        this.Z = ht2Var;
        this.X = -1L;
        this.Y = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
        if (r14 == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
        defpackage.iq2.g(16);
        r1 = java.lang.Integer.toString(r5, 16);
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f0, code lost:
        if (r18.Y == false) goto L70;
     */
    @Override // defpackage.bt2, defpackage.sb6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long L(defpackage.f60 r19, long r20) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt2.L(f60, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.L) {
            return;
        }
        if (this.Y) {
            TimeZone timeZone = ik7.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = ik7.f(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.Z.b.h();
                d(ht2.f);
            }
        }
        this.L = true;
    }
}

package defpackage;

import java.util.TimeZone;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ut2  reason: default package */
/* loaded from: classes.dex */
public final class ut2 implements sb6 {
    public final long A;
    public boolean B;
    public final f60 L = new Object();
    public final f60 R = new Object();
    public boolean X;
    public final /* synthetic */ wt2 Y;

    /* JADX WARN: Type inference failed for: r1v1, types: [f60, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [f60, java.lang.Object] */
    public ut2(wt2 wt2Var, long j, boolean z) {
        this.Y = wt2Var;
        this.A = j;
        this.B = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #2 {, blocks: (B:6:0x0010, B:8:0x001d, B:14:0x0027, B:48:0x00c5, B:18:0x0030, B:20:0x0036, B:22:0x003a, B:24:0x003e, B:28:0x004f, B:30:0x0053, B:32:0x005d, B:34:0x007a, B:36:0x008b, B:39:0x00a4, B:42:0x00ae, B:44:0x00b4, B:45:0x00c0, B:59:0x00e3, B:60:0x00ea), top: B:70:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053 A[Catch: all -> 0x004b, TryCatch #2 {, blocks: (B:6:0x0010, B:8:0x001d, B:14:0x0027, B:48:0x00c5, B:18:0x0030, B:20:0x0036, B:22:0x003a, B:24:0x003e, B:28:0x004f, B:30:0x0053, B:32:0x005d, B:34:0x007a, B:36:0x008b, B:39:0x00a4, B:42:0x00ae, B:44:0x00b4, B:45:0x00c0, B:59:0x00e3, B:60:0x00ea), top: B:70:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3 A[SYNTHETIC] */
    @Override // defpackage.sb6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long L(defpackage.f60 r28, long r29) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut2.L(f60, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        wt2 wt2Var = this.Y;
        synchronized (wt2Var) {
            this.X = true;
            f60 f60Var = this.R;
            j = f60Var.B;
            f60Var.w();
            wt2Var.notifyAll();
        }
        if (j > 0) {
            wt2 wt2Var2 = this.Y;
            TimeZone timeZone = ik7.a;
            wt2Var2.B.x(j);
        }
        this.Y.a();
    }

    @Override // defpackage.sb6
    public final kt6 f() {
        return this.Y.e0;
    }
}

package wi;

import fj.g0;
import fj.i0;
import java.util.TimeZone;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements g0 {
    public final long A;
    public boolean B;
    public final fj.e L = new Object();
    public final fj.e R = new Object();
    public boolean X;
    public final /* synthetic */ x Y;

    /* JADX WARN: Type inference failed for: r1v1, types: [fj.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [fj.e, java.lang.Object] */
    public v(x xVar, long j2, boolean z10) {
        this.Y = xVar;
        this.A = j2;
        this.B = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        x xVar = this.Y;
        synchronized (xVar) {
            this.X = true;
            fj.e eVar = this.R;
            j2 = eVar.B;
            eVar.t();
            xVar.notifyAll();
        }
        if (j2 > 0) {
            x xVar2 = this.Y;
            TimeZone timeZone = qi.g.f12552a;
            xVar2.B.v(j2);
        }
        this.Y.a();
    }

    @Override // fj.g0
    public final i0 f() {
        return this.Y.f14287d0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #2 {, blocks: (B:6:0x0010, B:8:0x001d, B:14:0x0027, B:47:0x00be, B:18:0x0030, B:20:0x0036, B:22:0x003a, B:24:0x003e, B:28:0x004f, B:30:0x0053, B:32:0x005d, B:34:0x007a, B:36:0x0089, B:38:0x009f, B:41:0x00a7, B:43:0x00ad, B:44:0x00b9, B:58:0x00dc, B:59:0x00e3), top: B:69:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053 A[Catch: all -> 0x004b, TryCatch #2 {, blocks: (B:6:0x0010, B:8:0x001d, B:14:0x0027, B:47:0x00be, B:18:0x0030, B:20:0x0036, B:22:0x003a, B:24:0x003e, B:28:0x004f, B:30:0x0053, B:32:0x005d, B:34:0x007a, B:36:0x0089, B:38:0x009f, B:41:0x00a7, B:43:0x00ad, B:44:0x00b9, B:58:0x00dc, B:59:0x00e3), top: B:69:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc A[SYNTHETIC] */
    @Override // fj.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k(fj.e r26, long r27) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.v.k(fj.e, long):long");
    }
}

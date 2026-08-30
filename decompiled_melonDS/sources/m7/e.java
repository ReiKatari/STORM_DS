package m7;

import kf.s0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements b {
    public final u A;
    public final u B;
    public final k0.g L;
    public final ThreadLocal R;
    public volatile boolean X;
    public final long Y;
    public final int Z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k0.g] */
    public e(final jb.c cVar, final String str, int i2) {
        str.getClass();
        this.L = new Object();
        this.R = new ThreadLocal();
        l7.a aVar = wc.b.B;
        this.Y = wc.j.l(30, wc.e.SECONDS);
        this.Z = 2;
        if (i2 > 0) {
            this.A = new u(i2, new mc.a() { // from class: m7.c
                @Override // mc.a
                public final Object b() {
                    switch (r3) {
                        case 0:
                            t7.a d4 = cVar.d(str);
                            zb.k.r(d4, "PRAGMA query_only = 1");
                            return d4;
                        default:
                            return cVar.d(str);
                    }
                }
            });
            this.B = new u(1, new mc.a() { // from class: m7.c
                @Override // mc.a
                public final Object b() {
                    switch (r3) {
                        case 0:
                            t7.a d4 = cVar.d(str);
                            zb.k.r(d4, "PRAGMA query_only = 1");
                            return d4;
                        default:
                            return cVar.d(str);
                    }
                }
            });
            return;
        }
        a0.j.h("Maximum number of readers must be greater than 0");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.X) {
            this.X = true;
            this.A.c();
            this.B.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #1 {all -> 0x01a6, blocks: (B:64:0x0123, B:69:0x013f, B:71:0x014a, B:86:0x01aa, B:87:0x01b1), top: B:109:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01aa A[Catch: all -> 0x01a6, TRY_ENTER, TryCatch #1 {all -> 0x01a6, blocks: (B:64:0x0123, B:69:0x013f, B:71:0x014a, B:86:0x01aa, B:87:0x01b1), top: B:109:0x0123 }] */
    /* JADX WARN: Type inference failed for: r6v1, types: [nc.t, java.lang.Object] */
    @Override // m7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(boolean r17, mc.p r18, ec.c r19) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.e.y(boolean, mc.p, ec.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k0.g] */
    public e(jb.c cVar) {
        this.L = new Object();
        this.R = new ThreadLocal();
        l7.a aVar = wc.b.B;
        this.Y = wc.j.l(30, wc.e.SECONDS);
        this.Z = 2;
        u uVar = new u(1, new s0(3, cVar));
        this.A = uVar;
        this.B = uVar;
    }
}

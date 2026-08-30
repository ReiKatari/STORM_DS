package kf;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a1 extends ec.j implements mc.p {
    public final /* synthetic */ b1 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, cc.c cVar) {
        super(2, cVar);
        this.X = b1Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        cc.c cVar = (cc.c) obj2;
        yb.y yVar = yb.y.f14813a;
        ((a1) t(cVar, (zc.u) obj)).v(yVar);
        return yVar;
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new a1(this.X, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0025 A[SYNTHETIC] */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r7) {
        /*
            r6 = this;
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            p7.j.I(r7)
            java.io.File r7 = new java.io.File
            kf.b1 r0 = r6.X
            android.content.Context r1 = r0.f8143a
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "layouts.json"
            r7.<init>(r1, r2)
            cd.q1 r1 = r0.f8147e     // Catch: java.lang.Exception -> L48
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> L48
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Exception -> L48
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L48
            r2.<init>()     // Catch: java.lang.Exception -> L48
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L48
        L25:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Exception -> L48
            if (r3 == 0) goto L51
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Exception -> L48
            sd.b r3 = (sd.b) r3     // Catch: java.lang.Exception -> L48
            boolean r4 = r3.f12867b     // Catch: java.lang.Exception -> L48
            if (r4 != 0) goto L4a
            java.lang.Object r3 = r3.f12866a     // Catch: java.lang.Exception -> L48
            r4 = r3
            ve.f r4 = (ve.f) r4     // Catch: java.lang.Exception -> L48
            ve.e r4 = r4.f13800c     // Catch: java.lang.Exception -> L48
            ve.e r5 = ve.e.DEFAULT     // Catch: java.lang.Exception -> L48
            if (r4 != r5) goto L41
            goto L4a
        L41:
            ve.f r3 = (ve.f) r3     // Catch: java.lang.Exception -> L48
            nf.b r3 = nf.b.a.a(r3)     // Catch: java.lang.Exception -> L48
            goto L4b
        L48:
            r7 = move-exception
            goto L6f
        L4a:
            r3 = 0
        L4b:
            if (r3 == 0) goto L25
            r2.add(r3)     // Catch: java.lang.Exception -> L48
            goto L25
        L51:
            ua.h r0 = r0.f8144b     // Catch: java.lang.Exception -> L48
            java.lang.String r0 = r0.e(r2)     // Catch: java.lang.Exception -> L48
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Exception -> L48
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L48
            r2.<init>(r7)     // Catch: java.lang.Exception -> L48
            r1.<init>(r2)     // Catch: java.lang.Exception -> L48
            r1.write(r0)     // Catch: java.lang.Throwable -> L68
            r1.close()     // Catch: java.lang.Exception -> L48
            goto L72
        L68:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            l0.f.f(r1, r7)     // Catch: java.lang.Exception -> L48
            throw r0     // Catch: java.lang.Exception -> L48
        L6f:
            r7.printStackTrace()
        L72:
            yb.y r7 = yb.y.f14813a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.a1.v(java.lang.Object):java.lang.Object");
    }
}

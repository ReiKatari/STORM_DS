package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hb2  reason: default package */
/* loaded from: classes.dex */
public final class hb2 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.xb2 B;

    public /* synthetic */ hb2(defpackage.xb2 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r5, defpackage.r41 r6) {
            r4 = this;
            int r6 = r4.A
            jg7 r0 = defpackage.jg7.a
            xb2 r4 = r4.B
            switch(r6) {
                case 0: goto L15;
                case 1: goto Lf;
                default: goto L9;
            }
        L9:
            pq5 r5 = (defpackage.pq5) r5
            defpackage.xb2.a(r4, r5)
            return r0
        Lf:
            pq5 r5 = (defpackage.pq5) r5
            defpackage.xb2.a(r4, r5)
            return r0
        L15:
            java.util.List r5 = (java.util.List) r5
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.v
            r1 = 1
            r2 = 0
            boolean r6 = r6.compareAndSet(r1, r2)
            if (r6 == 0) goto L22
            goto L6d
        L22:
            java.io.File r6 = new java.io.File
            android.content.Context r1 = r4.a
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "rom_data.json"
            r6.<init>(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L52
            r2 = 10
            int r2 = defpackage.ht0.v0(r5, r2)     // Catch: java.lang.Exception -> L52
            r1.<init>(r2)     // Catch: java.lang.Exception -> L52
            java.util.Iterator r2 = r5.iterator()     // Catch: java.lang.Exception -> L52
        L3e:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L52
            if (r3 == 0) goto L54
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L52
            pq5 r3 = (defpackage.pq5) r3     // Catch: java.lang.Exception -> L52
            mw5 r3 = defpackage.mw5.a.a(r3)     // Catch: java.lang.Exception -> L52
            r1.add(r3)     // Catch: java.lang.Exception -> L52
            goto L3e
        L52:
            r4 = move-exception
            goto L66
        L54:
            su2 r2 = r4.b     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = r2.f(r1)     // Catch: java.lang.Exception -> L52
            defpackage.xb2.E(r6, r1)     // Catch: java.lang.Exception -> L52
            r4.x(r5)     // Catch: java.lang.Exception -> L52
            jd6 r4 = r4.f     // Catch: java.lang.Exception -> L52
            r4.i()     // Catch: java.lang.Exception -> L52
            goto L6d
        L66:
            java.lang.String r5 = "FSRomsRepository"
            java.lang.String r6 = "Failed to save ROM data"
            android.util.Log.e(r5, r6, r4)
        L6d:
            return r0
    }
}

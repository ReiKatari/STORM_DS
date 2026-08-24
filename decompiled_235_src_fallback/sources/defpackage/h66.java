package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h66  reason: default package */
/* loaded from: classes.dex */
public abstract class h66 {
    public static final java.lang.String a = null;

    static {
            java.lang.String r0 = "Schedulers"
            java.lang.String r0 = defpackage.ga0.h(r0)
            defpackage.h66.a = r0
            return
    }

    public static void a(defpackage.dx7 r2, defpackage.q61 r3, java.util.List r4) {
            int r0 = r4.size()
            if (r0 <= 0) goto L23
            r3.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            java.util.Iterator r3 = r4.iterator()
        L11:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L23
            java.lang.Object r4 = r3.next()
            yw7 r4 = (defpackage.yw7) r4
            java.lang.String r4 = r4.a
            r2.e(r0, r4)
            goto L11
        L23:
            return
    }

    public static void b(defpackage.az0 r7, androidx.work.impl.WorkDatabase r8, java.util.List r9) {
            if (r9 == 0) goto Lae
            int r0 = r9.size()
            if (r0 != 0) goto La
            goto Lae
        La:
            dx7 r0 = r8.w()
            r8.b()
            m16 r1 = r0.a     // Catch: java.lang.Throwable -> La9
            m16 r2 = r0.a     // Catch: java.lang.Throwable -> La9
            rk7 r3 = new rk7     // Catch: java.lang.Throwable -> La9
            r4 = 17
            r3.<init>(r4)     // Catch: java.lang.Throwable -> La9
            r4 = 0
            r5 = 1
            java.lang.Object r1 = defpackage.hv.Q(r1, r5, r4, r3)     // Catch: java.lang.Throwable -> La9
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> La9
            q61 r3 = r7.d     // Catch: java.lang.Throwable -> La9
            a(r0, r3, r1)     // Catch: java.lang.Throwable -> La9
            int r3 = r7.k     // Catch: java.lang.Throwable -> La9
            mr3 r6 = new mr3     // Catch: java.lang.Throwable -> La9
            r6.<init>(r3)     // Catch: java.lang.Throwable -> La9
            java.lang.Object r3 = defpackage.hv.Q(r2, r5, r4, r6)     // Catch: java.lang.Throwable -> La9
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> La9
            q61 r7 = r7.d     // Catch: java.lang.Throwable -> La9
            a(r0, r7, r3)     // Catch: java.lang.Throwable -> La9
            r3.addAll(r1)     // Catch: java.lang.Throwable -> La9
            rk7 r7 = new rk7     // Catch: java.lang.Throwable -> La9
            r0 = 20
            r7.<init>(r0)     // Catch: java.lang.Throwable -> La9
            java.lang.Object r7 = defpackage.hv.Q(r2, r5, r4, r7)     // Catch: java.lang.Throwable -> La9
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> La9
            r8.p()     // Catch: java.lang.Throwable -> La9
            r8.f()
            int r8 = r3.size()
            if (r8 <= 0) goto L7d
            int r8 = r3.size()
            yw7[] r8 = new defpackage.yw7[r8]
            java.lang.Object[] r8 = r3.toArray(r8)
            yw7[] r8 = (defpackage.yw7[]) r8
            java.util.Iterator r0 = r9.iterator()
        L67:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r0.next()
            e66 r1 = (defpackage.e66) r1
            boolean r2 = r1.c()
            if (r2 == 0) goto L67
            r1.e(r8)
            goto L67
        L7d:
            int r8 = r7.size()
            if (r8 <= 0) goto Lae
            int r8 = r7.size()
            yw7[] r8 = new defpackage.yw7[r8]
            java.lang.Object[] r7 = r7.toArray(r8)
            yw7[] r7 = (defpackage.yw7[]) r7
            java.util.Iterator r8 = r9.iterator()
        L93:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lae
            java.lang.Object r9 = r8.next()
            e66 r9 = (defpackage.e66) r9
            boolean r0 = r9.c()
            if (r0 != 0) goto L93
            r9.e(r7)
            goto L93
        La9:
            r7 = move-exception
            r8.f()
            throw r7
        Lae:
            return
    }
}

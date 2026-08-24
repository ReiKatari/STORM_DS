package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: te3  reason: default package */
/* loaded from: classes.dex */
public abstract class te3 {
    public static final defpackage.x31 a = null;

    static {
            x31 r0 = new x31
            r1 = 1
            r0.<init>(r1)
            defpackage.te3.a = r0
            return
    }

    public static final int a(defpackage.wb6 r5, defpackage.id3 r6, java.lang.String r7) {
            r5.getClass()
            r6.getClass()
            r7.getClass()
            d(r6, r5)
            int r0 = r5.d(r7)
            r1 = -3
            if (r0 == r1) goto L14
            goto L1a
        L14:
            td3 r2 = r6.a
            boolean r2 = r2.e
            if (r2 != 0) goto L1b
        L1a:
            return r0
        L1b:
            d51 r0 = r6.c
            ci2 r2 = new ci2
            r3 = 6
            r2.<init>(r3, r5, r6)
            r0.getClass()
            java.lang.Object r6 = r0.B
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            java.lang.Object r0 = r6.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            x31 r3 = defpackage.te3.a
            r4 = 0
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r0.get(r3)
            goto L3b
        L3a:
            r0 = r4
        L3b:
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            r4 = r0
        L3f:
            if (r4 == 0) goto L42
            goto L5a
        L42:
            java.lang.Object r4 = r2.c()
            java.lang.Object r0 = r6.get(r5)
            if (r0 != 0) goto L55
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r2 = 2
            r0.<init>(r2)
            r6.put(r5, r0)
        L55:
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r3, r4)
        L5a:
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r4.get(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L69
            int r5 = r5.intValue()
            return r5
        L69:
            return r1
    }

    public static final int b(defpackage.wb6 r1, defpackage.id3 r2, java.lang.String r3, java.lang.String r4) {
            r1.getClass()
            r2.getClass()
            r3.getClass()
            int r2 = a(r1, r2, r3)
            r0 = -3
            if (r2 == r0) goto L11
            return r2
        L11:
            fc6 r2 = new fc6
            java.lang.String r1 = r1.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " does not contain element with name '"
            r0.append(r1)
            r0.append(r3)
            r1 = 39
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final boolean c(defpackage.id3 r0, defpackage.wb6 r1) {
            r1.getClass()
            r0.getClass()
            td3 r0 = r0.a
            boolean r0 = r0.a
            if (r0 != 0) goto L30
            java.util.List r0 = r1.getAnnotations()
            if (r0 == 0) goto L19
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L19
            goto L2e
        L19:
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            java.lang.annotation.Annotation r1 = (java.lang.annotation.Annotation) r1
            boolean r1 = r1 instanceof defpackage.oe3
            if (r1 == 0) goto L1d
            goto L30
        L2e:
            r0 = 0
            return r0
        L30:
            r0 = 1
            return r0
    }

    public static final void d(defpackage.id3 r0, defpackage.wb6 r1) {
            r1.getClass()
            r0.getClass()
            np2 r0 = r1.e()
            bt6 r1 = defpackage.bt6.e
            defpackage.nb3.k(r0, r1)
            return
    }
}

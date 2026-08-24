package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tc6  reason: default package */
/* loaded from: classes.dex */
public final class tc6 {
    public final java.util.Collection a;
    public final boolean b;
    public final defpackage.ex6 c;
    public final defpackage.ex6 d;
    public final defpackage.ex6 e;
    public final defpackage.ex6 f;
    public final defpackage.ex6 g;

    public tc6(java.util.Collection r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            sc6 r1 = new sc6
            r2 = 0
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.c = r2
            sc6 r1 = new sc6
            r2 = 1
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.d = r2
            sc6 r1 = new sc6
            r2 = 2
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.e = r2
            sc6 r1 = new sc6
            r2 = 3
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.f = r2
            sc6 r1 = new sc6
            r2 = 4
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.g = r2
            return
    }

    public final void a(defpackage.ig1 r6) {
            r5 = this;
            r6.getClass()
            java.lang.String r0 = "CXCP"
            boolean r1 = defpackage.kj2.F(r0)
            if (r1 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unavailable "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = ", notify SessionConfig invalid"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L21:
            java.util.Collection r0 = r5.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L52
            java.lang.Object r1 = r0.next()
            r3 = r1
            di7 r3 = (defpackage.di7) r3
            r3.getClass()
            boolean r4 = r5.b
            if (r4 == 0) goto L44
            rc6 r3 = r3.o
        L40:
            r3.getClass()
            goto L47
        L44:
            rc6 r3 = r3.p
            goto L40
        L47:
            java.util.List r3 = r3.b()
            boolean r3 = r3.contains(r6)
            if (r3 == 0) goto L29
            goto L53
        L52:
            r1 = r2
        L53:
            di7 r1 = (defpackage.di7) r1
            if (r1 == 0) goto L5a
            rc6 r5 = r1.o
            goto L5b
        L5a:
            r5 = r2
        L5b:
            xe1 r6 = defpackage.xk1.a
            jv2 r6 = defpackage.e04.a
            jv2 r6 = r6.Y
            o41 r6 = defpackage.g04.i(r6)
            y3 r0 = new y3
            r1 = 15
            r0.<init>(r5, r2, r1)
            r5 = 3
            defpackage.hv.L(r6, r2, r2, r0, r5)
            return
    }
}

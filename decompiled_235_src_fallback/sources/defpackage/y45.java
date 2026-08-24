package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y45  reason: default package */
/* loaded from: classes.dex */
public final class y45 {
    public static final defpackage.y45 c = null;
    public final defpackage.os0 a;
    public final java.util.concurrent.ConcurrentHashMap b;

    static {
            y45 r0 = new y45
            r0.<init>()
            defpackage.y45.c = r0
            return
    }

    public y45() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.b = r0
            os0 r0 = new os0
            r1 = 1
            r0.<init>(r1)
            r2.a = r0
            return
    }

    public final defpackage.j66 a(java.lang.Class r11) {
            r10 = this;
            java.lang.String r0 = "messageType"
            defpackage.aa3.a(r11, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r10.b
            java.lang.Object r1 = r0.get(r11)
            j66 r1 = (defpackage.j66) r1
            if (r1 != 0) goto Ld6
            os0 r10 = r10.a
            r10.getClass()
            java.lang.Class r1 = defpackage.m66.a
            java.lang.Class<pr2> r1 = defpackage.pr2.class
            boolean r2 = r1.isAssignableFrom(r11)
            r3 = 0
            if (r2 != 0) goto L30
            java.lang.Class r2 = defpackage.m66.a
            if (r2 == 0) goto L30
            boolean r2 = r2.isAssignableFrom(r11)
            if (r2 == 0) goto L2a
            goto L30
        L2a:
            java.lang.String r10 = "Message classes must extend GeneratedMessage or GeneratedMessageLite"
            defpackage.i.h(r10)
            return r3
        L30:
            java.lang.Object r10 = r10.B
            l04 r10 = (defpackage.l04) r10
            wd5 r4 = r10.a(r11)
            int r10 = r4.d
            r2 = 2
            r10 = r10 & r2
            r5 = 1
            if (r10 != r2) goto L41
            r10 = r5
            goto L42
        L41:
            r10 = 0
        L42:
            java.lang.String r2 = "Protobuf runtime is not correctly loaded."
            if (r10 == 0) goto L6b
            boolean r10 = r1.isAssignableFrom(r11)
            if (r10 == 0) goto L59
            ng7 r10 = defpackage.m66.d
            i82 r1 = defpackage.j82.a
            c1 r2 = r4.a
            j54 r3 = new j54
            r3.<init>(r10, r1, r2)
            goto Lcc
        L59:
            ng7 r10 = defpackage.m66.b
            i82 r1 = defpackage.j82.b
            if (r1 == 0) goto L67
            c1 r2 = r4.a
            j54 r3 = new j54
            r3.<init>(r10, r1, r2)
            goto Lcc
        L67:
            defpackage.i.m(r2)
            return r3
        L6b:
            boolean r10 = r1.isAssignableFrom(r11)
            if (r10 == 0) goto L9c
            int r10 = r4.d
            r10 = r10 & r5
            if (r10 != r5) goto L79
            u45 r10 = defpackage.u45.PROTO2
            goto L7b
        L79:
            u45 r10 = defpackage.u45.PROTO3
        L7b:
            u45 r1 = defpackage.u45.PROTO2
            if (r10 != r1) goto L8e
            mf4 r5 = defpackage.nf4.b
            nw3 r6 = defpackage.ow3.b
            ng7 r7 = defpackage.m66.d
            i82 r8 = defpackage.j82.a
            y04 r9 = defpackage.z04.b
            i54 r3 = defpackage.i54.y(r4, r5, r6, r7, r8, r9)
            goto Lcc
        L8e:
            mf4 r5 = defpackage.nf4.b
            nw3 r6 = defpackage.ow3.b
            ng7 r7 = defpackage.m66.d
            r8 = 0
            y04 r9 = defpackage.z04.b
            i54 r3 = defpackage.i54.y(r4, r5, r6, r7, r8, r9)
            goto Lcc
        L9c:
            int r10 = r4.d
            r10 = r10 & r5
            if (r10 != r5) goto La4
            u45 r10 = defpackage.u45.PROTO2
            goto La6
        La4:
            u45 r10 = defpackage.u45.PROTO3
        La6:
            u45 r1 = defpackage.u45.PROTO2
            if (r10 != r1) goto Lbf
            mf4 r5 = defpackage.nf4.a
            mw3 r6 = defpackage.ow3.a
            ng7 r7 = defpackage.m66.b
            i82 r8 = defpackage.j82.b
            if (r8 == 0) goto Lbb
            y04 r9 = defpackage.z04.a
            i54 r3 = defpackage.i54.y(r4, r5, r6, r7, r8, r9)
            goto Lcc
        Lbb:
            defpackage.i.m(r2)
            return r3
        Lbf:
            mf4 r5 = defpackage.nf4.a
            mw3 r6 = defpackage.ow3.a
            ng7 r7 = defpackage.m66.c
            r8 = 0
            y04 r9 = defpackage.z04.a
            i54 r3 = defpackage.i54.y(r4, r5, r6, r7, r8, r9)
        Lcc:
            java.lang.Object r10 = r0.putIfAbsent(r11, r3)
            j66 r10 = (defpackage.j66) r10
            if (r10 == 0) goto Ld5
            return r10
        Ld5:
            return r3
        Ld6:
            return r1
    }
}

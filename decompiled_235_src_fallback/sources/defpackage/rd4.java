package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rd4  reason: default package */
/* loaded from: classes.dex */
public final class rd4 {
    public static final java.util.LinkedHashMap b = null;
    public final java.util.LinkedHashMap a;

    static {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            defpackage.rd4.b = r0
            return
    }

    public rd4() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.a = r0
            return
    }

    public final void a(defpackage.qd4 r6) {
            r5 = this;
            r6.getClass()
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = defpackage.xk2.o(r0)
            int r1 = r0.length()
            if (r1 <= 0) goto L41
            java.util.LinkedHashMap r5 = r5.a
            java.lang.Object r1 = r5.get(r0)
            qd4 r1 = (defpackage.qd4) r1
            boolean r2 = defpackage.nb3.k(r1, r6)
            if (r2 == 0) goto L20
            return
        L20:
            java.lang.String r2 = "Navigator "
            if (r1 == 0) goto L30
            boolean r3 = r1.b
            r4 = 1
            if (r3 == r4) goto L2a
            goto L30
        L2a:
            java.lang.String r5 = " is replacing an already attached "
            defpackage.u34.l(r2, r6, r5, r1)
            return
        L30:
            boolean r1 = r6.b
            if (r1 != 0) goto L3b
            java.lang.Object r5 = r5.put(r0, r6)
            qd4 r5 = (defpackage.qd4) r5
            return
        L3b:
            java.lang.String r5 = " is already attached to another NavController"
            defpackage.e41.g(r6, r5, r2)
            return
        L41:
            java.lang.String r5 = "navigator name cannot be an empty string"
            defpackage.i.h(r5)
            return
    }

    public final defpackage.qd4 b(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            int r0 = r3.length()
            r1 = 0
            if (r0 <= 0) goto L21
            java.util.LinkedHashMap r2 = r2.a
            java.lang.Object r2 = r2.get(r3)
            qd4 r2 = (defpackage.qd4) r2
            if (r2 == 0) goto L15
            return r2
        L15:
            java.lang.String r2 = "Could not find Navigator with name \""
            java.lang.String r0 = "\". You must call NavController.addNavigator() for each navigation type."
            java.lang.String r2 = defpackage.lb1.A(r2, r3, r0)
            defpackage.i.m(r2)
            return r1
        L21:
            java.lang.String r2 = "navigator name cannot be an empty string"
            defpackage.i.h(r2)
            return r1
    }
}

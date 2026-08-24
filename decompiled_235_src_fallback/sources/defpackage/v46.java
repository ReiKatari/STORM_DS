package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v46  reason: default package */
/* loaded from: classes.dex */
public final class v46 {
    public final java.util.LinkedHashMap a;
    public final defpackage.s9 b;

    public v46() {
            r2 = this;
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.a = r0
            s9 r0 = new s9
            zt1 r1 = defpackage.zt1.A
            r0.<init>(r1)
            r2.b = r0
            return
    }

    public v46(defpackage.p04 r2) {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.a = r0
            s9 r0 = new s9
            r0.<init>(r2)
            r1.b = r0
            return
    }

    public final java.lang.Object a(java.lang.String r4) {
            r3 = this;
            s9 r3 = r3.b
            java.lang.Object r0 = r3.a
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r1 = r3.d
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.ClassCastException -> L1f
            tp6 r2 = (defpackage.tp6) r2     // Catch: java.lang.ClassCastException -> L1f
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.ClassCastException -> L1f
            if (r2 != 0) goto L19
            goto L1a
        L19:
            return r2
        L1a:
            java.lang.Object r3 = r0.get(r4)     // Catch: java.lang.ClassCastException -> L1f
            return r3
        L1f:
            r0.remove(r4)
            java.lang.Object r3 = r3.c
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            r3.remove(r4)
            r1.remove(r4)
            r3 = 0
            return r3
    }

    public final defpackage.de5 b(java.lang.String r4) {
            r3 = this;
            s9 r3 = r3.b
            java.lang.Object r0 = r3.d
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            boolean r0 = r0.containsKey(r4)
            java.lang.Object r1 = r3.a
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            r2 = 0
            if (r0 == 0) goto L37
            java.lang.Object r3 = r3.d
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            java.lang.Object r0 = r3.get(r4)
            if (r0 != 0) goto L2f
            boolean r0 = r1.containsKey(r4)
            if (r0 != 0) goto L24
            r1.put(r4, r2)
        L24:
            java.lang.Object r0 = r1.get(r4)
            tp6 r0 = defpackage.up6.a(r0)
            r3.put(r4, r0)
        L2f:
            tp6 r0 = (defpackage.tp6) r0
            de5 r3 = new de5
            r3.<init>(r0)
            return r3
        L37:
            java.lang.Object r3 = r3.c
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            java.lang.Object r0 = r3.get(r4)
            if (r0 != 0) goto L55
            boolean r0 = r1.containsKey(r4)
            if (r0 != 0) goto L4a
            r1.put(r4, r2)
        L4a:
            java.lang.Object r0 = r1.get(r4)
            tp6 r0 = defpackage.up6.a(r0)
            r3.put(r4, r0)
        L55:
            tp6 r0 = (defpackage.tp6) r0
            de5 r3 = new de5
            r3.<init>(r0)
            return r3
    }

    public final void c(java.lang.Object r5, java.lang.String r6) {
            r4 = this;
            if (r5 == 0) goto L2e
            java.util.ArrayList r0 = defpackage.x46.a
            if (r0 == 0) goto Lc
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L22
        Lc:
            int r1 = r0.size()
            r2 = 0
        L11:
            if (r2 >= r1) goto L22
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isInstance(r5)
            if (r3 == 0) goto L11
            goto L30
        L22:
            java.lang.Class r4 = r5.getClass()
            java.lang.String r5 = " into saved state"
            java.lang.String r6 = "Can't put value with type "
            defpackage.u34.A(r4, r5, r6)
            return
        L2e:
            java.util.ArrayList r0 = defpackage.x46.a
        L30:
            java.util.LinkedHashMap r0 = r4.a
            java.lang.Object r0 = r0.get(r6)
            boolean r1 = r0 instanceof defpackage.s94
            if (r1 == 0) goto L3d
            s94 r0 = (defpackage.s94) r0
            goto L3e
        L3d:
            r0 = 0
        L3e:
            if (r0 == 0) goto L43
            r0.f(r5)
        L43:
            s9 r4 = r4.b
            r4.G(r5, r6)
            return
    }
}

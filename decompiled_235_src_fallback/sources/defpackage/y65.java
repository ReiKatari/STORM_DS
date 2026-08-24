package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y65  reason: default package */
/* loaded from: classes.dex */
public final class y65 {
    public final java.util.ArrayList a;

    public y65(java.util.ArrayList r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public static java.lang.String d(defpackage.y65 r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r4 = r4.a
            int r1 = r4.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L22
            java.lang.Object r3 = r4.get(r2)
            int r2 = r2 + 1
            u65 r3 = (defpackage.u65) r3
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r0.add(r3)
            goto Lc
        L22:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
        L31:
            java.lang.Object r1 = r0.next()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4.append(r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.String r1 = " | "
            r4.append(r1)
            goto L31
        L46:
            java.lang.String r4 = r4.toString()
            return r4
    }

    public final boolean a(java.lang.Class r5) {
            r4 = this;
            java.util.ArrayList r4 = r4.a
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1e
            java.lang.Object r3 = r4.get(r2)
            int r2 = r2 + 1
            u65 r3 = (defpackage.u65) r3
            java.lang.Class r3 = r3.getClass()
            boolean r3 = r5.isAssignableFrom(r3)
            if (r3 == 0) goto L8
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public final defpackage.u65 b(java.lang.Class r5) {
            r4 = this;
            java.util.ArrayList r4 = r4.a
            int r0 = r4.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L18
            java.lang.Object r2 = r4.get(r1)
            int r1 = r1 + 1
            u65 r2 = (defpackage.u65) r2
            java.lang.Class r3 = r2.getClass()
            if (r3 != r5) goto L7
            return r2
        L18:
            r4 = 0
            return r4
    }

    public final java.util.ArrayList c(java.lang.Class r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r5 = r5.a
            int r1 = r5.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L24
            java.lang.Object r3 = r5.get(r2)
            int r2 = r2 + 1
            u65 r3 = (defpackage.u65) r3
            java.lang.Class r4 = r3.getClass()
            boolean r4 = r6.isAssignableFrom(r4)
            if (r4 == 0) goto Lc
            r0.add(r3)
            goto Lc
        L24:
            return r0
    }
}

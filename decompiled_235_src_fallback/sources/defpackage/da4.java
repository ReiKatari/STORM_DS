package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: da4  reason: default package */
/* loaded from: classes.dex */
public final class da4 extends defpackage.go4 {
    public static final defpackage.xy0 R = null;

    static {
            xy0 r0 = defpackage.xy0.OPTIONAL
            defpackage.da4.R = r0
            return
    }

    public static defpackage.da4 d() {
            da4 r0 = new da4
            java.util.TreeMap r1 = new java.util.TreeMap
            bk r2 = defpackage.go4.B
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static defpackage.da4 k(defpackage.yy0 r7) {
            java.util.TreeMap r0 = new java.util.TreeMap
            bk r1 = defpackage.go4.B
            r0.<init>(r1)
            java.util.Set r1 = r7.c()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.next()
            xx r2 = (defpackage.xx) r2
            java.util.Set r3 = r7.f(r2)
            android.util.ArrayMap r4 = new android.util.ArrayMap
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L28:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L3c
            java.lang.Object r5 = r3.next()
            xy0 r5 = (defpackage.xy0) r5
            java.lang.Object r6 = r7.g(r2, r5)
            r4.put(r5, r6)
            goto L28
        L3c:
            r0.put(r2, r4)
            goto Lf
        L40:
            da4 r7 = new da4
            r7.<init>(r0)
            return r7
    }

    public final void l(defpackage.xx r5, defpackage.xy0 r6, java.lang.Object r7) {
            r4 = this;
            java.util.TreeMap r4 = r4.A
            java.lang.Object r0 = r4.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L16
            android.util.ArrayMap r0 = new android.util.ArrayMap
            r0.<init>()
            r4.put(r5, r0)
            r0.put(r6, r7)
            return
        L16:
            java.util.Set r4 = r0.keySet()
            java.lang.Object r4 = java.util.Collections.min(r4)
            xy0 r4 = (defpackage.xy0) r4
            java.lang.Object r1 = r0.get(r4)
            boolean r1 = java.util.Objects.equals(r1, r7)
            if (r1 != 0) goto L69
            xy0 r1 = defpackage.xy0.REQUIRED
            if (r4 != r1) goto L69
            if (r6 == r1) goto L31
            goto L69
        L31:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Option values conflicts: "
            r2.<init>(r3)
            java.lang.String r5 = r5.a
            r2.append(r5)
            java.lang.String r5 = ", existing value ("
            r2.append(r5)
            r2.append(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r5 = ")="
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = ", conflicting ("
            r2.append(r4)
            r2.append(r6)
            r2.append(r5)
            r2.append(r7)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L69:
            r0.put(r6, r7)
            return
    }

    public final void m(defpackage.xx r2, java.lang.Object r3) {
            r1 = this;
            xy0 r0 = defpackage.da4.R
            r1.l(r2, r0, r3)
            return
    }

    public final void n(defpackage.xx r1) {
            r0 = this;
            java.util.TreeMap r0 = r0.A
            r0.remove(r1)
            return
    }
}

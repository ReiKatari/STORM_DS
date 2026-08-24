package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: go4  reason: default package */
/* loaded from: classes.dex */
public class go4 implements defpackage.yy0 {
    public static final defpackage.bk B = null;
    public static final defpackage.go4 L = null;
    public final java.util.TreeMap A;

    static {
            bk r0 = new bk
            r1 = 7
            r0.<init>(r1)
            defpackage.go4.B = r0
            go4 r1 = new go4
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>(r0)
            r1.<init>(r2)
            defpackage.go4.L = r1
            return
    }

    public go4(java.util.TreeMap r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    public static defpackage.go4 a(defpackage.yy0 r7) {
            java.lang.Class<go4> r0 = defpackage.go4.class
            java.lang.Class r1 = r7.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            go4 r7 = (defpackage.go4) r7
            return r7
        Lf:
            java.util.TreeMap r0 = new java.util.TreeMap
            bk r1 = defpackage.go4.B
            r0.<init>(r1)
            java.util.Set r1 = r7.c()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r1.next()
            xx r2 = (defpackage.xx) r2
            java.util.Set r3 = r7.f(r2)
            android.util.ArrayMap r4 = new android.util.ArrayMap
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L37:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L4b
            java.lang.Object r5 = r3.next()
            xy0 r5 = (defpackage.xy0) r5
            java.lang.Object r6 = r7.g(r2, r5)
            r4.put(r5, r6)
            goto L37
        L4b:
            r0.put(r2, r4)
            goto L1e
        L4f:
            go4 r7 = new go4
            r7.<init>(r0)
            return r7
    }

    @Override // defpackage.yy0
    public final java.lang.Object b(defpackage.xx r1, java.lang.Object r2) {
            r0 = this;
            java.util.TreeMap r0 = r0.A
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto Lb
            return r2
        Lb:
            java.util.Set r1 = r0.keySet()
            java.lang.Object r1 = java.util.Collections.min(r1)
            xy0 r1 = (defpackage.xy0) r1
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // defpackage.yy0
    public final java.util.Set c() {
            r0 = this;
            java.util.TreeMap r0 = r0.A
            java.util.Set r0 = r0.keySet()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @Override // defpackage.yy0
    public final java.lang.Object e(defpackage.xx r1) {
            r0 = this;
            java.util.TreeMap r0 = r0.A
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L19
            java.util.Set r1 = r0.keySet()
            java.lang.Object r1 = java.util.Collections.min(r1)
            xy0 r1 = (defpackage.xy0) r1
            java.lang.Object r0 = r0.get(r1)
            return r0
        L19:
            java.lang.String r0 = "Option does not exist: "
            defpackage.e41.w(r1, r0)
            r0 = 0
            return r0
    }

    @Override // defpackage.yy0
    public final java.util.Set f(defpackage.xx r1) {
            r0 = this;
            java.util.TreeMap r0 = r0.A
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto Ld
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
        Ld:
            java.util.Set r0 = r0.keySet()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @Override // defpackage.yy0
    public final java.lang.Object g(defpackage.xx r4, defpackage.xy0 r5) {
            r3 = this;
            java.util.TreeMap r3 = r3.A
            java.lang.Object r3 = r3.get(r4)
            java.util.Map r3 = (java.util.Map) r3
            r0 = 0
            java.lang.String r1 = "Option does not exist: "
            if (r3 == 0) goto L1e
            boolean r2 = r3.containsKey(r5)
            if (r2 == 0) goto L18
            java.lang.Object r3 = r3.get(r5)
            return r3
        L18:
            java.lang.String r3 = " with priority="
            defpackage.fa6.f(r1, r4, r3, r5)
            return r0
        L1e:
            defpackage.e41.w(r4, r1)
            return r0
    }

    @Override // defpackage.yy0
    public final void h(defpackage.pk0 r6) {
            r5 = this;
            xx r0 = new xx
            java.lang.String r1 = "camera2.captureRequest.option."
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.TreeMap r5 = r5.A
            java.util.SortedMap r5 = r5.tailMap(r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            xx r2 = (defpackage.xx) r2
            java.lang.String r2 = r2.a
            boolean r2 = r2.startsWith(r1)
            if (r2 != 0) goto L33
            goto L52
        L33:
            java.lang.Object r0 = r0.getKey()
            xx r0 = (defpackage.xx) r0
            java.lang.Object r2 = r6.B
            jd0 r2 = (defpackage.jd0) r2
            java.lang.Object r3 = r6.L
            yy0 r3 = (defpackage.yy0) r3
            r0.getClass()
            da4 r2 = r2.B
            xy0 r4 = r3.j(r0)
            java.lang.Object r3 = r3.e(r0)
            r2.l(r0, r4, r3)
            goto L18
        L52:
            return
    }

    @Override // defpackage.yy0
    public final boolean i(defpackage.xx r1) {
            r0 = this;
            java.util.TreeMap r0 = r0.A
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // defpackage.yy0
    public final defpackage.xy0 j(defpackage.xx r1) {
            r0 = this;
            java.util.TreeMap r0 = r0.A
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L15
            java.util.Set r0 = r0.keySet()
            java.lang.Object r0 = java.util.Collections.min(r0)
            xy0 r0 = (defpackage.xy0) r0
            return r0
        L15:
            java.lang.String r0 = "Option does not exist: "
            defpackage.e41.w(r1, r0)
            r0 = 0
            return r0
    }
}

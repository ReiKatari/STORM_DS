package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s36  reason: default package */
/* loaded from: classes.dex */
public class s36 implements java.lang.Iterable {
    public defpackage.p36 A;
    public defpackage.p36 B;
    public final java.util.WeakHashMap L;
    public int R;

    public s36() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.L = r0
            r0 = 0
            r1.R = r0
            return
    }

    public defpackage.p36 a(java.lang.Object r2) {
            r1 = this;
            p36 r1 = r1.A
        L2:
            if (r1 == 0) goto L10
            java.lang.Object r0 = r1.A
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld
            goto L10
        Ld:
            p36 r1 = r1.L
            goto L2
        L10:
            return r1
    }

    public java.lang.Object b(java.lang.Object r4) {
            r3 = this;
            p36 r4 = r3.a(r4)
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            int r1 = r3.R
            int r1 = r1 + (-1)
            r3.R = r1
            java.util.WeakHashMap r1 = r3.L
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L2e
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            r36 r2 = (defpackage.r36) r2
            r2.a(r4)
            goto L1e
        L2e:
            p36 r1 = r4.R
            p36 r2 = r4.L
            if (r1 == 0) goto L37
            r1.L = r2
            goto L39
        L37:
            r3.A = r2
        L39:
            p36 r2 = r4.L
            if (r2 == 0) goto L40
            r2.R = r1
            goto L42
        L40:
            r3.B = r1
        L42:
            r4.L = r0
            r4.R = r0
            java.lang.Object r3 = r4.B
            return r3
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.s36
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            s36 r6 = (defpackage.s36) r6
            int r1 = r5.R
            int r3 = r6.R
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            o36 r1 = (defpackage.o36) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            o36 r3 = (defpackage.o36) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            o36 r6 = (defpackage.o36) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L5:
            r1 = r3
            o36 r1 = (defpackage.o36) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            goto L5
        L1a:
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r4 = this;
            o36 r0 = new o36
            p36 r1 = r4.A
            p36 r2 = r4.B
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.WeakHashMap r4 = r4.L
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.put(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lb:
            r1 = r3
            o36 r1 = (defpackage.o36) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto Lb
            java.lang.String r1 = ", "
            r0.append(r1)
            goto Lb
        L2d:
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}

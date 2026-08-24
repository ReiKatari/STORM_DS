package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mh0  reason: default package */
/* loaded from: classes.dex */
public final class mh0 {
    public static final defpackage.mh0 b = null;
    public static final defpackage.mh0 c = null;
    public final java.util.LinkedHashSet a;

    static {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            lt3 r1 = new lt3
            r2 = 0
            r1.<init>(r2)
            r0.add(r1)
            mh0 r1 = new mh0
            r1.<init>(r0)
            defpackage.mh0.b = r1
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            lt3 r1 = new lt3
            r2 = 1
            r1.<init>(r2)
            r0.add(r1)
            mh0 r1 = new mh0
            r1.<init>(r0)
            defpackage.mh0.c = r1
            return
    }

    public mh0(java.util.LinkedHashSet r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final java.util.ArrayList a(java.util.ArrayList r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            java.util.LinkedHashSet r6 = r6.a
            java.util.Iterator r6 = r6.iterator()
        Lb:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r6.next()
            lt3 r1 = (defpackage.lt3) r1
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L46
            java.lang.Object r3 = r0.next()
            zf0 r3 = (defpackage.zf0) r3
            boolean r4 = r3 instanceof defpackage.cg0
            java.lang.String r5 = "The camera info doesn't contain internal implementation."
            defpackage.np2.s(r5, r4)
            int r4 = r3.m()
            int r5 = r1.a
            if (r4 != r5) goto L27
            r2.add(r3)
            goto L27
        L46:
            r0 = r2
            goto Lb
        L48:
            r0.retainAll(r7)
            return r0
    }

    public final java.lang.Integer b() {
            r4 = this;
            java.util.LinkedHashSet r4 = r4.a
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
            r1 = r0
        L8:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r4.next()
            lt3 r2 = (defpackage.lt3) r2
            boolean r3 = r2 instanceof defpackage.lt3
            if (r3 == 0) goto L8
            int r2 = r2.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            if (r1 != 0) goto L22
            r1 = r2
            goto L8
        L22:
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L29
            goto L8
        L29:
            java.lang.String r4 = "Multiple conflicting lens facing requirements exist."
            defpackage.i.m(r4)
            return r0
        L2f:
            return r1
    }

    public final defpackage.eg0 c(java.util.LinkedHashSet r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            eg0 r2 = (defpackage.eg0) r2
            zf0 r2 = r2.a()
            r0.add(r2)
            goto L9
        L1d:
            java.util.ArrayList r0 = r5.a(r0)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r2 = r6.iterator()
        L2a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()
            eg0 r3 = (defpackage.eg0) r3
            zf0 r4 = r3.a()
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L2a
            r1.add(r3)
            goto L2a
        L44:
            java.util.Iterator r0 = r1.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r5 = r0.next()
            eg0 r5 = (defpackage.eg0) r5
            return r5
        L55:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cams:"
            r0.<init>(r1)
            int r1 = r6.size()
            r0.append(r1)
            java.util.Iterator r6 = r6.iterator()
        L67:
            boolean r1 = r6.hasNext()
            java.lang.String r2 = " Id:"
            if (r1 == 0) goto L99
            java.lang.Object r1 = r6.next()
            eg0 r1 = (defpackage.eg0) r1
            cg0 r1 = r1.q()
            java.lang.String r3 = r1.d()
            int r1 = r1.m()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r3)
            java.lang.String r2 = "  Lens:"
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            goto L67
        L99:
            java.lang.String r6 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.LinkedHashSet r5 = r5.a
            int r1 = r5.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "PhyId:null  Filters:"
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.util.Iterator r5 = r5.iterator()
        Lbd:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Le3
            java.lang.Object r1 = r5.next()
            lt3 r1 = (defpackage.lt3) r1
            r0.append(r2)
            r1.getClass()
            ky r3 = defpackage.lt3.b
            r0.append(r3)
            boolean r3 = r1 instanceof defpackage.lt3
            if (r3 == 0) goto Lbd
            java.lang.String r3 = " LensFilter:"
            r0.append(r3)
            int r1 = r1.a
            r0.append(r1)
            goto Lbd
        Le3:
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No available camera can be found. "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " "
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r5)
            throw r6
    }
}

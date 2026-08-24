package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ps4  reason: default package */
/* loaded from: classes.dex */
public final class ps4 implements java.lang.Iterable, defpackage.zf3 {
    public static final defpackage.ps4 B = null;
    public final java.util.Map A;

    static {
            ps4 r0 = new ps4
            zt1 r1 = defpackage.zt1.A
            r0.<init>(r1)
            defpackage.ps4.B = r0
            return
    }

    public ps4(java.util.Map r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof defpackage.ps4
            if (r1 == 0) goto L15
            ps4 r3 = (defpackage.ps4) r3
            java.util.Map r3 = r3.A
            java.util.Map r2 = r2.A
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L15
            return r0
        L15:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            java.util.Map r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map r4 = r4.A
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            r3 = 0
            if (r1 != 0) goto L35
            vr4 r1 = new vr4
            r1.<init>(r2, r3)
            r0.add(r1)
            goto L13
        L35:
            defpackage.u34.a()
            return r3
        L39:
            java.util.Iterator r4 = r0.iterator()
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Parameters(entries="
            r0.<init>(r1)
            java.util.Map r2 = r2.A
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

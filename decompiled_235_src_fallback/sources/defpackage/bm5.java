package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bm5  reason: default package */
/* loaded from: classes.dex */
public final class bm5 extends defpackage.ak7 {
    public final java.util.Set l;
    public final java.util.Set m;
    public final java.util.Set n;
    public final java.util.Set o;
    public final defpackage.ov0 p;

    public bm5(defpackage.bv0 r12, defpackage.ov0 r13) {
            r11 = this;
            r11.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Set r5 = r12.b
            java.util.Set r12 = r12.e
            java.util.Iterator r5 = r5.iterator()
        L24:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L58
            java.lang.Object r6 = r5.next()
            wh1 r6 = (defpackage.wh1) r6
            int r7 = r6.c
            int r8 = r6.b
            if (r7 != 0) goto L38
            r9 = 1
            goto L39
        L38:
            r9 = 0
        L39:
            java.lang.Class r6 = r6.a
            r10 = 2
            if (r9 == 0) goto L48
            if (r8 != r10) goto L44
            r3.add(r6)
            goto L24
        L44:
            r0.add(r6)
            goto L24
        L48:
            if (r7 != r10) goto L4e
            r2.add(r6)
            goto L24
        L4e:
            if (r8 != r10) goto L54
            r4.add(r6)
            goto L24
        L54:
            r1.add(r6)
            goto L24
        L58:
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L63
            java.lang.Class<g65> r12 = defpackage.g65.class
            r0.add(r12)
        L63:
            java.util.Set r12 = java.util.Collections.unmodifiableSet(r0)
            r11.l = r12
            java.util.Set r12 = java.util.Collections.unmodifiableSet(r1)
            r11.m = r12
            java.util.Collections.unmodifiableSet(r2)
            java.util.Set r12 = java.util.Collections.unmodifiableSet(r3)
            r11.n = r12
            java.util.Set r12 = java.util.Collections.unmodifiableSet(r4)
            r11.o = r12
            r11.p = r13
            return
    }

    @Override // defpackage.ak7, defpackage.ov0
    public final java.lang.Object a(java.lang.Class r2) {
            r1 = this;
            java.util.Set r0 = r1.l
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1f
            ov0 r1 = r1.p
            java.lang.Object r1 = r1.a(r2)
            java.lang.Class<g65> r0 = defpackage.g65.class
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L17
            return r1
        L17:
            am5 r2 = new am5
            g65 r1 = (defpackage.g65) r1
            r2.<init>()
            return r2
        L1f:
            java.lang.String r1 = "Attempting to request an undeclared dependency "
            java.lang.String r0 = "."
            defpackage.u34.v(r2, r0, r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.ov0
    public final defpackage.o55 b(java.lang.Class r2) {
            r1 = this;
            java.util.Set r0 = r1.m
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto Lf
            ov0 r1 = r1.p
            o55 r1 = r1.b(r2)
            return r1
        Lf:
            java.lang.String r1 = "Attempting to request an undeclared dependency Provider<"
            java.lang.String r0 = ">."
            defpackage.u34.v(r2, r0, r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.ov0
    public final defpackage.o55 c(java.lang.Class r2) {
            r1 = this;
            java.util.Set r0 = r1.o
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto Lf
            ov0 r1 = r1.p
            o55 r1 = r1.c(r2)
            return r1
        Lf:
            java.lang.String r1 = "Attempting to request an undeclared dependency Provider<Set<"
            java.lang.String r0 = ">>."
            defpackage.u34.v(r2, r0, r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.ak7, defpackage.ov0
    public final java.util.Set d(java.lang.Class r2) {
            r1 = this;
            java.util.Set r0 = r1.n
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto Lf
            ov0 r1 = r1.p
            java.util.Set r1 = r1.d(r2)
            return r1
        Lf:
            java.lang.String r1 = "Attempting to request an undeclared dependency Set<"
            java.lang.String r0 = ">."
            defpackage.u34.v(r2, r0, r1)
            r1 = 0
            return r1
    }
}

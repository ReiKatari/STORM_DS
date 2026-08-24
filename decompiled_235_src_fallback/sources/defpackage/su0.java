package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: su0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class su0 implements java.util.Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ su0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.a
            r1 = 0
            java.lang.Object r5 = r5.b
            switch(r0) {
                case 0: goto Lb9;
                case 1: goto L7c;
                case 2: goto L6d;
                case 3: goto L46;
                case 4: goto L39;
                default: goto L8;
            }
        L8:
            q33 r5 = (defpackage.q33) r5
            wy r6 = (defpackage.wy) r6
            wy r7 = (defpackage.wy) r7
            r5.getClass()
            ig1 r5 = r6.a
            java.lang.Class r5 = r5.j
            r6 = 1
            java.lang.Class<pr6> r0 = defpackage.pr6.class
            java.lang.Class<p25> r2 = defpackage.p25.class
            r3 = 2
            java.lang.Class<android.media.MediaCodec> r4 = android.media.MediaCodec.class
            if (r5 != r4) goto L21
            r5 = r3
            goto L29
        L21:
            if (r5 == r2) goto L28
            if (r5 != r0) goto L26
            goto L28
        L26:
            r5 = r6
            goto L29
        L28:
            r5 = r1
        L29:
            ig1 r7 = r7.a
            java.lang.Class r7 = r7.j
            if (r7 != r4) goto L31
            r1 = r3
            goto L37
        L31:
            if (r7 == r2) goto L37
            if (r7 != r0) goto L36
            goto L37
        L36:
            r1 = r6
        L37:
            int r5 = r5 - r1
            return r5
        L39:
            eo2 r5 = (defpackage.eo2) r5
            java.lang.Object r5 = r5.o(r6, r7)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            return r5
        L46:
            hn6 r5 = (defpackage.hn6) r5
            pq5 r6 = (defpackage.pq5) r6
            pq5 r7 = (defpackage.pq5) r7
            xh5 r0 = defpackage.tz5.L
            r6.getClass()
            r7.getClass()
            java.lang.String r6 = defpackage.hf.k0(r6)
            java.lang.String r7 = defpackage.hf.k0(r7)
            r6.getClass()
            r7.getClass()
            int r6 = r6.compareToIgnoreCase(r7)
            hn6 r7 = defpackage.hn6.ASCENDING
            if (r5 != r7) goto L6b
            goto L6c
        L6b:
            int r6 = -r6
        L6c:
            return r6
        L6d:
            z5 r5 = (defpackage.z5) r5
            xh5 r0 = defpackage.tz5.L
            java.lang.Object r5 = r5.o(r6, r7)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            return r5
        L7c:
            com.google.android.material.button.MaterialButtonToggleGroup r5 = (com.google.android.material.button.MaterialButtonToggleGroup) r5
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            boolean r0 = r6.n0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r7.n0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L95
            goto Lb8
        L95:
            boolean r0 = r6.isPressed()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r7.isPressed()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto Lac
            goto Lb8
        Lac:
            int r6 = r5.indexOfChild(r6)
            int r5 = r5.indexOfChild(r7)
            int r0 = java.lang.Integer.compare(r6, r5)
        Lb8:
            return r0
        Lb9:
            qn2[] r5 = (defpackage.qn2[]) r5
            int r0 = r5.length
            r2 = r1
        Lbd:
            if (r2 >= r0) goto Ld8
            r3 = r5[r2]
            java.lang.Object r4 = r3.g(r6)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            java.lang.Object r3 = r3.g(r7)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = defpackage.g04.z(r4, r3)
            if (r3 == 0) goto Ld5
            r1 = r3
            goto Ld8
        Ld5:
            int r2 = r2 + 1
            goto Lbd
        Ld8:
            return r1
    }
}

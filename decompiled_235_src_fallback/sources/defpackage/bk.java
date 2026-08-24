package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bk implements java.util.Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ bk(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r3 = r3.a
            switch(r3) {
                case 0: goto L9d;
                case 1: goto L7f;
                case 2: goto L72;
                case 3: goto L62;
                case 4: goto L3c;
                case 5: goto L2b;
                case 6: goto L12;
                default: goto L5;
            }
        L5:
            xx r4 = (defpackage.xx) r4
            xx r5 = (defpackage.xx) r5
            java.lang.String r3 = r4.a
            java.lang.String r4 = r5.a
            int r3 = r3.compareTo(r4)
            return r3
        L12:
            bw3 r4 = (defpackage.bw3) r4
            bw3 r5 = (defpackage.bw3) r5
            int r3 = r4.c
            int r0 = r5.c
            if (r3 >= r0) goto L1e
            r3 = -1
            goto L2a
        L1e:
            if (r3 <= r0) goto L22
            r3 = 1
            goto L2a
        L22:
            int r3 = r5.d
            int r4 = r4.d
            int r3 = java.lang.Integer.compare(r3, r4)
        L2a:
            return r3
        L2b:
            gq3 r4 = (defpackage.gq3) r4
            gq3 r5 = (defpackage.gq3) r5
            int r3 = r4.getIndex()
            int r4 = r5.getIndex()
            int r3 = defpackage.nb3.p(r3, r4)
            return r3
        L3c:
            sm3 r4 = (defpackage.sm3) r4
            sm3 r5 = (defpackage.sm3) r5
            wm3 r3 = r4.C0
            d34 r3 = r3.p
            float r3 = r3.A0
            wm3 r0 = r5.C0
            d34 r0 = r0.p
            float r0 = r0.A0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 != 0) goto L5d
            int r3 = r4.w()
            int r4 = r5.w()
            int r3 = defpackage.nb3.p(r3, r4)
            goto L61
        L5d:
            int r3 = java.lang.Float.compare(r3, r0)
        L61:
            return r3
        L62:
            l93 r4 = (defpackage.l93) r4
            l93 r5 = (defpackage.l93) r5
            int r3 = r4.B
            int r4 = r4.A
            int r3 = r3 - r4
            int r4 = r5.B
            int r5 = r5.A
            int r4 = r4 - r5
            int r3 = r3 - r4
            return r3
        L72:
            xb3 r4 = (defpackage.xb3) r4
            xb3 r5 = (defpackage.xb3) r5
            int r3 = r4.b
            int r4 = r5.b
            int r3 = defpackage.nb3.p(r3, r4)
            return r3
        L7f:
            byte[] r4 = (byte[]) r4
            byte[] r5 = (byte[]) r5
            int r3 = r4.length
            int r0 = r5.length
            if (r3 == r0) goto L8b
            int r3 = r4.length
            int r4 = r5.length
            int r3 = r3 - r4
            goto L9c
        L8b:
            r3 = 0
            r0 = r3
        L8d:
            int r1 = r4.length
            if (r0 >= r1) goto L9c
            r1 = r4[r0]
            r2 = r5[r0]
            if (r1 == r2) goto L99
            int r3 = r1 - r2
            goto L9c
        L99:
            int r0 = r0 + 1
            goto L8d
        L9c:
            return r3
        L9d:
            e35 r4 = (defpackage.e35) r4
            e35 r5 = (defpackage.e35) r5
            int r3 = r5.a
            int r4 = r4.a
            int r3 = defpackage.nb3.p(r3, r4)
            return r3
    }
}

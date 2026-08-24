package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m14  reason: default package */
/* loaded from: classes.dex */
public final class m14 extends defpackage.l0 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;

    public /* synthetic */ m14(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.l0
    public final int a() {
            r1 = this;
            int r0 = r1.A
            java.lang.Object r1 = r1.B
            switch(r0) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            yv4 r1 = (defpackage.yv4) r1
            r1.getClass()
            int r1 = r1.B
            return r1
        Lf:
            n14 r1 = (defpackage.n14) r1
            java.util.regex.Matcher r1 = r1.a
            int r1 = r1.groupCount()
            int r1 = r1 + 1
            return r1
    }

    public defpackage.k14 b(int r3) {
            r2 = this;
            java.lang.Object r2 = r2.B
            n14 r2 = (defpackage.n14) r2
            java.util.regex.Matcher r2 = r2.a
            int r0 = r2.start(r3)
            int r1 = r2.end(r3)
            l93 r0 = defpackage.gi2.R(r0, r1)
            int r1 = r0.A
            if (r1 < 0) goto L23
            k14 r1 = new k14
            java.lang.String r2 = r2.group(r3)
            r2.getClass()
            r1.<init>(r2, r0)
            return r1
        L23:
            r2 = 0
            return r2
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.B
            yv4 r1 = (defpackage.yv4) r1
            boolean r1 = r1.containsValue(r2)
            return r1
        Le:
            if (r2 != 0) goto L12
            r0 = 1
            goto L14
        L12:
            boolean r0 = r2 instanceof defpackage.k14
        L14:
            if (r0 != 0) goto L18
            r1 = 0
            goto L1e
        L18:
            k14 r2 = (defpackage.k14) r2
            boolean r1 = super.contains(r2)
        L1e:
            return r1
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.isEmpty()
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r6 = this;
            int r0 = r6.A
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            gw4 r0 = new gw4
            java.lang.Object r6 = r6.B
            yv4 r6 = (defpackage.yv4) r6
            ac7 r6 = r6.A
            r1 = 8
            bc7[] r2 = new defpackage.bc7[r1]
            r3 = 0
        L12:
            if (r3 >= r1) goto L1f
            cc7 r4 = new cc7
            r5 = 2
            r4.<init>(r5)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L12
        L1f:
            r0.<init>(r6, r2)
            return r0
        L23:
            l93 r0 = new l93
            int r1 = r6.size()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r0.<init>(r3, r1, r2)
            ev r1 = new ev
            r1.<init>(r0, r2)
            bg2 r0 = new bg2
            r2 = 11
            r0.<init>(r6, r2)
            qd2 r6 = new qd2
            r2 = 2
            r6.<init>(r1, r0, r2)
            r97 r0 = new r97
            r0.<init>(r6)
            return r0
    }
}

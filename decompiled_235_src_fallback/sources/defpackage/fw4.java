package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fw4  reason: default package */
/* loaded from: classes.dex */
public final class fw4 extends defpackage.s1 implements defpackage.s33 {
    public final /* synthetic */ int A;
    public final defpackage.yv4 B;

    public /* synthetic */ fw4(defpackage.yv4 r1, int r2) {
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
            yv4 r1 = r1.B
            switch(r0) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            r1.getClass()
            int r1 = r1.B
            return r1
        Ld:
            r1.getClass()
            int r1 = r1.B
            return r1
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.A
            yv4 r2 = r2.B
            switch(r0) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r2 = r2.containsKey(r3)
            return r2
        Lc:
            boolean r0 = r3 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L12
            goto L38
        L12:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L27
            java.lang.Object r2 = r3.getValue()
            boolean r1 = r0.equals(r2)
            goto L38
        L27:
            java.lang.Object r0 = r3.getValue()
            if (r0 != 0) goto L38
            java.lang.Object r3 = r3.getKey()
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L38
            r1 = 1
        L38:
            return r1
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r6 = this;
            int r0 = r6.A
            switch(r0) {
                case 0: goto L21;
                default: goto L5;
            }
        L5:
            gw4 r0 = new gw4
            yv4 r6 = r6.B
            ac7 r6 = r6.A
            r1 = 8
            bc7[] r2 = new defpackage.bc7[r1]
            r3 = 0
        L10:
            if (r3 >= r1) goto L1d
            cc7 r4 = new cc7
            r5 = 1
            r4.<init>(r5)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L10
        L1d:
            r0.<init>(r6, r2)
            return r0
        L21:
            gw4 r0 = new gw4
            yv4 r6 = r6.B
            ac7 r6 = r6.A
            r1 = 8
            bc7[] r2 = new defpackage.bc7[r1]
            r3 = 0
        L2c:
            if (r3 >= r1) goto L39
            cc7 r4 = new cc7
            r5 = 0
            r4.<init>(r5)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L2c
        L39:
            r0.<init>(r6, r2)
            return r0
    }
}

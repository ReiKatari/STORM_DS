package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd1  reason: default package */
/* loaded from: classes.dex */
public final class cd1 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.mm6 B;

    public /* synthetic */ cd1(defpackage.mm6 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r2, defpackage.r41 r3) {
            r1 = this;
            int r3 = r1.A
            jg7 r0 = defpackage.jg7.a
            mm6 r1 = r1.B
            switch(r3) {
                case 0: goto L8d;
                case 1: goto L4b;
                default: goto L9;
            }
        L9:
            t93 r2 = (defpackage.t93) r2
            boolean r3 = r2 instanceof defpackage.l25
            if (r3 == 0) goto L13
            r1.add(r2)
            goto L4a
        L13:
            boolean r3 = r2 instanceof defpackage.m25
            if (r3 == 0) goto L1f
            m25 r2 = (defpackage.m25) r2
            l25 r2 = r2.a
            r1.remove(r2)
            goto L4a
        L1f:
            boolean r3 = r2 instanceof defpackage.k25
            if (r3 == 0) goto L2b
            k25 r2 = (defpackage.k25) r2
            l25 r2 = r2.a
            r1.remove(r2)
            goto L4a
        L2b:
            boolean r3 = r2 instanceof defpackage.ao1
            if (r3 == 0) goto L33
            r1.add(r2)
            goto L4a
        L33:
            boolean r3 = r2 instanceof defpackage.bo1
            if (r3 == 0) goto L3f
            bo1 r2 = (defpackage.bo1) r2
            ao1 r2 = r2.a
            r1.remove(r2)
            goto L4a
        L3f:
            boolean r3 = r2 instanceof defpackage.zn1
            if (r3 == 0) goto L4a
            zn1 r2 = (defpackage.zn1) r2
            ao1 r2 = r2.a
            r1.remove(r2)
        L4a:
            return r0
        L4b:
            t93 r2 = (defpackage.t93) r2
            boolean r3 = r2 instanceof defpackage.l25
            if (r3 == 0) goto L55
            r1.add(r2)
            goto L8c
        L55:
            boolean r3 = r2 instanceof defpackage.m25
            if (r3 == 0) goto L61
            m25 r2 = (defpackage.m25) r2
            l25 r2 = r2.a
            r1.remove(r2)
            goto L8c
        L61:
            boolean r3 = r2 instanceof defpackage.k25
            if (r3 == 0) goto L6d
            k25 r2 = (defpackage.k25) r2
            l25 r2 = r2.a
            r1.remove(r2)
            goto L8c
        L6d:
            boolean r3 = r2 instanceof defpackage.ao1
            if (r3 == 0) goto L75
            r1.add(r2)
            goto L8c
        L75:
            boolean r3 = r2 instanceof defpackage.bo1
            if (r3 == 0) goto L81
            bo1 r2 = (defpackage.bo1) r2
            ao1 r2 = r2.a
            r1.remove(r2)
            goto L8c
        L81:
            boolean r3 = r2 instanceof defpackage.zn1
            if (r3 == 0) goto L8c
            zn1 r2 = (defpackage.zn1) r2
            ao1 r2 = r2.a
            r1.remove(r2)
        L8c:
            return r0
        L8d:
            t93 r2 = (defpackage.t93) r2
            boolean r3 = r2 instanceof defpackage.oy2
            if (r3 == 0) goto L97
            r1.add(r2)
            goto Ld6
        L97:
            boolean r3 = r2 instanceof defpackage.py2
            if (r3 == 0) goto La3
            py2 r2 = (defpackage.py2) r2
            oy2 r2 = r2.a
            r1.remove(r2)
            goto Ld6
        La3:
            boolean r3 = r2 instanceof defpackage.sg2
            if (r3 == 0) goto Lab
            r1.add(r2)
            goto Ld6
        Lab:
            boolean r3 = r2 instanceof defpackage.tg2
            if (r3 == 0) goto Lb7
            tg2 r2 = (defpackage.tg2) r2
            sg2 r2 = r2.a
            r1.remove(r2)
            goto Ld6
        Lb7:
            boolean r3 = r2 instanceof defpackage.l25
            if (r3 == 0) goto Lbf
            r1.add(r2)
            goto Ld6
        Lbf:
            boolean r3 = r2 instanceof defpackage.m25
            if (r3 == 0) goto Lcb
            m25 r2 = (defpackage.m25) r2
            l25 r2 = r2.a
            r1.remove(r2)
            goto Ld6
        Lcb:
            boolean r3 = r2 instanceof defpackage.k25
            if (r3 == 0) goto Ld6
            k25 r2 = (defpackage.k25) r2
            l25 r2 = r2.a
            r1.remove(r2)
        Ld6:
            return r0
    }
}

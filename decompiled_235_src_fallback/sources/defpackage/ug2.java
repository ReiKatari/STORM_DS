package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ug2  reason: default package */
/* loaded from: classes.dex */
public final class ug2 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.ArrayList B;
    public final /* synthetic */ defpackage.qa4 L;

    public /* synthetic */ ug2(java.util.ArrayList r1, defpackage.qa4 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r3, defpackage.r41 r4) {
            r2 = this;
            int r4 = r2.A
            jg7 r0 = defpackage.jg7.a
            qa4 r1 = r2.L
            java.util.ArrayList r2 = r2.B
            switch(r4) {
                case 0: goto L3a;
                default: goto Lb;
            }
        Lb:
            t93 r3 = (defpackage.t93) r3
            boolean r4 = r3 instanceof defpackage.l25
            if (r4 == 0) goto L15
            r2.add(r3)
            goto L2c
        L15:
            boolean r4 = r3 instanceof defpackage.m25
            if (r4 == 0) goto L21
            m25 r3 = (defpackage.m25) r3
            l25 r3 = r3.a
            r2.remove(r3)
            goto L2c
        L21:
            boolean r4 = r3 instanceof defpackage.k25
            if (r4 == 0) goto L2c
            k25 r3 = (defpackage.k25) r3
            l25 r3 = r3.a
            r2.remove(r3)
        L2c:
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.setValue(r2)
            return r0
        L3a:
            t93 r3 = (defpackage.t93) r3
            boolean r4 = r3 instanceof defpackage.sg2
            if (r4 == 0) goto L44
            r2.add(r3)
            goto L4f
        L44:
            boolean r4 = r3 instanceof defpackage.tg2
            if (r4 == 0) goto L4f
            tg2 r3 = (defpackage.tg2) r3
            sg2 r3 = r3.a
            r2.remove(r3)
        L4f:
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.setValue(r2)
            return r0
    }
}

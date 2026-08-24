package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wb4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wb4 implements defpackage.fu3 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ wb4(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.fu3
    public final void h(defpackage.hu3 r5, defpackage.st3 r6) {
            r4 = this;
            int r5 = r4.A
            r0 = 0
            java.lang.Object r4 = r4.B
            switch(r5) {
                case 0: goto L23;
                case 1: goto L12;
                default: goto L8;
            }
        L8:
            p0 r4 = (defpackage.p0) r4
            st3 r5 = defpackage.st3.ON_DESTROY
            if (r6 != r5) goto L11
            r4.e()
        L11:
            return
        L12:
            f56 r4 = (defpackage.f56) r4
            st3 r5 = defpackage.st3.ON_START
            if (r6 != r5) goto L1c
            r5 = 1
            r4.h = r5
            goto L22
        L1c:
            st3 r5 = defpackage.st3.ON_STOP
            if (r6 != r5) goto L22
            r4.h = r0
        L22:
            return
        L23:
            zb4 r4 = (defpackage.zb4) r4
            tt3 r5 = r6.getTargetState()
            r4.q = r5
            mc4 r5 = r4.c
            if (r5 == 0) goto L62
            pu r4 = r4.f
            java.util.ArrayList r4 = defpackage.gt0.m1(r4)
            int r5 = r4.size()
        L39:
            if (r0 >= r5) goto L62
            java.lang.Object r1 = r4.get(r0)
            int r0 = r0 + 1
            sb4 r1 = (defpackage.sb4) r1
            r1.getClass()
            uk1 r1 = r1.d0
            r1.getClass()
            java.lang.Object r2 = r1.c
            sb4 r2 = (defpackage.sb4) r2
            tt3 r3 = r6.getTargetState()
            r3.getClass()
            r2.R = r3
            tt3 r2 = r6.getTargetState()
            r1.f = r2
            r1.f()
            goto L39
        L62:
            return
    }
}

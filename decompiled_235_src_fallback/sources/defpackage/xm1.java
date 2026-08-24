package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xm1  reason: default package */
/* loaded from: classes.dex */
public final class xm1 extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.zg5 L;

    public xm1(defpackage.d51 r1, defpackage.ym1 r2, defpackage.zg5 r3) {
            r0 = this;
            r1 = 0
            r0.B = r1
            r0.L = r3
            r1 = 1
            r0.<init>(r1)
            return
    }

    public xm1(defpackage.zg5 r2) {
            r1 = this;
            r0 = 1
            r1.B = r0
            r1.L = r2
            r1.<init>(r0)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.B
            zg5 r1 = r1.L
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            ny2 r2 = (defpackage.ny2) r2
            boolean r2 = r2.m0
            if (r2 == 0) goto L13
            r2 = 0
            r1.A = r2
            tb7 r1 = defpackage.tb7.CancelTraversal
            goto L15
        L13:
            tb7 r1 = defpackage.tb7.ContinueTraversal
        L15:
            return r1
        L16:
            ym1 r2 = (defpackage.ym1) r2
            boolean r0 = r2.j0
            if (r0 != 0) goto L1f
            tb7 r1 = defpackage.tb7.SkipSubtreeAndContinueTraversal
            goto L32
        L1f:
            ym1 r0 = r2.l0
            if (r0 != 0) goto L24
            goto L29
        L24:
            java.lang.String r0 = "DragAndDropTarget self reference must be null at the start of a drag and drop session"
            defpackage.p53.c(r0)
        L29:
            r0 = 0
            r2.l0 = r0
            boolean r2 = r1.A
            r1.A = r2
            tb7 r1 = defpackage.tb7.ContinueTraversal
        L32:
            return r1
    }
}

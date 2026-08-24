package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pb3  reason: default package */
/* loaded from: classes.dex */
public final class pb3 extends defpackage.s41 {
    public int R;
    public final /* synthetic */ defpackage.eo2 X;
    public final /* synthetic */ java.lang.Object Y;

    public pb3(defpackage.r41 r1, defpackage.l61 r2, defpackage.eo2 r3, java.lang.Object r4) {
            r0 = this;
            r0.X = r3
            r0.Y = r4
            r1.getClass()
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.R
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto Le
            r3.R = r1
            defpackage.oi2.Y(r4)
            return r4
        Le:
            java.lang.String r3 = "This coroutine had already completed"
            defpackage.i.m(r3)
            r3 = 0
            return r3
        L15:
            r3.R = r2
            defpackage.oi2.Y(r4)
            eo2 r4 = r3.X
            r4.getClass()
            defpackage.ge7.p(r1, r4)
            java.lang.Object r0 = r3.Y
            java.lang.Object r3 = r4.o(r0, r3)
            return r3
    }
}

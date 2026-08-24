package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ob3  reason: default package */
/* loaded from: classes.dex */
public final class ob3 extends defpackage.cm5 {
    public int B;
    public final /* synthetic */ defpackage.eo2 L;
    public final /* synthetic */ java.lang.Object R;

    public ob3(defpackage.eo2 r1, java.lang.Object r2, defpackage.r41 r3) {
            r0 = this;
            r0.L = r1
            r0.R = r2
            r3.getClass()
            r0.<init>(r3)
            return
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.B
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto Le
            r3.B = r1
            defpackage.oi2.Y(r4)
            return r4
        Le:
            java.lang.String r3 = "This coroutine had already completed"
            defpackage.i.m(r3)
            r3 = 0
            return r3
        L15:
            r3.B = r2
            defpackage.oi2.Y(r4)
            eo2 r4 = r3.L
            r4.getClass()
            defpackage.ge7.p(r1, r4)
            java.lang.Object r0 = r3.R
            java.lang.Object r3 = r4.o(r0, r3)
            return r3
    }
}

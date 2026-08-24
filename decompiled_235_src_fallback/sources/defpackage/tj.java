package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tj  reason: default package */
/* loaded from: classes.dex */
public final class tj extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ defpackage.c05 B;
    public final /* synthetic */ defpackage.on2 L;
    public final /* synthetic */ defpackage.g05 R;
    public final /* synthetic */ java.lang.String X;
    public final /* synthetic */ defpackage.kk3 Y;

    public tj(defpackage.c05 r1, defpackage.on2 r2, defpackage.g05 r3, java.lang.String r4, defpackage.kk3 r5) {
            r0 = this;
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.Y = r5
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r4) {
            r3 = this;
            gl1 r4 = (defpackage.gl1) r4
            c05 r4 = r3.B
            android.view.WindowManager r0 = r4.o0
            android.view.WindowManager$LayoutParams r1 = r4.p0
            r0.addView(r4, r1)
            java.lang.String r0 = r3.X
            kk3 r1 = r3.Y
            on2 r2 = r3.L
            g05 r3 = r3.R
            r4.n(r2, r3, r0, r1)
            z3 r3 = new z3
            r0 = 3
            r3.<init>(r4, r0)
            return r3
    }
}

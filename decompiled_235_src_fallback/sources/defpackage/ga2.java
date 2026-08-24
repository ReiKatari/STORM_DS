package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ga2  reason: default package */
/* loaded from: classes.dex */
public abstract class ga2 extends defpackage.h20 {
    public final boolean B;

    public ga2(defpackage.s03 r1, boolean r2, defpackage.u87 r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    public final void a(android.view.View r1, defpackage.ea2 r2) {
            r0 = this;
            r2.getClass()
            boolean r0 = r0.B
            if (r0 == 0) goto L1f
            int[] r0 = defpackage.fa2.a
            int r2 = r2.ordinal()
            r0 = r0[r2]
            r2 = 1
            if (r0 == r2) goto L1b
            r2 = 2
            if (r0 != r2) goto L17
            r0 = 4
            goto L1c
        L17:
            defpackage.i.d()
            return
        L1b:
            r0 = 0
        L1c:
            r1.performHapticFeedback(r0)
        L1f:
            return
    }
}

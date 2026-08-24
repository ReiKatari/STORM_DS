package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t80  reason: default package */
/* loaded from: classes.dex */
public final class t80 extends defpackage.s41 {
    public /* synthetic */ java.lang.Object R;
    public final /* synthetic */ defpackage.v80 X;
    public int Y;

    public t80(defpackage.v80 r1, defpackage.s41 r2) {
            r0 = this;
            r0.X = r1
            r0.<init>(r2)
            return
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r2) {
            r1 = this;
            r1.R = r2
            int r2 = r1.Y
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.Y = r2
            v80 r2 = r1.X
            java.lang.Object r1 = defpackage.v80.M(r2, r1)
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            if (r1 != r2) goto L14
            return r1
        L14:
            gm0 r2 = new gm0
            r2.<init>(r1)
            return r2
    }
}

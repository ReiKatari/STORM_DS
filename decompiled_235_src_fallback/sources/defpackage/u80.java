package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u80  reason: default package */
/* loaded from: classes.dex */
public final class u80 extends defpackage.s41 {
    public /* synthetic */ java.lang.Object R;
    public final /* synthetic */ defpackage.v80 X;
    public int Y;

    public u80(defpackage.v80 r1, defpackage.s41 r2) {
            r0 = this;
            r0.X = r1
            r0.<init>(r2)
            return
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            r6.R = r7
            int r7 = r6.Y
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r6.Y = r7
            r2 = 0
            r3 = 0
            v80 r0 = r6.X
            r1 = 0
            r5 = r6
            java.lang.Object r6 = r0.N(r1, r2, r3, r5)
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            if (r6 != r7) goto L19
            return r6
        L19:
            gm0 r7 = new gm0
            r7.<init>(r6)
            return r7
    }
}

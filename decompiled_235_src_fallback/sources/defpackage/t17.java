package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t17  reason: default package */
/* loaded from: classes.dex */
public final class t17 implements defpackage.fo2 {
    public final /* synthetic */ defpackage.i17 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ defpackage.r94 R;

    public t17(defpackage.i17 r1, boolean r2, boolean r3, defpackage.r94 r4) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            z63 r3 = (defpackage.z63) r3
            px0 r4 = (defpackage.px0) r4
            java.lang.Number r5 = (java.lang.Number) r5
            r5.intValue()
            xq2 r4 = (defpackage.xq2) r4
            r5 = 1423138213(0x54d35da5, float:7.2624736E12)
            r4.b0(r5)
            z63 r5 = defpackage.z63.UnfocusedEmpty
            r0 = 0
            if (r3 != r5) goto L18
            r3 = r0
            goto L1a
        L18:
            boolean r3 = r2.L
        L1a:
            r94 r5 = r2.R
            i17 r1 = r2.A
            boolean r2 = r2.B
            qa4 r2 = r1.e(r2, r3, r5, r4)
            java.lang.Object r2 = r2.getValue()
            kt0 r2 = (defpackage.kt0) r2
            long r2 = r2.a
            r4.p(r0)
            kt0 r4 = new kt0
            r4.<init>(r2)
            return r4
    }
}

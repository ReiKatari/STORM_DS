package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h85  reason: default package */
/* loaded from: classes.dex */
public final class h85 extends defpackage.s41 {
    public long R;
    public java.lang.String X;
    public java.lang.String Y;
    public boolean Z;
    public /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ defpackage.l85 e0;
    public int f0;

    public h85(defpackage.l85 r1, defpackage.s41 r2) {
            r0 = this;
            r0.e0 = r1
            r0.<init>(r2)
            return
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            r7.d0 = r8
            int r8 = r7.f0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 | r0
            r7.f0 = r8
            r4 = 0
            r5 = 0
            l85 r0 = r7.e0
            r1 = 0
            r3 = 0
            r6 = r7
            java.lang.Object r7 = r0.s(r1, r3, r4, r5, r6)
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            if (r7 != r8) goto L1a
            return r7
        L1a:
            hm5 r8 = new hm5
            r8.<init>(r7)
            return r8
    }
}

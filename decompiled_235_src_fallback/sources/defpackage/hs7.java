package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hs7  reason: default package */
/* loaded from: classes.dex */
public final class hs7 extends defpackage.hw6 implements defpackage.eo2 {
    public defpackage.nh2 X;
    public int Y;
    public int Z;
    public int d0;
    public /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ defpackage.nh2 f0;

    public hs7(defpackage.nh2 r1, defpackage.r41 r2) {
            r0 = this;
            r0.f0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            hs7 r0 = (defpackage.hs7) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            hs7 r0 = new hs7
            nh2 r1 = r1.f0
            r0.<init>(r1, r2)
            r0.e0 = r3
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            java.lang.Object r0 = r8.e0
            w61 r0 = (defpackage.w61) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r8.d0
            r3 = 1
            if (r2 == 0) goto L1e
            if (r2 != r3) goto L17
            int r2 = r8.Z
            int r4 = r8.Y
            nh2 r5 = r8.X
            defpackage.oi2.Y(r9)
            goto L53
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            r8 = 0
            return r8
        L1e:
            defpackage.oi2.Y(r9)
            r9 = 0
            r2 = 12
            nh2 r4 = r8.f0
            r5 = r4
            r4 = r2
            r2 = r9
        L29:
            if (r2 >= r4) goto L55
            boolean r9 = defpackage.nh2.a(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L34
            goto L3b
        L34:
            r9 = move-exception
            em5 r6 = new em5
            r6.<init>(r9)
            r9 = r6
        L3b:
            boolean r9 = r9 instanceof defpackage.em5
            if (r9 != 0) goto L40
            goto L55
        L40:
            r8.e0 = r0
            r8.X = r5
            r8.Y = r4
            r8.Z = r2
            r8.d0 = r3
            r6 = 30
            java.lang.Object r9 = defpackage.q60.t(r6, r8)
            if (r9 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L29
        L55:
            jg7 r8 = defpackage.jg7.a
            return r8
    }
}

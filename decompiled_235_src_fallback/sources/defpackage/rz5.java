package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rz5  reason: default package */
/* loaded from: classes.dex */
public final class rz5 extends defpackage.hw6 implements defpackage.ho2 {
    public int X;
    public /* synthetic */ java.util.List Y;
    public /* synthetic */ java.util.List Z;
    public /* synthetic */ defpackage.gn6 d0;
    public /* synthetic */ defpackage.hn6 e0;
    public final /* synthetic */ defpackage.tz5 f0;

    public rz5(defpackage.r41 r1, defpackage.tz5 r2) {
            r0 = this;
            r0.f0 = r2
            r2 = 5
            r0.<init>(r2, r1)
            return
    }

    @Override // defpackage.ho2
    public final java.lang.Object p(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r1 = this;
            java.util.List r2 = (java.util.List) r2
            java.util.List r3 = (java.util.List) r3
            gn6 r4 = (defpackage.gn6) r4
            hn6 r5 = (defpackage.hn6) r5
            r41 r6 = (defpackage.r41) r6
            rz5 r0 = new rz5
            tz5 r1 = r1.f0
            r0.<init>(r6, r1)
            r0.Y = r2
            r0.Z = r3
            r0.d0 = r4
            r0.e0 = r5
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r1 = r0.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            java.util.List r1 = r10.Y
            java.util.List r2 = r10.Z
            gn6 r4 = r10.d0
            hn6 r5 = r10.e0
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r10.X
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L1c
            if (r0 != r8) goto L16
            defpackage.oi2.Y(r11)
            return r11
        L16:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r9
        L1c:
            defpackage.oi2.Y(r11)
            xe1 r11 = defpackage.xk1.a
            v70 r0 = new v70
            tz5 r3 = r10.f0
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.Y = r9
            r10.Z = r9
            r10.d0 = r9
            r10.e0 = r9
            r10.X = r8
            java.lang.Object r10 = defpackage.hv.d0(r11, r0, r10)
            if (r10 != r7) goto L3a
            return r7
        L3a:
            return r10
    }
}

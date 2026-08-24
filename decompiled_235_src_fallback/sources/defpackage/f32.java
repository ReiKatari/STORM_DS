package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f32  reason: default package */
/* loaded from: classes.dex */
public final class f32 extends defpackage.hw6 implements defpackage.fo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ defpackage.fk3 Y;

    public /* synthetic */ f32(int r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int r2 = r2.X
            jg7 r0 = defpackage.jg7.a
            r1 = 3
            fk3 r3 = (defpackage.fk3) r3
            jg7 r4 = (defpackage.jg7) r4
            r41 r5 = (defpackage.r41) r5
            switch(r2) {
                case 0: goto L1b;
                default: goto Le;
            }
        Le:
            f32 r2 = new f32
            r4 = 1
            r2.<init>(r1, r5, r4)
            r2.Y = r3
            java.lang.Object r2 = r2.s(r0)
            return r2
        L1b:
            f32 r2 = new f32
            r4 = 0
            r2.<init>(r1, r5, r4)
            r2.Y = r3
            java.lang.Object r2 = r2.s(r0)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.X
            fk3 r1 = r1.Y
            switch(r0) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r2)
            return r1
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r2)
            return r1
    }
}

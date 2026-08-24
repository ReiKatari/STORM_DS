package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zw6  reason: default package */
/* loaded from: classes.dex */
public final class zw6 extends defpackage.hw6 implements defpackage.eo2 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ defpackage.qa4 Y;
    public final /* synthetic */ defpackage.qa4 Z;
    public final /* synthetic */ defpackage.qa4 d0;

    public zw6(defpackage.qa4 r1, defpackage.qa4 r2, defpackage.qa4 r3, defpackage.r41 r4) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            zw6 r0 = (defpackage.zw6) r0
            jg7 r1 = defpackage.jg7.a
            r0.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            zw6 r0 = new zw6
            qa4 r1 = r3.Z
            qa4 r2 = r3.d0
            qa4 r3 = r3.Y
            r0.<init>(r3, r1, r2, r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
            r0.X = r3
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r2) {
            r1 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r2)
            boolean r2 = r1.X
            float r0 = defpackage.bx6.a
            qa4 r0 = r1.Y
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == r2) goto L3d
            qa4 r0 = r1.Z
            java.lang.Object r0 = r0.getValue()
            qn2 r0 = (defpackage.qn2) r0
            if (r0 == 0) goto L28
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.g(r2)
        L28:
            qa4 r1 = r1.d0
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r2 = r2 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.setValue(r2)
        L3d:
            jg7 r1 = defpackage.jg7.a
            return r1
    }
}

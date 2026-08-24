package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ft5  reason: default package */
/* loaded from: classes.dex */
public final class ft5 implements defpackage.ne2 {
    public final /* synthetic */ me.magnum.melonds.database.MelonDatabase A;
    public final /* synthetic */ java.lang.String B;
    public final /* synthetic */ java.lang.String L;
    public final /* synthetic */ java.lang.String R;
    public final /* synthetic */ defpackage.qa4 X;
    public final /* synthetic */ defpackage.om6 Y;
    public final /* synthetic */ defpackage.qa4 Z;

    public ft5(me.magnum.melonds.database.MelonDatabase r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, defpackage.qa4 r5, defpackage.om6 r6, defpackage.qa4 r7) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            r0.Z = r7
            return
    }

    @Override // defpackage.ne2
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r1, defpackage.r41 r2) {
            r0 = this;
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.b(r1, r2)
            return r0
    }

    public final java.lang.Object b(java.util.List r9, defpackage.r41 r10) {
            r8 = this;
            boolean r0 = r10 instanceof defpackage.et5
            if (r0 == 0) goto L13
            r0 = r10
            et5 r0 = (defpackage.et5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            et5 r0 = new et5
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.util.List r9 = r0.R
            defpackage.oi2.Y(r10)
            goto L56
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            r8 = 0
            return r8
        L30:
            defpackage.oi2.Y(r10)
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L56
            r0.R = r9
            r0.Z = r3
            xe1 r10 = defpackage.xk1.a
            de1 r10 = defpackage.de1.L
            ja1 r2 = new ja1
            r7 = 0
            java.lang.String r3 = r8.B
            java.lang.String r4 = r8.R
            me.magnum.melonds.database.MelonDatabase r5 = r8.A
            java.lang.String r6 = r8.L
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r10 = defpackage.hv.d0(r10, r2, r0)
            if (r10 != r1) goto L56
            return r1
        L56:
            qa4 r10 = r8.X
            r10.setValue(r9)
            java.util.Iterator r9 = r9.iterator()
        L5f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L8b
            java.lang.Object r10 = r9.next()
            an0 r10 = (defpackage.an0) r10
            java.lang.Long r10 = r10.a
            if (r10 == 0) goto L5f
            long r0 = r10.longValue()
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r0)
            om6 r2 = r8.Y
            boolean r10 = r2.containsKey(r10)
            if (r10 != 0) goto L5f
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.put(r10, r0)
            goto L5f
        L8b:
            qa4 r8 = r8.Z
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.setValue(r9)
            jg7 r8 = defpackage.jg7.a
            return r8
    }
}

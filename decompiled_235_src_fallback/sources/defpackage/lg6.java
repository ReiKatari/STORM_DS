package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lg6  reason: default package */
/* loaded from: classes.dex */
public final class lg6 extends defpackage.hw6 implements defpackage.go2 {
    public /* synthetic */ java.lang.String X;
    public /* synthetic */ android.net.Uri Y;
    public final /* synthetic */ defpackage.ng6 Z;

    public lg6(defpackage.ng6 r1, defpackage.r41 r2) {
            r0 = this;
            r0.Z = r1
            r1 = 4
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Number r3 = (java.lang.Number) r3
            r3.longValue()
            r41 r4 = (defpackage.r41) r4
            lg6 r3 = new lg6
            ng6 r0 = r0.Z
            r3.<init>(r0, r4)
            r3.X = r1
            r3.Y = r2
            jg7 r0 = defpackage.jg7.a
            java.lang.Object r0 = r3.s(r0)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            java.lang.String r0 = r8.X
            android.net.Uri r1 = r8.Y
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r9)
            ng6 r8 = r8.Z
            cp5 r8 = r8.f
            java.io.File r8 = r8.d()
            r9 = 0
            r2 = 1
            if (r1 == 0) goto L17
            r3 = r2
            goto L18
        L17:
            r3 = r9
        L18:
            if (r8 == 0) goto L1b
            r9 = r2
        L1b:
            gp5 r4 = me.magnum.melonds.domain.model.RetroArchShaderSource.Companion
            r4.getClass()
            t52 r4 = me.magnum.melonds.domain.model.RetroArchShaderSource.getEntries()
            java.util.Iterator r4 = r4.iterator()
        L28:
            boolean r5 = r4.hasNext()
            r6 = 0
            if (r5 == 0) goto L41
            java.lang.Object r5 = r4.next()
            r7 = r5
            me.magnum.melonds.domain.model.RetroArchShaderSource r7 = (me.magnum.melonds.domain.model.RetroArchShaderSource) r7
            java.lang.String r7 = r7.getPreferenceValue()
            boolean r7 = defpackage.xs6.Z(r7, r0, r2)
            if (r7 == 0) goto L28
            goto L42
        L41:
            r5 = r6
        L42:
            me.magnum.melonds.domain.model.RetroArchShaderSource r5 = (me.magnum.melonds.domain.model.RetroArchShaderSource) r5
            if (r5 == 0) goto L47
            goto L52
        L47:
            if (r3 == 0) goto L4c
            me.magnum.melonds.domain.model.RetroArchShaderSource r5 = me.magnum.melonds.domain.model.RetroArchShaderSource.FOLDER
            goto L52
        L4c:
            if (r9 == 0) goto L51
            me.magnum.melonds.domain.model.RetroArchShaderSource r5 = me.magnum.melonds.domain.model.RetroArchShaderSource.INTERNAL
            goto L52
        L51:
            r5 = r6
        L52:
            if (r5 != 0) goto L55
            goto L76
        L55:
            int[] r9 = defpackage.cg6.a
            int r0 = r5.ordinal()
            r9 = r9[r0]
            if (r9 == r2) goto L6e
            r8 = 2
            if (r9 != r8) goto L6a
            if (r1 == 0) goto L76
            ag6 r8 = new ag6
            r8.<init>(r1)
            return r8
        L6a:
            defpackage.i.d()
            return r6
        L6e:
            if (r8 == 0) goto L76
            zf6 r9 = new zf6
            r9.<init>(r8)
            return r9
        L76:
            return r6
    }
}

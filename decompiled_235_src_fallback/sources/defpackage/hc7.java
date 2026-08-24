package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hc7  reason: default package */
/* loaded from: classes.dex */
public final class hc7 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ defpackage.nc7 d0;

    public /* synthetic */ hc7(defpackage.nc7 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.d0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            d97 r3 = (defpackage.d97) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            hc7 r2 = (defpackage.hc7) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            bt4 r3 = (defpackage.bt4) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            hc7 r2 = (defpackage.hc7) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            nc7 r2 = r2.d0
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            hc7 r0 = new hc7
            r1 = 1
            r0.<init>(r2, r3, r1)
            r0.Z = r4
            return r0
        L10:
            hc7 r0 = new hc7
            r1 = 0
            r0.<init>(r2, r3, r1)
            r0.Z = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.X
            nc7 r1 = r7.d0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L5d;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r7.Y
            r6 = 2
            if (r5 == 0) goto L26
            if (r5 == r3) goto L1e
            if (r5 != r6) goto L1a
            defpackage.oi2.Y(r8)     // Catch: android.database.SQLException -> L5a
            goto L56
        L1a:
            defpackage.i.m(r2)
            goto L5c
        L1e:
            java.lang.Object r2 = r7.Z
            d97 r2 = (defpackage.d97) r2
            defpackage.oi2.Y(r8)
            goto L39
        L26:
            defpackage.oi2.Y(r8)
            java.lang.Object r8 = r7.Z
            r2 = r8
            d97 r2 = (defpackage.d97) r2
            r7.Z = r2
            r7.Y = r3
            java.lang.Boolean r8 = r2.c(r7)
            if (r8 != r0) goto L39
            goto L54
        L39:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L42
            goto L5a
        L42:
            c97 r8 = defpackage.c97.IMMEDIATE     // Catch: android.database.SQLException -> L5a
            hc7 r3 = new hc7     // Catch: android.database.SQLException -> L5a
            r5 = 0
            r3.<init>(r1, r4, r5)     // Catch: android.database.SQLException -> L5a
            r7.Z = r4     // Catch: android.database.SQLException -> L5a
            r7.Y = r6     // Catch: android.database.SQLException -> L5a
            java.lang.Object r8 = r2.a(r8, r3, r7)     // Catch: android.database.SQLException -> L5a
            if (r8 != r0) goto L56
        L54:
            r4 = r0
            goto L5c
        L56:
            r4 = r8
            java.util.Set r4 = (java.util.Set) r4     // Catch: android.database.SQLException -> L5a
            goto L5c
        L5a:
            du1 r4 = defpackage.du1.A
        L5c:
            return r4
        L5d:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r7.Y
            if (r5 == 0) goto L6e
            if (r5 != r3) goto L69
            defpackage.oi2.Y(r8)
            goto L7e
        L69:
            defpackage.i.m(r2)
            r8 = r4
            goto L7e
        L6e:
            defpackage.oi2.Y(r8)
            java.lang.Object r8 = r7.Z
            bt4 r8 = (defpackage.bt4) r8
            r7.Y = r3
            java.lang.Object r8 = defpackage.nc7.a(r1, r8, r7)
            if (r8 != r0) goto L7e
            r8 = r0
        L7e:
            return r8
    }
}

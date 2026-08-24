package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w91  reason: default package */
/* loaded from: classes.dex */
public final class w91 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.la1 Z;
    public final /* synthetic */ android.content.Context d0;

    public /* synthetic */ w91(defpackage.la1 r1, android.content.Context r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Z = r1
            r0.d0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            w91 r2 = (defpackage.w91) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            w91 r2 = (defpackage.w91) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            android.content.Context r0 = r2.d0
            la1 r2 = r2.Z
            switch(r4) {
                case 0: goto L10;
                default: goto L9;
            }
        L9:
            w91 r4 = new w91
            r1 = 1
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            w91 r4 = new w91
            r1 = 0
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            android.content.Context r2 = r8.d0
            la1 r3 = r8.Z
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L34;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L20
            if (r7 != r5) goto L1b
            defpackage.oi2.Y(r9)
            goto L33
        L1b:
            defpackage.i.m(r4)
            r1 = r6
            goto L33
        L20:
            defpackage.oi2.Y(r9)
            be5 r9 = r3.n
            v91 r3 = new v91
            r3.<init>(r2, r6, r5)
            r8.Y = r5
            java.lang.Object r8 = defpackage.f04.v(r9, r3, r8)
            if (r8 != r0) goto L33
            r1 = r0
        L33:
            return r1
        L34:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L45
            if (r7 != r5) goto L40
            defpackage.oi2.Y(r9)
            goto L59
        L40:
            defpackage.i.m(r4)
            r1 = r6
            goto L59
        L45:
            defpackage.oi2.Y(r9)
            be5 r9 = r3.l
            v91 r3 = new v91
            r4 = 0
            r3.<init>(r2, r6, r4)
            r8.Y = r5
            java.lang.Object r8 = defpackage.f04.v(r9, r3, r8)
            if (r8 != r0) goto L59
            r1 = r0
        L59:
            return r1
    }
}

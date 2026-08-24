package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ka1  reason: default package */
/* loaded from: classes.dex */
public final class ka1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.la1 Z;
    public final /* synthetic */ me.magnum.melonds.domain.model.DSiWareTitle d0;
    public final /* synthetic */ java.lang.String e0;

    public /* synthetic */ ka1(defpackage.la1 r1, me.magnum.melonds.domain.model.DSiWareTitle r2, java.lang.String r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r1 = 2
            r0.<init>(r1, r4)
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
            ka1 r2 = (defpackage.ka1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            ka1 r2 = (defpackage.ka1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            int r9 = r7.X
            switch(r9) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            ka1 r0 = new ka1
            java.lang.String r3 = r7.e0
            r5 = 1
            la1 r1 = r7.Z
            me.magnum.melonds.domain.model.DSiWareTitle r2 = r7.d0
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L13:
            r4 = r8
            ka1 r1 = new ka1
            r5 = r4
            java.lang.String r4 = r7.e0
            r6 = 0
            la1 r2 = r7.Z
            me.magnum.melonds.domain.model.DSiWareTitle r3 = r7.d0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.X
            jg7 r1 = defpackage.jg7.a
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L38;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r11.Y
            if (r5 == 0) goto L1c
            if (r5 != r3) goto L17
            defpackage.oi2.Y(r12)
            goto L37
        L17:
            defpackage.i.m(r2)
            r1 = r4
            goto L37
        L1c:
            defpackage.oi2.Y(r12)
            xe1 r12 = defpackage.xk1.a
            ka1 r4 = new ka1
            r8 = 0
            r9 = 0
            la1 r5 = r11.Z
            me.magnum.melonds.domain.model.DSiWareTitle r6 = r11.d0
            java.lang.String r7 = r11.e0
            r4.<init>(r5, r6, r7, r8, r9)
            r11.Y = r3
            java.lang.Object r11 = defpackage.hv.d0(r12, r4, r11)
            if (r11 != r0) goto L37
            r1 = r0
        L37:
            return r1
        L38:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r11.Y
            la1 r6 = r11.Z
            if (r5 == 0) goto L4d
            if (r5 != r3) goto L47
            defpackage.oi2.Y(r12)
            goto Lb7
        L47:
            defpackage.i.m(r2)
            r1 = r4
            goto Lc6
        L4d:
            defpackage.oi2.Y(r12)
            db1 r12 = r6.e
            me.magnum.melonds.domain.model.DSiWareTitle r2 = r11.d0
            long r7 = r2.getTitleId()
            r12.getClass()
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            r2 = 16
            defpackage.g04.y(r2)
            java.lang.String r2 = java.lang.Long.toString(r7, r2)
            r2.getClass()
            r5 = 8
            java.lang.String r2 = defpackage.qs6.B0(r5, r2)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r5)
            r2.getClass()
            android.content.SharedPreferences r12 = r12.c()
            android.content.SharedPreferences$Editor r12 = r12.edit()
            java.lang.String r5 = r11.e0
            java.lang.String r7 = "custom_name_"
            if (r5 == 0) goto La1
            boolean r8 = defpackage.qs6.v0(r5)
            if (r8 == 0) goto L91
            goto La1
        L91:
            java.lang.String r2 = r7.concat(r2)
            java.lang.CharSequence r5 = defpackage.qs6.T0(r5)
            java.lang.String r5 = r5.toString()
            r12.putString(r2, r5)
            goto La8
        La1:
            java.lang.String r2 = r7.concat(r2)
            r12.remove(r2)
        La8:
            r12.apply()
            fg r12 = r6.b
            r11.Y = r3
            java.io.Serializable r12 = r12.h(r11)
            if (r12 != r0) goto Lb7
            r1 = r0
            goto Lc6
        Lb7:
            java.util.List r12 = (java.util.List) r12
            tp6 r11 = r6.g
            ea1 r0 = new ea1
            r0.<init>(r12)
            r11.getClass()
            r11.m(r4, r0)
        Lc6:
            return r1
    }
}

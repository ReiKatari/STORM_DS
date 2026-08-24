package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e90  reason: default package */
/* loaded from: classes.dex */
public final class e90 extends defpackage.a51 {
    public final /* synthetic */ int a;

    public /* synthetic */ e90(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.a51
    public defpackage.b51 a(java.lang.reflect.Type r2, java.lang.annotation.Annotation[] r3, java.lang.annotation.Annotation[] r4, defpackage.pa r5) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            b51 r1 = super.a(r2, r3, r4, r5)
            return r1
        La:
            java.lang.Class<mk5> r1 = defpackage.mk5.class
            java.lang.Class r2 = defpackage.ak7.c0(r2)
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L19
            xd5 r1 = defpackage.xd5.R
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
    }

    @Override // defpackage.a51
    public final defpackage.b51 b(java.lang.reflect.Type r4, java.lang.annotation.Annotation[] r5, defpackage.pa r6) {
            r3 = this;
            int r3 = r3.a
            r0 = 0
            r1 = 0
            switch(r3) {
                case 0: goto L22;
                default: goto L7;
            }
        L7:
            java.lang.Class r3 = defpackage.ak7.c0(r4)
            java.lang.Class<java.util.Optional> r2 = java.util.Optional.class
            if (r3 == r2) goto L10
            goto L21
        L10:
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r3 = defpackage.ak7.Y(r0, r4)
            b51 r3 = r6.t(r3, r5)
            s63 r1 = new s63
            r4 = 24
            r1.<init>(r3, r4)
        L21:
            return r1
        L22:
            java.lang.Class<yl5> r3 = defpackage.yl5.class
            if (r4 != r3) goto L34
            java.lang.Class<wr6> r3 = defpackage.wr6.class
            boolean r3 = defpackage.ak7.l0(r5, r3)
            if (r3 == 0) goto L31
            d90 r1 = defpackage.d90.p0
            goto L48
        L31:
            cs1 r1 = defpackage.cs1.R
            goto L48
        L34:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            if (r4 != r3) goto L3b
            cs1 r1 = defpackage.cs1.X
            goto L48
        L3b:
            boolean r3 = defpackage.ak7.i
            if (r3 == 0) goto L48
            java.lang.Class<jg7> r3 = defpackage.jg7.class
            if (r4 != r3) goto L48
            vs0 r1 = defpackage.vs0.Z
            goto L48
        L46:
            defpackage.ak7.i = r0
        L48:
            return r1
    }
}

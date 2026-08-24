package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z17  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class z17 implements defpackage.eo2 {
    public final /* synthetic */ int A;

    public /* synthetic */ z17(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public /* synthetic */ z17(int r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r3 = r3.A
            r0 = 0
            jg7 r1 = defpackage.jg7.a
            r2 = 1
            switch(r3) {
                case 0: goto Lc7;
                case 1: goto L9e;
                case 2: goto L7c;
                case 3: goto L5d;
                case 4: goto L4d;
                case 5: goto L2e;
                case 6: goto L27;
                case 7: goto L18;
                default: goto L9;
            }
        L9:
            px0 r4 = (defpackage.px0) r4
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            int r3 = defpackage.ii2.a0(r2)
            defpackage.is7.d(r4, r3)
            return r1
        L18:
            px0 r4 = (defpackage.px0) r4
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            int r3 = defpackage.ii2.a0(r2)
            defpackage.l.e(r4, r3)
            return r1
        L27:
            jg7 r5 = (defpackage.jg7) r5
            sm3 r4 = (defpackage.sm3) r4
            r4.d0 = r2
            return r1
        L2e:
            q57 r4 = (defpackage.q57) r4
            j61 r5 = (defpackage.j61) r5
            boolean r3 = r5 instanceof defpackage.l57
            if (r3 == 0) goto L4c
            l57 r5 = (defpackage.l57) r5
            l61 r3 = r4.a
            java.lang.Object r3 = r5.b()
            java.lang.Object[] r0 = r4.b
            int r1 = r4.d
            r0[r1] = r3
            l57[] r3 = r4.c
            int r0 = r1 + 1
            r4.d = r0
            r3[r1] = r5
        L4c:
            return r4
        L4d:
            l57 r4 = (defpackage.l57) r4
            j61 r5 = (defpackage.j61) r5
            if (r4 == 0) goto L55
            r0 = r4
            goto L5c
        L55:
            boolean r3 = r5 instanceof defpackage.l57
            if (r3 == 0) goto L5c
            r0 = r5
            l57 r0 = (defpackage.l57) r0
        L5c:
            return r0
        L5d:
            j61 r5 = (defpackage.j61) r5
            boolean r3 = r5 instanceof defpackage.l57
            if (r3 == 0) goto L7b
            boolean r3 = r4 instanceof java.lang.Integer
            if (r3 == 0) goto L6a
            r0 = r4
            java.lang.Integer r0 = (java.lang.Integer) r0
        L6a:
            if (r0 == 0) goto L71
            int r3 = r0.intValue()
            goto L72
        L71:
            r3 = r2
        L72:
            if (r3 != 0) goto L76
            r4 = r5
            goto L7b
        L76:
            int r3 = r3 + r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L7b:
            return r4
        L7c:
            n46 r4 = (defpackage.n46) r4
            c37 r5 = (defpackage.c37) r5
            fp r3 = r5.a
            ap3 r0 = defpackage.p56.a
            java.lang.Object r3 = defpackage.p56.a(r3, r0, r4)
            long r0 = r5.b
            k47 r5 = new k47
            r5.<init>(r0)
            ap3 r0 = defpackage.p56.p
            java.lang.Object r4 = defpackage.p56.a(r5, r0, r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.util.ArrayList r3 = defpackage.hf.w(r3)
            return r3
        L9e:
            n46 r4 = (defpackage.n46) r4
            i27 r5 = (defpackage.i27) r5
            rs4 r3 = r5.a
            float r3 = r3.h()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            vs4 r4 = r5.f
            java.lang.Object r4 = r4.getValue()
            lo4 r4 = (defpackage.lo4) r4
            lo4 r5 = defpackage.lo4.Vertical
            if (r4 != r5) goto Lb9
            goto Lba
        Lb9:
            r2 = 0
        Lba:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.util.List r3 = defpackage.hf.c0(r3)
            return r3
        Lc7:
            x24 r4 = (defpackage.x24) r4
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r3 = r5.intValue()
            int r3 = r4.n(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
    }
}

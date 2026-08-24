package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vn0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vn0 implements defpackage.qn2 {
    public final /* synthetic */ int A;

    public /* synthetic */ vn0(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r8) {
            r7 = this;
            int r7 = r7.A
            r0 = 7
            r1 = 6
            r2 = 0
            r3 = 0
            r4 = 1
            jg7 r5 = defpackage.jg7.a
            switch(r7) {
                case 0: goto L1a8;
                case 1: goto L199;
                case 2: goto L18a;
                case 3: goto L17a;
                case 4: goto L16b;
                case 5: goto L15f;
                case 6: goto L159;
                case 7: goto L14d;
                case 8: goto L144;
                case 9: goto L13b;
                case 10: goto L132;
                case 11: goto L129;
                case 12: goto L120;
                case 13: goto L117;
                case 14: goto L10e;
                case 15: goto L105;
                case 16: goto Lfc;
                case 17: goto Lf2;
                case 18: goto Le4;
                case 19: goto Lba;
                case 20: goto L9d;
                case 21: goto L76;
                case 22: goto L73;
                case 23: goto L6e;
                case 24: goto L67;
                case 25: goto L43;
                case 26: goto L36;
                case 27: goto L25;
                case 28: goto L19;
                default: goto Lc;
            }
        Lc:
            gb5 r8 = (defpackage.gb5) r8
            r8.getClass()
            java.util.ArrayList r7 = r8.g
            ev r8 = new ev
            r8.<init>(r7, r4)
            return r8
        L19:
            sj4 r8 = (defpackage.sj4) r8
            r8.getClass()
            long r7 = r8.a
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            return r7
        L25:
            eb5 r8 = (defpackage.eb5) r8
            r8.getClass()
            sj4 r7 = new sj4
            o75 r8 = r8.a
            long r0 = r8.a
            java.lang.String r8 = r8.l
            r7.<init>(r0, r8)
            return r7
        L36:
            gb5 r8 = (defpackage.gb5) r8
            r8.getClass()
            java.util.ArrayList r7 = r8.f
            ev r8 = new ev
            r8.<init>(r7, r4)
            return r8
        L43:
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            int r7 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r8.getClass()
            java.lang.Object r7 = r8.getKey()
            java.lang.Object r8 = r8.getValue()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = "="
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = r0.toString()
            return r7
        L67:
            fp1 r8 = (defpackage.fp1) r8
            sc7 r7 = defpackage.dp1.a
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L6e:
            bz4 r8 = (defpackage.bz4) r8
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L73:
            jk4 r8 = (defpackage.jk4) r8
            return r5
        L76:
            java.util.List r8 = (java.util.List) r8
            ue1 r7 = new ue1
            java.lang.Object r0 = r8.get(r3)
            r0.getClass()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r1 = r8.get(r4)
            r1.getClass()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            b5 r2 = new b5
            r2.<init>(r4, r8)
            r7.<init>(r0, r1, r2)
            return r7
        L9d:
            boolean r7 = r8 instanceof java.lang.Object[]
            if (r7 == 0) goto Lb5
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            vn0 r7 = new vn0
            r0 = 20
            r7.<init>(r0)
            r0 = 25
            java.lang.String r1 = "["
            java.lang.String r2 = "]"
            java.lang.String r7 = defpackage.fv.M0(r8, r1, r2, r7, r0)
            goto Lb9
        Lb5:
            java.lang.String r7 = java.lang.String.valueOf(r8)
        Lb9:
            return r7
        Lba:
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            r8.getClass()
            java.lang.Object r7 = r8.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r8.getValue()
            java.lang.String r0 = " : "
            java.lang.StringBuilder r7 = defpackage.i61.r(r7, r0)
            boolean r0 = r8 instanceof java.lang.Object[]
            if (r0 == 0) goto Ldc
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            java.lang.String r8 = java.util.Arrays.toString(r8)
            r8.getClass()
        Ldc:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            return r7
        Le4:
            me.magnum.melonds.domain.model.DSiWareTitle r8 = (me.magnum.melonds.domain.model.DSiWareTitle) r8
            r8.getClass()
            long r7 = r8.getTitleId()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            return r7
        Lf2:
            j61 r8 = (defpackage.j61) r8
            boolean r7 = r8 instanceof defpackage.n61
            if (r7 == 0) goto Lfb
            r2 = r8
            n61 r2 = (defpackage.n61) r2
        Lfb:
            return r2
        Lfc:
            fh2 r8 = (defpackage.fh2) r8
            r8.getClass()
            r8.a()
            return r5
        L105:
            fh2 r8 = (defpackage.fh2) r8
            r8.getClass()
            r8.a()
            return r5
        L10e:
            fh2 r8 = (defpackage.fh2) r8
            r8.getClass()
            r8.a()
            return r5
        L117:
            fh2 r8 = (defpackage.fh2) r8
            r8.getClass()
            r8.a()
            return r5
        L120:
            fh2 r8 = (defpackage.fh2) r8
            r8.getClass()
            r8.a()
            return r5
        L129:
            fh2 r8 = (defpackage.fh2) r8
            r8.getClass()
            r8.a()
            return r5
        L132:
            fh2 r8 = (defpackage.fh2) r8
            r8.getClass()
            r8.a()
            return r5
        L13b:
            fh2 r8 = (defpackage.fh2) r8
            r8.getClass()
            r8.a()
            return r5
        L144:
            fh2 r8 = (defpackage.fh2) r8
            r8.getClass()
            r8.a()
            return r5
        L14d:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            int r7 = -r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        L159:
            java.lang.Integer r8 = (java.lang.Integer) r8
            r8.intValue()
            return r8
        L15f:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            int r7 = -r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        L16b:
            yn r8 = (defpackage.yn) r8
            r8.getClass()
            vn0 r7 = new vn0
            r7.<init>(r1)
            z72 r7 = defpackage.i52.j(r4, r7)
            return r7
        L17a:
            yn r8 = (defpackage.yn) r8
            r8.getClass()
            vn0 r7 = new vn0
            r8 = 5
            r7.<init>(r8)
            o52 r7 = defpackage.i52.h(r7)
            return r7
        L18a:
            yn r8 = (defpackage.yn) r8
            r8.getClass()
            vn0 r7 = new vn0
            r7.<init>(r0)
            z72 r7 = defpackage.i52.j(r4, r7)
            return r7
        L199:
            yn r8 = (defpackage.yn) r8
            r8.getClass()
            vn0 r7 = new vn0
            r7.<init>(r1)
            o52 r7 = defpackage.i52.h(r7)
            return r7
        L1a8:
            java.util.List r8 = (java.util.List) r8
            r8.getClass()
            ap3 r7 = defpackage.c37.d
            java.lang.Object r7 = r7.L
            qn2 r7 = (defpackage.qn2) r7
            xn0 r1 = new xn0
            java.lang.Object r3 = r8.get(r3)
            r3.getClass()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r1.<init>(r3)
            java.lang.Object r3 = r8.get(r4)
            r4 = 0
            if (r3 == 0) goto L1d5
            java.lang.Object r3 = r7.g(r3)
            c37 r3 = (defpackage.c37) r3
            if (r3 != 0) goto L1da
        L1d5:
            c37 r3 = new c37
            r3.<init>(r2, r0, r4)
        L1da:
            vs4 r6 = r1.b
            r6.setValue(r3)
            r3 = 2
            java.lang.Object r3 = r8.get(r3)
            if (r3 == 0) goto L1ee
            java.lang.Object r3 = r7.g(r3)
            c37 r3 = (defpackage.c37) r3
            if (r3 != 0) goto L1f3
        L1ee:
            c37 r3 = new c37
            r3.<init>(r2, r0, r4)
        L1f3:
            vs4 r6 = r1.c
            r6.setValue(r3)
            r3 = 3
            java.lang.Object r8 = r8.get(r3)
            if (r8 == 0) goto L207
            java.lang.Object r7 = r7.g(r8)
            c37 r7 = (defpackage.c37) r7
            if (r7 != 0) goto L20c
        L207:
            c37 r7 = new c37
            r7.<init>(r2, r0, r4)
        L20c:
            vs4 r8 = r1.d
            r8.setValue(r7)
            return r1
    }
}

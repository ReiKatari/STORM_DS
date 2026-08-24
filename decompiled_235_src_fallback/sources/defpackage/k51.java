package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k51  reason: default package */
/* loaded from: classes.dex */
public final class k51 implements defpackage.g14 {
    public final /* synthetic */ int a;

    public /* synthetic */ k51(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.g14
    public final void a(defpackage.eb r7, defpackage.a21 r8) {
            r6 = this;
            int r6 = r6.a
            r0 = 160(0xa0, float:2.24E-43)
            r1 = 0
            r2 = 0
            switch(r6) {
                case 0: goto L1c5;
                case 1: goto L1a3;
                case 2: goto L197;
                case 3: goto L191;
                case 4: goto L157;
                case 5: goto L13f;
                case 6: goto L132;
                case 7: goto L125;
                case 8: goto L112;
                case 9: goto Lf7;
                case 10: goto Led;
                case 11: goto Le5;
                case 12: goto L7a;
                case 13: goto L1a;
                default: goto L9;
            }
        L9:
            r7.z()
            int r6 = r7.H()
            r7.Q(r8)
            r7.M(r8, r6)
            r7.l(r8)
            return
        L1a:
            qw3 r8 = (defpackage.qw3) r8
            h45 r6 = defpackage.u24.d
            int r0 = r7.H()
            java.lang.Object r1 = r7.L
            ng3 r1 = (defpackage.ng3) r1
            r7.Q(r8)
            java.lang.Object r3 = r8.b
            a21 r3 = (defpackage.a21) r3
            a50 r3 = (defpackage.a50) r3
            boolean r4 = r3 instanceof defpackage.ho4
            if (r4 == 0) goto L4c
            ho4 r3 = (defpackage.ho4) r3
            int r2 = r3.h
            n51 r4 = defpackage.n51.ORDERED
            r6.b(r1, r4)
            h45 r6 = defpackage.u24.f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.b(r1, r2)
            int r6 = r3.h
            int r6 = r6 + 1
            r3.h = r6
            goto L6d
        L4c:
            n51 r3 = defpackage.n51.BULLET
            r6.b(r1, r3)
            h45 r6 = defpackage.u24.e
            java.lang.Object r3 = r8.b
            a21 r3 = (defpackage.a21) r3
            a50 r3 = (defpackage.a50) r3
        L59:
            if (r3 == 0) goto L66
            boolean r4 = r3 instanceof defpackage.qw3
            if (r4 == 0) goto L61
            int r2 = r2 + 1
        L61:
            a21 r3 = r3.c()
            goto L59
        L66:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.b(r1, r2)
        L6d:
            r7.M(r8, r0)
            java.lang.Object r6 = r8.f
            a21 r6 = (defpackage.a21) r6
            if (r6 == 0) goto L79
            r7.z()
        L79:
            return
        L7a:
            java.lang.Object r6 = r7.R
            sn6 r6 = (defpackage.sn6) r6
            m13 r8 = (defpackage.m13) r8
            java.lang.Object r0 = r7.B
            d14 r0 = (defpackage.d14) r0
            ng0 r2 = r0.g
            java.lang.Class<m13> r3 = defpackage.m13.class
            java.util.Map r2 = r2.A
            java.lang.Object r2 = r2.get(r3)
            i50 r2 = (defpackage.i50) r2
            if (r2 != 0) goto L96
            r7.Q(r8)
            goto Le4
        L96:
            int r3 = r7.H()
            r7.Q(r8)
            int r4 = r7.H()
            if (r3 != r4) goto La9
            r4 = 65532(0xfffc, float:9.183E-41)
            r6.a(r4)
        La9:
            java.lang.Object r4 = r8.b
            a21 r4 = (defpackage.a21) r4
            boolean r4 = r4 instanceof defpackage.mv3
            q61 r5 = r0.e
            java.lang.String r8 = r8.g
            r5.getClass()
            java.lang.Object r7 = r7.L
            ng3 r7 = (defpackage.ng3) r7
            h45 r5 = defpackage.mb3.s
            r5.b(r7, r8)
            h45 r8 = defpackage.mb3.t
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r8.b(r7, r4)
            h45 r8 = defpackage.mb3.u
            r8.b(r7, r1)
            java.lang.Object r7 = r2.a(r0, r7)
            java.lang.StringBuilder r8 = r6.A
            int r0 = r8.length()
            int r8 = r8.length()
            if (r0 <= r3) goto Le4
            if (r3 < 0) goto Le4
            if (r0 > r8) goto Le4
            defpackage.sn6.c(r6, r7, r3, r0)
        Le4:
            return
        Le5:
            i43 r8 = (defpackage.i43) r8
            java.lang.String r6 = r8.g
            defpackage.m51.e(r7, r1, r6, r8)
            return
        Led:
            ha2 r8 = (defpackage.ha2) r8
            java.lang.String r6 = r8.j
            java.lang.String r0 = r8.k
            defpackage.m51.e(r7, r6, r0, r8)
            return
        Lf7:
            hs0 r8 = (defpackage.hs0) r8
            int r6 = r7.H()
            java.lang.Object r1 = r7.R
            sn6 r1 = (defpackage.sn6) r1
            java.lang.StringBuilder r2 = r1.A
            r2.append(r0)
            java.lang.String r3 = r8.g
            r2.append(r3)
            r1.a(r0)
            r7.M(r8, r6)
            return
        L112:
            e50 r8 = (defpackage.e50) r8
            r7.z()
            int r6 = r7.H()
            r7.Q(r8)
            r7.M(r8, r6)
            r7.l(r8)
            return
        L125:
            pt1 r8 = (defpackage.pt1) r8
            int r6 = r7.H()
            r7.Q(r8)
            r7.M(r8, r6)
            return
        L132:
            zs6 r8 = (defpackage.zs6) r8
            int r6 = r7.H()
            r7.Q(r8)
            r7.M(r8, r6)
            return
        L13f:
            mv3 r8 = (defpackage.mv3) r8
            int r6 = r7.H()
            r7.Q(r8)
            java.lang.String r0 = r8.g
            h45 r1 = defpackage.u24.h
            java.lang.Object r2 = r7.L
            ng3 r2 = (defpackage.ng3) r2
            r1.b(r2, r0)
            r7.M(r8, r6)
            return
        L157:
            xr4 r8 = (defpackage.xr4) r8
            java.lang.Object r6 = r8.b
            a21 r6 = (defpackage.a21) r6
            a50 r6 = (defpackage.a50) r6
            if (r6 == 0) goto L16f
            java.lang.Object r6 = r6.b
            a21 r6 = (defpackage.a21) r6
            a50 r6 = (defpackage.a50) r6
            boolean r0 = r6 instanceof defpackage.gw3
            if (r0 == 0) goto L16f
            gw3 r6 = (defpackage.gw3) r6
            boolean r2 = r6.g
        L16f:
            if (r2 != 0) goto L174
            r7.z()
        L174:
            int r6 = r7.H()
            r7.Q(r8)
            h45 r0 = defpackage.u24.i
            java.lang.Object r1 = r7.L
            ng3 r1 = (defpackage.ng3) r1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r0.b(r1, r3)
            r7.M(r8, r6)
            if (r2 != 0) goto L190
            r7.l(r8)
        L190:
            return
        L191:
            vv2 r8 = (defpackage.vv2) r8
            r7.z()
            return
        L197:
            wm6 r8 = (defpackage.wm6) r8
            java.lang.Object r6 = r7.R
            sn6 r6 = (defpackage.sn6) r6
            r7 = 32
            r6.a(r7)
            return
        L1a3:
            zw2 r8 = (defpackage.zw2) r8
            r7.z()
            int r6 = r7.H()
            r7.Q(r8)
            h45 r0 = defpackage.u24.g
            java.lang.Object r1 = r7.L
            ng3 r1 = (defpackage.ng3) r1
            int r2 = r8.g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.b(r1, r2)
            r7.M(r8, r6)
            r7.l(r8)
            return
        L1c5:
            d57 r8 = (defpackage.d57) r8
            r7.z()
            int r6 = r7.H()
            java.lang.Object r1 = r7.R
            sn6 r1 = (defpackage.sn6) r1
            r1.a(r0)
            r7.M(r8, r6)
            r7.l(r8)
            return
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hp2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hp2 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ hp2(java.lang.Object r1, long r2, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r2
            r0.L = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.A
            java.lang.String r2 = "Required value was null."
            r3 = 0
            java.lang.String r4 = "game_id"
            r5 = 0
            r6 = 1
            java.lang.Object r7 = r0.L
            long r8 = r0.B
            switch(r1) {
                case 0: goto L153;
                case 1: goto La9;
                default: goto L12;
            }
        L12:
            bn5 r7 = (defpackage.bn5) r7
            r0 = r19
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM ra_game WHERE game_id = ?"
            j36 r1 = r0.i0(r1)
            r1.c(r6, r8)     // Catch: java.lang.Throwable -> L5d
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r8 = "rich_presence_patch"
            int r8 = defpackage.ej2.B(r1, r8)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r9 = "title"
            int r9 = defpackage.ej2.B(r1, r9)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r10 = "icon"
            int r10 = defpackage.ej2.B(r1, r10)     // Catch: java.lang.Throwable -> L5d
            hz3 r11 = new hz3     // Catch: java.lang.Throwable -> L5d
            r11.<init>(r5)     // Catch: java.lang.Throwable -> L5d
        L3f:
            boolean r12 = r1.f0()     // Catch: java.lang.Throwable -> L5d
            if (r12 == 0) goto L5f
            long r12 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L5d
            int r14 = r11.c(r12)     // Catch: java.lang.Throwable -> L5d
            if (r14 < 0) goto L51
            r14 = r6
            goto L52
        L51:
            r14 = r3
        L52:
            if (r14 != 0) goto L3f
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5d
            r14.<init>()     // Catch: java.lang.Throwable -> L5d
            r11.f(r12, r14)     // Catch: java.lang.Throwable -> L5d
            goto L3f
        L5d:
            r0 = move-exception
            goto La5
        L5f:
            r1.reset()     // Catch: java.lang.Throwable -> L5d
            r7.L(r0, r11)     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r1.f0()     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto La1
            long r13 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r1.isNull(r8)     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L77
        L75:
            r15 = r5
            goto L7c
        L77:
            java.lang.String r5 = r1.R(r8)     // Catch: java.lang.Throwable -> L5d
            goto L75
        L7c:
            java.lang.String r16 = r1.R(r9)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r17 = r1.R(r10)     // Catch: java.lang.Throwable -> L5d
            ea5 r12 = new ea5     // Catch: java.lang.Throwable -> L5d
            r12.<init>(r13, r15, r16, r17)     // Catch: java.lang.Throwable -> L5d
            long r3 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = r11.b(r3)     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L9b
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L5d
            ka5 r5 = new ka5     // Catch: java.lang.Throwable -> L5d
            r5.<init>(r12, r0)     // Catch: java.lang.Throwable -> L5d
            goto La1
        L9b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L5d
            throw r0     // Catch: java.lang.Throwable -> L5d
        La1:
            r1.close()
            return r5
        La5:
            r1.close()
            throw r0
        La9:
            lq4 r7 = (defpackage.lq4) r7
            r0 = r19
            um3 r0 = (defpackage.um3) r0
            r1 = 32
            long r2 = r8 >> r1
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L14d
            r4 = 1082130432(0x40800000, float:4.0)
            float r4 = r0.e0(r4)
            zj0 r5 = r0.A
            kk3 r10 = r0.getLayoutDirection()
            float r7 = r7.b(r10)
            float r7 = r0.e0(r7)
            float r7 = r7 - r4
            float r2 = r2 + r7
            r10 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r10
            float r4 = r4 + r2
            kk3 r2 = r0.getLayoutDirection()
            int[] r11 = defpackage.yo4.a
            int r2 = r2.ordinal()
            r2 = r11[r2]
            if (r2 != r6) goto Lf2
            long r12 = r5.e()
            long r12 = r12 >> r1
            int r2 = (int) r12
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 - r4
        Lf0:
            r13 = r2
            goto Lfa
        Lf2:
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lf8
            r2 = r3
            goto Lf0
        Lf8:
            r2 = r7
            goto Lf0
        Lfa:
            kk3 r2 = r0.getLayoutDirection()
            int r2 = r2.ordinal()
            r2 = r11[r2]
            if (r2 != r6) goto L119
            long r11 = r5.e()
            long r1 = r11 >> r1
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 >= 0) goto L116
            goto L117
        L116:
            r3 = r7
        L117:
            float r4 = r1 - r3
        L119:
            r15 = r4
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r8
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r2 = -r1
            float r14 = r2 / r10
            float r16 = r1 / r10
            bt r1 = r5.B
            long r2 = r1.L()
            xj0 r4 = r1.G()
            r4.h()
            java.lang.Object r4 = r1.B     // Catch: java.lang.Throwable -> L148
            r12 = r4
            os0 r12 = (defpackage.os0) r12     // Catch: java.lang.Throwable -> L148
            r17 = 0
            r12.Q(r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L148
            r0.b()     // Catch: java.lang.Throwable -> L148
            defpackage.xg6.v(r1, r2)
            goto L150
        L148:
            r0 = move-exception
            defpackage.xg6.v(r1, r2)
            throw r0
        L14d:
            r0.b()
        L150:
            jg7 r0 = defpackage.jg7.a
            return r0
        L153:
            ip2 r7 = (defpackage.ip2) r7
            r0 = r19
            e36 r0 = (defpackage.e36) r0
            r0.getClass()
            java.lang.String r1 = "SELECT * FROM cheat_folder WHERE game_id = ?"
            j36 r1 = r0.i0(r1)
            r1.c(r6, r8)     // Catch: java.lang.Throwable -> L1ae
            java.lang.String r8 = "id"
            int r8 = defpackage.ej2.B(r1, r8)     // Catch: java.lang.Throwable -> L1ae
            int r4 = defpackage.ej2.B(r1, r4)     // Catch: java.lang.Throwable -> L1ae
            java.lang.String r9 = "name"
            int r9 = defpackage.ej2.B(r1, r9)     // Catch: java.lang.Throwable -> L1ae
            hz3 r10 = new hz3     // Catch: java.lang.Throwable -> L1ae
            r10.<init>(r5)     // Catch: java.lang.Throwable -> L1ae
        L17a:
            boolean r11 = r1.f0()     // Catch: java.lang.Throwable -> L1ae
            if (r11 == 0) goto L1b0
            boolean r11 = r1.isNull(r8)     // Catch: java.lang.Throwable -> L1ae
            if (r11 == 0) goto L188
            r11 = r5
            goto L190
        L188:
            long r11 = r1.getLong(r8)     // Catch: java.lang.Throwable -> L1ae
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L1ae
        L190:
            if (r11 == 0) goto L17a
            long r12 = r11.longValue()     // Catch: java.lang.Throwable -> L1ae
            int r12 = r10.c(r12)     // Catch: java.lang.Throwable -> L1ae
            if (r12 < 0) goto L19e
            r12 = r6
            goto L19f
        L19e:
            r12 = r3
        L19f:
            if (r12 != 0) goto L17a
            long r11 = r11.longValue()     // Catch: java.lang.Throwable -> L1ae
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1ae
            r13.<init>()     // Catch: java.lang.Throwable -> L1ae
            r10.f(r11, r13)     // Catch: java.lang.Throwable -> L1ae
            goto L17a
        L1ae:
            r0 = move-exception
            goto L219
        L1b0:
            r1.reset()     // Catch: java.lang.Throwable -> L1ae
            r7.a(r0, r10)     // Catch: java.lang.Throwable -> L1ae
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1ae
            r0.<init>()     // Catch: java.lang.Throwable -> L1ae
        L1bb:
            boolean r3 = r1.f0()     // Catch: java.lang.Throwable -> L1ae
            if (r3 == 0) goto L215
            boolean r3 = r1.isNull(r8)     // Catch: java.lang.Throwable -> L1ae
            if (r3 == 0) goto L1c9
            r3 = r5
            goto L1d1
        L1c9:
            long r6 = r1.getLong(r8)     // Catch: java.lang.Throwable -> L1ae
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L1ae
        L1d1:
            long r6 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L1ae
            java.lang.String r11 = r1.R(r9)     // Catch: java.lang.Throwable -> L1ae
            cn0 r12 = new cn0     // Catch: java.lang.Throwable -> L1ae
            r12.<init>(r3, r6, r11)     // Catch: java.lang.Throwable -> L1ae
            boolean r3 = r1.isNull(r8)     // Catch: java.lang.Throwable -> L1ae
            if (r3 == 0) goto L1e6
            r3 = r5
            goto L1ee
        L1e6:
            long r6 = r1.getLong(r8)     // Catch: java.lang.Throwable -> L1ae
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L1ae
        L1ee:
            if (r3 == 0) goto L203
            long r6 = r3.longValue()     // Catch: java.lang.Throwable -> L1ae
            java.lang.Object r3 = r10.b(r6)     // Catch: java.lang.Throwable -> L1ae
            if (r3 == 0) goto L1fd
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L1ae
            goto L208
        L1fd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1ae
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1ae
            throw r0     // Catch: java.lang.Throwable -> L1ae
        L203:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1ae
            r3.<init>()     // Catch: java.lang.Throwable -> L1ae
        L208:
            en0 r6 = new en0     // Catch: java.lang.Throwable -> L1ae
            r6.<init>()     // Catch: java.lang.Throwable -> L1ae
            r6.a = r12     // Catch: java.lang.Throwable -> L1ae
            r6.b = r3     // Catch: java.lang.Throwable -> L1ae
            r0.add(r6)     // Catch: java.lang.Throwable -> L1ae
            goto L1bb
        L215:
            r1.close()
            return r0
        L219:
            r1.close()
            throw r0
    }
}

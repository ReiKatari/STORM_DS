package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fw0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fw0 implements defpackage.ho2 {
    public final /* synthetic */ int A;

    public /* synthetic */ fw0(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ho2
    public final java.lang.Object p(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
            r10 = this;
            int r10 = r10.A
            r0 = 0
            r1 = 1170(0x492, float:1.64E-42)
            r2 = 128(0x80, float:1.8E-43)
            r3 = 256(0x100, float:3.59E-43)
            r4 = 16
            r5 = 32
            r6 = 2
            r7 = 4
            r8 = 1
            jg7 r9 = defpackage.jg7.a
            switch(r10) {
                case 0: goto Lce;
                case 1: goto L5f;
                default: goto L15;
            }
        L15:
            android.content.Context r11 = (android.content.Context) r11
            android.content.pm.ResolveInfo r12 = (android.content.pm.ResolveInfo) r12
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r10 = r13.booleanValue()
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            k47 r15 = (defpackage.k47) r15
            long r0 = r15.a
            int r13 = defpackage.k47.f(r0)
            int r15 = defpackage.k47.e(r0)
            java.lang.CharSequence r13 = r14.subSequence(r13, r15)
            java.lang.String r13 = r13.toString()
            android.content.Intent r14 = new android.content.Intent
            r14.<init>()
            java.lang.String r15 = "android.intent.action.PROCESS_TEXT"
            android.content.Intent r14 = r14.setAction(r15)
            java.lang.String r15 = "text/plain"
            android.content.Intent r14 = r14.setType(r15)
            java.lang.String r15 = "android.intent.extra.PROCESS_TEXT_READONLY"
            android.content.Intent r10 = r14.putExtra(r15, r10)
            android.content.pm.ActivityInfo r12 = r12.activityInfo
            java.lang.String r14 = r12.packageName
            java.lang.String r12 = r12.name
            android.content.Intent r10 = r10.setClassName(r14, r12)
            java.lang.String r12 = "android.intent.extra.PROCESS_TEXT"
            r10.putExtra(r12, r13)
            r11.startActivity(r10)
            return r9
        L5f:
            x07 r11 = (defpackage.x07) r11
            m07 r12 = (defpackage.m07) r12
            on2 r13 = (defpackage.on2) r13
            px0 r14 = (defpackage.px0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r10 = r15.intValue()
            r15 = r10 & 6
            if (r15 != 0) goto L8a
            r15 = r10 & 8
            if (r15 != 0) goto L7d
            r15 = r14
            xq2 r15 = (defpackage.xq2) r15
            boolean r15 = r15.f(r11)
            goto L84
        L7d:
            r15 = r14
            xq2 r15 = (defpackage.xq2) r15
            boolean r15 = r15.h(r11)
        L84:
            if (r15 == 0) goto L87
            r6 = r7
        L87:
            r15 = r10 | r6
            goto L8b
        L8a:
            r15 = r10
        L8b:
            r6 = r10 & 48
            if (r6 != 0) goto La6
            r6 = r10 & 64
            if (r6 != 0) goto L9b
            r6 = r14
            xq2 r6 = (defpackage.xq2) r6
            boolean r6 = r6.f(r12)
            goto La2
        L9b:
            r6 = r14
            xq2 r6 = (defpackage.xq2) r6
            boolean r6 = r6.h(r12)
        La2:
            if (r6 == 0) goto La5
            r4 = r5
        La5:
            r15 = r15 | r4
        La6:
            r10 = r10 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto Lb5
            r10 = r14
            xq2 r10 = (defpackage.xq2) r10
            boolean r10 = r10.h(r13)
            if (r10 == 0) goto Lb4
            r2 = r3
        Lb4:
            r15 = r15 | r2
        Lb5:
            r10 = r15 & 1171(0x493, float:1.641E-42)
            if (r10 == r1) goto Lba
            r0 = r8
        Lba:
            r10 = r15 & 1
            xq2 r14 = (defpackage.xq2) r14
            boolean r10 = r14.S(r10, r0)
            if (r10 == 0) goto Lca
            r10 = r15 & 1022(0x3fe, float:1.432E-42)
            defpackage.vf1.c(r11, r12, r13, r14, r10)
            goto Lcd
        Lca:
            r14.V()
        Lcd:
            return r9
        Lce:
            x07 r11 = (defpackage.x07) r11
            m07 r12 = (defpackage.m07) r12
            on2 r13 = (defpackage.on2) r13
            px0 r14 = (defpackage.px0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r10 = r15.intValue()
            r15 = r10 & 6
            if (r15 != 0) goto Lf9
            r15 = r10 & 8
            if (r15 != 0) goto Lec
            r15 = r14
            xq2 r15 = (defpackage.xq2) r15
            boolean r15 = r15.f(r11)
            goto Lf3
        Lec:
            r15 = r14
            xq2 r15 = (defpackage.xq2) r15
            boolean r15 = r15.h(r11)
        Lf3:
            if (r15 == 0) goto Lf6
            r6 = r7
        Lf6:
            r15 = r10 | r6
            goto Lfa
        Lf9:
            r15 = r10
        Lfa:
            r6 = r10 & 48
            if (r6 != 0) goto L115
            r6 = r10 & 64
            if (r6 != 0) goto L10a
            r6 = r14
            xq2 r6 = (defpackage.xq2) r6
            boolean r6 = r6.f(r12)
            goto L111
        L10a:
            r6 = r14
            xq2 r6 = (defpackage.xq2) r6
            boolean r6 = r6.h(r12)
        L111:
            if (r6 == 0) goto L114
            r4 = r5
        L114:
            r15 = r15 | r4
        L115:
            r10 = r10 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L124
            r10 = r14
            xq2 r10 = (defpackage.xq2) r10
            boolean r10 = r10.h(r13)
            if (r10 == 0) goto L123
            r2 = r3
        L123:
            r15 = r15 | r2
        L124:
            r10 = r15 & 1171(0x493, float:1.641E-42)
            if (r10 == r1) goto L129
            r0 = r8
        L129:
            r10 = r15 & 1
            xq2 r14 = (defpackage.xq2) r14
            boolean r10 = r14.S(r10, r0)
            if (r10 == 0) goto L139
            r10 = r15 & 1022(0x3fe, float:1.432E-42)
            defpackage.vf1.c(r11, r12, r13, r14, r10)
            goto L13c
        L139:
            r14.V()
        L13c:
            return r9
    }
}

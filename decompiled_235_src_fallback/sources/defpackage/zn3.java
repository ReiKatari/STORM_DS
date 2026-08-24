package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zn3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zn3 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ android.content.Context B;

    public /* synthetic */ zn3(android.content.Context r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.A
            jg7 r1 = defpackage.jg7.a
            r2 = 2131952137(0x7f130209, float:1.9540708E38)
            r3 = 0
            android.content.Context r14 = r14.B
            switch(r0) {
                case 0: goto L142;
                case 1: goto L12f;
                default: goto Ld;
            }
        Ld:
            android.os.Bundle r15 = (android.os.Bundle) r15
            rc4 r14 = defpackage.gi2.A(r14)
            if (r15 == 0) goto L1e
            android.content.Context r0 = r14.a
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r15.setClassLoader(r0)
        L1e:
            zb4 r0 = r14.b
            java.util.LinkedHashMap r1 = r0.m
            r2 = 0
            if (r15 != 0) goto L27
            goto L110
        L27:
            java.lang.String r4 = "android-support-nav:controller:navigatorState"
            boolean r5 = r15.containsKey(r4)
            if (r5 == 0) goto L3a
            android.os.Bundle r5 = r15.getBundle(r4)
            if (r5 == 0) goto L36
            goto L3b
        L36:
            defpackage.xk2.B(r4)
            throw r2
        L3a:
            r5 = r2
        L3b:
            r0.d = r5
            java.lang.String r4 = "android-support-nav:controller:backStack"
            boolean r5 = r15.containsKey(r4)
            if (r5 == 0) goto L52
            java.util.ArrayList r4 = defpackage.uj2.O(r15, r4)
            android.os.Bundle[] r5 = new android.os.Bundle[r3]
            java.lang.Object[] r4 = r4.toArray(r5)
            android.os.Bundle[] r4 = (android.os.Bundle[]) r4
            goto L53
        L52:
            r4 = r2
        L53:
            r0.e = r4
            r1.clear()
            java.lang.String r4 = "android-support-nav:controller:backStackDestIds"
            boolean r5 = r15.containsKey(r4)
            if (r5 == 0) goto La6
            java.lang.String r5 = "android-support-nav:controller:backStackIds"
            boolean r6 = r15.containsKey(r5)
            if (r6 == 0) goto La6
            int[] r6 = r15.getIntArray(r4)
            if (r6 == 0) goto La2
            java.util.ArrayList r4 = r15.getStringArrayList(r5)
            if (r4 == 0) goto L9e
            int r5 = r6.length
            r7 = r3
            r8 = r7
        L77:
            if (r7 >= r5) goto La6
            r9 = r6[r7]
            int r10 = r8 + 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.util.LinkedHashMap r11 = r0.l
            java.lang.Object r12 = r4.get(r8)
            java.lang.String r13 = ""
            boolean r12 = defpackage.nb3.k(r12, r13)
            if (r12 != 0) goto L96
            java.lang.Object r8 = r4.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L97
        L96:
            r8 = r2
        L97:
            r11.put(r9, r8)
            int r7 = r7 + 1
            r8 = r10
            goto L77
        L9e:
            defpackage.xk2.B(r5)
            throw r2
        La2:
            defpackage.xk2.B(r4)
            throw r2
        La6:
            java.lang.String r0 = "android-support-nav:controller:backStackStates"
            boolean r4 = r15.containsKey(r0)
            if (r4 == 0) goto L110
            java.util.ArrayList r4 = r15.getStringArrayList(r0)
            if (r4 == 0) goto L10c
            int r0 = r4.size()
            r5 = r3
        Lb9:
            if (r5 >= r0) goto L110
            java.lang.Object r6 = r4.get(r5)
            int r5 = r5 + 1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "android-support-nav:controller:backStackStates:"
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            boolean r7 = r15.containsKey(r7)
            if (r7 == 0) goto Lb9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.util.ArrayList r7 = defpackage.uj2.O(r15, r7)
            pu r8 = new pu
            int r9 = r7.size()
            r8.<init>(r9)
            int r9 = r7.size()
            r10 = r3
        Lf5:
            if (r10 >= r9) goto L108
            java.lang.Object r11 = r7.get(r10)
            int r10 = r10 + 1
            android.os.Bundle r11 = (android.os.Bundle) r11
            ub4 r12 = new ub4
            r12.<init>(r11)
            r8.addLast(r12)
            goto Lf5
        L108:
            r1.put(r6, r8)
            goto Lb9
        L10c:
            defpackage.xk2.B(r0)
            throw r2
        L110:
            if (r15 == 0) goto L12e
            java.lang.String r0 = "android-support-nav:controller:deepLinkHandled"
            boolean r1 = r15.getBoolean(r0, r3)
            if (r1 != 0) goto L122
            r4 = 1
            boolean r15 = r15.getBoolean(r0, r4)
            if (r15 != r4) goto L122
            goto L126
        L122:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
        L126:
            if (r2 == 0) goto L12c
            boolean r3 = r2.booleanValue()
        L12c:
            r14.e = r3
        L12e:
            return r14
        L12f:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L13a
            r2 = 2131952133(0x7f130205, float:1.95407E38)
        L13a:
            android.widget.Toast r14 = android.widget.Toast.makeText(r14, r2, r3)
            r14.show()
            return r1
        L142:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L14d
            r2 = 2131952134(0x7f130206, float:1.9540702E38)
        L14d:
            android.widget.Toast r14 = android.widget.Toast.makeText(r14, r2, r3)
            r14.show()
            return r1
    }
}

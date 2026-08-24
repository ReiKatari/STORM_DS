package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: el2  reason: default package */
/* loaded from: classes.dex */
public final class el2 implements defpackage.a9 {
    public final /* synthetic */ int A;
    public final /* synthetic */ androidx.fragment.app.u B;

    public /* synthetic */ el2(androidx.fragment.app.u r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.a9
    public final void a(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.A
            androidx.fragment.app.u r1 = r7.B
            java.lang.String r2 = "FragmentManager"
            switch(r0) {
                case 0: goto L91;
                case 1: goto L4d;
                default: goto L9;
            }
        L9:
            z8 r8 = (defpackage.z8) r8
            java.util.ArrayDeque r0 = r1.F
            java.lang.Object r0 = r0.pollFirst()
            il2 r0 = (defpackage.il2) r0
            if (r0 != 0) goto L27
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "No IntentSenders were started for "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.w(r2, r7)
            goto L4c
        L27:
            java.lang.String r7 = r0.A
            int r0 = r0.B
            androidx.fragment.app.y r1 = r1.c
            androidx.fragment.app.o r1 = r1.c(r7)
            if (r1 != 0) goto L45
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Intent Sender result delivered for unknown Fragment "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.w(r2, r7)
            goto L4c
        L45:
            int r7 = r8.A
            android.content.Intent r8 = r8.B
            r1.onActivityResult(r0, r7, r8)
        L4c:
            return
        L4d:
            z8 r8 = (defpackage.z8) r8
            java.util.ArrayDeque r0 = r1.F
            java.lang.Object r0 = r0.pollLast()
            il2 r0 = (defpackage.il2) r0
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "No Activities were started for result for "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.w(r2, r7)
            goto L90
        L6b:
            java.lang.String r7 = r0.A
            int r0 = r0.B
            androidx.fragment.app.y r1 = r1.c
            androidx.fragment.app.o r1 = r1.c(r7)
            if (r1 != 0) goto L89
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Activity result delivered for unknown Fragment "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.w(r2, r7)
            goto L90
        L89:
            int r7 = r8.A
            android.content.Intent r8 = r8.B
            r1.onActivityResult(r0, r7, r8)
        L90:
            return
        L91:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Set r0 = r8.keySet()
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.Object[] r0 = r0.toArray(r4)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.Collection r8 = r8.values()
            r4.<init>(r8)
            int r8 = r4.size()
            int[] r8 = new int[r8]
            r5 = r3
        Lb0:
            int r6 = r4.size()
            if (r5 >= r6) goto Lca
            java.lang.Object r6 = r4.get(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto Lc4
            r6 = r3
            goto Lc5
        Lc4:
            r6 = -1
        Lc5:
            r8[r5] = r6
            int r5 = r5 + 1
            goto Lb0
        Lca:
            java.util.ArrayDeque r3 = r1.F
            java.lang.Object r3 = r3.pollFirst()
            il2 r3 = (defpackage.il2) r3
            if (r3 != 0) goto Le6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "No permissions were requested for "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.w(r2, r7)
            goto L107
        Le6:
            java.lang.String r7 = r3.A
            int r3 = r3.B
            androidx.fragment.app.y r1 = r1.c
            androidx.fragment.app.o r1 = r1.c(r7)
            if (r1 != 0) goto L104
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Permission request result delivered for unknown Fragment "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.w(r2, r7)
            goto L107
        L104:
            r1.onRequestPermissionsResult(r3, r0, r8)
        L107:
            return
    }
}

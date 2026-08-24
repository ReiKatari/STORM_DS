package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c9  reason: default package */
/* loaded from: classes.dex */
public final class c9 extends defpackage.b9 {
    public final /* synthetic */ int a;

    public /* synthetic */ c9(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.b9
    public final android.content.Intent a(android.content.Context r4, java.lang.Object r5) {
            r3 = this;
            int r3 = r3.a
            java.lang.String r4 = "androidx.activity.result.contract.extra.PERMISSIONS"
            java.lang.String r0 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
            java.lang.String r1 = "android.intent.extra.TITLE"
            java.lang.String r2 = "android.intent.action.CREATE_DOCUMENT"
            switch(r3) {
                case 0: goto Ldd;
                case 1: goto Lc1;
                case 2: goto Laa;
                case 3: goto L98;
                case 4: goto L82;
                case 5: goto L7c;
                case 6: goto L5e;
                default: goto Ld;
            }
        Ld:
            s93 r5 = (defpackage.s93) r5
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
            r3.<init>(r4)
            android.content.Intent r4 = r5.B
            if (r4 == 0) goto L3e
            java.lang.String r0 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            android.os.Bundle r1 = r4.getBundleExtra(r0)
            if (r1 == 0) goto L3e
            r3.putExtra(r0, r1)
            r4.removeExtra(r0)
            java.lang.String r0 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
            r1 = 0
            boolean r4 = r4.getBooleanExtra(r0, r1)
            if (r4 == 0) goto L3e
            android.content.IntentSender r4 = r5.A
            int r0 = r5.R
            int r5 = r5.L
            s93 r1 = new s93
            r2 = 0
            r1.<init>(r4, r2, r5, r0)
            r5 = r1
        L3e:
            java.lang.String r4 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
            r3.putExtra(r4, r5)
            r4 = 2
            boolean r4 = androidx.fragment.app.u.K(r4)
            if (r4 == 0) goto L5d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "CreateIntent created the following intent: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "FragmentManager"
            android.util.Log.v(r5, r4)
        L5d:
            return r3
        L5e:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r2)
            android.content.Intent r3 = r3.putExtra(r1, r5)
            java.lang.String r4 = "android.intent.category.OPENABLE"
            android.content.Intent r3 = r3.addCategory(r4)
            java.lang.String r4 = "application/octet-stream"
            android.content.Intent r3 = r3.setType(r4)
            r3.getClass()
            return r3
        L7c:
            android.content.Intent r5 = (android.content.Intent) r5
            r5.getClass()
            return r5
        L82:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            java.lang.String[] r3 = new java.lang.String[]{r5}
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r0)
            android.content.Intent r3 = r5.putExtra(r4, r3)
            r3.getClass()
            return r3
        L98:
            java.lang.String[] r5 = (java.lang.String[]) r5
            r5.getClass()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            android.content.Intent r3 = r3.putExtra(r4, r5)
            r3.getClass()
            return r3
        Laa:
            android.net.Uri r5 = (android.net.Uri) r5
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.OPEN_DOCUMENT_TREE"
            r3.<init>(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r4 < r0) goto Lc0
            if (r5 == 0) goto Lc0
            java.lang.String r4 = "android.provider.extra.INITIAL_URI"
            r3.putExtra(r4, r5)
        Lc0:
            return r3
        Lc1:
            java.lang.String[] r5 = (java.lang.String[]) r5
            r5.getClass()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.OPEN_DOCUMENT"
            r3.<init>(r4)
            java.lang.String r4 = "android.intent.extra.MIME_TYPES"
            android.content.Intent r3 = r3.putExtra(r4, r5)
            java.lang.String r4 = "*/*"
            android.content.Intent r3 = r3.setType(r4)
            r3.getClass()
            return r3
        Ldd:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r2)
            java.lang.String r4 = "application/json"
            android.content.Intent r3 = r3.setType(r4)
            android.content.Intent r3 = r3.putExtra(r1, r5)
            r3.getClass()
            return r3
    }

    @Override // defpackage.b9
    public defpackage.os0 b(android.content.Context r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.a
            r1 = 7
            r2 = 0
            switch(r0) {
                case 0: goto L6a;
                case 1: goto L64;
                case 2: goto L61;
                case 3: goto L1f;
                case 4: goto Lc;
                default: goto L7;
            }
        L7:
            os0 r5 = super.b(r6, r7)
            return r5
        Lc:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            int r5 = defpackage.ge7.s(r6, r7)
            if (r5 != 0) goto L1e
            os0 r2 = new os0
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r2.<init>(r5, r1)
        L1e:
            return r2
        L1f:
            java.lang.String[] r7 = (java.lang.String[]) r7
            r7.getClass()
            int r5 = r7.length
            if (r5 != 0) goto L2f
            os0 r2 = new os0
            zt1 r5 = defpackage.zt1.A
            r2.<init>(r5, r1)
            goto L60
        L2f:
            int r5 = r7.length
            r0 = 0
            r3 = r0
        L32:
            if (r3 >= r5) goto L3f
            r4 = r7[r3]
            int r4 = defpackage.ge7.s(r6, r4)
            if (r4 != 0) goto L60
            int r3 = r3 + 1
            goto L32
        L3f:
            int r5 = r7.length
            int r5 = defpackage.c14.k0(r5)
            r6 = 16
            if (r5 >= r6) goto L49
            r5 = r6
        L49:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r5)
            int r5 = r7.length
        L4f:
            if (r0 >= r5) goto L5b
            r2 = r7[r0]
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r6.put(r2, r3)
            int r0 = r0 + 1
            goto L4f
        L5b:
            os0 r2 = new os0
            r2.<init>(r6, r1)
        L60:
            return r2
        L61:
            android.net.Uri r7 = (android.net.Uri) r7
            return r2
        L64:
            java.lang.String[] r7 = (java.lang.String[]) r7
            r7.getClass()
            return r2
        L6a:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            return r2
    }

    @Override // defpackage.b9
    public final java.lang.Object c(android.content.Intent r6, int r7) {
            r5 = this;
            int r5 = r5.a
            java.lang.String r0 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = -1
            switch(r5) {
                case 0: goto L97;
                case 1: goto L8c;
                case 2: goto L81;
                case 3: goto L41;
                case 4: goto L21;
                case 5: goto L1b;
                case 6: goto L11;
                default: goto Lb;
            }
        Lb:
            z8 r5 = new z8
            r5.<init>(r6, r7)
            return r5
        L11:
            if (r6 == 0) goto L1a
            if (r7 == r4) goto L16
            goto L1a
        L16:
            android.net.Uri r3 = r6.getData()
        L1a:
            return r3
        L1b:
            z8 r5 = new z8
            r5.<init>(r6, r7)
            return r5
        L21:
            if (r6 == 0) goto L3e
            if (r7 == r4) goto L26
            goto L3e
        L26:
            int[] r5 = r6.getIntArrayExtra(r0)
            if (r5 == 0) goto L39
            int r6 = r5.length
            r7 = r1
        L2e:
            if (r7 >= r6) goto L39
            r0 = r5[r7]
            if (r0 != 0) goto L36
            r1 = r2
            goto L39
        L36:
            int r7 = r7 + 1
            goto L2e
        L39:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            goto L40
        L3e:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L40:
            return r5
        L41:
            if (r7 == r4) goto L44
            goto L7e
        L44:
            if (r6 != 0) goto L47
            goto L7e
        L47:
            java.lang.String r5 = "androidx.activity.result.contract.extra.PERMISSIONS"
            java.lang.String[] r5 = r6.getStringArrayExtra(r5)
            int[] r6 = r6.getIntArrayExtra(r0)
            if (r6 == 0) goto L7e
            if (r5 != 0) goto L56
            goto L7e
        L56:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r6.length
            r7.<init>(r0)
            int r0 = r6.length
            r3 = r1
        L5e:
            if (r3 >= r0) goto L71
            r4 = r6[r3]
            if (r4 != 0) goto L66
            r4 = r2
            goto L67
        L66:
            r4 = r1
        L67:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r7.add(r4)
            int r3 = r3 + 1
            goto L5e
        L71:
            java.util.ArrayList r5 = defpackage.fv.C0(r5)
            java.util.ArrayList r5 = defpackage.gt0.q1(r5, r7)
            java.util.Map r5 = defpackage.c14.r0(r5)
            goto L80
        L7e:
            zt1 r5 = defpackage.zt1.A
        L80:
            return r5
        L81:
            if (r7 != r4) goto L84
            goto L85
        L84:
            r6 = r3
        L85:
            if (r6 == 0) goto L8b
            android.net.Uri r3 = r6.getData()
        L8b:
            return r3
        L8c:
            if (r7 != r4) goto L8f
            goto L90
        L8f:
            r6 = r3
        L90:
            if (r6 == 0) goto L96
            android.net.Uri r3 = r6.getData()
        L96:
            return r3
        L97:
            if (r7 != r4) goto L9a
            goto L9b
        L9a:
            r6 = r3
        L9b:
            if (r6 == 0) goto La1
            android.net.Uri r3 = r6.getData()
        La1:
            return r3
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: du6  reason: default package */
/* loaded from: classes.dex */
public final class du6 extends defpackage.z71 implements android.view.View.OnClickListener {
    public static final /* synthetic */ int t0 = 0;
    public final int d0;
    public final int e0;
    public final android.view.LayoutInflater f0;
    public final androidx.appcompat.widget.SearchView g0;
    public final android.app.SearchableInfo h0;
    public final android.content.Context i0;
    public final java.util.WeakHashMap j0;
    public final int k0;
    public int l0;
    public android.content.res.ColorStateList m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;

    public du6(android.content.Context r6, androidx.appcompat.widget.SearchView r7, android.app.SearchableInfo r8, java.util.WeakHashMap r9) {
            r5 = this;
            int r0 = r7.getSuggestionRowLayout()
            r5.<init>()
            r1 = 1
            r5.B = r1
            r2 = 0
            r5.L = r2
            r2 = 0
            r5.A = r2
            r3 = -1
            r5.R = r3
            x71 r4 = new x71
            r4.<init>(r5)
            r5.X = r4
            y71 r4 = new y71
            r4.<init>(r5, r2)
            r5.Y = r4
            r5.e0 = r0
            r5.d0 = r0
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            r5.f0 = r0
            r5.l0 = r1
            r5.n0 = r3
            r5.o0 = r3
            r5.p0 = r3
            r5.q0 = r3
            r5.r0 = r3
            r5.s0 = r3
            r5.g0 = r7
            r5.h0 = r8
            int r7 = r7.getSuggestionCommitIconResId()
            r5.k0 = r7
            r5.i0 = r6
            r5.j0 = r9
            return
    }

    public static java.lang.String h(android.database.Cursor r2, int r3) {
            r0 = -1
            r1 = 0
            if (r3 != r0) goto L5
            return r1
        L5:
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Exception -> La
            return r2
        La:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r0 = "unexpected error retrieving valid column from cursor, did the remote process die?"
            android.util.Log.e(r3, r0, r2)
            return r1
    }

    @Override // defpackage.z71
    public final void a(android.view.View r21, android.database.Cursor r22) {
            r20 = this;
            r1 = r20
            r2 = r22
            java.lang.Object r0 = r21.getTag()
            r3 = r0
            cu6 r3 = (defpackage.cu6) r3
            int r0 = r1.s0
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L17
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L18
        L17:
            r6 = r4
        L18:
            android.widget.TextView r7 = r3.a
            android.widget.TextView r0 = r3.b
            android.widget.ImageView r8 = r3.e
            r9 = 8
            if (r7 == 0) goto L38
            int r10 = r1.n0
            java.lang.String r10 = h(r2, r10)
            r7.setText(r10)
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L35
            r7.setVisibility(r9)
            goto L38
        L35:
            r7.setVisibility(r4)
        L38:
            r10 = 2
            android.content.Context r11 = r1.i0
            r12 = 1
            if (r0 == 0) goto Lb1
            int r13 = r1.p0
            java.lang.String r13 = h(r2, r13)
            if (r13 == 0) goto L84
            android.content.res.ColorStateList r14 = r1.m0
            if (r14 != 0) goto L65
            android.util.TypedValue r14 = new android.util.TypedValue
            r14.<init>()
            android.content.res.Resources$Theme r15 = r11.getTheme()
            r5 = 2130969950(0x7f04055e, float:1.7548596E38)
            r15.resolveAttribute(r5, r14, r12)
            android.content.res.Resources r5 = r11.getResources()
            int r14 = r14.resourceId
            android.content.res.ColorStateList r5 = r5.getColorStateList(r14)
            r1.m0 = r5
        L65:
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r13)
            android.text.style.TextAppearanceSpan r14 = new android.text.style.TextAppearanceSpan
            android.content.res.ColorStateList r15 = r1.m0
            r19 = 0
            r18 = r15
            r15 = 0
            r16 = 0
            r17 = 0
            r14.<init>(r15, r16, r17, r18, r19)
            int r13 = r13.length()
            r15 = 33
            r5.setSpan(r14, r4, r13, r15)
            goto L8a
        L84:
            int r5 = r1.o0
            java.lang.String r5 = h(r2, r5)
        L8a:
            boolean r13 = android.text.TextUtils.isEmpty(r5)
            if (r13 == 0) goto L99
            if (r7 == 0) goto La1
            r7.setSingleLine(r4)
            r7.setMaxLines(r10)
            goto La1
        L99:
            if (r7 == 0) goto La1
            r7.setSingleLine(r12)
            r7.setMaxLines(r12)
        La1:
            r0.setText(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto Lae
            r0.setVisibility(r9)
            goto Lb1
        Lae:
            r0.setVisibility(r4)
        Lb1:
            android.widget.ImageView r5 = r3.c
            if (r5 == 0) goto L15b
            int r0 = r1.q0
            r14 = -1
            if (r0 != r14) goto Lbd
            r0 = 0
            goto L146
        Lbd:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.f(r0)
            if (r0 == 0) goto Lc9
            goto L146
        Lc9:
            android.app.SearchableInfo r0 = r1.h0
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r14 = r0.flattenToShortString()
            java.util.WeakHashMap r15 = r1.j0
            boolean r16 = r15.containsKey(r14)
            if (r16 == 0) goto Lee
            java.lang.Object r0 = r15.get(r14)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto Le5
            r0 = 0
            goto L13b
        Le5:
            android.content.res.Resources r14 = r11.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r14)
            goto L13b
        Lee:
            java.lang.String r13 = "SuggestionsAdapter"
            android.content.pm.PackageManager r10 = r11.getPackageManager()
            r9 = 128(0x80, float:1.8E-43)
            android.content.pm.ActivityInfo r9 = r10.getActivityInfo(r0, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L127
            int r12 = r9.getIconResource()
            if (r12 != 0) goto L102
        L100:
            r0 = 0
            goto L130
        L102:
            java.lang.String r4 = r0.getPackageName()
            android.content.pm.ApplicationInfo r9 = r9.applicationInfo
            android.graphics.drawable.Drawable r4 = r10.getDrawable(r4, r12, r9)
            if (r4 != 0) goto L125
            java.lang.String r4 = "Invalid icon resource "
            java.lang.String r9 = " for "
            java.lang.StringBuilder r4 = defpackage.xg6.t(r4, r12, r9)
            java.lang.String r0 = r0.flattenToShortString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.w(r13, r0)
            goto L100
        L125:
            r0 = r4
            goto L130
        L127:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r13, r0)
            goto L100
        L130:
            if (r0 != 0) goto L134
            r4 = 0
            goto L138
        L134:
            android.graphics.drawable.Drawable$ConstantState r4 = r0.getConstantState()
        L138:
            r15.put(r14, r4)
        L13b:
            if (r0 == 0) goto L13e
            goto L146
        L13e:
            android.content.pm.PackageManager r0 = r11.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L146:
            r5.setImageDrawable(r0)
            if (r0 != 0) goto L150
            r0 = 4
            r5.setVisibility(r0)
            goto L15b
        L150:
            r4 = 0
            r5.setVisibility(r4)
            r0.setVisible(r4, r4)
            r5 = 1
            r0.setVisible(r5, r4)
        L15b:
            android.widget.ImageView r0 = r3.d
            if (r0 == 0) goto L185
            int r3 = r1.r0
            r14 = -1
            if (r3 != r14) goto L166
            r13 = 0
            goto L16e
        L166:
            java.lang.String r2 = r2.getString(r3)
            android.graphics.drawable.Drawable r13 = r1.f(r2)
        L16e:
            r0.setImageDrawable(r13)
            if (r13 != 0) goto L179
            r2 = 8
            r0.setVisibility(r2)
            goto L185
        L179:
            r4 = 0
            r0.setVisibility(r4)
            r13.setVisible(r4, r4)
            r5 = 1
            r13.setVisible(r5, r4)
            goto L186
        L185:
            r5 = 1
        L186:
            int r0 = r1.l0
            r2 = 2
            if (r0 == r2) goto L191
            if (r0 != r5) goto L193
            r0 = r6 & 1
            if (r0 == 0) goto L193
        L191:
            r4 = 0
            goto L199
        L193:
            r2 = 8
            r8.setVisibility(r2)
            goto L1a6
        L199:
            r8.setVisibility(r4)
            java.lang.CharSequence r0 = r7.getText()
            r8.setTag(r0)
            r8.setOnClickListener(r1)
        L1a6:
            return
    }

    @Override // defpackage.z71
    public final void b(android.database.Cursor r2) {
            r1 = this;
            super.b(r2)     // Catch: java.lang.Exception -> L36
            if (r2 == 0) goto L35
            java.lang.String r0 = "suggest_text_1"
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r1.n0 = r0     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "suggest_text_2"
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r1.o0 = r0     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "suggest_text_2_url"
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r1.p0 = r0     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "suggest_icon_1"
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r1.q0 = r0     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "suggest_icon_2"
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r1.r0 = r0     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "suggest_flags"
            int r2 = r2.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36
            r1.s0 = r2     // Catch: java.lang.Exception -> L36
        L35:
            return
        L36:
            r1 = move-exception
            java.lang.String r2 = "SuggestionsAdapter"
            java.lang.String r0 = "error changing cursor and caching columns"
            android.util.Log.e(r2, r0, r1)
            return
    }

    @Override // defpackage.z71
    public final java.lang.String c(android.database.Cursor r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L38
        L3:
            java.lang.String r0 = "suggest_intent_query"
            int r0 = r2.getColumnIndex(r0)
            java.lang.String r0 = h(r2, r0)
            if (r0 == 0) goto L10
            return r0
        L10:
            android.app.SearchableInfo r1 = r1.h0
            boolean r0 = r1.shouldRewriteQueryFromData()
            if (r0 == 0) goto L25
            java.lang.String r0 = "suggest_intent_data"
            int r0 = r2.getColumnIndex(r0)
            java.lang.String r0 = h(r2, r0)
            if (r0 == 0) goto L25
            return r0
        L25:
            boolean r1 = r1.shouldRewriteQueryFromText()
            if (r1 == 0) goto L38
            java.lang.String r1 = "suggest_text_1"
            int r1 = r2.getColumnIndex(r1)
            java.lang.String r1 = h(r2, r1)
            if (r1 == 0) goto L38
            return r1
        L38:
            r1 = 0
            return r1
    }

    @Override // defpackage.z71
    public final android.view.View d(android.view.ViewGroup r4) {
            r3 = this;
            int r0 = r3.d0
            r1 = 0
            android.view.LayoutInflater r2 = r3.f0
            android.view.View r4 = r2.inflate(r0, r4, r1)
            cu6 r0 = new cu6
            r0.<init>(r4)
            r4.setTag(r0)
            r0 = 2131427565(0x7f0b00ed, float:1.847675E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            int r3 = r3.k0
            r0.setImageResource(r3)
            return r4
    }

    public final android.graphics.drawable.Drawable e(android.net.Uri r7) {
            r6 = this;
            java.lang.String r0 = r7.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L83
            android.content.Context r6 = r6.i0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            android.content.res.Resources r6 = r6.getResourcesForApplication(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.util.List r1 = r7.getPathSegments()
            if (r1 == 0) goto L6b
            int r2 = r1.size()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L39
            java.lang.Object r0 = r1.get(r3)     // Catch: java.lang.NumberFormatException -> L2d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L2d
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L2d
            goto L4c
        L2d:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r0 = "Single path segment is not a resource ID: "
            java.lang.String r7 = defpackage.xg6.n(r7, r0)
            r6.<init>(r7)
            throw r6
        L39:
            r5 = 2
            if (r2 != r5) goto L5f
            java.lang.Object r2 = r1.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r6.getIdentifier(r2, r1, r0)
        L4c:
            if (r0 == 0) goto L53
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r0)
            return r6
        L53:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r0 = "No resource found for: "
            java.lang.String r7 = defpackage.xg6.n(r7, r0)
            r6.<init>(r7)
            throw r6
        L5f:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r0 = "More than two path segments: "
            java.lang.String r7 = defpackage.xg6.n(r7, r0)
            r6.<init>(r7)
            throw r6
        L6b:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r0 = "No path: "
            java.lang.String r7 = defpackage.xg6.n(r7, r0)
            r6.<init>(r7)
            throw r6
        L77:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r0 = "No package found for authority: "
            java.lang.String r7 = defpackage.xg6.n(r7, r0)
            r6.<init>(r7)
            throw r6
        L83:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r0 = "No authority: "
            java.lang.String r7 = defpackage.xg6.n(r7, r0)
            r6.<init>(r7)
            throw r6
    }

    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
            r10 = this;
            java.util.WeakHashMap r0 = r10.j0
            java.lang.String r1 = "SuggestionsAdapter"
            android.content.Context r2 = r10.i0
            java.lang.String r3 = "android.resource://"
            r4 = 0
            if (r11 == 0) goto L113
            boolean r5 = r11.isEmpty()
            if (r5 != 0) goto L113
            java.lang.String r5 = "0"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L1b
            goto L113
        L1b:
            int r5 = java.lang.Integer.parseInt(r11)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L60
            r6.<init>(r3)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L60
            java.lang.String r3 = r2.getPackageName()     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L60
            r6.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L60
            java.lang.String r3 = "/"
            r6.append(r3)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L60
            r6.append(r5)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L60
            java.lang.String r3 = r6.toString()     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L60
            java.lang.Object r6 = r0.get(r3)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L60
            android.graphics.drawable.Drawable$ConstantState r6 = (android.graphics.drawable.Drawable.ConstantState) r6     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L60
            if (r6 != 0) goto L41
            r6 = r4
            goto L45
        L41:
            android.graphics.drawable.Drawable r6 = r6.newDrawable()     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L60
        L45:
            if (r6 == 0) goto L48
            return r6
        L48:
            android.graphics.drawable.Drawable r5 = r2.getDrawable(r5)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L60
            if (r5 == 0) goto L55
            android.graphics.drawable.Drawable$ConstantState r6 = r5.getConstantState()     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L60
            r0.put(r3, r6)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L60
        L55:
            return r5
        L56:
            java.lang.String r10 = "Icon resource not found: "
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r1, r10)
            return r4
        L60:
            java.lang.Object r3 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3
            if (r3 != 0) goto L6a
            r3 = r4
            goto L6e
        L6a:
            android.graphics.drawable.Drawable r3 = r3.newDrawable()
        L6e:
            if (r3 == 0) goto L71
            return r3
        L71:
            android.net.Uri r3 = android.net.Uri.parse(r11)
            java.lang.String r5 = "Error closing icon stream for "
            java.lang.String r6 = "Failed to open "
            java.lang.String r7 = "Resource does not exist: "
            java.lang.String r8 = r3.getScheme()     // Catch: java.io.FileNotFoundException -> L8d
            java.lang.String r9 = "android.resource"
            boolean r8 = r9.equals(r8)     // Catch: java.io.FileNotFoundException -> L8d
            if (r8 == 0) goto La1
            android.graphics.drawable.Drawable r4 = r10.e(r3)     // Catch: java.io.FileNotFoundException -> L8d android.content.res.Resources.NotFoundException -> L8f
            goto L10a
        L8d:
            r10 = move-exception
            goto Led
        L8f:
            java.io.FileNotFoundException r10 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L8d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L8d
            r2.<init>(r7)     // Catch: java.io.FileNotFoundException -> L8d
            r2.append(r3)     // Catch: java.io.FileNotFoundException -> L8d
            java.lang.String r2 = r2.toString()     // Catch: java.io.FileNotFoundException -> L8d
            r10.<init>(r2)     // Catch: java.io.FileNotFoundException -> L8d
            throw r10     // Catch: java.io.FileNotFoundException -> L8d
        La1:
            android.content.ContentResolver r10 = r2.getContentResolver()     // Catch: java.io.FileNotFoundException -> L8d
            java.io.InputStream r10 = r10.openInputStream(r3)     // Catch: java.io.FileNotFoundException -> L8d
            if (r10 == 0) goto Ldb
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r10, r4)     // Catch: java.lang.Throwable -> Lc5
            r10.close()     // Catch: java.io.IOException -> Lb4
        Lb2:
            r4 = r2
            goto L10a
        Lb4:
            r10 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L8d
            r6.<init>(r5)     // Catch: java.io.FileNotFoundException -> L8d
            r6.append(r3)     // Catch: java.io.FileNotFoundException -> L8d
            java.lang.String r5 = r6.toString()     // Catch: java.io.FileNotFoundException -> L8d
            android.util.Log.e(r1, r5, r10)     // Catch: java.io.FileNotFoundException -> L8d
            goto Lb2
        Lc5:
            r2 = move-exception
            r10.close()     // Catch: java.io.IOException -> Lca
            goto Lda
        Lca:
            r10 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L8d
            r6.<init>(r5)     // Catch: java.io.FileNotFoundException -> L8d
            r6.append(r3)     // Catch: java.io.FileNotFoundException -> L8d
            java.lang.String r5 = r6.toString()     // Catch: java.io.FileNotFoundException -> L8d
            android.util.Log.e(r1, r5, r10)     // Catch: java.io.FileNotFoundException -> L8d
        Lda:
            throw r2     // Catch: java.io.FileNotFoundException -> L8d
        Ldb:
            java.io.FileNotFoundException r10 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L8d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L8d
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L8d
            r2.append(r3)     // Catch: java.io.FileNotFoundException -> L8d
            java.lang.String r2 = r2.toString()     // Catch: java.io.FileNotFoundException -> L8d
            r10.<init>(r2)     // Catch: java.io.FileNotFoundException -> L8d
            throw r10     // Catch: java.io.FileNotFoundException -> L8d
        Led:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Icon not found: "
            r2.<init>(r5)
            r2.append(r3)
            java.lang.String r3 = ", "
            r2.append(r3)
            java.lang.String r10 = r10.getMessage()
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            android.util.Log.w(r1, r10)
        L10a:
            if (r4 == 0) goto L113
            android.graphics.drawable.Drawable$ConstantState r10 = r4.getConstantState()
            r0.put(r11, r10)
        L113:
            return r4
    }

    public final android.database.Cursor g(android.app.SearchableInfo r10, java.lang.String r11) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            goto La
        L4:
            java.lang.String r1 = r10.getSuggestAuthority()
            if (r1 != 0) goto Lb
        La:
            return r0
        Lb:
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r1 = r2.authority(r1)
            java.lang.String r2 = ""
            android.net.Uri$Builder r1 = r1.query(r2)
            android.net.Uri$Builder r1 = r1.fragment(r2)
            java.lang.String r2 = r10.getSuggestPath()
            if (r2 == 0) goto L2d
            r1.appendEncodedPath(r2)
        L2d:
            java.lang.String r2 = "search_suggest_query"
            r1.appendPath(r2)
            java.lang.String r6 = r10.getSuggestSelection()
            if (r6 == 0) goto L40
            r10 = 1
            java.lang.String[] r0 = new java.lang.String[r10]
            r10 = 0
            r0[r10] = r11
        L3e:
            r7 = r0
            goto L44
        L40:
            r1.appendPath(r11)
            goto L3e
        L44:
            java.lang.String r10 = "limit"
            r11 = 50
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r1.appendQueryParameter(r10, r11)
            android.net.Uri r4 = r1.build()
            android.content.Context r9 = r9.i0
            android.content.ContentResolver r3 = r9.getContentResolver()
            r5 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)
            return r9
    }

    @Override // defpackage.z71, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.View r1 = super.getDropDownView(r2, r3, r4)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L5:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions cursor threw exception."
            android.util.Log.w(r3, r0, r2)
            int r3 = r1.e0
            r0 = 0
            android.view.LayoutInflater r1 = r1.f0
            android.view.View r1 = r1.inflate(r3, r4, r0)
            if (r1 == 0) goto L27
            java.lang.Object r3 = r1.getTag()
            cu6 r3 = (defpackage.cu6) r3
            android.widget.TextView r3 = r3.a
            java.lang.String r2 = r2.toString()
            r3.setText(r2)
        L27:
            return r1
    }

    @Override // defpackage.z71, android.widget.Adapter
    public final android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            android.view.View r1 = super.getView(r2, r3, r4)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L5:
            r2 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions cursor threw exception."
            android.util.Log.w(r3, r0, r2)
            android.view.View r1 = r1.d(r4)
            java.lang.Object r3 = r1.getTag()
            cu6 r3 = (defpackage.cu6) r3
            android.widget.TextView r3 = r3.a
            java.lang.String r2 = r2.toString()
            r3.setText(r2)
            return r1
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
            r1 = this;
            super.notifyDataSetChanged()
            android.database.Cursor r1 = r1.L
            if (r1 == 0) goto Lc
            android.os.Bundle r1 = r1.getExtras()
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L14
            java.lang.String r0 = "in_progress"
            r1.getBoolean(r0)
        L14:
            return
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
            r1 = this;
            super.notifyDataSetInvalidated()
            android.database.Cursor r1 = r1.L
            if (r1 == 0) goto Lc
            android.os.Bundle r1 = r1.getExtras()
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L14
            java.lang.String r0 = "in_progress"
            r1.getBoolean(r0)
        L14:
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            java.lang.Object r2 = r2.getTag()
            boolean r0 = r2 instanceof java.lang.CharSequence
            if (r0 == 0) goto Lf
            androidx.appcompat.widget.SearchView r1 = r1.g0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.p(r2)
        Lf:
            return
    }
}

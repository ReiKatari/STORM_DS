package androidx.appcompat.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class a implements android.view.View.OnClickListener {
    public final /* synthetic */ androidx.appcompat.widget.SearchView A;

    public a(androidx.appcompat.widget.SearchView r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            androidx.appcompat.widget.SearchView r2 = r2.A
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.o0
            android.widget.ImageView r1 = r2.s0
            if (r3 != r1) goto L1b
            r3 = 0
            r2.w(r3)
            r0.requestFocus()
            r3 = 1
            r0.setImeVisibility(r3)
            android.view.View$OnClickListener r3 = r2.L0
            if (r3 == 0) goto L7b
            r3.onClick(r2)
            return
        L1b:
            android.widget.ImageView r1 = r2.u0
            if (r3 != r1) goto L23
            r2.m()
            return
        L23:
            android.widget.ImageView r1 = r2.t0
            if (r3 != r1) goto L2b
            r2.q()
            return
        L2b:
            android.widget.ImageView r1 = r2.v0
            if (r3 != r1) goto L76
            android.app.SearchableInfo r3 = r2.Z0
            if (r3 != 0) goto L34
            goto L7b
        L34:
            boolean r0 = r3.getVoiceSearchLaunchWebSearch()     // Catch: android.content.ActivityNotFoundException -> L6e
            if (r0 == 0) goto L5a
            android.content.Intent r0 = r2.G0     // Catch: android.content.ActivityNotFoundException -> L6e
            android.content.Intent r1 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L6e
            r1.<init>(r0)     // Catch: android.content.ActivityNotFoundException -> L6e
            android.content.ComponentName r3 = r3.getSearchActivity()     // Catch: android.content.ActivityNotFoundException -> L6e
            java.lang.String r0 = "calling_package"
            if (r3 != 0) goto L4b
            r3 = 0
            goto L4f
        L4b:
            java.lang.String r3 = r3.flattenToShortString()     // Catch: android.content.ActivityNotFoundException -> L6e
        L4f:
            r1.putExtra(r0, r3)     // Catch: android.content.ActivityNotFoundException -> L6e
            android.content.Context r2 = r2.getContext()     // Catch: android.content.ActivityNotFoundException -> L6e
            r2.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L6e
            return
        L5a:
            boolean r0 = r3.getVoiceSearchLaunchRecognizer()     // Catch: android.content.ActivityNotFoundException -> L6e
            if (r0 == 0) goto L7b
            android.content.Intent r0 = r2.H0     // Catch: android.content.ActivityNotFoundException -> L6e
            android.content.Intent r3 = r2.k(r0, r3)     // Catch: android.content.ActivityNotFoundException -> L6e
            android.content.Context r2 = r2.getContext()     // Catch: android.content.ActivityNotFoundException -> L6e
            r2.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L6e
            return
        L6e:
            java.lang.String r2 = "SearchView"
            java.lang.String r3 = "Could not find voice search activity"
            android.util.Log.w(r2, r3)
            return
        L76:
            if (r3 != r0) goto L7b
            r2.l()
        L7b:
            return
    }
}

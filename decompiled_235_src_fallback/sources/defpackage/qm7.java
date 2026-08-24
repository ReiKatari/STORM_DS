package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qm7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qm7 implements defpackage.x05 {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.preference.ListPreference b;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment c;

    public /* synthetic */ qm7(androidx.preference.ListPreference r1, me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    public /* synthetic */ qm7(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r2, androidx.preference.ListPreference r3) {
            r1 = this;
            r0 = 2
            r1.a = r0
            r1.<init>()
            r1.c = r2
            r1.b = r3
            return
    }

    @Override // defpackage.x05
    public final boolean a(androidx.preference.Preference r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.a
            java.lang.String r1 = "top_right"
            java.lang.String r2 = "hidden"
            java.lang.String r3 = "top_left"
            r4 = 1
            r5 = 0
            r6 = 0
            androidx.preference.ListPreference r7 = r8.b
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r8 = r8.c
            switch(r0) {
                case 0: goto L6e;
                case 1: goto L3a;
                default: goto L12;
            }
        L12:
            r9.getClass()
            boolean r9 = r10 instanceof java.util.Set
            if (r9 == 0) goto L1c
            java.util.Set r10 = (java.util.Set) r10
            goto L1d
        L1c:
            r10 = r6
        L1d:
            if (r10 == 0) goto L35
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r9 = defpackage.gt0.I0(r10)
            if (r9 == 0) goto L35
            boolean r10 = r9 instanceof java.lang.String
            if (r10 == 0) goto L2e
            java.lang.String r9 = (java.lang.String) r9
            goto L2f
        L2e:
            r9 = r6
        L2f:
            if (r9 == 0) goto L35
            android.net.Uri r6 = android.net.Uri.parse(r9)
        L35:
            r9 = 4
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.G(r8, r7, r6, r5, r9)
            return r4
        L3a:
            r9.getClass()
            boolean r9 = r10 instanceof java.lang.String
            if (r9 == 0) goto L44
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6
        L44:
            if (r6 != 0) goto L47
            goto L6d
        L47:
            boolean r9 = r6.equals(r2)
            if (r9 != 0) goto L6d
            java.lang.String r9 = r7.e0
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto L6d
            boolean r9 = r6.equals(r3)
            if (r9 == 0) goto L5c
            goto L5d
        L5c:
            r1 = r3
        L5d:
            r7.h(r1)
            android.content.Context r8 = r8.requireContext()
            java.lang.String r9 = "Позиция FPS изменена во избежание наложения"
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r9, r5)
            r8.show()
        L6d:
            return r4
        L6e:
            r9.getClass()
            boolean r9 = r10 instanceof java.lang.String
            if (r9 == 0) goto L78
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6
        L78:
            if (r6 != 0) goto L7b
            goto La1
        L7b:
            boolean r9 = r6.equals(r2)
            if (r9 != 0) goto La1
            java.lang.String r9 = r7.e0
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto La1
            boolean r9 = r6.equals(r3)
            if (r9 == 0) goto L90
            goto L91
        L90:
            r1 = r3
        L91:
            r7.h(r1)
            android.content.Context r8 = r8.requireContext()
            java.lang.String r9 = "Позиция разрешения изменена во избежание наложения"
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r9, r5)
            r8.show()
        La1:
            return r4
    }
}

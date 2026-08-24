package me.magnum.melonds.ui.settings.preferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class StoragePickerPreference extends androidx.preference.Preference {
    public boolean A;
    public me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a B;
    public defpackage.sv4 L;
    public boolean R;
    public java.lang.String X;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public enum a extends java.lang.Enum {
        private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
        private static final /* synthetic */ me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a[] $VALUES = null;
        public static final me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a DIRECTORY = null;
        public static final me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a FILE = null;

        private static final /* synthetic */ me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a[] $values() {
                me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a r0 = me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a.FILE
                me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a r1 = me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a.DIRECTORY
                me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a[] r0 = new me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a[]{r0, r1}
                return r0
        }

        static {
                me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a r0 = new me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a
                java.lang.String r1 = "FILE"
                r2 = 0
                r0.<init>(r1, r2)
                me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a.FILE = r0
                me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a r0 = new me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a
                java.lang.String r1 = "DIRECTORY"
                r2 = 1
                r0.<init>(r1, r2)
                me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a.DIRECTORY = r0
                me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a[] r0 = $values()
                me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a.$VALUES = r0
                u52 r0 = defpackage.nc1.L(r0)
                me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a.$ENTRIES = r0
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static defpackage.t52 getEntries() {
                t52 r0 = me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a.$ENTRIES
                return r0
        }

        public static me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a valueOf(java.lang.String r1) {
                java.lang.Class<me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a> r0 = me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a r1 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a) r1
                return r1
        }

        public static me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a[] values() {
                me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a[] r0 = me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a.$VALUES
                java.lang.Object r0 = r0.clone()
                me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a[] r0 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a[]) r0
                return r0
        }
    }

    public StoragePickerPreference(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r2.getClass()
            r1.<init>(r2, r3)
            r2 = 0
            r1.A = r2
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a r0 = me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a.FILE
            r1.B = r0
            sv4 r0 = defpackage.sv4.READ
            r1.L = r0
            r1.R = r2
            r2 = 0
            r1.X = r2
            r1.e(r3)
            return
    }

    public void e(android.util.AttributeSet r7) {
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = defpackage.c75.b
            r2 = 0
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1, r2, r2)
            r7.getClass()
            int r0 = r7.getIndexCount()
            if (r0 < 0) goto L71
            r1 = r2
        L1c:
            int r3 = r7.getIndex(r1)
            r4 = 3
            r5 = 1
            if (r3 != r4) goto L2f
            int r3 = r7.getInt(r4, r2)
            if (r3 != r5) goto L2b
            goto L2c
        L2b:
            r5 = r2
        L2c:
            r6.A = r5
            goto L6c
        L2f:
            r4 = 4
            if (r3 != r4) goto L45
            t52 r3 = me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a.getEntries()
            int r4 = r7.getInt(r4, r2)
            u52 r3 = (defpackage.u52) r3
            java.lang.Object r3 = r3.get(r4)
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a r3 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a) r3
            r6.B = r3
            goto L6c
        L45:
            if (r3 != r5) goto L5a
            t52 r3 = defpackage.sv4.getEntries()
            int r4 = r7.getInt(r5, r2)
            u52 r3 = (defpackage.u52) r3
            java.lang.Object r3 = r3.get(r4)
            sv4 r3 = (defpackage.sv4) r3
            r6.L = r3
            goto L6c
        L5a:
            r4 = 2
            if (r3 != r4) goto L64
            boolean r3 = r7.getBoolean(r4, r2)
            r6.R = r3
            goto L6c
        L64:
            if (r3 != 0) goto L6c
            java.lang.String r3 = r7.getString(r2)
            r6.X = r3
        L6c:
            if (r1 == r0) goto L71
            int r1 = r1 + 1
            goto L1c
        L71:
            r7.recycle()
            return
    }

    public void f(android.net.Uri r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L44
        L3:
            java.lang.String r3 = r3.toString()
            r3.getClass()
            du1 r0 = defpackage.du1.A
            java.util.Set r0 = r2.getPersistedStringSet(r0)
            if (r0 == 0) goto L19
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = defpackage.gt0.o1(r0)
            goto L1e
        L19:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
        L1e:
            boolean r1 = r2.A
            if (r1 == 0) goto L26
            r0.add(r3)
            goto L2e
        L26:
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.util.Set r0 = defpackage.ii2.G(r3)
        L2e:
            java.util.Set r3 = defpackage.gt0.o1(r0)
            boolean r0 = r2.isPersistent()
            if (r0 == 0) goto L3b
            r2.persistStringSet(r3)
        L3b:
            x05 r0 = r2.getOnPreferenceChangeListener()
            if (r0 == 0) goto L44
            r0.a(r2, r3)
        L44:
            return
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: is1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class is1 {
    public static /* synthetic */ android.content.pm.ShortcutInfo.Builder a(android.content.Context r1, java.lang.String r2) {
            android.content.pm.ShortcutInfo$Builder r0 = new android.content.pm.ShortcutInfo$Builder
            r0.<init>(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.pm.ShortcutInfo.Builder b(android.content.pm.ShortcutInfo.Builder r0, java.lang.CharSequence r1) {
            android.content.pm.ShortcutInfo$Builder r0 = r0.setShortLabel(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.pm.ShortcutInfo.Builder c(android.content.pm.ShortcutInfo.Builder r0, android.content.Intent[] r1) {
            android.content.pm.ShortcutInfo$Builder r0 = r0.setIntents(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.pm.ShortcutInfo d(android.content.pm.ShortcutInfo.Builder r0) {
            android.content.pm.ShortcutInfo r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.pm.ShortcutManager e(java.lang.Object r0) {
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class f() {
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            return r0
    }

    public static /* synthetic */ void g() {
            android.content.pm.ShortcutInfo$Builder r0 = new android.content.pm.ShortcutInfo$Builder
            return
    }

    public static /* bridge */ /* synthetic */ void h(android.content.pm.ShortcutInfo.Builder r1) {
            r0 = 0
            r1.setLongLabel(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void i(android.content.pm.ShortcutInfo.Builder r0, android.graphics.drawable.Icon r1) {
            r0.setIcon(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void j(android.content.pm.ShortcutInfo.Builder r0, android.os.PersistableBundle r1) {
            r0.setExtras(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void k(android.view.inputmethod.EditorInfo r0, java.lang.String[] r1) {
            r0.contentMimeTypes = r1
            return
    }

    public static /* bridge */ /* synthetic */ java.lang.String[] l(android.view.inputmethod.EditorInfo r0) {
            java.lang.String[] r0 = r0.contentMimeTypes
            return r0
    }

    public static /* bridge */ /* synthetic */ void m(android.content.pm.ShortcutInfo.Builder r1) {
            r0 = 0
            r1.setDisabledMessage(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.content.pm.ShortcutInfo.Builder r1) {
            r0 = 0
            r1.setRank(r0)
            return
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ht7  reason: default package */
/* loaded from: classes.dex */
public abstract class ht7 {
    public static boolean a(android.view.Window.Callback r0, android.view.SearchEvent r1) {
            boolean r0 = r0.onSearchRequested(r1)
            return r0
    }

    public static android.view.ActionMode b(android.view.Window.Callback r0, android.view.ActionMode.Callback r1, int r2) {
            android.view.ActionMode r0 = r0.onWindowStartingActionMode(r1, r2)
            return r0
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s24  reason: default package */
/* loaded from: classes.dex */
public final class s24<S> extends defpackage.xw4 {
    public int B;
    public defpackage.fb0 L;

    public s24() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            if (r2 != 0) goto L9
            android.os.Bundle r2 = r1.getArguments()
        L9:
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.B = r0
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            if (r0 != 0) goto L24
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            fb0 r2 = (defpackage.fb0) r2
            r1.L = r2
            return
        L24:
            defpackage.u34.a()
            return
    }

    @Override // androidx.fragment.app.o
    public final android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            android.content.Context r3 = r0.getContext()
            int r0 = r0.B
            r2.<init>(r3, r0)
            r1.cloneInContext(r2)
            r0 = 0
            throw r0
    }

    @Override // androidx.fragment.app.o
    public final void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r1 = r2.B
            r3.putInt(r0, r1)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            r1 = 0
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            fb0 r2 = r2.L
            r3.putParcelable(r0, r2)
            return
    }
}

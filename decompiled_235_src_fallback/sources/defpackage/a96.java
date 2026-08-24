package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a96  reason: default package */
/* loaded from: classes.dex */
public final class a96 implements android.view.View.OnKeyListener {
    public final /* synthetic */ androidx.preference.SeekBarPreference A;

    public a96(androidx.preference.SeekBarPreference r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View r2, int r3, android.view.KeyEvent r4) {
            r1 = this;
            int r2 = r4.getAction()
            r0 = 0
            if (r2 == 0) goto L8
            goto L31
        L8:
            androidx.preference.SeekBarPreference r1 = r1.A
            boolean r2 = r1.d0
            if (r2 != 0) goto L17
            r2 = 21
            if (r3 == r2) goto L31
            r2 = 22
            if (r3 != r2) goto L17
            goto L31
        L17:
            r2 = 23
            if (r3 == r2) goto L31
            r2 = 66
            if (r3 != r2) goto L20
            goto L31
        L20:
            android.widget.SeekBar r1 = r1.Y
            if (r1 != 0) goto L2c
            java.lang.String r1 = "SeekBarPreference"
            java.lang.String r2 = "SeekBar view is null and hence cannot be adjusted."
            android.util.Log.e(r1, r2)
            return r0
        L2c:
            boolean r1 = r1.onKeyDown(r3, r4)
            return r1
        L31:
            return r0
    }
}

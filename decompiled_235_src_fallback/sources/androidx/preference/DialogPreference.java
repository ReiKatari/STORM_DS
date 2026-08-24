package androidx.preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class DialogPreference extends androidx.preference.Preference {
    public final java.lang.CharSequence A;
    public final java.lang.String B;
    public final android.graphics.drawable.Drawable L;
    public final java.lang.String R;
    public final java.lang.String X;
    public final int Y;

    public DialogPreference(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 2130969007(0x7f0401af, float:1.7546684E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = defpackage.xk2.l(r3, r0, r1)
            r2.<init>(r3, r4, r0)
            return
    }

    public DialogPreference(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r0 = 0
            r2.<init>(r3, r4, r5, r0)
            int[] r1 = defpackage.i75.c
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1, r5, r0)
            r4 = 9
            java.lang.String r4 = r3.getString(r4)
            if (r4 != 0) goto L16
            java.lang.String r4 = r3.getString(r0)
        L16:
            r2.A = r4
            if (r4 != 0) goto L20
            java.lang.CharSequence r4 = r2.getTitle()
            r2.A = r4
        L20:
            r4 = 8
            java.lang.String r4 = r3.getString(r4)
            if (r4 != 0) goto L2d
            r4 = 1
            java.lang.String r4 = r3.getString(r4)
        L2d:
            r2.B = r4
            r4 = 6
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            if (r4 != 0) goto L3b
            r4 = 2
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
        L3b:
            r2.L = r4
            r4 = 11
            java.lang.String r4 = r3.getString(r4)
            if (r4 != 0) goto L4a
            r4 = 3
            java.lang.String r4 = r3.getString(r4)
        L4a:
            r2.R = r4
            r4 = 10
            java.lang.String r4 = r3.getString(r4)
            if (r4 != 0) goto L59
            r4 = 4
            java.lang.String r4 = r3.getString(r4)
        L59:
            r2.X = r4
            r4 = 5
            int r4 = r3.getResourceId(r4, r0)
            r5 = 7
            int r4 = r3.getResourceId(r5, r4)
            r2.Y = r4
            r3.recycle()
            return
    }

    @Override // androidx.preference.Preference
    public void onClick() {
            r1 = this;
            v15 r0 = r1.getPreferenceManager()
            k15 r0 = r0.i
            if (r0 == 0) goto Lb
            r0.onDisplayPreferenceDialog(r1)
        Lb:
            return
    }
}

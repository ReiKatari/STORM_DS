package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f15  reason: default package */
/* loaded from: classes.dex */
public abstract class f15 extends androidx.fragment.app.i implements android.content.DialogInterface.OnClickListener {
    public androidx.preference.DialogPreference A;
    public java.lang.CharSequence B;
    public java.lang.CharSequence L;
    public java.lang.CharSequence R;
    public java.lang.CharSequence X;
    public int Y;
    public android.graphics.drawable.BitmapDrawable Z;
    public int d0;

    public f15() {
            r0 = this;
            r0.<init>()
            return
    }

    public final androidx.preference.DialogPreference i() {
            r2 = this;
            androidx.preference.DialogPreference r0 = r2.A
            if (r0 != 0) goto L1c
            android.os.Bundle r0 = r2.requireArguments()
            java.lang.String r1 = "key"
            java.lang.String r0 = r0.getString(r1)
            androidx.fragment.app.o r1 = r2.getTargetFragment()
            k15 r1 = (defpackage.k15) r1
            androidx.preference.Preference r0 = r1.findPreference(r0)
            androidx.preference.DialogPreference r0 = (androidx.preference.DialogPreference) r0
            r2.A = r0
        L1c:
            androidx.preference.DialogPreference r2 = r2.A
            return r2
    }

    public void j(android.view.View r2) {
            r1 = this;
            r0 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r2 = r2.findViewById(r0)
            if (r2 == 0) goto L28
            java.lang.CharSequence r1 = r1.X
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L1d
            boolean r0 = r2 instanceof android.widget.TextView
            if (r0 == 0) goto L1b
            r0 = r2
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
        L1b:
            r1 = 0
            goto L1f
        L1d:
            r1 = 8
        L1f:
            int r0 = r2.getVisibility()
            if (r0 == r1) goto L28
            r2.setVisibility(r1)
        L28:
            return
    }

    public abstract void k(boolean r1);

    public void l(defpackage.zb r1) {
            r0 = this;
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            r0.d0 = r2
            return
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public void onCreate(android.os.Bundle r6) {
            r5 = this;
            super.onCreate(r6)
            androidx.fragment.app.o r0 = r5.getTargetFragment()
            boolean r1 = r0 instanceof defpackage.k15
            if (r1 == 0) goto Laf
            k15 r0 = (defpackage.k15) r0
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r2 = "key"
            java.lang.String r1 = r1.getString(r2)
            r2 = 0
            if (r6 != 0) goto L71
            androidx.preference.Preference r6 = r0.findPreference(r1)
            androidx.preference.DialogPreference r6 = (androidx.preference.DialogPreference) r6
            r5.A = r6
            java.lang.CharSequence r0 = r6.A
            r5.B = r0
            java.lang.String r0 = r6.R
            r5.L = r0
            java.lang.String r0 = r6.X
            r5.R = r0
            java.lang.String r0 = r6.B
            r5.X = r0
            int r0 = r6.Y
            r5.Y = r0
            android.graphics.drawable.Drawable r6 = r6.L
            if (r6 == 0) goto L6c
            boolean r0 = r6 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L3f
            goto L6c
        L3f:
            int r0 = r6.getIntrinsicWidth()
            int r1 = r6.getIntrinsicHeight()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r3)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            int r3 = r1.getWidth()
            int r4 = r1.getHeight()
            r6.setBounds(r2, r2, r3, r4)
            r6.draw(r1)
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r5.getResources()
            r6.<init>(r1, r0)
            r5.Z = r6
            return
        L6c:
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6
            r5.Z = r6
            return
        L71:
            java.lang.String r0 = "PreferenceDialogFragment.title"
            java.lang.CharSequence r0 = r6.getCharSequence(r0)
            r5.B = r0
            java.lang.String r0 = "PreferenceDialogFragment.positiveText"
            java.lang.CharSequence r0 = r6.getCharSequence(r0)
            r5.L = r0
            java.lang.String r0 = "PreferenceDialogFragment.negativeText"
            java.lang.CharSequence r0 = r6.getCharSequence(r0)
            r5.R = r0
            java.lang.String r0 = "PreferenceDialogFragment.message"
            java.lang.CharSequence r0 = r6.getCharSequence(r0)
            r5.X = r0
            java.lang.String r0 = "PreferenceDialogFragment.layout"
            int r0 = r6.getInt(r0, r2)
            r5.Y = r0
            java.lang.String r0 = "PreferenceDialogFragment.icon"
            android.os.Parcelable r6 = r6.getParcelable(r0)
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 == 0) goto Lae
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r5.getResources()
            r0.<init>(r1, r6)
            r5.Z = r0
        Lae:
            return
        Laf:
            java.lang.String r5 = "Target fragment must implement TargetFragment interface"
            defpackage.i.m(r5)
            return
    }

    @Override // androidx.fragment.app.i
    public final android.app.Dialog onCreateDialog(android.os.Bundle r5) {
            r4 = this;
            r5 = -2
            r4.d0 = r5
            zb r5 = new zb
            android.content.Context r0 = r4.requireContext()
            r5.<init>(r0)
            java.lang.CharSequence r0 = r4.B
            java.lang.Object r1 = r5.L
            wb r1 = (defpackage.wb) r1
            r1.d = r0
            android.graphics.drawable.BitmapDrawable r0 = r4.Z
            r1.c = r0
            java.lang.CharSequence r0 = r4.L
            r1.g = r0
            r1.h = r4
            java.lang.CharSequence r0 = r4.R
            r1.i = r0
            r1.j = r4
            r4.requireContext()
            int r0 = r4.Y
            r2 = 0
            if (r0 != 0) goto L2d
            goto L35
        L2d:
            android.view.LayoutInflater r3 = r4.getLayoutInflater()
            android.view.View r2 = r3.inflate(r0, r2)
        L35:
            if (r2 == 0) goto L3e
            r4.j(r2)
            r5.A(r2)
            goto L42
        L3e:
            java.lang.CharSequence r0 = r4.X
            r1.f = r0
        L42:
            r4.l(r5)
            ac r5 = r5.l()
            boolean r0 = r4 instanceof defpackage.fs1
            if (r0 == 0) goto L66
            android.view.Window r0 = r5.getWindow()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L5b
            defpackage.e15.a(r0)
            return r5
        L5b:
            fs1 r4 = (defpackage.fs1) r4
            long r0 = android.os.SystemClock.currentThreadTimeMillis()
            r4.h0 = r0
            r4.m()
        L66:
            return r5
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            super.onDismiss(r2)
            int r2 = r1.d0
            r0 = -1
            if (r2 != r0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            r1.k(r2)
            return
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            java.lang.String r0 = "PreferenceDialogFragment.title"
            java.lang.CharSequence r1 = r2.B
            r3.putCharSequence(r0, r1)
            java.lang.String r0 = "PreferenceDialogFragment.positiveText"
            java.lang.CharSequence r1 = r2.L
            r3.putCharSequence(r0, r1)
            java.lang.String r0 = "PreferenceDialogFragment.negativeText"
            java.lang.CharSequence r1 = r2.R
            r3.putCharSequence(r0, r1)
            java.lang.String r0 = "PreferenceDialogFragment.message"
            java.lang.CharSequence r1 = r2.X
            r3.putCharSequence(r0, r1)
            java.lang.String r0 = "PreferenceDialogFragment.layout"
            int r1 = r2.Y
            r3.putInt(r0, r1)
            android.graphics.drawable.BitmapDrawable r2 = r2.Z
            if (r2 == 0) goto L33
            java.lang.String r0 = "PreferenceDialogFragment.icon"
            android.graphics.Bitmap r2 = r2.getBitmap()
            r3.putParcelable(r0, r2)
        L33:
            return
    }
}

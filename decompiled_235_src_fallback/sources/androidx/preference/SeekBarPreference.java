package androidx.preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SeekBarPreference extends androidx.preference.Preference {
    public int A;
    public int B;
    public int L;
    public int R;
    public boolean X;
    public android.widget.SeekBar Y;
    public android.widget.TextView Z;
    public final boolean d0;
    public final boolean e0;
    public final boolean f0;
    public final defpackage.gl3 g0;
    public final defpackage.a96 h0;

    public SeekBarPreference(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r0 = 2130969716(0x7f040474, float:1.7548122E38)
            r1 = 0
            r4.<init>(r5, r6, r0, r1)
            gl3 r2 = new gl3
            r3 = 4
            r2.<init>(r4, r3)
            r4.g0 = r2
            a96 r2 = new a96
            r2.<init>(r4)
            r4.h0 = r2
            int[] r2 = defpackage.i75.k
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r2, r0, r1)
            r6 = 3
            int r6 = r5.getInt(r6, r1)
            r4.B = r6
            r6 = 100
            r0 = 1
            int r6 = r5.getInt(r0, r6)
            int r2 = r4.B
            if (r6 >= r2) goto L2f
            r6 = r2
        L2f:
            int r2 = r4.L
            if (r6 == r2) goto L38
            r4.L = r6
            r4.notifyChanged()
        L38:
            int r6 = r5.getInt(r3, r1)
            int r2 = r4.R
            if (r6 == r2) goto L52
            int r2 = r4.L
            int r3 = r4.B
            int r2 = r2 - r3
            int r6 = java.lang.Math.abs(r6)
            int r6 = java.lang.Math.min(r2, r6)
            r4.R = r6
            r4.notifyChanged()
        L52:
            r6 = 2
            boolean r6 = r5.getBoolean(r6, r0)
            r4.d0 = r6
            r6 = 5
            boolean r6 = r5.getBoolean(r6, r1)
            r4.e0 = r6
            r6 = 6
            boolean r6 = r5.getBoolean(r6, r1)
            r4.f0 = r6
            r5.recycle()
            return
    }

    public final void e(int r3, boolean r4) {
            r2 = this;
            int r0 = r2.B
            if (r3 >= r0) goto L5
            r3 = r0
        L5:
            int r0 = r2.L
            if (r3 <= r0) goto La
            r3 = r0
        La:
            int r0 = r2.A
            if (r3 == r0) goto L23
            r2.A = r3
            android.widget.TextView r0 = r2.Z
            if (r0 == 0) goto L1b
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r0.setText(r1)
        L1b:
            r2.persistInt(r3)
            if (r4 == 0) goto L23
            r2.notifyChanged()
        L23:
            return
    }

    public final void f(android.widget.SeekBar r3) {
            r2 = this;
            int r0 = r2.B
            int r1 = r3.getProgress()
            int r1 = r1 + r0
            int r0 = r2.A
            if (r1 == r0) goto L2f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r0 = r2.callChangeListener(r0)
            if (r0 == 0) goto L1a
            r3 = 0
            r2.e(r1, r3)
            return
        L1a:
            int r0 = r2.A
            int r1 = r2.B
            int r0 = r0 - r1
            r3.setProgress(r0)
            int r3 = r2.A
            android.widget.TextView r2 = r2.Z
            if (r2 == 0) goto L2f
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.setText(r3)
        L2f:
            return
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(defpackage.x15 r3) {
            r2 = this;
            super.onBindViewHolder(r3)
            android.view.View r0 = r3.a
            a96 r1 = r2.h0
            r0.setOnKeyListener(r1)
            r0 = 2131427877(0x7f0b0225, float:1.8477383E38)
            android.view.View r0 = r3.q(r0)
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r2.Y = r0
            r0 = 2131427878(0x7f0b0226, float:1.8477385E38)
            android.view.View r3 = r3.q(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.Z = r3
            boolean r0 = r2.e0
            if (r0 == 0) goto L29
            r0 = 0
            r3.setVisibility(r0)
            goto L31
        L29:
            r0 = 8
            r3.setVisibility(r0)
            r3 = 0
            r2.Z = r3
        L31:
            android.widget.SeekBar r3 = r2.Y
            if (r3 != 0) goto L3d
            java.lang.String r2 = "SeekBarPreference"
            java.lang.String r3 = "SeekBar view is null in onBindViewHolder."
            android.util.Log.e(r2, r3)
            return
        L3d:
            gl3 r0 = r2.g0
            r3.setOnSeekBarChangeListener(r0)
            android.widget.SeekBar r3 = r2.Y
            int r0 = r2.L
            int r1 = r2.B
            int r0 = r0 - r1
            r3.setMax(r0)
            int r3 = r2.R
            android.widget.SeekBar r0 = r2.Y
            if (r3 == 0) goto L56
            r0.setKeyProgressIncrement(r3)
            goto L5c
        L56:
            int r3 = r0.getKeyProgressIncrement()
            r2.R = r3
        L5c:
            android.widget.SeekBar r3 = r2.Y
            int r0 = r2.A
            int r1 = r2.B
            int r0 = r0 - r1
            r3.setProgress(r0)
            int r3 = r2.A
            android.widget.TextView r0 = r2.Z
            if (r0 == 0) goto L73
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.setText(r3)
        L73:
            android.widget.SeekBar r3 = r2.Y
            boolean r2 = r2.isEnabled()
            r3.setEnabled(r2)
            return
    }

    @Override // androidx.preference.Preference
    public final java.lang.Object onGetDefaultValue(android.content.res.TypedArray r1, int r2) {
            r0 = this;
            r0 = 0
            int r0 = r1.getInt(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<c96> r1 = defpackage.c96.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L10
            super.onRestoreInstanceState(r3)
            return
        L10:
            c96 r3 = (defpackage.c96) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            int r0 = r3.A
            r2.A = r0
            int r0 = r3.B
            r2.B = r0
            int r3 = r3.L
            r2.L = r3
            r2.notifyChanged()
            return
    }

    @Override // androidx.preference.Preference
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            super.onSaveInstanceState()
            android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
            boolean r1 = r2.isPersistent()
            if (r1 == 0) goto Lc
            return r0
        Lc:
            c96 r0 = new c96
            r0.<init>()
            int r1 = r2.A
            r0.A = r1
            int r1 = r2.B
            r0.B = r1
            int r2 = r2.L
            r0.L = r2
            return r0
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L7:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = r1.getPersistedInt(r2)
            r0 = 1
            r1.e(r2, r0)
            return
    }
}

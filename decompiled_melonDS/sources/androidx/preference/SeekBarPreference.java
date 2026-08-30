package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int A;
    public int B;
    public int L;
    public int R;
    public boolean X;
    public SeekBar Y;
    public TextView Z;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f1523b0;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f1524c0;

    /* renamed from: d0  reason: collision with root package name */
    public final boolean f1525d0;

    /* renamed from: e0  reason: collision with root package name */
    public final k0 f1526e0;

    /* renamed from: f0  reason: collision with root package name */
    public final l0 f1527f0;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.f1526e0 = new k0(this);
        this.f1527f0 = new l0(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.f1581k, R.attr.seekBarPreferenceStyle, 0);
        this.B = obtainStyledAttributes.getInt(3, 0);
        int i2 = obtainStyledAttributes.getInt(1, 100);
        int i10 = this.B;
        i2 = i2 < i10 ? i10 : i2;
        if (i2 != this.L) {
            this.L = i2;
            notifyChanged();
        }
        int i11 = obtainStyledAttributes.getInt(4, 0);
        if (i11 != this.R) {
            this.R = Math.min(this.L - this.B, Math.abs(i11));
            notifyChanged();
        }
        this.f1523b0 = obtainStyledAttributes.getBoolean(2, true);
        this.f1524c0 = obtainStyledAttributes.getBoolean(5, false);
        this.f1525d0 = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public final void e(int i2, boolean z10) {
        int i10 = this.B;
        if (i2 < i10) {
            i2 = i10;
        }
        int i11 = this.L;
        if (i2 > i11) {
            i2 = i11;
        }
        if (i2 != this.A) {
            this.A = i2;
            TextView textView = this.Z;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
            }
            persistInt(i2);
            if (z10) {
                notifyChanged();
            }
        }
    }

    public final void f(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.B;
        if (progress != this.A) {
            if (callChangeListener(Integer.valueOf(progress))) {
                e(progress, false);
                return;
            }
            seekBar.setProgress(this.A - this.B);
            int i2 = this.A;
            TextView textView = this.Z;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(i0 i0Var) {
        super.onBindViewHolder(i0Var);
        i0Var.f7594a.setOnKeyListener(this.f1527f0);
        this.Y = (SeekBar) i0Var.q(R.id.seekbar);
        TextView textView = (TextView) i0Var.q(R.id.seekbar_value);
        this.Z = textView;
        if (this.f1524c0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.Z = null;
        }
        SeekBar seekBar = this.Y;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f1526e0);
        this.Y.setMax(this.L - this.B);
        int i2 = this.R;
        SeekBar seekBar2 = this.Y;
        if (i2 != 0) {
            seekBar2.setKeyProgressIncrement(i2);
        } else {
            this.R = seekBar2.getKeyProgressIncrement();
        }
        this.Y.setProgress(this.A - this.B);
        int i10 = this.A;
        TextView textView2 = this.Z;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i10));
        }
        this.Y.setEnabled(isEnabled());
    }

    @Override // androidx.preference.Preference
    public final Object onGetDefaultValue(TypedArray typedArray, int i2) {
        return Integer.valueOf(typedArray.getInt(i2, 0));
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(m0.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m0 m0Var = (m0) parcelable;
        super.onRestoreInstanceState(m0Var.getSuperState());
        this.A = m0Var.A;
        this.B = m0Var.B;
        this.L = m0Var.L;
        notifyChanged();
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        m0 m0Var = new m0();
        m0Var.A = this.A;
        m0Var.B = this.B;
        m0Var.L = this.L;
        return m0Var;
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        e(getPersistedInt(((Integer) obj).intValue()), true);
    }
}

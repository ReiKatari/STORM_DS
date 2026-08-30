package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int A;
    public int B;
    public int L;
    public int R;
    public boolean X;
    public SeekBar Y;
    public TextView Z;
    public final boolean c0;
    public final boolean d0;
    public final boolean e0;
    public final le3 f0;
    public final ox5 g0;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.f0 = new le3(4, this);
        this.g0 = new ox5(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xx4.k, R.attr.seekBarPreferenceStyle, 0);
        this.B = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.B;
        i = i < i2 ? i2 : i;
        if (i != this.L) {
            this.L = i;
            notifyChanged();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.R) {
            this.R = Math.min(this.L - this.B, Math.abs(i3));
            notifyChanged();
        }
        this.c0 = obtainStyledAttributes.getBoolean(2, true);
        this.d0 = obtainStyledAttributes.getBoolean(5, false);
        this.e0 = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public final void e(int i, boolean z) {
        int i2 = this.B;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.L;
        if (i > i3) {
            i = i3;
        }
        if (i != this.A) {
            this.A = i;
            TextView textView = this.Z;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            persistInt(i);
            if (z) {
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
            int i = this.A;
            TextView textView = this.Z;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(vs4 vs4Var) {
        super.onBindViewHolder(vs4Var);
        vs4Var.a.setOnKeyListener(this.g0);
        this.Y = (SeekBar) vs4Var.q(R.id.seekbar);
        TextView textView = (TextView) vs4Var.q(R.id.seekbar_value);
        this.Z = textView;
        if (this.d0) {
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
        seekBar.setOnSeekBarChangeListener(this.f0);
        this.Y.setMax(this.L - this.B);
        int i = this.R;
        SeekBar seekBar2 = this.Y;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.R = seekBar2.getKeyProgressIncrement();
        }
        this.Y.setProgress(this.A - this.B);
        int i2 = this.A;
        TextView textView2 = this.Z;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.Y.setEnabled(isEnabled());
    }

    @Override // androidx.preference.Preference
    public final Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(qx5.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qx5 qx5Var = (qx5) parcelable;
        super.onRestoreInstanceState(qx5Var.getSuperState());
        this.A = qx5Var.A;
        this.B = qx5Var.B;
        this.L = qx5Var.L;
        notifyChanged();
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        qx5 qx5Var = new qx5();
        qx5Var.A = this.A;
        qx5Var.B = this.B;
        qx5Var.L = this.L;
        return qx5Var;
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        e(getPersistedInt(((Integer) obj).intValue()), true);
    }
}

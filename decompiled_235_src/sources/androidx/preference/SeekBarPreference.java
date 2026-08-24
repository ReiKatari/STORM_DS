package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int A;
    public int B;
    public int L;
    public int R;
    public boolean X;
    public SeekBar Y;
    public TextView Z;
    public final boolean d0;
    public final boolean e0;
    public final boolean f0;
    public final gl3 g0;
    public final a96 h0;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.g0 = new gl3(this, 4);
        this.h0 = new a96(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i75.k, R.attr.seekBarPreferenceStyle, 0);
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
        this.d0 = obtainStyledAttributes.getBoolean(2, true);
        this.e0 = obtainStyledAttributes.getBoolean(5, false);
        this.f0 = obtainStyledAttributes.getBoolean(6, false);
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
    public final void onBindViewHolder(x15 x15Var) {
        super.onBindViewHolder(x15Var);
        x15Var.a.setOnKeyListener(this.h0);
        this.Y = (SeekBar) x15Var.q(R.id.seekbar);
        TextView textView = (TextView) x15Var.q(R.id.seekbar_value);
        this.Z = textView;
        if (this.e0) {
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
        seekBar.setOnSeekBarChangeListener(this.g0);
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
        if (!parcelable.getClass().equals(c96.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c96 c96Var = (c96) parcelable;
        super.onRestoreInstanceState(c96Var.getSuperState());
        this.A = c96Var.A;
        this.B = c96Var.B;
        this.L = c96Var.L;
        notifyChanged();
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        c96 c96Var = new c96();
        c96Var.A = this.A;
        c96Var.B = this.B;
        c96Var.L = this.L;
        return c96Var;
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        e(getPersistedInt(((Integer) obj).intValue()), true);
    }
}

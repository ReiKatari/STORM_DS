package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.i;
import androidx.fragment.app.o;
import androidx.preference.DialogPreference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ds4  reason: default package */
/* loaded from: classes.dex */
public abstract class ds4 extends i implements DialogInterface.OnClickListener {
    public DialogPreference l0;
    public CharSequence m0;
    public CharSequence n0;
    public CharSequence o0;
    public CharSequence p0;
    public int q0;
    public BitmapDrawable r0;
    public int s0;

    @Override // androidx.fragment.app.i
    public final Dialog i() {
        this.s0 = -2;
        sb sbVar = new sb(requireContext());
        CharSequence charSequence = this.m0;
        pb pbVar = (pb) sbVar.L;
        pbVar.d = charSequence;
        pbVar.c = this.r0;
        pbVar.g = this.n0;
        pbVar.h = this;
        pbVar.i = this.o0;
        pbVar.j = this;
        requireContext();
        int i = this.q0;
        View view = null;
        if (i != 0) {
            view = getLayoutInflater().inflate(i, (ViewGroup) null);
        }
        if (view != null) {
            l(view);
            sbVar.B(view);
        } else {
            pbVar.f = this.p0;
        }
        n(sbVar);
        tb l = sbVar.l();
        if (this instanceof wn1) {
            Window window = l.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                cs4.a(window);
                return l;
            }
            wn1 wn1Var = (wn1) this;
            wn1Var.w0 = SystemClock.currentThreadTimeMillis();
            wn1Var.o();
        }
        return l;
    }

    public final DialogPreference k() {
        if (this.l0 == null) {
            this.l0 = (DialogPreference) ((is4) getTargetFragment()).findPreference(requireArguments().getString("key"));
        }
        return this.l0;
    }

    public void l(View view) {
        int i;
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.p0;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            } else {
                i = 8;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public abstract void m(boolean z);

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.s0 = i;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o targetFragment = getTargetFragment();
        if (targetFragment instanceof is4) {
            is4 is4Var = (is4) targetFragment;
            String string = requireArguments().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) is4Var.findPreference(string);
                this.l0 = dialogPreference;
                this.m0 = dialogPreference.A;
                this.n0 = dialogPreference.R;
                this.o0 = dialogPreference.X;
                this.p0 = dialogPreference.B;
                this.q0 = dialogPreference.Y;
                Drawable drawable = dialogPreference.L;
                if (drawable != null && !(drawable instanceof BitmapDrawable)) {
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    this.r0 = new BitmapDrawable(getResources(), createBitmap);
                    return;
                }
                this.r0 = (BitmapDrawable) drawable;
                return;
            }
            this.m0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.n0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.o0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.p0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.q0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.r0 = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        i.n("Target fragment must implement TargetFragment interface");
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z;
        super.onDismiss(dialogInterface);
        if (this.s0 == -1) {
            z = true;
        } else {
            z = false;
        }
        m(z);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.m0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.n0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.o0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.p0);
        bundle.putInt("PreferenceDialogFragment.layout", this.q0);
        BitmapDrawable bitmapDrawable = this.r0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public void n(sb sbVar) {
    }
}

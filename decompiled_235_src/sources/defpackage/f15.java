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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f15  reason: default package */
/* loaded from: classes.dex */
public abstract class f15 extends i implements DialogInterface.OnClickListener {
    public DialogPreference A;
    public CharSequence B;
    public CharSequence L;
    public CharSequence R;
    public CharSequence X;
    public int Y;
    public BitmapDrawable Z;
    public int d0;

    public final DialogPreference i() {
        if (this.A == null) {
            this.A = (DialogPreference) ((k15) getTargetFragment()).findPreference(requireArguments().getString("key"));
        }
        return this.A;
    }

    public void j(View view) {
        int i;
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.X;
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

    public abstract void k(boolean z);

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.d0 = i;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o targetFragment = getTargetFragment();
        if (targetFragment instanceof k15) {
            k15 k15Var = (k15) targetFragment;
            String string = requireArguments().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) k15Var.findPreference(string);
                this.A = dialogPreference;
                this.B = dialogPreference.A;
                this.L = dialogPreference.R;
                this.R = dialogPreference.X;
                this.X = dialogPreference.B;
                this.Y = dialogPreference.Y;
                Drawable drawable = dialogPreference.L;
                if (drawable != null && !(drawable instanceof BitmapDrawable)) {
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    this.Z = new BitmapDrawable(getResources(), createBitmap);
                    return;
                }
                this.Z = (BitmapDrawable) drawable;
                return;
            }
            this.B = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.L = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.R = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.X = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.Y = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.Z = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        i.m("Target fragment must implement TargetFragment interface");
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        this.d0 = -2;
        zb zbVar = new zb(requireContext());
        CharSequence charSequence = this.B;
        wb wbVar = (wb) zbVar.L;
        wbVar.d = charSequence;
        wbVar.c = this.Z;
        wbVar.g = this.L;
        wbVar.h = this;
        wbVar.i = this.R;
        wbVar.j = this;
        requireContext();
        int i = this.Y;
        View view = null;
        if (i != 0) {
            view = getLayoutInflater().inflate(i, (ViewGroup) null);
        }
        if (view != null) {
            j(view);
            zbVar.A(view);
        } else {
            wbVar.f = this.X;
        }
        l(zbVar);
        ac l = zbVar.l();
        if (this instanceof fs1) {
            Window window = l.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                e15.a(window);
                return l;
            }
            fs1 fs1Var = (fs1) this;
            fs1Var.h0 = SystemClock.currentThreadTimeMillis();
            fs1Var.m();
        }
        return l;
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z;
        super.onDismiss(dialogInterface);
        if (this.d0 == -1) {
            z = true;
        } else {
            z = false;
        }
        k(z);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.B);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.L);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.R);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.X);
        bundle.putInt("PreferenceDialogFragment.layout", this.Y);
        BitmapDrawable bitmapDrawable = this.Z;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public void l(zb zbVar) {
    }
}

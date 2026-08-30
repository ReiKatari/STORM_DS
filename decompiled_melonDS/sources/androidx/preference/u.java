package androidx.preference;

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
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class u extends androidx.fragment.app.w implements DialogInterface.OnClickListener {

    /* renamed from: k0  reason: collision with root package name */
    public DialogPreference f1588k0;

    /* renamed from: l0  reason: collision with root package name */
    public CharSequence f1589l0;

    /* renamed from: m0  reason: collision with root package name */
    public CharSequence f1590m0;

    /* renamed from: n0  reason: collision with root package name */
    public CharSequence f1591n0;

    /* renamed from: o0  reason: collision with root package name */
    public CharSequence f1592o0;
    public int p0;

    /* renamed from: q0  reason: collision with root package name */
    public BitmapDrawable f1593q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f1594r0;

    @Override // androidx.fragment.app.w
    public final Dialog i() {
        this.f1594r0 = -2;
        bk.a aVar = new bk.a(requireContext());
        CharSequence charSequence = this.f1589l0;
        l.d dVar = (l.d) aVar.L;
        dVar.f8359d = charSequence;
        dVar.f8358c = this.f1593q0;
        dVar.f8362g = this.f1590m0;
        dVar.f8363h = this;
        dVar.f8364i = this.f1591n0;
        dVar.f8365j = this;
        requireContext();
        int i2 = this.p0;
        View view = null;
        if (i2 != 0) {
            view = getLayoutInflater().inflate(i2, (ViewGroup) null);
        }
        if (view != null) {
            l(view);
            aVar.x(view);
        } else {
            dVar.f8361f = this.f1592o0;
        }
        n(aVar);
        l.g i10 = aVar.i();
        if (this instanceof d) {
            Window window = i10.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                t.a(window);
                return i10;
            }
            d dVar2 = (d) this;
            dVar2.f1538v0 = SystemClock.currentThreadTimeMillis();
            dVar2.o();
        }
        return i10;
    }

    public final DialogPreference k() {
        if (this.f1588k0 == null) {
            this.f1588k0 = (DialogPreference) ((a0) getTargetFragment()).findPreference(requireArguments().getString("key"));
        }
        return this.f1588k0;
    }

    public void l(View view) {
        int i2;
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f1592o0;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i2 = 0;
            } else {
                i2 = 8;
            }
            if (findViewById.getVisibility() != i2) {
                findViewById.setVisibility(i2);
            }
        }
    }

    public abstract void m(boolean z10);

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f1594r0 = i2;
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.j0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.j0 targetFragment = getTargetFragment();
        if (targetFragment instanceof a0) {
            a0 a0Var = (a0) targetFragment;
            String string = requireArguments().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) a0Var.findPreference(string);
                this.f1588k0 = dialogPreference;
                this.f1589l0 = dialogPreference.A;
                this.f1590m0 = dialogPreference.R;
                this.f1591n0 = dialogPreference.X;
                this.f1592o0 = dialogPreference.B;
                this.p0 = dialogPreference.Y;
                Drawable drawable = dialogPreference.L;
                if (drawable != null && !(drawable instanceof BitmapDrawable)) {
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    this.f1593q0 = new BitmapDrawable(getResources(), createBitmap);
                    return;
                }
                this.f1593q0 = (BitmapDrawable) drawable;
                return;
            }
            this.f1589l0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f1590m0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f1591n0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f1592o0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.p0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f1593q0 = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        a0.j.p("Target fragment must implement TargetFragment interface");
    }

    @Override // androidx.fragment.app.w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z10;
        super.onDismiss(dialogInterface);
        if (this.f1594r0 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        m(z10);
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.j0
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f1589l0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f1590m0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f1591n0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f1592o0);
        bundle.putInt("PreferenceDialogFragment.layout", this.p0);
        BitmapDrawable bitmapDrawable = this.f1593q0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public void n(bk.a aVar) {
    }
}

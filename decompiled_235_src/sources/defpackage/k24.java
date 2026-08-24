package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.i;
import com.google.android.material.internal.CheckableImageButton;
import com.stormds.emulator.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k24  reason: default package */
/* loaded from: classes.dex */
public class k24<S> extends i {
    public final LinkedHashSet A;
    public final LinkedHashSet B;
    public int L;
    public xw4 R;
    public fb0 X;
    public f24 Y;
    public int Z;
    public CharSequence d0;
    public boolean e0;
    public int f0;
    public int g0;
    public CharSequence h0;
    public int i0;
    public CharSequence j0;
    public int k0;
    public CharSequence l0;
    public int m0;
    public CharSequence n0;
    public TextView o0;
    public CheckableImageButton p0;
    public p24 q0;
    public boolean r0;
    public CharSequence s0;
    public CharSequence t0;

    public k24() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.A = new LinkedHashSet();
        this.B = new LinkedHashSet();
    }

    public static int j(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b = uj7.b();
        b.set(5, 1);
        Calendar a = uj7.a(b);
        a.get(2);
        a.get(1);
        int maximum = a.getMaximum(7);
        a.getActualMaximum(5);
        a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean k(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(qo2.O(context, R.attr.materialCalendarStyle, f24.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public final void i() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        u34.a();
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.L = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.X = (fb0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.Z = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
                this.d0 = bundle.getCharSequence("TITLE_TEXT_KEY");
                this.f0 = bundle.getInt("INPUT_MODE_KEY");
                this.g0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
                this.h0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
                this.i0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.j0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                this.k0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
                this.l0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                this.m0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.n0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                CharSequence charSequence = this.d0;
                if (charSequence == null) {
                    charSequence = requireContext().getResources().getText(this.Z);
                }
                this.s0 = charSequence;
                if (charSequence != null) {
                    CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
                    if (split.length > 1) {
                        charSequence = split[0];
                    }
                } else {
                    charSequence = null;
                }
                this.t0 = charSequence;
                return;
            }
            u34.a();
            return;
        }
        u34.a();
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i = this.L;
        if (i != 0) {
            Dialog dialog = new Dialog(requireContext, i);
            Context context = dialog.getContext();
            this.e0 = k(context, 16843277);
            this.q0 = new p24(context, null, R.attr.materialCalendarStyle, 2132018393);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, a75.m, R.attr.materialCalendarStyle, 2132018393);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.q0.k(context);
            this.q0.n(ColorStateList.valueOf(color));
            this.q0.m(dialog.getWindow().getDecorView().getElevation());
            return dialog;
        }
        i();
        throw null;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        String string;
        if (this.e0) {
            i = R.layout.mtrl_picker_fullscreen;
        } else {
            i = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.e0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(j(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(j(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.p0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.o0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.p0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.p0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, hf.S(context, R.drawable.material_ic_calendar_black_24dp));
        boolean z = false;
        stateListDrawable.addState(new int[0], hf.S(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.p0;
        if (this.f0 != 0) {
            z = true;
        }
        checkableImageButton2.setChecked(z);
        ao7.n(this.p0, null);
        CheckableImageButton checkableImageButton3 = this.p0;
        if (this.f0 == 1) {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.p0.setContentDescription(string);
        this.p0.setOnClickListener(new hr0(this, 3));
        Button button = (Button) inflate.findViewById(R.id.confirm_button);
        i();
        throw null;
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eb0, java.lang.Object] */
    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        i74 i74Var;
        i74 b;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.L);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        fb0 fb0Var = this.X;
        ?? obj = new Object();
        long j = fb0Var.A.Y;
        long j2 = fb0Var.B.Y;
        obj.a = Long.valueOf(fb0Var.R.Y);
        int i = fb0Var.X;
        dc1 dc1Var = fb0Var.L;
        f24 f24Var = this.Y;
        if (f24Var == null) {
            i74Var = null;
        } else {
            i74Var = f24Var.R;
        }
        if (i74Var != null) {
            obj.a = Long.valueOf(i74Var.Y);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dc1Var);
        i74 b2 = i74.b(j);
        i74 b3 = i74.b(j2);
        dc1 dc1Var2 = (dc1) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = obj.a;
        if (l == null) {
            b = null;
        } else {
            b = i74.b(l.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new fb0(b2, b3, dc1Var2, b, i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.Z);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.d0);
        bundle.putInt("INPUT_MODE_KEY", this.f0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.g0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.h0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.i0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.j0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.k0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.l0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.m0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.n0);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStart() {
        CharSequence charSequence;
        Integer num;
        boolean z;
        int i;
        boolean z2;
        bv7 wu7Var;
        bv7 wu7Var2;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.e0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.q0);
            if (!this.r0) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList r = u24.r(findViewById.getBackground());
                if (r != null) {
                    num = Integer.valueOf(r.getDefaultColor());
                } else {
                    num = null;
                }
                boolean z3 = false;
                if (num != null && num.intValue() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                int A = mp2.A(window.getContext(), 16842801, -16777216);
                if (z) {
                    num = Integer.valueOf(A);
                }
                kt7.a(window, false);
                window.getContext();
                Context context = window.getContext();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 27) {
                    i = tt0.d(mp2.A(context, 16843858, -16777216), 128);
                } else {
                    i = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i);
                boolean L = mp2.L(num.intValue());
                if (!mp2.L(0) && !L) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                s35 s35Var = new s35(window.getDecorView());
                if (i2 >= 35) {
                    wu7Var = new zu7(window, s35Var);
                } else if (i2 >= 30) {
                    wu7Var = new zu7(window, s35Var);
                } else if (i2 >= 26) {
                    wu7Var = new wu7(window, s35Var);
                } else {
                    wu7Var = new wu7(window, s35Var);
                }
                wu7Var.d(z2);
                boolean L2 = mp2.L(A);
                if (mp2.L(i) || (i == 0 && L2)) {
                    z3 = true;
                }
                s35 s35Var2 = new s35(window.getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 35) {
                    wu7Var2 = new zu7(window, s35Var2);
                } else if (i3 >= 30) {
                    wu7Var2 = new zu7(window, s35Var2);
                } else if (i3 >= 26) {
                    wu7Var2 = new wu7(window, s35Var2);
                } else {
                    wu7Var2 = new wu7(window, s35Var2);
                }
                wu7Var2.c(z3);
                gs1 gs1Var = new gs1(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                WeakHashMap weakHashMap = ao7.a;
                sn7.c(findViewById, gs1Var);
                this.r0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.q0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new c83(requireDialog(), rect));
        }
        requireContext();
        int i4 = this.L;
        if (i4 != 0) {
            i();
            fb0 fb0Var = this.X;
            f24 f24Var = new f24();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", i4);
            bundle.putParcelable("GRID_SELECTOR_KEY", null);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", fb0Var);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
            bundle.putParcelable("CURRENT_MONTH_KEY", fb0Var.R);
            f24Var.setArguments(bundle);
            this.Y = f24Var;
            xw4 xw4Var = f24Var;
            if (this.f0 == 1) {
                i();
                fb0 fb0Var2 = this.X;
                xw4 s24Var = new s24();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i4);
                bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", fb0Var2);
                s24Var.setArguments(bundle2);
                xw4Var = s24Var;
            }
            this.R = xw4Var;
            TextView textView = this.o0;
            if (this.f0 == 1 && getResources().getConfiguration().orientation == 2) {
                charSequence = this.t0;
            } else {
                charSequence = this.s0;
            }
            textView.setText(charSequence);
            i();
            getContext();
            throw null;
        }
        i();
        throw null;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStop() {
        this.R.A.clear();
        super.onStop();
    }
}

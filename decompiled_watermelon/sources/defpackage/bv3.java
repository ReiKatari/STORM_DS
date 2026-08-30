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
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bv3  reason: default package */
/* loaded from: classes.dex */
public class bv3<S> extends i {
    public CharSequence A0;
    public int B0;
    public CharSequence C0;
    public TextView D0;
    public CheckableImageButton E0;
    public gv3 F0;
    public boolean G0;
    public CharSequence H0;
    public CharSequence I0;
    public final LinkedHashSet l0;
    public final LinkedHashSet m0;
    public int n0;
    public sn4 o0;
    public x80 p0;
    public wu3 q0;
    public int r0;
    public CharSequence s0;
    public boolean t0;
    public int u0;
    public int v0;
    public CharSequence w0;
    public int x0;
    public CharSequence y0;
    public int z0;

    public bv3() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.l0 = new LinkedHashSet();
        this.m0 = new LinkedHashSet();
    }

    public static int l(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b = z57.b();
        b.set(5, 1);
        Calendar a = z57.a(b);
        a.get(2);
        a.get(1);
        int maximum = a.getMaximum(7);
        a.getActualMaximum(5);
        a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean m(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(hk2.Q(context, R.attr.materialCalendarStyle, wu3.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.i
    public final Dialog i() {
        Context requireContext = requireContext();
        requireContext();
        int i = this.n0;
        if (i != 0) {
            Dialog dialog = new Dialog(requireContext, i);
            Context context = dialog.getContext();
            this.t0 = m(context, 16843277);
            this.F0 = new gv3(context, null, R.attr.materialCalendarStyle, 2132018385);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, ay4.m, R.attr.materialCalendarStyle, 2132018385);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.F0.k(context);
            this.F0.n(ColorStateList.valueOf(color));
            this.F0.m(dialog.getWindow().getDecorView().getElevation());
            return dialog;
        }
        k();
        throw null;
    }

    public final void k() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        c44.b();
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.l0.iterator();
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
        this.n0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.p0 = (x80) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.r0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
                this.s0 = bundle.getCharSequence("TITLE_TEXT_KEY");
                this.u0 = bundle.getInt("INPUT_MODE_KEY");
                this.v0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
                this.w0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
                this.x0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.y0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                this.z0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
                this.A0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                this.B0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.C0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                CharSequence charSequence = this.s0;
                if (charSequence == null) {
                    charSequence = requireContext().getResources().getText(this.r0);
                }
                this.H0 = charSequence;
                if (charSequence != null) {
                    CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
                    if (split.length > 1) {
                        charSequence = split[0];
                    }
                } else {
                    charSequence = null;
                }
                this.I0 = charSequence;
                return;
            }
            c44.b();
            return;
        }
        c44.b();
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        String string;
        if (this.t0) {
            i = R.layout.mtrl_picker_fullscreen;
        } else {
            i = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.t0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(l(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(l(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.E0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.D0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.E0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.E0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, l07.M(context, R.drawable.material_ic_calendar_black_24dp));
        boolean z = false;
        stateListDrawable.addState(new int[0], l07.M(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.E0;
        if (this.u0 != 0) {
            z = true;
        }
        checkableImageButton2.setChecked(z);
        aa7.n(this.E0, null);
        CheckableImageButton checkableImageButton3 = this.E0;
        if (this.u0 == 1) {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.E0.setContentDescription(string);
        this.E0.setOnClickListener(new xo0(3, this));
        Button button = (Button) inflate.findViewById(R.id.confirm_button);
        k();
        throw null;
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.m0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, w80] */
    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        hz3 hz3Var;
        hz3 b;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.n0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        x80 x80Var = this.p0;
        ?? obj = new Object();
        long j = x80Var.A.Y;
        long j2 = x80Var.B.Y;
        obj.a = Long.valueOf(x80Var.R.Y);
        int i = x80Var.X;
        m81 m81Var = x80Var.L;
        wu3 wu3Var = this.q0;
        if (wu3Var == null) {
            hz3Var = null;
        } else {
            hz3Var = wu3Var.R;
        }
        if (hz3Var != null) {
            obj.a = Long.valueOf(hz3Var.Y);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", m81Var);
        hz3 b2 = hz3.b(j);
        hz3 b3 = hz3.b(j2);
        m81 m81Var2 = (m81) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = obj.a;
        if (l == null) {
            b = null;
        } else {
            b = hz3.b(l.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new x80(b2, b3, m81Var2, b, i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.r0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.s0);
        bundle.putInt("INPUT_MODE_KEY", this.u0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.v0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.w0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.x0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.y0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.z0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.A0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.B0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.C0);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStart() {
        CharSequence charSequence;
        Integer num;
        boolean z;
        int i;
        boolean z2;
        bg7 wf7Var;
        bg7 wf7Var2;
        super.onStart();
        Dialog dialog = this.g0;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (this.t0) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(this.F0);
                if (!this.G0) {
                    View findViewById = requireView().findViewById(R.id.fullscreen_header);
                    ColorStateList n = iq2.n(findViewById.getBackground());
                    if (n != null) {
                        num = Integer.valueOf(n.getDefaultColor());
                    } else {
                        num = null;
                    }
                    boolean z3 = false;
                    if (num != null && num.intValue() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    int w = jk2.w(window.getContext(), 16842801, -16777216);
                    if (z) {
                        num = Integer.valueOf(w);
                    }
                    ie7.d(window, false);
                    window.getContext();
                    Context context = window.getContext();
                    if (Build.VERSION.SDK_INT < 27) {
                        i = gr0.d(jk2.w(context, 16843858, -16777216), 128);
                    } else {
                        i = 0;
                    }
                    window.setStatusBarColor(0);
                    window.setNavigationBarColor(i);
                    boolean G = jk2.G(num.intValue());
                    if (!jk2.G(0) && !G) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    dz4 dz4Var = new dz4(window.getDecorView());
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 35) {
                        wf7Var = new zf7(window, dz4Var);
                    } else if (i2 >= 30) {
                        wf7Var = new zf7(window, dz4Var);
                    } else if (i2 >= 26) {
                        wf7Var = new wf7(window, dz4Var);
                    } else {
                        wf7Var = new wf7(window, dz4Var);
                    }
                    wf7Var.e(z2);
                    boolean G2 = jk2.G(w);
                    if (jk2.G(i) || (i == 0 && G2)) {
                        z3 = true;
                    }
                    dz4 dz4Var2 = new dz4(window.getDecorView());
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 35) {
                        wf7Var2 = new zf7(window, dz4Var2);
                    } else if (i3 >= 30) {
                        wf7Var2 = new zf7(window, dz4Var2);
                    } else if (i3 >= 26) {
                        wf7Var2 = new wf7(window, dz4Var2);
                    } else {
                        wf7Var2 = new wf7(window, dz4Var2);
                    }
                    wf7Var2.d(z3);
                    xn1 xn1Var = new xn1(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                    WeakHashMap weakHashMap = aa7.a;
                    s97.c(findViewById, xn1Var);
                    this.G0 = true;
                }
            } else {
                window.setLayout(-2, -2);
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
                Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                window.setBackgroundDrawable(new InsetDrawable((Drawable) this.F0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
                View decorView = window.getDecorView();
                Dialog dialog2 = this.g0;
                if (dialog2 != null) {
                    decorView.setOnTouchListener(new v13(dialog2, rect));
                } else {
                    throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
                }
            }
            requireContext();
            int i4 = this.n0;
            if (i4 != 0) {
                k();
                x80 x80Var = this.p0;
                wu3 wu3Var = new wu3();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i4);
                bundle.putParcelable("GRID_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", x80Var);
                bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle.putParcelable("CURRENT_MONTH_KEY", x80Var.R);
                wu3Var.setArguments(bundle);
                this.q0 = wu3Var;
                sn4 sn4Var = wu3Var;
                if (this.u0 == 1) {
                    k();
                    x80 x80Var2 = this.p0;
                    sn4 hv3Var = new hv3();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("THEME_RES_ID_KEY", i4);
                    bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                    bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", x80Var2);
                    hv3Var.setArguments(bundle2);
                    sn4Var = hv3Var;
                }
                this.o0 = sn4Var;
                TextView textView = this.D0;
                if (this.u0 == 1 && getResources().getConfiguration().orientation == 2) {
                    charSequence = this.I0;
                } else {
                    charSequence = this.H0;
                }
                textView.setText(charSequence);
                k();
                getContext();
                throw null;
            }
            k();
            throw null;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStop() {
        this.o0.A.clear();
        super.onStop();
    }
}

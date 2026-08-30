package com.google.android.material.datepicker;

import a6.j2;
import a6.l2;
import a6.p0;
import a6.x0;
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
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class o<S> extends androidx.fragment.app.w {
    public int A0;
    public CharSequence B0;
    public TextView C0;
    public CheckableImageButton D0;
    public na.j E0;
    public boolean F0;
    public CharSequence G0;
    public CharSequence H0;

    /* renamed from: k0  reason: collision with root package name */
    public final LinkedHashSet f3044k0;

    /* renamed from: l0  reason: collision with root package name */
    public final LinkedHashSet f3045l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f3046m0;

    /* renamed from: n0  reason: collision with root package name */
    public v f3047n0;

    /* renamed from: o0  reason: collision with root package name */
    public b f3048o0;
    public m p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f3049q0;

    /* renamed from: r0  reason: collision with root package name */
    public CharSequence f3050r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f3051s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f3052t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f3053u0;

    /* renamed from: v0  reason: collision with root package name */
    public CharSequence f3054v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f3055w0;

    /* renamed from: x0  reason: collision with root package name */
    public CharSequence f3056x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f3057y0;

    /* renamed from: z0  reason: collision with root package name */
    public CharSequence f3058z0;

    public o() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f3044k0 = new LinkedHashSet();
        this.f3045l0 = new LinkedHashSet();
    }

    public static int l(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b10 = x.b();
        b10.set(5, 1);
        Calendar a10 = x.a(b10);
        a10.get(2);
        a10.get(1);
        int maximum = a10.getMaximum(7);
        a10.getActualMaximum(5);
        a10.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean m(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(k0.d.K(context, R.attr.materialCalendarStyle, m.class.getCanonicalName()).data, new int[]{i2});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    @Override // androidx.fragment.app.w
    public final Dialog i() {
        Context requireContext = requireContext();
        requireContext();
        int i2 = this.f3046m0;
        if (i2 != 0) {
            Dialog dialog = new Dialog(requireContext, i2);
            Context context = dialog.getContext();
            this.f3051s0 = m(context, 16843277);
            this.E0 = new na.j(context, null, R.attr.materialCalendarStyle, 2131952830);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, t9.a.m, R.attr.materialCalendarStyle, 2131952830);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.E0.k(context);
            this.E0.n(ColorStateList.valueOf(color));
            this.E0.m(dialog.getWindow().getDecorView().getElevation());
            return dialog;
        }
        k();
        throw null;
    }

    public final void k() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        m9.o.b();
    }

    @Override // androidx.fragment.app.w, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f3044k0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.j0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f3046m0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f3048o0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f3049q0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
                this.f3050r0 = bundle.getCharSequence("TITLE_TEXT_KEY");
                this.f3052t0 = bundle.getInt("INPUT_MODE_KEY");
                this.f3053u0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f3054v0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
                this.f3055w0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f3056x0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                this.f3057y0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f3058z0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                this.A0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.B0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                CharSequence charSequence = this.f3050r0;
                if (charSequence == null) {
                    charSequence = requireContext().getResources().getText(this.f3049q0);
                }
                this.G0 = charSequence;
                if (charSequence != null) {
                    CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
                    if (split.length > 1) {
                        charSequence = split[0];
                    }
                } else {
                    charSequence = null;
                }
                this.H0 = charSequence;
                return;
            }
            m9.o.b();
            return;
        }
        m9.o.b();
    }

    @Override // androidx.fragment.app.j0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        String string;
        if (this.f3051s0) {
            i2 = R.layout.mtrl_picker_fullscreen;
        } else {
            i2 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup);
        Context context = inflate.getContext();
        if (this.f3051s0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(l(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(l(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.D0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.C0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.D0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.D0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, k7.w.p(context, R.drawable.material_ic_calendar_black_24dp));
        boolean z10 = false;
        stateListDrawable.addState(new int[0], k7.w.p(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.D0;
        if (this.f3052t0 != 0) {
            z10 = true;
        }
        checkableImageButton2.setChecked(z10);
        x0.o(this.D0, null);
        CheckableImageButton checkableImageButton3 = this.D0;
        if (this.f3052t0 == 1) {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.D0.setContentDescription(string);
        this.D0.setOnClickListener(new ah.f(2, this));
        Button button = (Button) inflate.findViewById(R.id.confirm_button);
        k();
        throw null;
    }

    @Override // androidx.fragment.app.w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f3045l0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    @Override // androidx.fragment.app.w, androidx.fragment.app.j0
    public final void onSaveInstanceState(Bundle bundle) {
        q qVar;
        q b10;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f3046m0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f3048o0;
        ?? obj = new Object();
        int i2 = a.f3030b;
        int i10 = a.f3030b;
        long j2 = bVar.A.Y;
        long j10 = bVar.B.Y;
        obj.f3031a = Long.valueOf(bVar.R.Y);
        int i11 = bVar.X;
        d dVar = bVar.L;
        m mVar = this.p0;
        if (mVar == null) {
            qVar = null;
        } else {
            qVar = mVar.R;
        }
        if (qVar != null) {
            obj.f3031a = Long.valueOf(qVar.Y);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar);
        q b11 = q.b(j2);
        q b12 = q.b(j10);
        d dVar2 = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = obj.f3031a;
        if (l10 == null) {
            b10 = null;
        } else {
            b10 = q.b(l10.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b11, b12, dVar2, b10, i11));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f3049q0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f3050r0);
        bundle.putInt("INPUT_MODE_KEY", this.f3052t0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f3053u0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f3054v0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f3055w0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f3056x0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f3057y0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f3058z0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.A0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.B0);
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.j0
    public final void onStart() {
        CharSequence charSequence;
        Integer num;
        boolean z10;
        int i2;
        boolean z11;
        aj.g j2Var;
        aj.g j2Var2;
        super.onStart();
        Dialog dialog = this.f1432f0;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (this.f3051s0) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(this.E0);
                if (!this.F0) {
                    View findViewById = requireView().findViewById(R.id.fullscreen_header);
                    ColorStateList n10 = l0.f.n(findViewById.getBackground());
                    if (n10 != null) {
                        num = Integer.valueOf(n10.getDefaultColor());
                    } else {
                        num = null;
                    }
                    boolean z12 = false;
                    if (num != null && num.intValue() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int l10 = l0.f.l(window.getContext(), 16842801, -16777216);
                    if (z10) {
                        num = Integer.valueOf(l10);
                    }
                    q8.r.S(window, false);
                    window.getContext();
                    Context context = window.getContext();
                    if (Build.VERSION.SDK_INT < 27) {
                        i2 = q5.a.d(l0.f.l(context, 16843858, -16777216), 128);
                    } else {
                        i2 = 0;
                    }
                    window.setStatusBarColor(0);
                    window.setNavigationBarColor(i2);
                    boolean q10 = l0.f.q(num.intValue());
                    if (!l0.f.q(0) && !q10) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    a0.b bVar = new a0.b(window.getDecorView());
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 35) {
                        j2Var = new l2(window, bVar);
                    } else if (i10 >= 30) {
                        j2Var = new l2(window, bVar);
                    } else if (i10 >= 26) {
                        j2Var = new j2(window, bVar);
                    } else {
                        j2Var = new j2(window, bVar);
                    }
                    j2Var.e0(z11);
                    boolean q11 = l0.f.q(l10);
                    if (l0.f.q(i2) || (i2 == 0 && q11)) {
                        z12 = true;
                    }
                    a0.b bVar2 = new a0.b(window.getDecorView());
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 35) {
                        j2Var2 = new l2(window, bVar2);
                    } else if (i11 >= 30) {
                        j2Var2 = new l2(window, bVar2);
                    } else if (i11 >= 26) {
                        j2Var2 = new j2(window, bVar2);
                    } else {
                        j2Var2 = new j2(window, bVar2);
                    }
                    j2Var2.d0(z12);
                    n nVar = new n(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                    WeakHashMap weakHashMap = x0.f533a;
                    p0.k(findViewById, nVar);
                    this.F0 = true;
                }
            } else {
                window.setLayout(-2, -2);
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
                Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                window.setBackgroundDrawable(new InsetDrawable((Drawable) this.E0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
                View decorView = window.getDecorView();
                Dialog dialog2 = this.f1432f0;
                if (dialog2 != null) {
                    decorView.setOnTouchListener(new ea.a(dialog2, rect));
                } else {
                    throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
                }
            }
            requireContext();
            int i12 = this.f3046m0;
            if (i12 != 0) {
                k();
                b bVar3 = this.f3048o0;
                m mVar = new m();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i12);
                bundle.putParcelable("GRID_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar3);
                bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle.putParcelable("CURRENT_MONTH_KEY", bVar3.R);
                mVar.setArguments(bundle);
                this.p0 = mVar;
                v vVar = mVar;
                if (this.f3052t0 == 1) {
                    k();
                    b bVar4 = this.f3048o0;
                    v pVar = new p();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("THEME_RES_ID_KEY", i12);
                    bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                    bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar4);
                    pVar.setArguments(bundle2);
                    vVar = pVar;
                }
                this.f3047n0 = vVar;
                TextView textView = this.C0;
                if (this.f3052t0 == 1 && getResources().getConfiguration().orientation == 2) {
                    charSequence = this.H0;
                } else {
                    charSequence = this.G0;
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

    @Override // androidx.fragment.app.w, androidx.fragment.app.j0
    public final void onStop() {
        this.f3047n0.A.clear();
        super.onStop();
    }
}

package me.magnum.melonds.ui.layouteditor;

import a6.p0;
import a6.x0;
import ah.m1;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import cd.o1;
import cd.q1;
import com.squareup.picasso.a0;
import he.g;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import k7.w;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import n1.h;
import n2.f1;
import n2.l;
import n2.r;
import n2.s;
import n2.w0;
import oe.h0;
import og.i;
import p7.j;
import q.x1;
import rh.e0;
import rh.k;
import rh.o;
import rh.p;
import rh.q;
import rh.t;
import rh.u;
import rh.z;
import sh.d;
import sh.e;
import ve.c;
import ve.f;
import ve.m;
import yb.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends FrameLayout {
    public final d A;
    public final a0 B;
    public final le.a L;
    public final n R;

    /* renamed from: b0  reason: collision with root package name */
    public t f9541b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f9542c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f9543d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f9544e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f9545f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f9546g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f9547h0;

    /* renamed from: i0  reason: collision with root package name */
    public c f9548i0;

    /* renamed from: j0  reason: collision with root package name */
    public u f9549j0;

    /* renamed from: k0  reason: collision with root package name */
    public u f9550k0;

    /* renamed from: l0  reason: collision with root package name */
    public u f9551l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f9552m0;

    /* renamed from: n0  reason: collision with root package name */
    public final f1 f9553n0;

    /* renamed from: o0  reason: collision with root package name */
    public final f1 f9554o0;
    public final f1 p0;

    /* renamed from: q0  reason: collision with root package name */
    public final rg.d f9555q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, a0 a0Var, e eVar, ContextWrapper contextWrapper) {
        super(contextWrapper, null);
        boolean z10;
        boolean z11;
        dVar.getClass();
        this.A = dVar;
        this.B = a0Var;
        this.R = new n(new k(this, 0));
        this.f9542c0 = true;
        this.f9543d0 = true;
        u uVar = u.RATIO_4_3;
        this.f9549j0 = uVar;
        this.f9550k0 = uVar;
        this.f9551l0 = uVar;
        if (eVar != null) {
            z10 = eVar.f12923a;
        } else {
            z10 = false;
        }
        this.f9553n0 = s.w(Boolean.valueOf(z10));
        if (eVar != null) {
            z11 = eVar.f12924b;
        } else {
            z11 = false;
        }
        this.f9554o0 = s.w(Boolean.valueOf(z11));
        this.p0 = s.w(null);
        this.f9555q0 = new rg.d();
        LayoutInflater from = LayoutInflater.from(contextWrapper);
        setFocusable(true);
        setFocusableInTouchMode(true);
        View inflate = from.inflate(R.layout.view_layout_editor_manager, (ViewGroup) null, false);
        int i2 = R.id.barrier_labels;
        if (((Barrier) w.k(inflate, R.id.barrier_labels)) != null) {
            i2 = R.id.button_add_button;
            Button button = (Button) w.k(inflate, R.id.button_add_button);
            if (button != null) {
                i2 = R.id.button_center_horizontal;
                Button button2 = (Button) w.k(inflate, R.id.button_center_horizontal);
                if (button2 != null) {
                    i2 = R.id.button_center_vertical;
                    Button button3 = (Button) w.k(inflate, R.id.button_center_vertical);
                    if (button3 != null) {
                        i2 = R.id.button_delete_button;
                        Button button4 = (Button) w.k(inflate, R.id.button_delete_button);
                        if (button4 != null) {
                            i2 = R.id.button_hide_controls;
                            ImageButton imageButton = (ImageButton) w.k(inflate, R.id.button_hide_controls);
                            if (imageButton != null) {
                                i2 = R.id.button_menu;
                                Button button5 = (Button) w.k(inflate, R.id.button_menu);
                                if (button5 != null) {
                                    i2 = R.id.checkbox_above_screen;
                                    CheckBox checkBox = (CheckBox) w.k(inflate, R.id.checkbox_above_screen);
                                    if (checkBox != null) {
                                        i2 = R.id.image_background;
                                        ImageView imageView = (ImageView) w.k(inflate, R.id.image_background);
                                        if (imageView != null) {
                                            i2 = R.id.layout_alpha_labels;
                                            LinearLayout linearLayout = (LinearLayout) w.k(inflate, R.id.layout_alpha_labels);
                                            if (linearLayout != null) {
                                                i2 = R.id.layout_aspect_ratio;
                                                LinearLayout linearLayout2 = (LinearLayout) w.k(inflate, R.id.layout_aspect_ratio);
                                                if (linearLayout2 != null) {
                                                    i2 = R.id.layout_controls;
                                                    LinearLayout linearLayout3 = (LinearLayout) w.k(inflate, R.id.layout_controls);
                                                    if (linearLayout3 != null) {
                                                        i2 = R.id.layout_height_labels;
                                                        LinearLayout linearLayout4 = (LinearLayout) w.k(inflate, R.id.layout_height_labels);
                                                        if (linearLayout4 != null) {
                                                            i2 = R.id.layout_scaling;
                                                            if (((ConstraintLayout) w.k(inflate, R.id.layout_scaling)) != null) {
                                                                i2 = R.id.layout_scaling_container;
                                                                ScrollView scrollView = (ScrollView) w.k(inflate, R.id.layout_scaling_container);
                                                                if (scrollView != null) {
                                                                    i2 = R.id.layout_size_labels;
                                                                    LinearLayout linearLayout5 = (LinearLayout) w.k(inflate, R.id.layout_size_labels);
                                                                    if (linearLayout5 != null) {
                                                                        i2 = R.id.layout_width_labels;
                                                                        LinearLayout linearLayout6 = (LinearLayout) w.k(inflate, R.id.layout_width_labels);
                                                                        if (linearLayout6 != null) {
                                                                            i2 = R.id.seek_bar_alpha;
                                                                            SeekBar seekBar = (SeekBar) w.k(inflate, R.id.seek_bar_alpha);
                                                                            if (seekBar != null) {
                                                                                i2 = R.id.seek_bar_height;
                                                                                SeekBar seekBar2 = (SeekBar) w.k(inflate, R.id.seek_bar_height);
                                                                                if (seekBar2 != null) {
                                                                                    i2 = R.id.seek_bar_size;
                                                                                    SeekBar seekBar3 = (SeekBar) w.k(inflate, R.id.seek_bar_size);
                                                                                    if (seekBar3 != null) {
                                                                                        i2 = R.id.seek_bar_width;
                                                                                        SeekBar seekBar4 = (SeekBar) w.k(inflate, R.id.seek_bar_width);
                                                                                        if (seekBar4 != null) {
                                                                                            i2 = R.id.spinner_aspect_ratio;
                                                                                            Spinner spinner = (Spinner) w.k(inflate, R.id.spinner_aspect_ratio);
                                                                                            if (spinner != null) {
                                                                                                i2 = R.id.text_height;
                                                                                                TextView textView = (TextView) w.k(inflate, R.id.text_height);
                                                                                                if (textView != null) {
                                                                                                    i2 = R.id.text_size;
                                                                                                    TextView textView2 = (TextView) w.k(inflate, R.id.text_size);
                                                                                                    if (textView2 != null) {
                                                                                                        i2 = R.id.text_width;
                                                                                                        TextView textView3 = (TextView) w.k(inflate, R.id.text_width);
                                                                                                        if (textView3 != null) {
                                                                                                            i2 = R.id.view_layout_editor;
                                                                                                            LayoutEditorView layoutEditorView = (LayoutEditorView) w.k(inflate, R.id.view_layout_editor);
                                                                                                            if (layoutEditorView != null) {
                                                                                                                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                                                                                                                this.L = new le.a(relativeLayout, button, button2, button3, button4, imageButton, button5, checkBox, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, scrollView, linearLayout5, linearLayout6, seekBar, seekBar2, seekBar3, seekBar4, spinner, textView, textView2, textView3, layoutEditorView);
                                                                                                                ComposeView composeView = new ComposeView(contextWrapper, null, 6);
                                                                                                                composeView.setContent(new v2.c(1040140390, true, new p(this, 1)));
                                                                                                                addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
                                                                                                                addView(composeView, new FrameLayout.LayoutParams(-1, -1));
                                                                                                                ah.e eVar2 = new ah.e(14, this);
                                                                                                                WeakHashMap weakHashMap = x0.f533a;
                                                                                                                p0.k(relativeLayout, eVar2);
                                                                                                                button.setOnClickListener(new View.OnClickListener(this) { // from class: rh.l
                                                                                                                    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

                                                                                                                    {
                                                                                                                        this.B = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        int i10;
                                                                                                                        switch (r2) {
                                                                                                                            case 0:
                                                                                                                                this.B.r();
                                                                                                                                return;
                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                LayoutEditorView layoutEditorView2 = this.B.L.f9067u;
                                                                                                                                og.i iVar = layoutEditorView2.f9533f0;
                                                                                                                                if (iVar != null) {
                                                                                                                                    layoutEditorView2.removeView(iVar.f11005a);
                                                                                                                                    layoutEditorView2.getViews().remove(iVar.f11006b);
                                                                                                                                    layoutEditorView2.j();
                                                                                                                                    layoutEditorView2.f9535h0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 2:
                                                                                                                                LayoutEditorView layoutEditorView3 = this.B.L.f9067u;
                                                                                                                                og.i iVar2 = layoutEditorView3.f9533f0;
                                                                                                                                if (iVar2 != null) {
                                                                                                                                    View view2 = iVar2.f11005a;
                                                                                                                                    int width = (layoutEditorView3.getWidth() - view2.getWidth()) / 2;
                                                                                                                                    int i11 = iVar2.a().f10909b;
                                                                                                                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                                                                                                                    if (layoutParams != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                                                                                                                        layoutParams2.leftMargin = width;
                                                                                                                                        layoutParams2.topMargin = i11;
                                                                                                                                        view2.setLayoutParams(layoutParams2);
                                                                                                                                        layoutEditorView3.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 3:
                                                                                                                                LayoutEditorView layoutEditorView4 = this.B.L.f9067u;
                                                                                                                                og.i iVar3 = layoutEditorView4.f9533f0;
                                                                                                                                if (iVar3 != null) {
                                                                                                                                    View view3 = iVar3.f11005a;
                                                                                                                                    int height = (layoutEditorView4.getHeight() - view3.getHeight()) / 2;
                                                                                                                                    int i12 = iVar3.a().f10908a;
                                                                                                                                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                                                                                                                                    if (layoutParams3 != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                                                                                                                        layoutParams4.leftMargin = i12;
                                                                                                                                        layoutParams4.topMargin = height;
                                                                                                                                        view3.setLayoutParams(layoutParams4);
                                                                                                                                        layoutEditorView4.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 4:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar = this.B;
                                                                                                                                boolean z12 = bVar.f9542c0;
                                                                                                                                if (z12) {
                                                                                                                                    me.magnum.melonds.ui.layouteditor.b.p(bVar);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                le.a aVar = bVar.L;
                                                                                                                                if (!z12) {
                                                                                                                                    LinearLayout linearLayout7 = aVar.f9055h;
                                                                                                                                    linearLayout7.clearAnimation();
                                                                                                                                    linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new n(bVar, 1)).start();
                                                                                                                                    bVar.f9542c0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.a(this.B);
                                                                                                                                return;
                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.d(this.B);
                                                                                                                                return;
                                                                                                                            case 7:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.g(this.B);
                                                                                                                                return;
                                                                                                                            case 8:
                                                                                                                                this.B.q(true);
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar2 = this.B;
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.p(bVar2);
                                                                                                                                List<ve.c> instantiatedComponents = bVar2.L.f9067u.getInstantiatedComponents();
                                                                                                                                fc.a entries = ve.c.getEntries();
                                                                                                                                ArrayList arrayList = new ArrayList();
                                                                                                                                for (Object obj : entries) {
                                                                                                                                    if (!instantiatedComponents.contains((ve.c) obj)) {
                                                                                                                                        arrayList.add(obj);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                bk.a aVar2 = new bk.a(new ContextThemeWrapper(bVar2.getContext(), (int) R.style.AppTheme));
                                                                                                                                aVar2.w(R.string.choose_component);
                                                                                                                                aVar2.u(R.string.cancel, new ah.m(8));
                                                                                                                                if (!arrayList.isEmpty()) {
                                                                                                                                    ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
                                                                                                                                    int size = arrayList.size();
                                                                                                                                    int i13 = 0;
                                                                                                                                    while (i13 < size) {
                                                                                                                                        Object obj2 = arrayList.get(i13);
                                                                                                                                        i13++;
                                                                                                                                        ve.c cVar = (ve.c) obj2;
                                                                                                                                        Resources resources = bVar2.getResources();
                                                                                                                                        cVar.getClass();
                                                                                                                                        switch (ji.b.f7907a[cVar.ordinal()]) {
                                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                                i10 = R.string.top_screen;
                                                                                                                                                break;
                                                                                                                                            case 2:
                                                                                                                                                i10 = R.string.bottom_screen;
                                                                                                                                                break;
                                                                                                                                            case 3:
                                                                                                                                                i10 = R.string.input_dpad;
                                                                                                                                                break;
                                                                                                                                            case 4:
                                                                                                                                                i10 = R.string.input_abxy_buttons;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                                i10 = R.string.input_l;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                                i10 = R.string.input_r;
                                                                                                                                                break;
                                                                                                                                            case 7:
                                                                                                                                                i10 = R.string.input_start;
                                                                                                                                                break;
                                                                                                                                            case 8:
                                                                                                                                                i10 = R.string.input_select;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8508d /* 9 */:
                                                                                                                                                i10 = R.string.input_lid;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8510f /* 10 */:
                                                                                                                                                i10 = R.string.input_pause;
                                                                                                                                                break;
                                                                                                                                            case 11:
                                                                                                                                                i10 = R.string.input_fast_forward;
                                                                                                                                                break;
                                                                                                                                            case 12:
                                                                                                                                                i10 = R.string.input_microphone;
                                                                                                                                                break;
                                                                                                                                            case 13:
                                                                                                                                                i10 = R.string.input_toggle_soft_input;
                                                                                                                                                break;
                                                                                                                                            case 14:
                                                                                                                                                i10 = R.string.reset;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8512h /* 15 */:
                                                                                                                                                i10 = R.string.input_swap_screens;
                                                                                                                                                break;
                                                                                                                                            case 16:
                                                                                                                                                i10 = R.string.input_quick_save;
                                                                                                                                                break;
                                                                                                                                            case 17:
                                                                                                                                                i10 = R.string.input_quick_load;
                                                                                                                                                break;
                                                                                                                                            case 18:
                                                                                                                                                i10 = R.string.rewind;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                m9.o.o();
                                                                                                                                                return;
                                                                                                                                        }
                                                                                                                                        arrayList2.add(resources.getString(i10));
                                                                                                                                    }
                                                                                                                                    ah.l lVar = new ah.l(4, arrayList, bVar2);
                                                                                                                                    l.d dVar2 = (l.d) aVar2.L;
                                                                                                                                    dVar2.f8371q = (CharSequence[]) arrayList2.toArray(new String[0]);
                                                                                                                                    dVar2.f8373s = lVar;
                                                                                                                                } else {
                                                                                                                                    aVar2.t(R.string.no_more_components);
                                                                                                                                }
                                                                                                                                l.g i14 = aVar2.i();
                                                                                                                                Window window = i14.getWindow();
                                                                                                                                if (window != null) {
                                                                                                                                    window.setType(1003);
                                                                                                                                    window.getAttributes().token = bVar2.getWindowToken();
                                                                                                                                }
                                                                                                                                i14.show();
                                                                                                                                return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                button5.setOnClickListener(new View.OnClickListener(this) { // from class: rh.l
                                                                                                                    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

                                                                                                                    {
                                                                                                                        this.B = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        int i10;
                                                                                                                        switch (r2) {
                                                                                                                            case 0:
                                                                                                                                this.B.r();
                                                                                                                                return;
                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                LayoutEditorView layoutEditorView2 = this.B.L.f9067u;
                                                                                                                                og.i iVar = layoutEditorView2.f9533f0;
                                                                                                                                if (iVar != null) {
                                                                                                                                    layoutEditorView2.removeView(iVar.f11005a);
                                                                                                                                    layoutEditorView2.getViews().remove(iVar.f11006b);
                                                                                                                                    layoutEditorView2.j();
                                                                                                                                    layoutEditorView2.f9535h0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 2:
                                                                                                                                LayoutEditorView layoutEditorView3 = this.B.L.f9067u;
                                                                                                                                og.i iVar2 = layoutEditorView3.f9533f0;
                                                                                                                                if (iVar2 != null) {
                                                                                                                                    View view2 = iVar2.f11005a;
                                                                                                                                    int width = (layoutEditorView3.getWidth() - view2.getWidth()) / 2;
                                                                                                                                    int i11 = iVar2.a().f10909b;
                                                                                                                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                                                                                                                    if (layoutParams != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                                                                                                                        layoutParams2.leftMargin = width;
                                                                                                                                        layoutParams2.topMargin = i11;
                                                                                                                                        view2.setLayoutParams(layoutParams2);
                                                                                                                                        layoutEditorView3.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 3:
                                                                                                                                LayoutEditorView layoutEditorView4 = this.B.L.f9067u;
                                                                                                                                og.i iVar3 = layoutEditorView4.f9533f0;
                                                                                                                                if (iVar3 != null) {
                                                                                                                                    View view3 = iVar3.f11005a;
                                                                                                                                    int height = (layoutEditorView4.getHeight() - view3.getHeight()) / 2;
                                                                                                                                    int i12 = iVar3.a().f10908a;
                                                                                                                                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                                                                                                                                    if (layoutParams3 != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                                                                                                                        layoutParams4.leftMargin = i12;
                                                                                                                                        layoutParams4.topMargin = height;
                                                                                                                                        view3.setLayoutParams(layoutParams4);
                                                                                                                                        layoutEditorView4.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 4:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar = this.B;
                                                                                                                                boolean z12 = bVar.f9542c0;
                                                                                                                                if (z12) {
                                                                                                                                    me.magnum.melonds.ui.layouteditor.b.p(bVar);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                le.a aVar = bVar.L;
                                                                                                                                if (!z12) {
                                                                                                                                    LinearLayout linearLayout7 = aVar.f9055h;
                                                                                                                                    linearLayout7.clearAnimation();
                                                                                                                                    linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new n(bVar, 1)).start();
                                                                                                                                    bVar.f9542c0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.a(this.B);
                                                                                                                                return;
                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.d(this.B);
                                                                                                                                return;
                                                                                                                            case 7:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.g(this.B);
                                                                                                                                return;
                                                                                                                            case 8:
                                                                                                                                this.B.q(true);
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar2 = this.B;
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.p(bVar2);
                                                                                                                                List<ve.c> instantiatedComponents = bVar2.L.f9067u.getInstantiatedComponents();
                                                                                                                                fc.a entries = ve.c.getEntries();
                                                                                                                                ArrayList arrayList = new ArrayList();
                                                                                                                                for (Object obj : entries) {
                                                                                                                                    if (!instantiatedComponents.contains((ve.c) obj)) {
                                                                                                                                        arrayList.add(obj);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                bk.a aVar2 = new bk.a(new ContextThemeWrapper(bVar2.getContext(), (int) R.style.AppTheme));
                                                                                                                                aVar2.w(R.string.choose_component);
                                                                                                                                aVar2.u(R.string.cancel, new ah.m(8));
                                                                                                                                if (!arrayList.isEmpty()) {
                                                                                                                                    ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
                                                                                                                                    int size = arrayList.size();
                                                                                                                                    int i13 = 0;
                                                                                                                                    while (i13 < size) {
                                                                                                                                        Object obj2 = arrayList.get(i13);
                                                                                                                                        i13++;
                                                                                                                                        ve.c cVar = (ve.c) obj2;
                                                                                                                                        Resources resources = bVar2.getResources();
                                                                                                                                        cVar.getClass();
                                                                                                                                        switch (ji.b.f7907a[cVar.ordinal()]) {
                                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                                i10 = R.string.top_screen;
                                                                                                                                                break;
                                                                                                                                            case 2:
                                                                                                                                                i10 = R.string.bottom_screen;
                                                                                                                                                break;
                                                                                                                                            case 3:
                                                                                                                                                i10 = R.string.input_dpad;
                                                                                                                                                break;
                                                                                                                                            case 4:
                                                                                                                                                i10 = R.string.input_abxy_buttons;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                                i10 = R.string.input_l;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                                i10 = R.string.input_r;
                                                                                                                                                break;
                                                                                                                                            case 7:
                                                                                                                                                i10 = R.string.input_start;
                                                                                                                                                break;
                                                                                                                                            case 8:
                                                                                                                                                i10 = R.string.input_select;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8508d /* 9 */:
                                                                                                                                                i10 = R.string.input_lid;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8510f /* 10 */:
                                                                                                                                                i10 = R.string.input_pause;
                                                                                                                                                break;
                                                                                                                                            case 11:
                                                                                                                                                i10 = R.string.input_fast_forward;
                                                                                                                                                break;
                                                                                                                                            case 12:
                                                                                                                                                i10 = R.string.input_microphone;
                                                                                                                                                break;
                                                                                                                                            case 13:
                                                                                                                                                i10 = R.string.input_toggle_soft_input;
                                                                                                                                                break;
                                                                                                                                            case 14:
                                                                                                                                                i10 = R.string.reset;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8512h /* 15 */:
                                                                                                                                                i10 = R.string.input_swap_screens;
                                                                                                                                                break;
                                                                                                                                            case 16:
                                                                                                                                                i10 = R.string.input_quick_save;
                                                                                                                                                break;
                                                                                                                                            case 17:
                                                                                                                                                i10 = R.string.input_quick_load;
                                                                                                                                                break;
                                                                                                                                            case 18:
                                                                                                                                                i10 = R.string.rewind;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                m9.o.o();
                                                                                                                                                return;
                                                                                                                                        }
                                                                                                                                        arrayList2.add(resources.getString(i10));
                                                                                                                                    }
                                                                                                                                    ah.l lVar = new ah.l(4, arrayList, bVar2);
                                                                                                                                    l.d dVar2 = (l.d) aVar2.L;
                                                                                                                                    dVar2.f8371q = (CharSequence[]) arrayList2.toArray(new String[0]);
                                                                                                                                    dVar2.f8373s = lVar;
                                                                                                                                } else {
                                                                                                                                    aVar2.t(R.string.no_more_components);
                                                                                                                                }
                                                                                                                                l.g i14 = aVar2.i();
                                                                                                                                Window window = i14.getWindow();
                                                                                                                                if (window != null) {
                                                                                                                                    window.setType(1003);
                                                                                                                                    window.getAttributes().token = bVar2.getWindowToken();
                                                                                                                                }
                                                                                                                                i14.show();
                                                                                                                                return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                button4.setOnClickListener(new View.OnClickListener(this) { // from class: rh.l
                                                                                                                    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

                                                                                                                    {
                                                                                                                        this.B = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        int i10;
                                                                                                                        switch (r2) {
                                                                                                                            case 0:
                                                                                                                                this.B.r();
                                                                                                                                return;
                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                LayoutEditorView layoutEditorView2 = this.B.L.f9067u;
                                                                                                                                og.i iVar = layoutEditorView2.f9533f0;
                                                                                                                                if (iVar != null) {
                                                                                                                                    layoutEditorView2.removeView(iVar.f11005a);
                                                                                                                                    layoutEditorView2.getViews().remove(iVar.f11006b);
                                                                                                                                    layoutEditorView2.j();
                                                                                                                                    layoutEditorView2.f9535h0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 2:
                                                                                                                                LayoutEditorView layoutEditorView3 = this.B.L.f9067u;
                                                                                                                                og.i iVar2 = layoutEditorView3.f9533f0;
                                                                                                                                if (iVar2 != null) {
                                                                                                                                    View view2 = iVar2.f11005a;
                                                                                                                                    int width = (layoutEditorView3.getWidth() - view2.getWidth()) / 2;
                                                                                                                                    int i11 = iVar2.a().f10909b;
                                                                                                                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                                                                                                                    if (layoutParams != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                                                                                                                        layoutParams2.leftMargin = width;
                                                                                                                                        layoutParams2.topMargin = i11;
                                                                                                                                        view2.setLayoutParams(layoutParams2);
                                                                                                                                        layoutEditorView3.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 3:
                                                                                                                                LayoutEditorView layoutEditorView4 = this.B.L.f9067u;
                                                                                                                                og.i iVar3 = layoutEditorView4.f9533f0;
                                                                                                                                if (iVar3 != null) {
                                                                                                                                    View view3 = iVar3.f11005a;
                                                                                                                                    int height = (layoutEditorView4.getHeight() - view3.getHeight()) / 2;
                                                                                                                                    int i12 = iVar3.a().f10908a;
                                                                                                                                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                                                                                                                                    if (layoutParams3 != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                                                                                                                        layoutParams4.leftMargin = i12;
                                                                                                                                        layoutParams4.topMargin = height;
                                                                                                                                        view3.setLayoutParams(layoutParams4);
                                                                                                                                        layoutEditorView4.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 4:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar = this.B;
                                                                                                                                boolean z12 = bVar.f9542c0;
                                                                                                                                if (z12) {
                                                                                                                                    me.magnum.melonds.ui.layouteditor.b.p(bVar);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                le.a aVar = bVar.L;
                                                                                                                                if (!z12) {
                                                                                                                                    LinearLayout linearLayout7 = aVar.f9055h;
                                                                                                                                    linearLayout7.clearAnimation();
                                                                                                                                    linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new n(bVar, 1)).start();
                                                                                                                                    bVar.f9542c0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.a(this.B);
                                                                                                                                return;
                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.d(this.B);
                                                                                                                                return;
                                                                                                                            case 7:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.g(this.B);
                                                                                                                                return;
                                                                                                                            case 8:
                                                                                                                                this.B.q(true);
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar2 = this.B;
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.p(bVar2);
                                                                                                                                List<ve.c> instantiatedComponents = bVar2.L.f9067u.getInstantiatedComponents();
                                                                                                                                fc.a entries = ve.c.getEntries();
                                                                                                                                ArrayList arrayList = new ArrayList();
                                                                                                                                for (Object obj : entries) {
                                                                                                                                    if (!instantiatedComponents.contains((ve.c) obj)) {
                                                                                                                                        arrayList.add(obj);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                bk.a aVar2 = new bk.a(new ContextThemeWrapper(bVar2.getContext(), (int) R.style.AppTheme));
                                                                                                                                aVar2.w(R.string.choose_component);
                                                                                                                                aVar2.u(R.string.cancel, new ah.m(8));
                                                                                                                                if (!arrayList.isEmpty()) {
                                                                                                                                    ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
                                                                                                                                    int size = arrayList.size();
                                                                                                                                    int i13 = 0;
                                                                                                                                    while (i13 < size) {
                                                                                                                                        Object obj2 = arrayList.get(i13);
                                                                                                                                        i13++;
                                                                                                                                        ve.c cVar = (ve.c) obj2;
                                                                                                                                        Resources resources = bVar2.getResources();
                                                                                                                                        cVar.getClass();
                                                                                                                                        switch (ji.b.f7907a[cVar.ordinal()]) {
                                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                                i10 = R.string.top_screen;
                                                                                                                                                break;
                                                                                                                                            case 2:
                                                                                                                                                i10 = R.string.bottom_screen;
                                                                                                                                                break;
                                                                                                                                            case 3:
                                                                                                                                                i10 = R.string.input_dpad;
                                                                                                                                                break;
                                                                                                                                            case 4:
                                                                                                                                                i10 = R.string.input_abxy_buttons;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                                i10 = R.string.input_l;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                                i10 = R.string.input_r;
                                                                                                                                                break;
                                                                                                                                            case 7:
                                                                                                                                                i10 = R.string.input_start;
                                                                                                                                                break;
                                                                                                                                            case 8:
                                                                                                                                                i10 = R.string.input_select;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8508d /* 9 */:
                                                                                                                                                i10 = R.string.input_lid;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8510f /* 10 */:
                                                                                                                                                i10 = R.string.input_pause;
                                                                                                                                                break;
                                                                                                                                            case 11:
                                                                                                                                                i10 = R.string.input_fast_forward;
                                                                                                                                                break;
                                                                                                                                            case 12:
                                                                                                                                                i10 = R.string.input_microphone;
                                                                                                                                                break;
                                                                                                                                            case 13:
                                                                                                                                                i10 = R.string.input_toggle_soft_input;
                                                                                                                                                break;
                                                                                                                                            case 14:
                                                                                                                                                i10 = R.string.reset;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8512h /* 15 */:
                                                                                                                                                i10 = R.string.input_swap_screens;
                                                                                                                                                break;
                                                                                                                                            case 16:
                                                                                                                                                i10 = R.string.input_quick_save;
                                                                                                                                                break;
                                                                                                                                            case 17:
                                                                                                                                                i10 = R.string.input_quick_load;
                                                                                                                                                break;
                                                                                                                                            case 18:
                                                                                                                                                i10 = R.string.rewind;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                m9.o.o();
                                                                                                                                                return;
                                                                                                                                        }
                                                                                                                                        arrayList2.add(resources.getString(i10));
                                                                                                                                    }
                                                                                                                                    ah.l lVar = new ah.l(4, arrayList, bVar2);
                                                                                                                                    l.d dVar2 = (l.d) aVar2.L;
                                                                                                                                    dVar2.f8371q = (CharSequence[]) arrayList2.toArray(new String[0]);
                                                                                                                                    dVar2.f8373s = lVar;
                                                                                                                                } else {
                                                                                                                                    aVar2.t(R.string.no_more_components);
                                                                                                                                }
                                                                                                                                l.g i14 = aVar2.i();
                                                                                                                                Window window = i14.getWindow();
                                                                                                                                if (window != null) {
                                                                                                                                    window.setType(1003);
                                                                                                                                    window.getAttributes().token = bVar2.getWindowToken();
                                                                                                                                }
                                                                                                                                i14.show();
                                                                                                                                return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                button2.setOnClickListener(new View.OnClickListener(this) { // from class: rh.l
                                                                                                                    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

                                                                                                                    {
                                                                                                                        this.B = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        int i10;
                                                                                                                        switch (r2) {
                                                                                                                            case 0:
                                                                                                                                this.B.r();
                                                                                                                                return;
                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                LayoutEditorView layoutEditorView2 = this.B.L.f9067u;
                                                                                                                                og.i iVar = layoutEditorView2.f9533f0;
                                                                                                                                if (iVar != null) {
                                                                                                                                    layoutEditorView2.removeView(iVar.f11005a);
                                                                                                                                    layoutEditorView2.getViews().remove(iVar.f11006b);
                                                                                                                                    layoutEditorView2.j();
                                                                                                                                    layoutEditorView2.f9535h0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 2:
                                                                                                                                LayoutEditorView layoutEditorView3 = this.B.L.f9067u;
                                                                                                                                og.i iVar2 = layoutEditorView3.f9533f0;
                                                                                                                                if (iVar2 != null) {
                                                                                                                                    View view2 = iVar2.f11005a;
                                                                                                                                    int width = (layoutEditorView3.getWidth() - view2.getWidth()) / 2;
                                                                                                                                    int i11 = iVar2.a().f10909b;
                                                                                                                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                                                                                                                    if (layoutParams != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                                                                                                                        layoutParams2.leftMargin = width;
                                                                                                                                        layoutParams2.topMargin = i11;
                                                                                                                                        view2.setLayoutParams(layoutParams2);
                                                                                                                                        layoutEditorView3.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 3:
                                                                                                                                LayoutEditorView layoutEditorView4 = this.B.L.f9067u;
                                                                                                                                og.i iVar3 = layoutEditorView4.f9533f0;
                                                                                                                                if (iVar3 != null) {
                                                                                                                                    View view3 = iVar3.f11005a;
                                                                                                                                    int height = (layoutEditorView4.getHeight() - view3.getHeight()) / 2;
                                                                                                                                    int i12 = iVar3.a().f10908a;
                                                                                                                                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                                                                                                                                    if (layoutParams3 != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                                                                                                                        layoutParams4.leftMargin = i12;
                                                                                                                                        layoutParams4.topMargin = height;
                                                                                                                                        view3.setLayoutParams(layoutParams4);
                                                                                                                                        layoutEditorView4.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 4:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar = this.B;
                                                                                                                                boolean z12 = bVar.f9542c0;
                                                                                                                                if (z12) {
                                                                                                                                    me.magnum.melonds.ui.layouteditor.b.p(bVar);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                le.a aVar = bVar.L;
                                                                                                                                if (!z12) {
                                                                                                                                    LinearLayout linearLayout7 = aVar.f9055h;
                                                                                                                                    linearLayout7.clearAnimation();
                                                                                                                                    linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new n(bVar, 1)).start();
                                                                                                                                    bVar.f9542c0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.a(this.B);
                                                                                                                                return;
                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.d(this.B);
                                                                                                                                return;
                                                                                                                            case 7:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.g(this.B);
                                                                                                                                return;
                                                                                                                            case 8:
                                                                                                                                this.B.q(true);
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar2 = this.B;
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.p(bVar2);
                                                                                                                                List<ve.c> instantiatedComponents = bVar2.L.f9067u.getInstantiatedComponents();
                                                                                                                                fc.a entries = ve.c.getEntries();
                                                                                                                                ArrayList arrayList = new ArrayList();
                                                                                                                                for (Object obj : entries) {
                                                                                                                                    if (!instantiatedComponents.contains((ve.c) obj)) {
                                                                                                                                        arrayList.add(obj);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                bk.a aVar2 = new bk.a(new ContextThemeWrapper(bVar2.getContext(), (int) R.style.AppTheme));
                                                                                                                                aVar2.w(R.string.choose_component);
                                                                                                                                aVar2.u(R.string.cancel, new ah.m(8));
                                                                                                                                if (!arrayList.isEmpty()) {
                                                                                                                                    ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
                                                                                                                                    int size = arrayList.size();
                                                                                                                                    int i13 = 0;
                                                                                                                                    while (i13 < size) {
                                                                                                                                        Object obj2 = arrayList.get(i13);
                                                                                                                                        i13++;
                                                                                                                                        ve.c cVar = (ve.c) obj2;
                                                                                                                                        Resources resources = bVar2.getResources();
                                                                                                                                        cVar.getClass();
                                                                                                                                        switch (ji.b.f7907a[cVar.ordinal()]) {
                                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                                i10 = R.string.top_screen;
                                                                                                                                                break;
                                                                                                                                            case 2:
                                                                                                                                                i10 = R.string.bottom_screen;
                                                                                                                                                break;
                                                                                                                                            case 3:
                                                                                                                                                i10 = R.string.input_dpad;
                                                                                                                                                break;
                                                                                                                                            case 4:
                                                                                                                                                i10 = R.string.input_abxy_buttons;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                                i10 = R.string.input_l;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                                i10 = R.string.input_r;
                                                                                                                                                break;
                                                                                                                                            case 7:
                                                                                                                                                i10 = R.string.input_start;
                                                                                                                                                break;
                                                                                                                                            case 8:
                                                                                                                                                i10 = R.string.input_select;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8508d /* 9 */:
                                                                                                                                                i10 = R.string.input_lid;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8510f /* 10 */:
                                                                                                                                                i10 = R.string.input_pause;
                                                                                                                                                break;
                                                                                                                                            case 11:
                                                                                                                                                i10 = R.string.input_fast_forward;
                                                                                                                                                break;
                                                                                                                                            case 12:
                                                                                                                                                i10 = R.string.input_microphone;
                                                                                                                                                break;
                                                                                                                                            case 13:
                                                                                                                                                i10 = R.string.input_toggle_soft_input;
                                                                                                                                                break;
                                                                                                                                            case 14:
                                                                                                                                                i10 = R.string.reset;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8512h /* 15 */:
                                                                                                                                                i10 = R.string.input_swap_screens;
                                                                                                                                                break;
                                                                                                                                            case 16:
                                                                                                                                                i10 = R.string.input_quick_save;
                                                                                                                                                break;
                                                                                                                                            case 17:
                                                                                                                                                i10 = R.string.input_quick_load;
                                                                                                                                                break;
                                                                                                                                            case 18:
                                                                                                                                                i10 = R.string.rewind;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                m9.o.o();
                                                                                                                                                return;
                                                                                                                                        }
                                                                                                                                        arrayList2.add(resources.getString(i10));
                                                                                                                                    }
                                                                                                                                    ah.l lVar = new ah.l(4, arrayList, bVar2);
                                                                                                                                    l.d dVar2 = (l.d) aVar2.L;
                                                                                                                                    dVar2.f8371q = (CharSequence[]) arrayList2.toArray(new String[0]);
                                                                                                                                    dVar2.f8373s = lVar;
                                                                                                                                } else {
                                                                                                                                    aVar2.t(R.string.no_more_components);
                                                                                                                                }
                                                                                                                                l.g i14 = aVar2.i();
                                                                                                                                Window window = i14.getWindow();
                                                                                                                                if (window != null) {
                                                                                                                                    window.setType(1003);
                                                                                                                                    window.getAttributes().token = bVar2.getWindowToken();
                                                                                                                                }
                                                                                                                                i14.show();
                                                                                                                                return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                button3.setOnClickListener(new View.OnClickListener(this) { // from class: rh.l
                                                                                                                    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

                                                                                                                    {
                                                                                                                        this.B = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        int i10;
                                                                                                                        switch (r2) {
                                                                                                                            case 0:
                                                                                                                                this.B.r();
                                                                                                                                return;
                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                LayoutEditorView layoutEditorView2 = this.B.L.f9067u;
                                                                                                                                og.i iVar = layoutEditorView2.f9533f0;
                                                                                                                                if (iVar != null) {
                                                                                                                                    layoutEditorView2.removeView(iVar.f11005a);
                                                                                                                                    layoutEditorView2.getViews().remove(iVar.f11006b);
                                                                                                                                    layoutEditorView2.j();
                                                                                                                                    layoutEditorView2.f9535h0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 2:
                                                                                                                                LayoutEditorView layoutEditorView3 = this.B.L.f9067u;
                                                                                                                                og.i iVar2 = layoutEditorView3.f9533f0;
                                                                                                                                if (iVar2 != null) {
                                                                                                                                    View view2 = iVar2.f11005a;
                                                                                                                                    int width = (layoutEditorView3.getWidth() - view2.getWidth()) / 2;
                                                                                                                                    int i11 = iVar2.a().f10909b;
                                                                                                                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                                                                                                                    if (layoutParams != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                                                                                                                        layoutParams2.leftMargin = width;
                                                                                                                                        layoutParams2.topMargin = i11;
                                                                                                                                        view2.setLayoutParams(layoutParams2);
                                                                                                                                        layoutEditorView3.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 3:
                                                                                                                                LayoutEditorView layoutEditorView4 = this.B.L.f9067u;
                                                                                                                                og.i iVar3 = layoutEditorView4.f9533f0;
                                                                                                                                if (iVar3 != null) {
                                                                                                                                    View view3 = iVar3.f11005a;
                                                                                                                                    int height = (layoutEditorView4.getHeight() - view3.getHeight()) / 2;
                                                                                                                                    int i12 = iVar3.a().f10908a;
                                                                                                                                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                                                                                                                                    if (layoutParams3 != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                                                                                                                        layoutParams4.leftMargin = i12;
                                                                                                                                        layoutParams4.topMargin = height;
                                                                                                                                        view3.setLayoutParams(layoutParams4);
                                                                                                                                        layoutEditorView4.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 4:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar = this.B;
                                                                                                                                boolean z12 = bVar.f9542c0;
                                                                                                                                if (z12) {
                                                                                                                                    me.magnum.melonds.ui.layouteditor.b.p(bVar);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                le.a aVar = bVar.L;
                                                                                                                                if (!z12) {
                                                                                                                                    LinearLayout linearLayout7 = aVar.f9055h;
                                                                                                                                    linearLayout7.clearAnimation();
                                                                                                                                    linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new n(bVar, 1)).start();
                                                                                                                                    bVar.f9542c0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.a(this.B);
                                                                                                                                return;
                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.d(this.B);
                                                                                                                                return;
                                                                                                                            case 7:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.g(this.B);
                                                                                                                                return;
                                                                                                                            case 8:
                                                                                                                                this.B.q(true);
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar2 = this.B;
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.p(bVar2);
                                                                                                                                List<ve.c> instantiatedComponents = bVar2.L.f9067u.getInstantiatedComponents();
                                                                                                                                fc.a entries = ve.c.getEntries();
                                                                                                                                ArrayList arrayList = new ArrayList();
                                                                                                                                for (Object obj : entries) {
                                                                                                                                    if (!instantiatedComponents.contains((ve.c) obj)) {
                                                                                                                                        arrayList.add(obj);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                bk.a aVar2 = new bk.a(new ContextThemeWrapper(bVar2.getContext(), (int) R.style.AppTheme));
                                                                                                                                aVar2.w(R.string.choose_component);
                                                                                                                                aVar2.u(R.string.cancel, new ah.m(8));
                                                                                                                                if (!arrayList.isEmpty()) {
                                                                                                                                    ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
                                                                                                                                    int size = arrayList.size();
                                                                                                                                    int i13 = 0;
                                                                                                                                    while (i13 < size) {
                                                                                                                                        Object obj2 = arrayList.get(i13);
                                                                                                                                        i13++;
                                                                                                                                        ve.c cVar = (ve.c) obj2;
                                                                                                                                        Resources resources = bVar2.getResources();
                                                                                                                                        cVar.getClass();
                                                                                                                                        switch (ji.b.f7907a[cVar.ordinal()]) {
                                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                                i10 = R.string.top_screen;
                                                                                                                                                break;
                                                                                                                                            case 2:
                                                                                                                                                i10 = R.string.bottom_screen;
                                                                                                                                                break;
                                                                                                                                            case 3:
                                                                                                                                                i10 = R.string.input_dpad;
                                                                                                                                                break;
                                                                                                                                            case 4:
                                                                                                                                                i10 = R.string.input_abxy_buttons;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                                i10 = R.string.input_l;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                                i10 = R.string.input_r;
                                                                                                                                                break;
                                                                                                                                            case 7:
                                                                                                                                                i10 = R.string.input_start;
                                                                                                                                                break;
                                                                                                                                            case 8:
                                                                                                                                                i10 = R.string.input_select;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8508d /* 9 */:
                                                                                                                                                i10 = R.string.input_lid;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8510f /* 10 */:
                                                                                                                                                i10 = R.string.input_pause;
                                                                                                                                                break;
                                                                                                                                            case 11:
                                                                                                                                                i10 = R.string.input_fast_forward;
                                                                                                                                                break;
                                                                                                                                            case 12:
                                                                                                                                                i10 = R.string.input_microphone;
                                                                                                                                                break;
                                                                                                                                            case 13:
                                                                                                                                                i10 = R.string.input_toggle_soft_input;
                                                                                                                                                break;
                                                                                                                                            case 14:
                                                                                                                                                i10 = R.string.reset;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8512h /* 15 */:
                                                                                                                                                i10 = R.string.input_swap_screens;
                                                                                                                                                break;
                                                                                                                                            case 16:
                                                                                                                                                i10 = R.string.input_quick_save;
                                                                                                                                                break;
                                                                                                                                            case 17:
                                                                                                                                                i10 = R.string.input_quick_load;
                                                                                                                                                break;
                                                                                                                                            case 18:
                                                                                                                                                i10 = R.string.rewind;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                m9.o.o();
                                                                                                                                                return;
                                                                                                                                        }
                                                                                                                                        arrayList2.add(resources.getString(i10));
                                                                                                                                    }
                                                                                                                                    ah.l lVar = new ah.l(4, arrayList, bVar2);
                                                                                                                                    l.d dVar2 = (l.d) aVar2.L;
                                                                                                                                    dVar2.f8371q = (CharSequence[]) arrayList2.toArray(new String[0]);
                                                                                                                                    dVar2.f8373s = lVar;
                                                                                                                                } else {
                                                                                                                                    aVar2.t(R.string.no_more_components);
                                                                                                                                }
                                                                                                                                l.g i14 = aVar2.i();
                                                                                                                                Window window = i14.getWindow();
                                                                                                                                if (window != null) {
                                                                                                                                    window.setType(1003);
                                                                                                                                    window.getAttributes().token = bVar2.getWindowToken();
                                                                                                                                }
                                                                                                                                i14.show();
                                                                                                                                return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                layoutEditorView.setLayoutComponentViewBuilderFactory(new m1(7, (byte) 0));
                                                                                                                layoutEditorView.setOnClickListener(new View.OnClickListener(this) { // from class: rh.l
                                                                                                                    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

                                                                                                                    {
                                                                                                                        this.B = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        int i10;
                                                                                                                        switch (r2) {
                                                                                                                            case 0:
                                                                                                                                this.B.r();
                                                                                                                                return;
                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                LayoutEditorView layoutEditorView2 = this.B.L.f9067u;
                                                                                                                                og.i iVar = layoutEditorView2.f9533f0;
                                                                                                                                if (iVar != null) {
                                                                                                                                    layoutEditorView2.removeView(iVar.f11005a);
                                                                                                                                    layoutEditorView2.getViews().remove(iVar.f11006b);
                                                                                                                                    layoutEditorView2.j();
                                                                                                                                    layoutEditorView2.f9535h0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 2:
                                                                                                                                LayoutEditorView layoutEditorView3 = this.B.L.f9067u;
                                                                                                                                og.i iVar2 = layoutEditorView3.f9533f0;
                                                                                                                                if (iVar2 != null) {
                                                                                                                                    View view2 = iVar2.f11005a;
                                                                                                                                    int width = (layoutEditorView3.getWidth() - view2.getWidth()) / 2;
                                                                                                                                    int i11 = iVar2.a().f10909b;
                                                                                                                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                                                                                                                    if (layoutParams != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                                                                                                                        layoutParams2.leftMargin = width;
                                                                                                                                        layoutParams2.topMargin = i11;
                                                                                                                                        view2.setLayoutParams(layoutParams2);
                                                                                                                                        layoutEditorView3.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 3:
                                                                                                                                LayoutEditorView layoutEditorView4 = this.B.L.f9067u;
                                                                                                                                og.i iVar3 = layoutEditorView4.f9533f0;
                                                                                                                                if (iVar3 != null) {
                                                                                                                                    View view3 = iVar3.f11005a;
                                                                                                                                    int height = (layoutEditorView4.getHeight() - view3.getHeight()) / 2;
                                                                                                                                    int i12 = iVar3.a().f10908a;
                                                                                                                                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                                                                                                                                    if (layoutParams3 != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                                                                                                                        layoutParams4.leftMargin = i12;
                                                                                                                                        layoutParams4.topMargin = height;
                                                                                                                                        view3.setLayoutParams(layoutParams4);
                                                                                                                                        layoutEditorView4.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 4:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar = this.B;
                                                                                                                                boolean z12 = bVar.f9542c0;
                                                                                                                                if (z12) {
                                                                                                                                    me.magnum.melonds.ui.layouteditor.b.p(bVar);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                le.a aVar = bVar.L;
                                                                                                                                if (!z12) {
                                                                                                                                    LinearLayout linearLayout7 = aVar.f9055h;
                                                                                                                                    linearLayout7.clearAnimation();
                                                                                                                                    linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new n(bVar, 1)).start();
                                                                                                                                    bVar.f9542c0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.a(this.B);
                                                                                                                                return;
                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.d(this.B);
                                                                                                                                return;
                                                                                                                            case 7:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.g(this.B);
                                                                                                                                return;
                                                                                                                            case 8:
                                                                                                                                this.B.q(true);
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar2 = this.B;
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.p(bVar2);
                                                                                                                                List<ve.c> instantiatedComponents = bVar2.L.f9067u.getInstantiatedComponents();
                                                                                                                                fc.a entries = ve.c.getEntries();
                                                                                                                                ArrayList arrayList = new ArrayList();
                                                                                                                                for (Object obj : entries) {
                                                                                                                                    if (!instantiatedComponents.contains((ve.c) obj)) {
                                                                                                                                        arrayList.add(obj);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                bk.a aVar2 = new bk.a(new ContextThemeWrapper(bVar2.getContext(), (int) R.style.AppTheme));
                                                                                                                                aVar2.w(R.string.choose_component);
                                                                                                                                aVar2.u(R.string.cancel, new ah.m(8));
                                                                                                                                if (!arrayList.isEmpty()) {
                                                                                                                                    ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
                                                                                                                                    int size = arrayList.size();
                                                                                                                                    int i13 = 0;
                                                                                                                                    while (i13 < size) {
                                                                                                                                        Object obj2 = arrayList.get(i13);
                                                                                                                                        i13++;
                                                                                                                                        ve.c cVar = (ve.c) obj2;
                                                                                                                                        Resources resources = bVar2.getResources();
                                                                                                                                        cVar.getClass();
                                                                                                                                        switch (ji.b.f7907a[cVar.ordinal()]) {
                                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                                i10 = R.string.top_screen;
                                                                                                                                                break;
                                                                                                                                            case 2:
                                                                                                                                                i10 = R.string.bottom_screen;
                                                                                                                                                break;
                                                                                                                                            case 3:
                                                                                                                                                i10 = R.string.input_dpad;
                                                                                                                                                break;
                                                                                                                                            case 4:
                                                                                                                                                i10 = R.string.input_abxy_buttons;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                                i10 = R.string.input_l;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                                i10 = R.string.input_r;
                                                                                                                                                break;
                                                                                                                                            case 7:
                                                                                                                                                i10 = R.string.input_start;
                                                                                                                                                break;
                                                                                                                                            case 8:
                                                                                                                                                i10 = R.string.input_select;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8508d /* 9 */:
                                                                                                                                                i10 = R.string.input_lid;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8510f /* 10 */:
                                                                                                                                                i10 = R.string.input_pause;
                                                                                                                                                break;
                                                                                                                                            case 11:
                                                                                                                                                i10 = R.string.input_fast_forward;
                                                                                                                                                break;
                                                                                                                                            case 12:
                                                                                                                                                i10 = R.string.input_microphone;
                                                                                                                                                break;
                                                                                                                                            case 13:
                                                                                                                                                i10 = R.string.input_toggle_soft_input;
                                                                                                                                                break;
                                                                                                                                            case 14:
                                                                                                                                                i10 = R.string.reset;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8512h /* 15 */:
                                                                                                                                                i10 = R.string.input_swap_screens;
                                                                                                                                                break;
                                                                                                                                            case 16:
                                                                                                                                                i10 = R.string.input_quick_save;
                                                                                                                                                break;
                                                                                                                                            case 17:
                                                                                                                                                i10 = R.string.input_quick_load;
                                                                                                                                                break;
                                                                                                                                            case 18:
                                                                                                                                                i10 = R.string.rewind;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                m9.o.o();
                                                                                                                                                return;
                                                                                                                                        }
                                                                                                                                        arrayList2.add(resources.getString(i10));
                                                                                                                                    }
                                                                                                                                    ah.l lVar = new ah.l(4, arrayList, bVar2);
                                                                                                                                    l.d dVar2 = (l.d) aVar2.L;
                                                                                                                                    dVar2.f8371q = (CharSequence[]) arrayList2.toArray(new String[0]);
                                                                                                                                    dVar2.f8373s = lVar;
                                                                                                                                } else {
                                                                                                                                    aVar2.t(R.string.no_more_components);
                                                                                                                                }
                                                                                                                                l.g i14 = aVar2.i();
                                                                                                                                Window window = i14.getWindow();
                                                                                                                                if (window != null) {
                                                                                                                                    window.setType(1003);
                                                                                                                                    window.getAttributes().token = bVar2.getWindowToken();
                                                                                                                                }
                                                                                                                                i14.show();
                                                                                                                                return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                layoutEditorView.setOnViewSelectedListener(new mc.t() { // from class: rh.m
                                                                                                                    @Override // mc.t
                                                                                                                    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                                                                                                        u uVar2;
                                                                                                                        int i10;
                                                                                                                        int i11;
                                                                                                                        int i12;
                                                                                                                        int i13;
                                                                                                                        int i14;
                                                                                                                        int i15;
                                                                                                                        int i16;
                                                                                                                        int i17;
                                                                                                                        int i18;
                                                                                                                        int i19;
                                                                                                                        int i20;
                                                                                                                        og.i iVar = (og.i) obj;
                                                                                                                        float floatValue = ((Float) obj2).floatValue();
                                                                                                                        float floatValue2 = ((Float) obj3).floatValue();
                                                                                                                        int intValue = ((Integer) obj4).intValue();
                                                                                                                        int intValue2 = ((Integer) obj5).intValue();
                                                                                                                        int intValue3 = ((Integer) obj6).intValue();
                                                                                                                        iVar.getClass();
                                                                                                                        me.magnum.melonds.ui.layouteditor.b bVar = me.magnum.melonds.ui.layouteditor.b.this;
                                                                                                                        me.magnum.melonds.ui.layouteditor.b.p(bVar);
                                                                                                                        bVar.q(false);
                                                                                                                        ve.c cVar = iVar.f11006b;
                                                                                                                        bVar.f9547h0 = cVar.isScreen();
                                                                                                                        bVar.f9548i0 = cVar;
                                                                                                                        int i21 = me.magnum.melonds.ui.layouteditor.a.f9538c[cVar.ordinal()];
                                                                                                                        if (i21 != 1) {
                                                                                                                            if (i21 != 2) {
                                                                                                                                uVar2 = u.UNRESTRICTED;
                                                                                                                            } else {
                                                                                                                                uVar2 = bVar.f9551l0;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            uVar2 = bVar.f9550k0;
                                                                                                                        }
                                                                                                                        bVar.f9549j0 = uVar2;
                                                                                                                        boolean z12 = bVar.f9547h0;
                                                                                                                        float f8 = iVar.f11007c;
                                                                                                                        boolean z13 = iVar.f11008d;
                                                                                                                        le.a aVar = bVar.L;
                                                                                                                        ScrollView scrollView2 = aVar.f9057j;
                                                                                                                        CheckBox checkBox2 = aVar.f9051d;
                                                                                                                        SeekBar seekBar5 = aVar.m;
                                                                                                                        SeekBar seekBar6 = aVar.f9061o;
                                                                                                                        SeekBar seekBar7 = aVar.f9060n;
                                                                                                                        SeekBar seekBar8 = aVar.f9062p;
                                                                                                                        scrollView2.animate().cancel();
                                                                                                                        if (z12) {
                                                                                                                            int i22 = intValue - intValue3;
                                                                                                                            seekBar8.setMax(i22);
                                                                                                                            float f10 = i22 * floatValue;
                                                                                                                            seekBar8.setProgress((int) f10);
                                                                                                                            float f11 = intValue3;
                                                                                                                            aVar.f9066t.setText(String.valueOf((int) (f10 + f11)));
                                                                                                                            int i23 = intValue2 - intValue3;
                                                                                                                            seekBar7.setMax(i23);
                                                                                                                            float f12 = i23 * floatValue2;
                                                                                                                            seekBar7.setProgress((int) f12);
                                                                                                                            aVar.f9064r.setText(String.valueOf((int) (f12 + f11)));
                                                                                                                        } else {
                                                                                                                            int i24 = intValue - intValue3;
                                                                                                                            seekBar6.setMax(Math.min(i24, intValue2 - intValue3));
                                                                                                                            float f13 = i24 * floatValue;
                                                                                                                            seekBar6.setProgress(pc.a.M(f13));
                                                                                                                            aVar.f9065s.setText(String.valueOf((int) (f13 + intValue3)));
                                                                                                                        }
                                                                                                                        seekBar5.setProgress((int) (f8 * 100));
                                                                                                                        checkBox2.setChecked(z13);
                                                                                                                        bVar.f9552m0 = true;
                                                                                                                        aVar.f9063q.setSelection(bVar.f9549j0.ordinal(), false);
                                                                                                                        bVar.f9552m0 = false;
                                                                                                                        LinearLayout linearLayout7 = aVar.f9058k;
                                                                                                                        int i25 = 8;
                                                                                                                        if (!z12) {
                                                                                                                            i10 = 0;
                                                                                                                        } else {
                                                                                                                            i10 = 8;
                                                                                                                        }
                                                                                                                        linearLayout7.setVisibility(i10);
                                                                                                                        if (!z12) {
                                                                                                                            i11 = 0;
                                                                                                                        } else {
                                                                                                                            i11 = 8;
                                                                                                                        }
                                                                                                                        seekBar6.setVisibility(i11);
                                                                                                                        LinearLayout linearLayout8 = aVar.f9059l;
                                                                                                                        if (z12) {
                                                                                                                            i12 = 0;
                                                                                                                        } else {
                                                                                                                            i12 = 8;
                                                                                                                        }
                                                                                                                        linearLayout8.setVisibility(i12);
                                                                                                                        if (z12) {
                                                                                                                            i13 = 0;
                                                                                                                        } else {
                                                                                                                            i13 = 8;
                                                                                                                        }
                                                                                                                        seekBar8.setVisibility(i13);
                                                                                                                        LinearLayout linearLayout9 = aVar.f9056i;
                                                                                                                        if (z12) {
                                                                                                                            i14 = 0;
                                                                                                                        } else {
                                                                                                                            i14 = 8;
                                                                                                                        }
                                                                                                                        linearLayout9.setVisibility(i14);
                                                                                                                        if (z12) {
                                                                                                                            i15 = 0;
                                                                                                                        } else {
                                                                                                                            i15 = 8;
                                                                                                                        }
                                                                                                                        seekBar7.setVisibility(i15);
                                                                                                                        LinearLayout linearLayout10 = aVar.f9053f;
                                                                                                                        if (z12) {
                                                                                                                            i16 = 0;
                                                                                                                        } else {
                                                                                                                            i16 = 8;
                                                                                                                        }
                                                                                                                        linearLayout10.setVisibility(i16);
                                                                                                                        if (z12) {
                                                                                                                            i17 = 0;
                                                                                                                        } else {
                                                                                                                            i17 = 8;
                                                                                                                        }
                                                                                                                        seekBar5.setVisibility(i17);
                                                                                                                        LinearLayout linearLayout11 = aVar.f9054g;
                                                                                                                        if (z12) {
                                                                                                                            i18 = 0;
                                                                                                                        } else {
                                                                                                                            i18 = 8;
                                                                                                                        }
                                                                                                                        linearLayout11.setVisibility(i18);
                                                                                                                        if (z12) {
                                                                                                                            i19 = 0;
                                                                                                                        } else {
                                                                                                                            i19 = 8;
                                                                                                                        }
                                                                                                                        checkBox2.setVisibility(i19);
                                                                                                                        Button button6 = aVar.f9049b;
                                                                                                                        if (z12) {
                                                                                                                            i20 = 0;
                                                                                                                        } else {
                                                                                                                            i20 = 8;
                                                                                                                        }
                                                                                                                        button6.setVisibility(i20);
                                                                                                                        Button button7 = aVar.f9050c;
                                                                                                                        if (z12) {
                                                                                                                            i25 = 0;
                                                                                                                        }
                                                                                                                        button7.setVisibility(i25);
                                                                                                                        bVar.f9545f0 = floatValue;
                                                                                                                        bVar.f9546g0 = floatValue2;
                                                                                                                        bVar.f9544e0 = intValue3;
                                                                                                                        if (!bVar.f9543d0) {
                                                                                                                            scrollView2.setVisibility(0);
                                                                                                                            scrollView2.post(new n(bVar, 4));
                                                                                                                            bVar.f9543d0 = true;
                                                                                                                        }
                                                                                                                        scrollView2.requestFocus();
                                                                                                                        return yb.y.f14813a;
                                                                                                                    }
                                                                                                                });
                                                                                                                layoutEditorView.setOnViewDeselectedListener(new o(this, 0));
                                                                                                                linearLayout5.setOnClickListener(new View.OnClickListener(this) { // from class: rh.l
                                                                                                                    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

                                                                                                                    {
                                                                                                                        this.B = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        int i10;
                                                                                                                        switch (r2) {
                                                                                                                            case 0:
                                                                                                                                this.B.r();
                                                                                                                                return;
                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                LayoutEditorView layoutEditorView2 = this.B.L.f9067u;
                                                                                                                                og.i iVar = layoutEditorView2.f9533f0;
                                                                                                                                if (iVar != null) {
                                                                                                                                    layoutEditorView2.removeView(iVar.f11005a);
                                                                                                                                    layoutEditorView2.getViews().remove(iVar.f11006b);
                                                                                                                                    layoutEditorView2.j();
                                                                                                                                    layoutEditorView2.f9535h0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 2:
                                                                                                                                LayoutEditorView layoutEditorView3 = this.B.L.f9067u;
                                                                                                                                og.i iVar2 = layoutEditorView3.f9533f0;
                                                                                                                                if (iVar2 != null) {
                                                                                                                                    View view2 = iVar2.f11005a;
                                                                                                                                    int width = (layoutEditorView3.getWidth() - view2.getWidth()) / 2;
                                                                                                                                    int i11 = iVar2.a().f10909b;
                                                                                                                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                                                                                                                    if (layoutParams != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                                                                                                                        layoutParams2.leftMargin = width;
                                                                                                                                        layoutParams2.topMargin = i11;
                                                                                                                                        view2.setLayoutParams(layoutParams2);
                                                                                                                                        layoutEditorView3.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 3:
                                                                                                                                LayoutEditorView layoutEditorView4 = this.B.L.f9067u;
                                                                                                                                og.i iVar3 = layoutEditorView4.f9533f0;
                                                                                                                                if (iVar3 != null) {
                                                                                                                                    View view3 = iVar3.f11005a;
                                                                                                                                    int height = (layoutEditorView4.getHeight() - view3.getHeight()) / 2;
                                                                                                                                    int i12 = iVar3.a().f10908a;
                                                                                                                                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                                                                                                                                    if (layoutParams3 != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                                                                                                                        layoutParams4.leftMargin = i12;
                                                                                                                                        layoutParams4.topMargin = height;
                                                                                                                                        view3.setLayoutParams(layoutParams4);
                                                                                                                                        layoutEditorView4.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 4:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar = this.B;
                                                                                                                                boolean z12 = bVar.f9542c0;
                                                                                                                                if (z12) {
                                                                                                                                    me.magnum.melonds.ui.layouteditor.b.p(bVar);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                le.a aVar = bVar.L;
                                                                                                                                if (!z12) {
                                                                                                                                    LinearLayout linearLayout7 = aVar.f9055h;
                                                                                                                                    linearLayout7.clearAnimation();
                                                                                                                                    linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new n(bVar, 1)).start();
                                                                                                                                    bVar.f9542c0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.a(this.B);
                                                                                                                                return;
                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.d(this.B);
                                                                                                                                return;
                                                                                                                            case 7:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.g(this.B);
                                                                                                                                return;
                                                                                                                            case 8:
                                                                                                                                this.B.q(true);
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar2 = this.B;
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.p(bVar2);
                                                                                                                                List<ve.c> instantiatedComponents = bVar2.L.f9067u.getInstantiatedComponents();
                                                                                                                                fc.a entries = ve.c.getEntries();
                                                                                                                                ArrayList arrayList = new ArrayList();
                                                                                                                                for (Object obj : entries) {
                                                                                                                                    if (!instantiatedComponents.contains((ve.c) obj)) {
                                                                                                                                        arrayList.add(obj);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                bk.a aVar2 = new bk.a(new ContextThemeWrapper(bVar2.getContext(), (int) R.style.AppTheme));
                                                                                                                                aVar2.w(R.string.choose_component);
                                                                                                                                aVar2.u(R.string.cancel, new ah.m(8));
                                                                                                                                if (!arrayList.isEmpty()) {
                                                                                                                                    ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
                                                                                                                                    int size = arrayList.size();
                                                                                                                                    int i13 = 0;
                                                                                                                                    while (i13 < size) {
                                                                                                                                        Object obj2 = arrayList.get(i13);
                                                                                                                                        i13++;
                                                                                                                                        ve.c cVar = (ve.c) obj2;
                                                                                                                                        Resources resources = bVar2.getResources();
                                                                                                                                        cVar.getClass();
                                                                                                                                        switch (ji.b.f7907a[cVar.ordinal()]) {
                                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                                i10 = R.string.top_screen;
                                                                                                                                                break;
                                                                                                                                            case 2:
                                                                                                                                                i10 = R.string.bottom_screen;
                                                                                                                                                break;
                                                                                                                                            case 3:
                                                                                                                                                i10 = R.string.input_dpad;
                                                                                                                                                break;
                                                                                                                                            case 4:
                                                                                                                                                i10 = R.string.input_abxy_buttons;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                                i10 = R.string.input_l;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                                i10 = R.string.input_r;
                                                                                                                                                break;
                                                                                                                                            case 7:
                                                                                                                                                i10 = R.string.input_start;
                                                                                                                                                break;
                                                                                                                                            case 8:
                                                                                                                                                i10 = R.string.input_select;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8508d /* 9 */:
                                                                                                                                                i10 = R.string.input_lid;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8510f /* 10 */:
                                                                                                                                                i10 = R.string.input_pause;
                                                                                                                                                break;
                                                                                                                                            case 11:
                                                                                                                                                i10 = R.string.input_fast_forward;
                                                                                                                                                break;
                                                                                                                                            case 12:
                                                                                                                                                i10 = R.string.input_microphone;
                                                                                                                                                break;
                                                                                                                                            case 13:
                                                                                                                                                i10 = R.string.input_toggle_soft_input;
                                                                                                                                                break;
                                                                                                                                            case 14:
                                                                                                                                                i10 = R.string.reset;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8512h /* 15 */:
                                                                                                                                                i10 = R.string.input_swap_screens;
                                                                                                                                                break;
                                                                                                                                            case 16:
                                                                                                                                                i10 = R.string.input_quick_save;
                                                                                                                                                break;
                                                                                                                                            case 17:
                                                                                                                                                i10 = R.string.input_quick_load;
                                                                                                                                                break;
                                                                                                                                            case 18:
                                                                                                                                                i10 = R.string.rewind;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                m9.o.o();
                                                                                                                                                return;
                                                                                                                                        }
                                                                                                                                        arrayList2.add(resources.getString(i10));
                                                                                                                                    }
                                                                                                                                    ah.l lVar = new ah.l(4, arrayList, bVar2);
                                                                                                                                    l.d dVar2 = (l.d) aVar2.L;
                                                                                                                                    dVar2.f8371q = (CharSequence[]) arrayList2.toArray(new String[0]);
                                                                                                                                    dVar2.f8373s = lVar;
                                                                                                                                } else {
                                                                                                                                    aVar2.t(R.string.no_more_components);
                                                                                                                                }
                                                                                                                                l.g i14 = aVar2.i();
                                                                                                                                Window window = i14.getWindow();
                                                                                                                                if (window != null) {
                                                                                                                                    window.setType(1003);
                                                                                                                                    window.getAttributes().token = bVar2.getWindowToken();
                                                                                                                                }
                                                                                                                                i14.show();
                                                                                                                                return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                seekBar3.setOnSeekBarChangeListener(new q(this, 0));
                                                                                                                linearLayout6.setOnClickListener(new View.OnClickListener(this) { // from class: rh.l
                                                                                                                    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

                                                                                                                    {
                                                                                                                        this.B = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        int i10;
                                                                                                                        switch (r2) {
                                                                                                                            case 0:
                                                                                                                                this.B.r();
                                                                                                                                return;
                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                LayoutEditorView layoutEditorView2 = this.B.L.f9067u;
                                                                                                                                og.i iVar = layoutEditorView2.f9533f0;
                                                                                                                                if (iVar != null) {
                                                                                                                                    layoutEditorView2.removeView(iVar.f11005a);
                                                                                                                                    layoutEditorView2.getViews().remove(iVar.f11006b);
                                                                                                                                    layoutEditorView2.j();
                                                                                                                                    layoutEditorView2.f9535h0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 2:
                                                                                                                                LayoutEditorView layoutEditorView3 = this.B.L.f9067u;
                                                                                                                                og.i iVar2 = layoutEditorView3.f9533f0;
                                                                                                                                if (iVar2 != null) {
                                                                                                                                    View view2 = iVar2.f11005a;
                                                                                                                                    int width = (layoutEditorView3.getWidth() - view2.getWidth()) / 2;
                                                                                                                                    int i11 = iVar2.a().f10909b;
                                                                                                                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                                                                                                                    if (layoutParams != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                                                                                                                        layoutParams2.leftMargin = width;
                                                                                                                                        layoutParams2.topMargin = i11;
                                                                                                                                        view2.setLayoutParams(layoutParams2);
                                                                                                                                        layoutEditorView3.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 3:
                                                                                                                                LayoutEditorView layoutEditorView4 = this.B.L.f9067u;
                                                                                                                                og.i iVar3 = layoutEditorView4.f9533f0;
                                                                                                                                if (iVar3 != null) {
                                                                                                                                    View view3 = iVar3.f11005a;
                                                                                                                                    int height = (layoutEditorView4.getHeight() - view3.getHeight()) / 2;
                                                                                                                                    int i12 = iVar3.a().f10908a;
                                                                                                                                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                                                                                                                                    if (layoutParams3 != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                                                                                                                        layoutParams4.leftMargin = i12;
                                                                                                                                        layoutParams4.topMargin = height;
                                                                                                                                        view3.setLayoutParams(layoutParams4);
                                                                                                                                        layoutEditorView4.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 4:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar = this.B;
                                                                                                                                boolean z12 = bVar.f9542c0;
                                                                                                                                if (z12) {
                                                                                                                                    me.magnum.melonds.ui.layouteditor.b.p(bVar);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                le.a aVar = bVar.L;
                                                                                                                                if (!z12) {
                                                                                                                                    LinearLayout linearLayout7 = aVar.f9055h;
                                                                                                                                    linearLayout7.clearAnimation();
                                                                                                                                    linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new n(bVar, 1)).start();
                                                                                                                                    bVar.f9542c0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.a(this.B);
                                                                                                                                return;
                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.d(this.B);
                                                                                                                                return;
                                                                                                                            case 7:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.g(this.B);
                                                                                                                                return;
                                                                                                                            case 8:
                                                                                                                                this.B.q(true);
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar2 = this.B;
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.p(bVar2);
                                                                                                                                List<ve.c> instantiatedComponents = bVar2.L.f9067u.getInstantiatedComponents();
                                                                                                                                fc.a entries = ve.c.getEntries();
                                                                                                                                ArrayList arrayList = new ArrayList();
                                                                                                                                for (Object obj : entries) {
                                                                                                                                    if (!instantiatedComponents.contains((ve.c) obj)) {
                                                                                                                                        arrayList.add(obj);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                bk.a aVar2 = new bk.a(new ContextThemeWrapper(bVar2.getContext(), (int) R.style.AppTheme));
                                                                                                                                aVar2.w(R.string.choose_component);
                                                                                                                                aVar2.u(R.string.cancel, new ah.m(8));
                                                                                                                                if (!arrayList.isEmpty()) {
                                                                                                                                    ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
                                                                                                                                    int size = arrayList.size();
                                                                                                                                    int i13 = 0;
                                                                                                                                    while (i13 < size) {
                                                                                                                                        Object obj2 = arrayList.get(i13);
                                                                                                                                        i13++;
                                                                                                                                        ve.c cVar = (ve.c) obj2;
                                                                                                                                        Resources resources = bVar2.getResources();
                                                                                                                                        cVar.getClass();
                                                                                                                                        switch (ji.b.f7907a[cVar.ordinal()]) {
                                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                                i10 = R.string.top_screen;
                                                                                                                                                break;
                                                                                                                                            case 2:
                                                                                                                                                i10 = R.string.bottom_screen;
                                                                                                                                                break;
                                                                                                                                            case 3:
                                                                                                                                                i10 = R.string.input_dpad;
                                                                                                                                                break;
                                                                                                                                            case 4:
                                                                                                                                                i10 = R.string.input_abxy_buttons;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                                i10 = R.string.input_l;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                                i10 = R.string.input_r;
                                                                                                                                                break;
                                                                                                                                            case 7:
                                                                                                                                                i10 = R.string.input_start;
                                                                                                                                                break;
                                                                                                                                            case 8:
                                                                                                                                                i10 = R.string.input_select;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8508d /* 9 */:
                                                                                                                                                i10 = R.string.input_lid;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8510f /* 10 */:
                                                                                                                                                i10 = R.string.input_pause;
                                                                                                                                                break;
                                                                                                                                            case 11:
                                                                                                                                                i10 = R.string.input_fast_forward;
                                                                                                                                                break;
                                                                                                                                            case 12:
                                                                                                                                                i10 = R.string.input_microphone;
                                                                                                                                                break;
                                                                                                                                            case 13:
                                                                                                                                                i10 = R.string.input_toggle_soft_input;
                                                                                                                                                break;
                                                                                                                                            case 14:
                                                                                                                                                i10 = R.string.reset;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8512h /* 15 */:
                                                                                                                                                i10 = R.string.input_swap_screens;
                                                                                                                                                break;
                                                                                                                                            case 16:
                                                                                                                                                i10 = R.string.input_quick_save;
                                                                                                                                                break;
                                                                                                                                            case 17:
                                                                                                                                                i10 = R.string.input_quick_load;
                                                                                                                                                break;
                                                                                                                                            case 18:
                                                                                                                                                i10 = R.string.rewind;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                m9.o.o();
                                                                                                                                                return;
                                                                                                                                        }
                                                                                                                                        arrayList2.add(resources.getString(i10));
                                                                                                                                    }
                                                                                                                                    ah.l lVar = new ah.l(4, arrayList, bVar2);
                                                                                                                                    l.d dVar2 = (l.d) aVar2.L;
                                                                                                                                    dVar2.f8371q = (CharSequence[]) arrayList2.toArray(new String[0]);
                                                                                                                                    dVar2.f8373s = lVar;
                                                                                                                                } else {
                                                                                                                                    aVar2.t(R.string.no_more_components);
                                                                                                                                }
                                                                                                                                l.g i14 = aVar2.i();
                                                                                                                                Window window = i14.getWindow();
                                                                                                                                if (window != null) {
                                                                                                                                    window.setType(1003);
                                                                                                                                    window.getAttributes().token = bVar2.getWindowToken();
                                                                                                                                }
                                                                                                                                i14.show();
                                                                                                                                return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                seekBar4.setOnSeekBarChangeListener(new q(this, 1));
                                                                                                                linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: rh.l
                                                                                                                    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

                                                                                                                    {
                                                                                                                        this.B = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        int i10;
                                                                                                                        switch (r2) {
                                                                                                                            case 0:
                                                                                                                                this.B.r();
                                                                                                                                return;
                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                LayoutEditorView layoutEditorView2 = this.B.L.f9067u;
                                                                                                                                og.i iVar = layoutEditorView2.f9533f0;
                                                                                                                                if (iVar != null) {
                                                                                                                                    layoutEditorView2.removeView(iVar.f11005a);
                                                                                                                                    layoutEditorView2.getViews().remove(iVar.f11006b);
                                                                                                                                    layoutEditorView2.j();
                                                                                                                                    layoutEditorView2.f9535h0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 2:
                                                                                                                                LayoutEditorView layoutEditorView3 = this.B.L.f9067u;
                                                                                                                                og.i iVar2 = layoutEditorView3.f9533f0;
                                                                                                                                if (iVar2 != null) {
                                                                                                                                    View view2 = iVar2.f11005a;
                                                                                                                                    int width = (layoutEditorView3.getWidth() - view2.getWidth()) / 2;
                                                                                                                                    int i11 = iVar2.a().f10909b;
                                                                                                                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                                                                                                                    if (layoutParams != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                                                                                                                        layoutParams2.leftMargin = width;
                                                                                                                                        layoutParams2.topMargin = i11;
                                                                                                                                        view2.setLayoutParams(layoutParams2);
                                                                                                                                        layoutEditorView3.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 3:
                                                                                                                                LayoutEditorView layoutEditorView4 = this.B.L.f9067u;
                                                                                                                                og.i iVar3 = layoutEditorView4.f9533f0;
                                                                                                                                if (iVar3 != null) {
                                                                                                                                    View view3 = iVar3.f11005a;
                                                                                                                                    int height = (layoutEditorView4.getHeight() - view3.getHeight()) / 2;
                                                                                                                                    int i12 = iVar3.a().f10908a;
                                                                                                                                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                                                                                                                                    if (layoutParams3 != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                                                                                                                        layoutParams4.leftMargin = i12;
                                                                                                                                        layoutParams4.topMargin = height;
                                                                                                                                        view3.setLayoutParams(layoutParams4);
                                                                                                                                        layoutEditorView4.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 4:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar = this.B;
                                                                                                                                boolean z12 = bVar.f9542c0;
                                                                                                                                if (z12) {
                                                                                                                                    me.magnum.melonds.ui.layouteditor.b.p(bVar);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                le.a aVar = bVar.L;
                                                                                                                                if (!z12) {
                                                                                                                                    LinearLayout linearLayout7 = aVar.f9055h;
                                                                                                                                    linearLayout7.clearAnimation();
                                                                                                                                    linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new n(bVar, 1)).start();
                                                                                                                                    bVar.f9542c0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.a(this.B);
                                                                                                                                return;
                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.d(this.B);
                                                                                                                                return;
                                                                                                                            case 7:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.g(this.B);
                                                                                                                                return;
                                                                                                                            case 8:
                                                                                                                                this.B.q(true);
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar2 = this.B;
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.p(bVar2);
                                                                                                                                List<ve.c> instantiatedComponents = bVar2.L.f9067u.getInstantiatedComponents();
                                                                                                                                fc.a entries = ve.c.getEntries();
                                                                                                                                ArrayList arrayList = new ArrayList();
                                                                                                                                for (Object obj : entries) {
                                                                                                                                    if (!instantiatedComponents.contains((ve.c) obj)) {
                                                                                                                                        arrayList.add(obj);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                bk.a aVar2 = new bk.a(new ContextThemeWrapper(bVar2.getContext(), (int) R.style.AppTheme));
                                                                                                                                aVar2.w(R.string.choose_component);
                                                                                                                                aVar2.u(R.string.cancel, new ah.m(8));
                                                                                                                                if (!arrayList.isEmpty()) {
                                                                                                                                    ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
                                                                                                                                    int size = arrayList.size();
                                                                                                                                    int i13 = 0;
                                                                                                                                    while (i13 < size) {
                                                                                                                                        Object obj2 = arrayList.get(i13);
                                                                                                                                        i13++;
                                                                                                                                        ve.c cVar = (ve.c) obj2;
                                                                                                                                        Resources resources = bVar2.getResources();
                                                                                                                                        cVar.getClass();
                                                                                                                                        switch (ji.b.f7907a[cVar.ordinal()]) {
                                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                                i10 = R.string.top_screen;
                                                                                                                                                break;
                                                                                                                                            case 2:
                                                                                                                                                i10 = R.string.bottom_screen;
                                                                                                                                                break;
                                                                                                                                            case 3:
                                                                                                                                                i10 = R.string.input_dpad;
                                                                                                                                                break;
                                                                                                                                            case 4:
                                                                                                                                                i10 = R.string.input_abxy_buttons;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                                i10 = R.string.input_l;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                                i10 = R.string.input_r;
                                                                                                                                                break;
                                                                                                                                            case 7:
                                                                                                                                                i10 = R.string.input_start;
                                                                                                                                                break;
                                                                                                                                            case 8:
                                                                                                                                                i10 = R.string.input_select;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8508d /* 9 */:
                                                                                                                                                i10 = R.string.input_lid;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8510f /* 10 */:
                                                                                                                                                i10 = R.string.input_pause;
                                                                                                                                                break;
                                                                                                                                            case 11:
                                                                                                                                                i10 = R.string.input_fast_forward;
                                                                                                                                                break;
                                                                                                                                            case 12:
                                                                                                                                                i10 = R.string.input_microphone;
                                                                                                                                                break;
                                                                                                                                            case 13:
                                                                                                                                                i10 = R.string.input_toggle_soft_input;
                                                                                                                                                break;
                                                                                                                                            case 14:
                                                                                                                                                i10 = R.string.reset;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8512h /* 15 */:
                                                                                                                                                i10 = R.string.input_swap_screens;
                                                                                                                                                break;
                                                                                                                                            case 16:
                                                                                                                                                i10 = R.string.input_quick_save;
                                                                                                                                                break;
                                                                                                                                            case 17:
                                                                                                                                                i10 = R.string.input_quick_load;
                                                                                                                                                break;
                                                                                                                                            case 18:
                                                                                                                                                i10 = R.string.rewind;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                m9.o.o();
                                                                                                                                                return;
                                                                                                                                        }
                                                                                                                                        arrayList2.add(resources.getString(i10));
                                                                                                                                    }
                                                                                                                                    ah.l lVar = new ah.l(4, arrayList, bVar2);
                                                                                                                                    l.d dVar2 = (l.d) aVar2.L;
                                                                                                                                    dVar2.f8371q = (CharSequence[]) arrayList2.toArray(new String[0]);
                                                                                                                                    dVar2.f8373s = lVar;
                                                                                                                                } else {
                                                                                                                                    aVar2.t(R.string.no_more_components);
                                                                                                                                }
                                                                                                                                l.g i14 = aVar2.i();
                                                                                                                                Window window = i14.getWindow();
                                                                                                                                if (window != null) {
                                                                                                                                    window.setType(1003);
                                                                                                                                    window.getAttributes().token = bVar2.getWindowToken();
                                                                                                                                }
                                                                                                                                i14.show();
                                                                                                                                return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                seekBar2.setOnSeekBarChangeListener(new q(this, 2));
                                                                                                                seekBar.setOnSeekBarChangeListener(new q(this, 3));
                                                                                                                ArrayAdapter arrayAdapter = new ArrayAdapter(contextWrapper, 17367048, p7.t.y(getResources().getString(R.string.aspect_ratio_4_3), getResources().getString(R.string.aspect_ratio_16_9), getResources().getString(R.string.aspect_ratio_unrestricted)));
                                                                                                                arrayAdapter.setDropDownViewResource(17367049);
                                                                                                                spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                                                                                                                spinner.setOnItemSelectedListener(new x1(2, this));
                                                                                                                checkBox.setOnCheckedChangeListener(new ca.a(this, 1));
                                                                                                                imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: rh.l
                                                                                                                    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

                                                                                                                    {
                                                                                                                        this.B = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        int i10;
                                                                                                                        switch (r2) {
                                                                                                                            case 0:
                                                                                                                                this.B.r();
                                                                                                                                return;
                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                LayoutEditorView layoutEditorView2 = this.B.L.f9067u;
                                                                                                                                og.i iVar = layoutEditorView2.f9533f0;
                                                                                                                                if (iVar != null) {
                                                                                                                                    layoutEditorView2.removeView(iVar.f11005a);
                                                                                                                                    layoutEditorView2.getViews().remove(iVar.f11006b);
                                                                                                                                    layoutEditorView2.j();
                                                                                                                                    layoutEditorView2.f9535h0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 2:
                                                                                                                                LayoutEditorView layoutEditorView3 = this.B.L.f9067u;
                                                                                                                                og.i iVar2 = layoutEditorView3.f9533f0;
                                                                                                                                if (iVar2 != null) {
                                                                                                                                    View view2 = iVar2.f11005a;
                                                                                                                                    int width = (layoutEditorView3.getWidth() - view2.getWidth()) / 2;
                                                                                                                                    int i11 = iVar2.a().f10909b;
                                                                                                                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                                                                                                                    if (layoutParams != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                                                                                                                        layoutParams2.leftMargin = width;
                                                                                                                                        layoutParams2.topMargin = i11;
                                                                                                                                        view2.setLayoutParams(layoutParams2);
                                                                                                                                        layoutEditorView3.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 3:
                                                                                                                                LayoutEditorView layoutEditorView4 = this.B.L.f9067u;
                                                                                                                                og.i iVar3 = layoutEditorView4.f9533f0;
                                                                                                                                if (iVar3 != null) {
                                                                                                                                    View view3 = iVar3.f11005a;
                                                                                                                                    int height = (layoutEditorView4.getHeight() - view3.getHeight()) / 2;
                                                                                                                                    int i12 = iVar3.a().f10908a;
                                                                                                                                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                                                                                                                                    if (layoutParams3 != null) {
                                                                                                                                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                                                                                                                        layoutParams4.leftMargin = i12;
                                                                                                                                        layoutParams4.topMargin = height;
                                                                                                                                        view3.setLayoutParams(layoutParams4);
                                                                                                                                        layoutEditorView4.f9535h0 = true;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    m9.o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case 4:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar = this.B;
                                                                                                                                boolean z12 = bVar.f9542c0;
                                                                                                                                if (z12) {
                                                                                                                                    me.magnum.melonds.ui.layouteditor.b.p(bVar);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                le.a aVar = bVar.L;
                                                                                                                                if (!z12) {
                                                                                                                                    LinearLayout linearLayout7 = aVar.f9055h;
                                                                                                                                    linearLayout7.clearAnimation();
                                                                                                                                    linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new n(bVar, 1)).start();
                                                                                                                                    bVar.f9542c0 = true;
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.a(this.B);
                                                                                                                                return;
                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.d(this.B);
                                                                                                                                return;
                                                                                                                            case 7:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.g(this.B);
                                                                                                                                return;
                                                                                                                            case 8:
                                                                                                                                this.B.q(true);
                                                                                                                                return;
                                                                                                                            default:
                                                                                                                                me.magnum.melonds.ui.layouteditor.b bVar2 = this.B;
                                                                                                                                me.magnum.melonds.ui.layouteditor.b.p(bVar2);
                                                                                                                                List<ve.c> instantiatedComponents = bVar2.L.f9067u.getInstantiatedComponents();
                                                                                                                                fc.a entries = ve.c.getEntries();
                                                                                                                                ArrayList arrayList = new ArrayList();
                                                                                                                                for (Object obj : entries) {
                                                                                                                                    if (!instantiatedComponents.contains((ve.c) obj)) {
                                                                                                                                        arrayList.add(obj);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                bk.a aVar2 = new bk.a(new ContextThemeWrapper(bVar2.getContext(), (int) R.style.AppTheme));
                                                                                                                                aVar2.w(R.string.choose_component);
                                                                                                                                aVar2.u(R.string.cancel, new ah.m(8));
                                                                                                                                if (!arrayList.isEmpty()) {
                                                                                                                                    ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
                                                                                                                                    int size = arrayList.size();
                                                                                                                                    int i13 = 0;
                                                                                                                                    while (i13 < size) {
                                                                                                                                        Object obj2 = arrayList.get(i13);
                                                                                                                                        i13++;
                                                                                                                                        ve.c cVar = (ve.c) obj2;
                                                                                                                                        Resources resources = bVar2.getResources();
                                                                                                                                        cVar.getClass();
                                                                                                                                        switch (ji.b.f7907a[cVar.ordinal()]) {
                                                                                                                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                                                                                                                i10 = R.string.top_screen;
                                                                                                                                                break;
                                                                                                                                            case 2:
                                                                                                                                                i10 = R.string.bottom_screen;
                                                                                                                                                break;
                                                                                                                                            case 3:
                                                                                                                                                i10 = R.string.input_dpad;
                                                                                                                                                break;
                                                                                                                                            case 4:
                                                                                                                                                i10 = R.string.input_abxy_buttons;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8511g /* 5 */:
                                                                                                                                                i10 = R.string.input_l;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8509e /* 6 */:
                                                                                                                                                i10 = R.string.input_r;
                                                                                                                                                break;
                                                                                                                                            case 7:
                                                                                                                                                i10 = R.string.input_start;
                                                                                                                                                break;
                                                                                                                                            case 8:
                                                                                                                                                i10 = R.string.input_select;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8508d /* 9 */:
                                                                                                                                                i10 = R.string.input_lid;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8510f /* 10 */:
                                                                                                                                                i10 = R.string.input_pause;
                                                                                                                                                break;
                                                                                                                                            case 11:
                                                                                                                                                i10 = R.string.input_fast_forward;
                                                                                                                                                break;
                                                                                                                                            case 12:
                                                                                                                                                i10 = R.string.input_microphone;
                                                                                                                                                break;
                                                                                                                                            case 13:
                                                                                                                                                i10 = R.string.input_toggle_soft_input;
                                                                                                                                                break;
                                                                                                                                            case 14:
                                                                                                                                                i10 = R.string.reset;
                                                                                                                                                break;
                                                                                                                                            case l1.c.f8512h /* 15 */:
                                                                                                                                                i10 = R.string.input_swap_screens;
                                                                                                                                                break;
                                                                                                                                            case 16:
                                                                                                                                                i10 = R.string.input_quick_save;
                                                                                                                                                break;
                                                                                                                                            case 17:
                                                                                                                                                i10 = R.string.input_quick_load;
                                                                                                                                                break;
                                                                                                                                            case 18:
                                                                                                                                                i10 = R.string.rewind;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                m9.o.o();
                                                                                                                                                return;
                                                                                                                                        }
                                                                                                                                        arrayList2.add(resources.getString(i10));
                                                                                                                                    }
                                                                                                                                    ah.l lVar = new ah.l(4, arrayList, bVar2);
                                                                                                                                    l.d dVar2 = (l.d) aVar2.L;
                                                                                                                                    dVar2.f8371q = (CharSequence[]) arrayList2.toArray(new String[0]);
                                                                                                                                    dVar2.f8373s = lVar;
                                                                                                                                } else {
                                                                                                                                    aVar2.t(R.string.no_more_components);
                                                                                                                                }
                                                                                                                                l.g i14 = aVar2.i();
                                                                                                                                Window window = i14.getWindow();
                                                                                                                                if (window != null) {
                                                                                                                                    window.setType(1003);
                                                                                                                                    window.getAttributes().token = bVar2.getWindowToken();
                                                                                                                                }
                                                                                                                                i14.show();
                                                                                                                                return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                q(false);
                                                                                                                return;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        m9.o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    public static void a(b bVar) {
        bVar.setShownEditablePropertyDialog(sh.c.SIZE);
    }

    public static void b(b bVar, String str, ve.d dVar, boolean z10, int i2) {
        dVar.getClass();
        e0 viewModel = bVar.getViewModel();
        viewModel.getClass();
        q1 q1Var = viewModel.f12731g;
        f fVar = (f) q1Var.getValue();
        if (fVar != null) {
            q1Var.k(null, f.a(fVar, null, str, dVar, z10, i2, null, 69));
        }
        bVar.setShowLayoutPropertiesDialog(false);
    }

    public static void c(b bVar) {
        bVar.setShownEditablePropertyDialog(null);
    }

    public static void d(b bVar) {
        bVar.setShownEditablePropertyDialog(sh.c.WIDTH);
    }

    public static void e(b bVar) {
        ve.n nVar;
        e0 viewModel = bVar.getViewModel();
        d dVar = bVar.A;
        viewModel.getClass();
        dVar.getClass();
        sh.a aVar = (sh.a) viewModel.f12737n.A.getValue();
        sh.b bVar2 = null;
        if (aVar != null) {
            nVar = aVar.f12919a;
        } else {
            nVar = null;
        }
        int i2 = z.f12746a[dVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                q1 q1Var = viewModel.f12740q;
                if (nVar != null) {
                    m mVar = nVar.f13822b;
                    bVar2 = new sh.b(mVar.f13818a, mVar.f13819b);
                }
                q1Var.j(bVar2);
            } else {
                m9.o.o();
                return;
            }
        } else {
            q1 q1Var2 = viewModel.f12738o;
            if (nVar != null) {
                m mVar2 = nVar.f13821a;
                bVar2 = new sh.b(mVar2.f13818a, mVar2.f13819b);
            }
            q1Var2.j(bVar2);
        }
        bVar.setShowBackgroundPropertiesDialog(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(me.magnum.melonds.ui.layouteditor.b r17) {
        /*
            r0 = r17
            rh.e0 r1 = r0.getViewModel()
            sh.d r2 = r0.A
            r1.getClass()
            r2.getClass()
            ve.o r3 = r1.f12730f
            if (r3 != 0) goto L14
            goto Le0
        L14:
            int[] r4 = rh.z.f12746a
            int r5 = r2.ordinal()
            r4 = r4[r5]
            r5 = 2
            r6 = 1
            if (r4 == r6) goto L2f
            if (r4 != r5) goto L2b
            cd.q1 r4 = r1.f12740q
            java.lang.Object r4 = r4.getValue()
            sh.b r4 = (sh.b) r4
            goto L37
        L2b:
            m9.o.o()
            return
        L2f:
            cd.q1 r4 = r1.f12738o
            java.lang.Object r4 = r4.getValue()
            sh.b r4 = (sh.b) r4
        L37:
            if (r4 != 0) goto L3b
            goto Le0
        L3b:
            java.util.UUID r7 = r4.f12921a
            ve.a r4 = r4.f12922b
            cd.q1 r1 = r1.f12731g
        L41:
            java.lang.Object r8 = r1.getValue()
            r9 = r8
            ve.f r9 = (ve.f) r9
            r10 = 0
            if (r9 == 0) goto Lda
            java.util.Map r11 = r9.f13804g
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>(r11)
            int[] r11 = rh.z.f12746a
            int r12 = r2.ordinal()
            r11 = r11[r12]
            r12 = 4
            if (r11 == r6) goto L97
            if (r11 != r5) goto L93
            boolean r11 = r15.containsKey(r3)
            if (r11 == 0) goto L82
            java.lang.Object r11 = r15.get(r3)
            ve.n r11 = (ve.n) r11
            if (r11 == 0) goto Lca
            ve.m r11 = r11.f13822b
            if (r11 == 0) goto Lca
            ve.m r11 = ve.m.a(r11, r7, r4, r10, r12)
            java.lang.Object r12 = r15.get(r3)
            ve.n r12 = (ve.n) r12
            if (r12 == 0) goto Lca
            ve.n r10 = ve.n.a(r12, r10, r11, r6)
            goto Lca
        L82:
            ve.n r11 = new ve.n
            ve.m r12 = new ve.m
            r12.<init>(r10)
            ve.m r13 = new ve.m
            r13.<init>(r7, r4, r10)
            r11.<init>(r12, r13)
        L91:
            r10 = r11
            goto Lca
        L93:
            m9.o.o()
            return
        L97:
            boolean r11 = r15.containsKey(r3)
            if (r11 == 0) goto Lba
            java.lang.Object r11 = r15.get(r3)
            ve.n r11 = (ve.n) r11
            if (r11 == 0) goto Lca
            ve.m r11 = r11.f13821a
            if (r11 == 0) goto Lca
            ve.m r11 = ve.m.a(r11, r7, r4, r10, r12)
            java.lang.Object r12 = r15.get(r3)
            ve.n r12 = (ve.n) r12
            if (r12 == 0) goto Lca
            ve.n r10 = ve.n.a(r12, r11, r10, r5)
            goto Lca
        Lba:
            ve.n r11 = new ve.n
            ve.m r12 = new ve.m
            r12.<init>(r7, r4, r10)
            ve.m r13 = new ve.m
            r13.<init>(r10)
            r11.<init>(r12, r13)
            goto L91
        Lca:
            if (r10 == 0) goto Lcf
            r15.put(r3, r10)
        Lcf:
            r16 = 63
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            ve.f r10 = ve.f.a(r9, r10, r11, r12, r13, r14, r15, r16)
        Lda:
            boolean r8 = r1.i(r8, r10)
            if (r8 == 0) goto L41
        Le0:
            r1 = 0
            r0.setShowBackgroundPropertiesDialog(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.layouteditor.b.f(me.magnum.melonds.ui.layouteditor.b):void");
    }

    public static void g(b bVar) {
        bVar.setShownEditablePropertyDialog(sh.c.HEIGHT);
    }

    private final boolean getShowBackgroundPropertiesDialog() {
        return ((Boolean) this.f9554o0.getValue()).booleanValue();
    }

    private final boolean getShowLayoutPropertiesDialog() {
        return ((Boolean) this.f9553n0.getValue()).booleanValue();
    }

    private final sh.c getShownEditablePropertyDialog() {
        return (sh.c) this.p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e0 getViewModel() {
        return (e0) this.R.getValue();
    }

    public static void h(b bVar, n2.m mVar, int i2) {
        boolean z10;
        int i10;
        int progress;
        int i11;
        w0 l10;
        int i12 = 0;
        if ((i2 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        r rVar = (r) mVar;
        if (rVar.O(i2 & 1, z10)) {
            boolean showLayoutPropertiesDialog = bVar.getShowLayoutPropertiesDialog();
            le.a aVar = bVar.L;
            Object obj = l.f9953a;
            if (showLayoutPropertiesDialog) {
                rVar.X(-233234850);
                f fVar = (f) j.l(bVar.getViewModel().f12732h, rVar).getValue();
                if (fVar != null) {
                    rVar.X(-232995282);
                    boolean h2 = rVar.h(bVar);
                    Object L = rVar.L();
                    if (h2 || L == obj) {
                        L = new k(bVar, 1);
                        rVar.h0(L);
                    }
                    mc.a aVar2 = (mc.a) L;
                    boolean h10 = rVar.h(bVar);
                    Object L2 = rVar.L();
                    if (h10 || L2 == obj) {
                        L2 = new h(4, bVar);
                        rVar.h0(L2);
                    }
                    p7.l.e(fVar, aVar2, (mc.r) L2, rVar, 0);
                    rVar.p(false);
                } else {
                    rVar.X(-232424448);
                    rVar.p(false);
                }
                rVar.p(false);
            } else {
                rVar.X(-232402624);
                rVar.p(false);
            }
            if (bVar.getShowBackgroundPropertiesDialog()) {
                rVar.X(-232292140);
                int i13 = a.f9536a[bVar.A.ordinal()];
                if (i13 != 1) {
                    if (i13 == 2) {
                        rVar.X(962346271);
                        l10 = j.l((o1) bVar.getViewModel().f12741r.getValue(), rVar);
                        rVar.p(false);
                    } else {
                        throw w.d.i(rVar, 962338361, false);
                    }
                } else {
                    rVar.X(962341887);
                    l10 = j.l((o1) bVar.getViewModel().f12739p.getValue(), rVar);
                    rVar.p(false);
                }
                sh.b bVar2 = (sh.b) l10.getValue();
                if (bVar2 != null) {
                    rVar.X(-231801751);
                    UUID uuid = bVar2.f12921a;
                    ve.a aVar3 = bVar2.f12922b;
                    boolean h11 = rVar.h(bVar);
                    Object L3 = rVar.L();
                    if (h11 || L3 == obj) {
                        L3 = new mh.m(7, (cc.c) null, bVar);
                        rVar.h0(L3);
                    }
                    mc.p pVar = (mc.p) L3;
                    boolean h12 = rVar.h(bVar) | rVar.h(bVar2);
                    Object L4 = rVar.L();
                    if (h12 || L4 == obj) {
                        L4 = new q1.e(2, bVar, bVar2);
                        rVar.h0(L4);
                    }
                    mc.a aVar4 = (mc.a) L4;
                    boolean h13 = rVar.h(bVar);
                    Object L5 = rVar.L();
                    if (h13 || L5 == obj) {
                        L5 = new o(bVar, 2);
                        rVar.h0(L5);
                    }
                    mc.l lVar = (mc.l) L5;
                    boolean h14 = rVar.h(bVar);
                    Object L6 = rVar.L();
                    if (h14 || L6 == obj) {
                        L6 = new k(bVar, 2);
                        rVar.h0(L6);
                    }
                    mc.a aVar5 = (mc.a) L6;
                    boolean h15 = rVar.h(bVar);
                    Object L7 = rVar.L();
                    if (h15 || L7 == obj) {
                        L7 = new k(bVar, 3);
                        rVar.h0(L7);
                    }
                    j.c(uuid, aVar3, pVar, aVar4, lVar, aVar5, (mc.a) L7, rVar, 0);
                    rVar = rVar;
                    rVar.p(false);
                } else {
                    rVar.X(-230672576);
                    rVar.p(false);
                }
                rVar.p(false);
            } else {
                rVar.X(-230650752);
                rVar.p(false);
            }
            sh.c shownEditablePropertyDialog = bVar.getShownEditablePropertyDialog();
            int i14 = -1;
            if (shownEditablePropertyDialog == null) {
                i10 = -1;
            } else {
                i10 = a.f9537b[shownEditablePropertyDialog.ordinal()];
            }
            if (i10 != -1) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            progress = aVar.f9060n.getProgress();
                            i11 = bVar.f9544e0;
                        } else {
                            m9.o.o();
                            return;
                        }
                    } else {
                        progress = aVar.f9062p.getProgress();
                        i11 = bVar.f9544e0;
                    }
                } else {
                    progress = aVar.f9061o.getProgress();
                    i11 = bVar.f9544e0;
                }
                i12 = i11 + progress;
            }
            int i15 = i12;
            if (shownEditablePropertyDialog != null) {
                i14 = shownEditablePropertyDialog.ordinal();
            }
            boolean d4 = rVar.d(i14) | rVar.h(bVar);
            Object L8 = rVar.L();
            if (d4 || L8 == obj) {
                L8 = new g(23, shownEditablePropertyDialog, bVar);
                rVar.h0(L8);
            }
            mc.l lVar2 = (mc.l) L8;
            boolean h16 = rVar.h(bVar);
            Object L9 = rVar.L();
            if (h16 || L9 == obj) {
                L9 = new k(bVar, 4);
                rVar.h0(L9);
            }
            p7.k.a(shownEditablePropertyDialog, i15, lVar2, (mc.a) L9, rVar, 0);
            p7.m.c(l0.f.I(rVar, R.string.layout_name), bVar.f9555q0, null, null, rVar, 0, 12);
            return;
        }
        rVar.R();
    }

    public static void i(b bVar) {
        bVar.setShowLayoutPropertiesDialog(false);
    }

    public static void j(b bVar, String str) {
        String str2;
        f fVar;
        str.getClass();
        e0 viewModel = bVar.getViewModel();
        viewModel.getClass();
        q1 q1Var = viewModel.f12731g;
        while (true) {
            Object value = q1Var.getValue();
            f fVar2 = (f) value;
            if (fVar2 != null) {
                str2 = str;
                fVar = f.a(fVar2, null, str2, null, false, 0, null, 125);
            } else {
                str2 = str;
                fVar = null;
            }
            if (q1Var.i(value, fVar)) {
                break;
            }
            str = str2;
        }
        t tVar = bVar.f9541b0;
        if (tVar != null) {
            ((rd.k) tVar).q();
        }
    }

    public static void k(b bVar, fc.a aVar, int i2) {
        Object value;
        f fVar;
        int i10 = a.f9539d[((LayoutEditorActivity.a) ((fc.b) aVar).get(i2)).ordinal()];
        String str = null;
        switch (i10) {
            case DSiCameraSource.FrontCamera /* 1 */:
                t tVar = bVar.f9541b0;
                if (tVar != null) {
                    int i11 = LayoutEditorActivity.K0;
                    ((LayoutEditorActivity) ((rd.k) tVar).B).B();
                }
                bVar.setShowLayoutPropertiesDialog(true);
                return;
            case 2:
                t tVar2 = bVar.f9541b0;
                if (tVar2 != null) {
                    int i12 = LayoutEditorActivity.K0;
                    ((LayoutEditorActivity) ((rd.k) tVar2).B).B();
                }
                bVar.setShowBackgroundPropertiesDialog(true);
                return;
            case 3:
                e0 viewModel = bVar.getViewModel();
                viewModel.f12731g.j(viewModel.f12729e);
                return;
            case 4:
                q1 q1Var = bVar.getViewModel().f12731g;
                do {
                    value = q1Var.getValue();
                    f fVar2 = (f) value;
                    if (fVar2 != null) {
                        fVar = f.a(fVar2, null, null, ve.d.FOLLOW_SYSTEM, false, 50, zb.r.A, 7);
                    } else {
                        fVar = null;
                    }
                } while (!q1Var.i(value, fVar));
                return;
            case l1.c.f8511g /* 5 */:
                f fVar3 = (f) bVar.getViewModel().f12731g.getValue();
                if (fVar3 != null) {
                    str = fVar3.f13799b;
                }
                if (str != null && str.length() != 0) {
                    t tVar3 = bVar.f9541b0;
                    if (tVar3 != null) {
                        ((rd.k) tVar3).q();
                        return;
                    }
                    return;
                }
                rg.d dVar = bVar.f9555q0;
                String string = bVar.getResources().getString(R.string.custom_layout_default_name);
                string.getClass();
                rg.d.d(dVar, string, new o(bVar, 1));
                return;
            case l1.c.f8509e /* 6 */:
                t tVar4 = bVar.f9541b0;
                if (tVar4 != null) {
                    ((LayoutEditorActivity) ((rd.k) tVar4).B).finish();
                    return;
                }
                return;
            default:
                m9.o.o();
                return;
        }
    }

    public static void l(b bVar, ve.a aVar) {
        Object value;
        sh.b bVar2;
        Object value2;
        sh.b bVar3;
        aVar.getClass();
        e0 viewModel = bVar.getViewModel();
        d dVar = bVar.A;
        viewModel.getClass();
        dVar.getClass();
        int i2 = z.f12746a[dVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                q1 q1Var = viewModel.f12740q;
                do {
                    value2 = q1Var.getValue();
                    sh.b bVar4 = (sh.b) value2;
                    if (bVar4 != null) {
                        bVar3 = sh.b.a(bVar4, null, aVar, 1);
                    } else {
                        bVar3 = null;
                    }
                } while (!q1Var.i(value2, bVar3));
                return;
            }
            m9.o.o();
            return;
        }
        q1 q1Var2 = viewModel.f12738o;
        do {
            value = q1Var2.getValue();
            sh.b bVar5 = (sh.b) value;
            if (bVar5 != null) {
                bVar2 = sh.b.a(bVar5, null, aVar, 1);
            } else {
                bVar2 = null;
            }
        } while (!q1Var2.i(value, bVar2));
    }

    public static void m(sh.c cVar, b bVar, int i2) {
        int i10;
        le.a aVar = bVar.L;
        if (cVar == null) {
            i10 = -1;
        } else {
            i10 = a.f9537b[cVar.ordinal()];
        }
        if (i10 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        aVar.f9060n.setProgress(i2 - bVar.f9544e0);
                        bVar.o(bVar.f9549j0, rh.s.HEIGHT);
                    } else {
                        m9.o.o();
                        return;
                    }
                } else {
                    aVar.f9062p.setProgress(i2 - bVar.f9544e0);
                    bVar.o(bVar.f9549j0, rh.s.WIDTH);
                }
            } else {
                aVar.f9061o.setProgress(i2 - bVar.f9544e0);
            }
        }
        bVar.setShownEditablePropertyDialog(null);
    }

    public static void p(b bVar) {
        le.a aVar = bVar.L;
        if (!bVar.f9542c0) {
            return;
        }
        LinearLayout linearLayout = aVar.f9055h;
        linearLayout.clearAnimation();
        linearLayout.animate().y(linearLayout.getBottom()).setDuration(100L).withEndAction(new rh.n(bVar, 2)).start();
        bVar.f9542c0 = false;
    }

    private final void setShowBackgroundPropertiesDialog(boolean z10) {
        this.f9554o0.setValue(Boolean.valueOf(z10));
    }

    private final void setShowLayoutPropertiesDialog(boolean z10) {
        this.f9553n0.setValue(Boolean.valueOf(z10));
    }

    private final void setShownEditablePropertyDialog(sh.c cVar) {
        this.p0.setValue(cVar);
    }

    public final ImageView getImageBackground() {
        return this.L.f9052e;
    }

    public final LayoutEditorView getLayoutEditorView() {
        return this.L.f9067u;
    }

    public final t getListener() {
        return this.f9541b0;
    }

    public final void o(u uVar, rh.s sVar) {
        float progress;
        float f8;
        Float ratio = uVar.getRatio();
        if (ratio != null) {
            float floatValue = ratio.floatValue();
            le.a aVar = this.L;
            SeekBar seekBar = aVar.f9062p;
            SeekBar seekBar2 = aVar.f9062p;
            SeekBar seekBar3 = aVar.f9060n;
            float max = seekBar.getMax() / seekBar3.getMax();
            int i2 = a.f9540e[sVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    f8 = seekBar3.getProgress() + this.f9544e0;
                    progress = f8 * floatValue;
                } else {
                    m9.o.o();
                    return;
                }
            } else {
                progress = this.f9544e0 + seekBar2.getProgress();
                f8 = progress / floatValue;
            }
            float floatValue2 = uVar.getRatio().floatValue() * this.f9544e0;
            float f10 = this.f9544e0;
            float min = Math.min(seekBar2.getMax() + this.f9544e0, (seekBar3.getMax() + this.f9544e0) * floatValue);
            float min2 = Math.min(seekBar3.getMax() + this.f9544e0, (seekBar2.getMax() + this.f9544e0) / floatValue);
            if (progress < floatValue2) {
                f8 = floatValue2 / floatValue;
                progress = floatValue2;
            }
            if (f8 < f10) {
                progress = f10 * floatValue;
            } else {
                f10 = f8;
            }
            if (max > floatValue) {
                if (progress > min) {
                    min2 = min / floatValue;
                }
                min = progress;
                min2 = f10;
            } else {
                if (f10 > min2) {
                    min = min2 * floatValue;
                }
                min = progress;
                min2 = f10;
            }
            float f11 = j.f((min - this.f9544e0) / seekBar2.getMax(), 0.0f, 1.0f);
            this.f9545f0 = f11;
            seekBar2.setProgress((int) (f11 * seekBar2.getMax()));
            aVar.f9066t.setText(String.valueOf((int) ((seekBar2.getMax() * this.f9545f0) + this.f9544e0)));
            float f12 = j.f((min2 - this.f9544e0) / seekBar3.getMax(), 0.0f, 1.0f);
            this.f9546g0 = f12;
            seekBar3.setProgress((int) (f12 * seekBar3.getMax()));
            aVar.f9064r.setText(String.valueOf((int) ((seekBar3.getMax() * this.f9546g0) + this.f9544e0)));
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        keyEvent.getClass();
        LayoutEditorView layoutEditorView = this.L.f9067u;
        i iVar = layoutEditorView.f9533f0;
        if (iVar != null) {
            switch (keyEvent.getKeyCode()) {
                case 19:
                    layoutEditorView.k(iVar, 0.0f, -1.0f);
                    return true;
                case 20:
                    layoutEditorView.k(iVar, 0.0f, 1.0f);
                    return true;
                case 21:
                    layoutEditorView.k(iVar, -1.0f, 0.0f);
                    return true;
                case 22:
                    layoutEditorView.k(iVar, 1.0f, 0.0f);
                    return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public final void q(boolean z10) {
        if (!this.f9543d0) {
            return;
        }
        le.a aVar = this.L;
        ScrollView scrollView = aVar.f9057j;
        ScrollView scrollView2 = aVar.f9057j;
        scrollView.animate().cancel();
        if (z10) {
            scrollView2.post(new rh.n(this, 0));
        } else {
            scrollView2.setY(scrollView2.getBottom());
            scrollView2.setVisibility(4);
        }
        this.f9543d0 = false;
    }

    public final void r() {
        t tVar = this.f9541b0;
        if (tVar != null) {
            int i2 = LayoutEditorActivity.K0;
            ((LayoutEditorActivity) ((rd.k) tVar).B).B();
        }
        fc.a entries = LayoutEditorActivity.a.getEntries();
        int a10 = ((zb.b) entries).a();
        String[] strArr = new String[a10];
        for (int i10 = 0; i10 < a10; i10++) {
            strArr[i10] = getResources().getString(((LayoutEditorActivity.a) ((fc.b) entries).get(i10)).getStringRes());
        }
        bk.a aVar = new bk.a(new ContextThemeWrapper(getContext(), (int) R.style.AppTheme));
        aVar.w(R.string.menu);
        ah.l lVar = new ah.l(3, this, entries);
        l.d dVar = (l.d) aVar.L;
        dVar.f8371q = strArr;
        dVar.f8373s = lVar;
        aVar.u(R.string.cancel, null);
        l.g i11 = aVar.i();
        Window window = i11.getWindow();
        if (window != null) {
            window.setType(1003);
            window.getAttributes().token = getWindowToken();
        }
        i11.show();
    }

    public final e s() {
        return new e(getShowLayoutPropertiesDialog(), getShowBackgroundPropertiesDialog());
    }

    public final void setListener(t tVar) {
        this.f9541b0 = tVar;
    }

    public final void t(h0 h0Var) {
        Uri uri;
        h0Var.getClass();
        oe.a aVar = h0Var.f10934a;
        if (aVar != null) {
            uri = aVar.f10907c;
        } else {
            uri = null;
        }
        a0 a0Var = this.B;
        a0Var.getClass();
        new com.squareup.picasso.e0(a0Var, uri).a(this.L.f9052e, new p1.a0(9, this, h0Var));
    }
}

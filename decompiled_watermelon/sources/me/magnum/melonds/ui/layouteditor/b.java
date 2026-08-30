package me.magnum.melonds.ui.layouteditor;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import me.magnum.melonds.ui.layouteditor.a;
import me.magnum.melonds.ui.layouteditor.b;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class b extends FrameLayout {
    public final ug3 A;
    public final nn4 B;
    public final qa7 L;
    public final il6 R;
    public oe3 c0;
    public boolean d0;
    public boolean e0;
    public int f0;
    public float g0;
    public float h0;
    public boolean i0;
    public boolean j0;
    public vc3 k0;
    public pe3 l0;
    public pe3 m0;
    public pe3 n0;
    public boolean o0;
    public boolean p0;
    public final tj4 q0;
    public final tj4 r0;
    public final tj4 s0;
    public final tj4 t0;
    public vc3 u0;
    public vc3 v0;
    public vc3 w0;
    public final uq6 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ug3 ug3Var, nn4 nn4Var, hv5 hv5Var, ContextWrapper contextWrapper) {
        super(contextWrapper, null);
        boolean z;
        boolean z2;
        ug3Var.getClass();
        this.A = ug3Var;
        this.B = nn4Var;
        this.R = new il6(new fe3(this, 0));
        this.d0 = true;
        this.e0 = true;
        pe3 pe3Var = pe3.RATIO_4_3;
        this.l0 = pe3Var;
        this.m0 = pe3Var;
        this.n0 = pe3Var;
        if (hv5Var != null) {
            z = hv5Var.a;
        } else {
            z = false;
        }
        this.q0 = me2.G(Boolean.valueOf(z));
        if (hv5Var != null) {
            z2 = hv5Var.b;
        } else {
            z2 = false;
        }
        this.r0 = me2.G(Boolean.valueOf(z2));
        this.s0 = me2.G(null);
        this.t0 = me2.G(null);
        this.x0 = new uq6();
        LayoutInflater from = LayoutInflater.from(contextWrapper);
        setFocusable(false);
        setFocusableInTouchMode(false);
        View inflate = from.inflate(R.layout.view_layout_editor_manager, (ViewGroup) null, false);
        int i = R.id.barrier_labels;
        if (((Barrier) ep2.r(inflate, R.id.barrier_labels)) != null) {
            i = R.id.button_add_button;
            Button button = (Button) ep2.r(inflate, R.id.button_add_button);
            if (button != null) {
                i = R.id.button_center_horizontal;
                Button button2 = (Button) ep2.r(inflate, R.id.button_center_horizontal);
                if (button2 != null) {
                    i = R.id.button_center_vertical;
                    Button button3 = (Button) ep2.r(inflate, R.id.button_center_vertical);
                    if (button3 != null) {
                        i = R.id.button_delete_button;
                        Button button4 = (Button) ep2.r(inflate, R.id.button_delete_button);
                        if (button4 != null) {
                            i = R.id.button_edit_position;
                            Button button5 = (Button) ep2.r(inflate, R.id.button_edit_position);
                            if (button5 != null) {
                                i = R.id.button_edit_size;
                                Button button6 = (Button) ep2.r(inflate, R.id.button_edit_size);
                                if (button6 != null) {
                                    i = R.id.button_hide_controls;
                                    ImageButton imageButton = (ImageButton) ep2.r(inflate, R.id.button_hide_controls);
                                    if (imageButton != null) {
                                        i = R.id.button_menu;
                                        Button button7 = (Button) ep2.r(inflate, R.id.button_menu);
                                        if (button7 != null) {
                                            i = R.id.checkbox_above_screen;
                                            CheckBox checkBox = (CheckBox) ep2.r(inflate, R.id.checkbox_above_screen);
                                            if (checkBox != null) {
                                                i = R.id.image_background;
                                                ImageView imageView = (ImageView) ep2.r(inflate, R.id.image_background);
                                                if (imageView != null) {
                                                    i = R.id.layout_alpha_labels;
                                                    LinearLayout linearLayout = (LinearLayout) ep2.r(inflate, R.id.layout_alpha_labels);
                                                    if (linearLayout != null) {
                                                        i = R.id.layout_aspect_ratio;
                                                        LinearLayout linearLayout2 = (LinearLayout) ep2.r(inflate, R.id.layout_aspect_ratio);
                                                        if (linearLayout2 != null) {
                                                            i = R.id.layout_controls;
                                                            LinearLayout linearLayout3 = (LinearLayout) ep2.r(inflate, R.id.layout_controls);
                                                            if (linearLayout3 != null) {
                                                                i = R.id.layout_height_labels;
                                                                LinearLayout linearLayout4 = (LinearLayout) ep2.r(inflate, R.id.layout_height_labels);
                                                                if (linearLayout4 != null) {
                                                                    i = R.id.layout_scaling;
                                                                    if (((ConstraintLayout) ep2.r(inflate, R.id.layout_scaling)) != null) {
                                                                        i = R.id.layout_scaling_container;
                                                                        ScrollView scrollView = (ScrollView) ep2.r(inflate, R.id.layout_scaling_container);
                                                                        if (scrollView != null) {
                                                                            i = R.id.layout_size_labels;
                                                                            LinearLayout linearLayout5 = (LinearLayout) ep2.r(inflate, R.id.layout_size_labels);
                                                                            if (linearLayout5 != null) {
                                                                                i = R.id.layout_width_labels;
                                                                                LinearLayout linearLayout6 = (LinearLayout) ep2.r(inflate, R.id.layout_width_labels);
                                                                                if (linearLayout6 != null) {
                                                                                    i = R.id.seek_bar_alpha;
                                                                                    SeekBar seekBar = (SeekBar) ep2.r(inflate, R.id.seek_bar_alpha);
                                                                                    if (seekBar != null) {
                                                                                        i = R.id.seek_bar_height;
                                                                                        SeekBar seekBar2 = (SeekBar) ep2.r(inflate, R.id.seek_bar_height);
                                                                                        if (seekBar2 != null) {
                                                                                            i = R.id.seek_bar_size;
                                                                                            SeekBar seekBar3 = (SeekBar) ep2.r(inflate, R.id.seek_bar_size);
                                                                                            if (seekBar3 != null) {
                                                                                                i = R.id.seek_bar_width;
                                                                                                SeekBar seekBar4 = (SeekBar) ep2.r(inflate, R.id.seek_bar_width);
                                                                                                if (seekBar4 != null) {
                                                                                                    i = R.id.spinner_aspect_ratio;
                                                                                                    Spinner spinner = (Spinner) ep2.r(inflate, R.id.spinner_aspect_ratio);
                                                                                                    if (spinner != null) {
                                                                                                        i = R.id.text_height;
                                                                                                        TextView textView = (TextView) ep2.r(inflate, R.id.text_height);
                                                                                                        if (textView != null) {
                                                                                                            i = R.id.text_size;
                                                                                                            TextView textView2 = (TextView) ep2.r(inflate, R.id.text_size);
                                                                                                            if (textView2 != null) {
                                                                                                                i = R.id.text_width;
                                                                                                                TextView textView3 = (TextView) ep2.r(inflate, R.id.text_width);
                                                                                                                if (textView3 != null) {
                                                                                                                    i = R.id.view_layout_editor;
                                                                                                                    LayoutEditorView layoutEditorView = (LayoutEditorView) ep2.r(inflate, R.id.view_layout_editor);
                                                                                                                    if (layoutEditorView != null) {
                                                                                                                        RelativeLayout relativeLayout = (RelativeLayout) inflate;
                                                                                                                        this.L = new qa7(relativeLayout, button, button2, button3, button4, button5, button6, imageButton, button7, checkBox, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, scrollView, linearLayout5, linearLayout6, seekBar, seekBar2, seekBar3, seekBar4, spinner, textView, textView2, textView3, layoutEditorView);
                                                                                                                        ComposeView composeView = new ComposeView(contextWrapper, null, 6);
                                                                                                                        composeView.setContent(new et0(1040140390, true, new ge3(this, 0)));
                                                                                                                        addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
                                                                                                                        addView(composeView, new FrameLayout.LayoutParams(-1, -1));
                                                                                                                        a31 a31Var = new a31(12, this);
                                                                                                                        WeakHashMap weakHashMap = aa7.a;
                                                                                                                        s97.c(relativeLayout, a31Var);
                                                                                                                        button.setOnClickListener(new View.OnClickListener(this) { // from class: he3
                                                                                                                            public final /* synthetic */ b B;

                                                                                                                            {
                                                                                                                                this.B = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i2 = r2;
                                                                                                                                b bVar = this.B;
                                                                                                                                switch (i2) {
                                                                                                                                    case 0:
                                                                                                                                        bVar.x();
                                                                                                                                        return;
                                                                                                                                    case 1:
                                                                                                                                        bVar.y();
                                                                                                                                        return;
                                                                                                                                    case 2:
                                                                                                                                        LayoutEditorView layoutEditorView2 = bVar.L.v;
                                                                                                                                        hd3 hd3Var = layoutEditorView2.g0;
                                                                                                                                        if (hd3Var != null) {
                                                                                                                                            layoutEditorView2.removeView(hd3Var.a);
                                                                                                                                            layoutEditorView2.getViews().remove(hd3Var.b);
                                                                                                                                            layoutEditorView2.m();
                                                                                                                                            layoutEditorView2.i0 = true;
                                                                                                                                            layoutEditorView2.o();
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 3:
                                                                                                                                        bVar.z();
                                                                                                                                        return;
                                                                                                                                    case 4:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 5:
                                                                                                                                        bVar.L.v.j();
                                                                                                                                        return;
                                                                                                                                    case ig7.b /* 6 */:
                                                                                                                                        bVar.L.v.k();
                                                                                                                                        return;
                                                                                                                                    case 7:
                                                                                                                                        boolean z3 = bVar.d0;
                                                                                                                                        if (z3) {
                                                                                                                                            b.u(bVar);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        qa7 qa7Var = bVar.L;
                                                                                                                                        if (!z3) {
                                                                                                                                            LinearLayout linearLayout7 = qa7Var.i;
                                                                                                                                            linearLayout7.clearAnimation();
                                                                                                                                            linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new ie3(bVar, 1)).start();
                                                                                                                                            bVar.d0 = true;
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 8:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 9:
                                                                                                                                        bVar.A(wc3.WIDTH);
                                                                                                                                        return;
                                                                                                                                    case 10:
                                                                                                                                        bVar.A(wc3.HEIGHT);
                                                                                                                                        return;
                                                                                                                                    default:
                                                                                                                                        bVar.v(true);
                                                                                                                                        return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        button7.setOnClickListener(new View.OnClickListener(this) { // from class: he3
                                                                                                                            public final /* synthetic */ b B;

                                                                                                                            {
                                                                                                                                this.B = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i2 = r2;
                                                                                                                                b bVar = this.B;
                                                                                                                                switch (i2) {
                                                                                                                                    case 0:
                                                                                                                                        bVar.x();
                                                                                                                                        return;
                                                                                                                                    case 1:
                                                                                                                                        bVar.y();
                                                                                                                                        return;
                                                                                                                                    case 2:
                                                                                                                                        LayoutEditorView layoutEditorView2 = bVar.L.v;
                                                                                                                                        hd3 hd3Var = layoutEditorView2.g0;
                                                                                                                                        if (hd3Var != null) {
                                                                                                                                            layoutEditorView2.removeView(hd3Var.a);
                                                                                                                                            layoutEditorView2.getViews().remove(hd3Var.b);
                                                                                                                                            layoutEditorView2.m();
                                                                                                                                            layoutEditorView2.i0 = true;
                                                                                                                                            layoutEditorView2.o();
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 3:
                                                                                                                                        bVar.z();
                                                                                                                                        return;
                                                                                                                                    case 4:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 5:
                                                                                                                                        bVar.L.v.j();
                                                                                                                                        return;
                                                                                                                                    case ig7.b /* 6 */:
                                                                                                                                        bVar.L.v.k();
                                                                                                                                        return;
                                                                                                                                    case 7:
                                                                                                                                        boolean z3 = bVar.d0;
                                                                                                                                        if (z3) {
                                                                                                                                            b.u(bVar);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        qa7 qa7Var = bVar.L;
                                                                                                                                        if (!z3) {
                                                                                                                                            LinearLayout linearLayout7 = qa7Var.i;
                                                                                                                                            linearLayout7.clearAnimation();
                                                                                                                                            linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new ie3(bVar, 1)).start();
                                                                                                                                            bVar.d0 = true;
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 8:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 9:
                                                                                                                                        bVar.A(wc3.WIDTH);
                                                                                                                                        return;
                                                                                                                                    case 10:
                                                                                                                                        bVar.A(wc3.HEIGHT);
                                                                                                                                        return;
                                                                                                                                    default:
                                                                                                                                        bVar.v(true);
                                                                                                                                        return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        button4.setOnClickListener(new View.OnClickListener(this) { // from class: he3
                                                                                                                            public final /* synthetic */ b B;

                                                                                                                            {
                                                                                                                                this.B = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i2 = r2;
                                                                                                                                b bVar = this.B;
                                                                                                                                switch (i2) {
                                                                                                                                    case 0:
                                                                                                                                        bVar.x();
                                                                                                                                        return;
                                                                                                                                    case 1:
                                                                                                                                        bVar.y();
                                                                                                                                        return;
                                                                                                                                    case 2:
                                                                                                                                        LayoutEditorView layoutEditorView2 = bVar.L.v;
                                                                                                                                        hd3 hd3Var = layoutEditorView2.g0;
                                                                                                                                        if (hd3Var != null) {
                                                                                                                                            layoutEditorView2.removeView(hd3Var.a);
                                                                                                                                            layoutEditorView2.getViews().remove(hd3Var.b);
                                                                                                                                            layoutEditorView2.m();
                                                                                                                                            layoutEditorView2.i0 = true;
                                                                                                                                            layoutEditorView2.o();
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 3:
                                                                                                                                        bVar.z();
                                                                                                                                        return;
                                                                                                                                    case 4:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 5:
                                                                                                                                        bVar.L.v.j();
                                                                                                                                        return;
                                                                                                                                    case ig7.b /* 6 */:
                                                                                                                                        bVar.L.v.k();
                                                                                                                                        return;
                                                                                                                                    case 7:
                                                                                                                                        boolean z3 = bVar.d0;
                                                                                                                                        if (z3) {
                                                                                                                                            b.u(bVar);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        qa7 qa7Var = bVar.L;
                                                                                                                                        if (!z3) {
                                                                                                                                            LinearLayout linearLayout7 = qa7Var.i;
                                                                                                                                            linearLayout7.clearAnimation();
                                                                                                                                            linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new ie3(bVar, 1)).start();
                                                                                                                                            bVar.d0 = true;
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 8:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 9:
                                                                                                                                        bVar.A(wc3.WIDTH);
                                                                                                                                        return;
                                                                                                                                    case 10:
                                                                                                                                        bVar.A(wc3.HEIGHT);
                                                                                                                                        return;
                                                                                                                                    default:
                                                                                                                                        bVar.v(true);
                                                                                                                                        return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        button5.setOnTouchListener(new ll1(1, this));
                                                                                                                        button5.setOnClickListener(new View.OnClickListener(this) { // from class: he3
                                                                                                                            public final /* synthetic */ b B;

                                                                                                                            {
                                                                                                                                this.B = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i2 = r2;
                                                                                                                                b bVar = this.B;
                                                                                                                                switch (i2) {
                                                                                                                                    case 0:
                                                                                                                                        bVar.x();
                                                                                                                                        return;
                                                                                                                                    case 1:
                                                                                                                                        bVar.y();
                                                                                                                                        return;
                                                                                                                                    case 2:
                                                                                                                                        LayoutEditorView layoutEditorView2 = bVar.L.v;
                                                                                                                                        hd3 hd3Var = layoutEditorView2.g0;
                                                                                                                                        if (hd3Var != null) {
                                                                                                                                            layoutEditorView2.removeView(hd3Var.a);
                                                                                                                                            layoutEditorView2.getViews().remove(hd3Var.b);
                                                                                                                                            layoutEditorView2.m();
                                                                                                                                            layoutEditorView2.i0 = true;
                                                                                                                                            layoutEditorView2.o();
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 3:
                                                                                                                                        bVar.z();
                                                                                                                                        return;
                                                                                                                                    case 4:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 5:
                                                                                                                                        bVar.L.v.j();
                                                                                                                                        return;
                                                                                                                                    case ig7.b /* 6 */:
                                                                                                                                        bVar.L.v.k();
                                                                                                                                        return;
                                                                                                                                    case 7:
                                                                                                                                        boolean z3 = bVar.d0;
                                                                                                                                        if (z3) {
                                                                                                                                            b.u(bVar);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        qa7 qa7Var = bVar.L;
                                                                                                                                        if (!z3) {
                                                                                                                                            LinearLayout linearLayout7 = qa7Var.i;
                                                                                                                                            linearLayout7.clearAnimation();
                                                                                                                                            linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new ie3(bVar, 1)).start();
                                                                                                                                            bVar.d0 = true;
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 8:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 9:
                                                                                                                                        bVar.A(wc3.WIDTH);
                                                                                                                                        return;
                                                                                                                                    case 10:
                                                                                                                                        bVar.A(wc3.HEIGHT);
                                                                                                                                        return;
                                                                                                                                    default:
                                                                                                                                        bVar.v(true);
                                                                                                                                        return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        button6.setOnTouchListener(new ll1(1, this));
                                                                                                                        button6.setOnClickListener(new View.OnClickListener(this) { // from class: he3
                                                                                                                            public final /* synthetic */ b B;

                                                                                                                            {
                                                                                                                                this.B = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i2 = r2;
                                                                                                                                b bVar = this.B;
                                                                                                                                switch (i2) {
                                                                                                                                    case 0:
                                                                                                                                        bVar.x();
                                                                                                                                        return;
                                                                                                                                    case 1:
                                                                                                                                        bVar.y();
                                                                                                                                        return;
                                                                                                                                    case 2:
                                                                                                                                        LayoutEditorView layoutEditorView2 = bVar.L.v;
                                                                                                                                        hd3 hd3Var = layoutEditorView2.g0;
                                                                                                                                        if (hd3Var != null) {
                                                                                                                                            layoutEditorView2.removeView(hd3Var.a);
                                                                                                                                            layoutEditorView2.getViews().remove(hd3Var.b);
                                                                                                                                            layoutEditorView2.m();
                                                                                                                                            layoutEditorView2.i0 = true;
                                                                                                                                            layoutEditorView2.o();
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 3:
                                                                                                                                        bVar.z();
                                                                                                                                        return;
                                                                                                                                    case 4:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 5:
                                                                                                                                        bVar.L.v.j();
                                                                                                                                        return;
                                                                                                                                    case ig7.b /* 6 */:
                                                                                                                                        bVar.L.v.k();
                                                                                                                                        return;
                                                                                                                                    case 7:
                                                                                                                                        boolean z3 = bVar.d0;
                                                                                                                                        if (z3) {
                                                                                                                                            b.u(bVar);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        qa7 qa7Var = bVar.L;
                                                                                                                                        if (!z3) {
                                                                                                                                            LinearLayout linearLayout7 = qa7Var.i;
                                                                                                                                            linearLayout7.clearAnimation();
                                                                                                                                            linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new ie3(bVar, 1)).start();
                                                                                                                                            bVar.d0 = true;
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 8:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 9:
                                                                                                                                        bVar.A(wc3.WIDTH);
                                                                                                                                        return;
                                                                                                                                    case 10:
                                                                                                                                        bVar.A(wc3.HEIGHT);
                                                                                                                                        return;
                                                                                                                                    default:
                                                                                                                                        bVar.v(true);
                                                                                                                                        return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        button2.setOnClickListener(new View.OnClickListener(this) { // from class: he3
                                                                                                                            public final /* synthetic */ b B;

                                                                                                                            {
                                                                                                                                this.B = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i2 = r2;
                                                                                                                                b bVar = this.B;
                                                                                                                                switch (i2) {
                                                                                                                                    case 0:
                                                                                                                                        bVar.x();
                                                                                                                                        return;
                                                                                                                                    case 1:
                                                                                                                                        bVar.y();
                                                                                                                                        return;
                                                                                                                                    case 2:
                                                                                                                                        LayoutEditorView layoutEditorView2 = bVar.L.v;
                                                                                                                                        hd3 hd3Var = layoutEditorView2.g0;
                                                                                                                                        if (hd3Var != null) {
                                                                                                                                            layoutEditorView2.removeView(hd3Var.a);
                                                                                                                                            layoutEditorView2.getViews().remove(hd3Var.b);
                                                                                                                                            layoutEditorView2.m();
                                                                                                                                            layoutEditorView2.i0 = true;
                                                                                                                                            layoutEditorView2.o();
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 3:
                                                                                                                                        bVar.z();
                                                                                                                                        return;
                                                                                                                                    case 4:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 5:
                                                                                                                                        bVar.L.v.j();
                                                                                                                                        return;
                                                                                                                                    case ig7.b /* 6 */:
                                                                                                                                        bVar.L.v.k();
                                                                                                                                        return;
                                                                                                                                    case 7:
                                                                                                                                        boolean z3 = bVar.d0;
                                                                                                                                        if (z3) {
                                                                                                                                            b.u(bVar);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        qa7 qa7Var = bVar.L;
                                                                                                                                        if (!z3) {
                                                                                                                                            LinearLayout linearLayout7 = qa7Var.i;
                                                                                                                                            linearLayout7.clearAnimation();
                                                                                                                                            linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new ie3(bVar, 1)).start();
                                                                                                                                            bVar.d0 = true;
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 8:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 9:
                                                                                                                                        bVar.A(wc3.WIDTH);
                                                                                                                                        return;
                                                                                                                                    case 10:
                                                                                                                                        bVar.A(wc3.HEIGHT);
                                                                                                                                        return;
                                                                                                                                    default:
                                                                                                                                        bVar.v(true);
                                                                                                                                        return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        button3.setOnClickListener(new View.OnClickListener(this) { // from class: he3
                                                                                                                            public final /* synthetic */ b B;

                                                                                                                            {
                                                                                                                                this.B = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i2 = r2;
                                                                                                                                b bVar = this.B;
                                                                                                                                switch (i2) {
                                                                                                                                    case 0:
                                                                                                                                        bVar.x();
                                                                                                                                        return;
                                                                                                                                    case 1:
                                                                                                                                        bVar.y();
                                                                                                                                        return;
                                                                                                                                    case 2:
                                                                                                                                        LayoutEditorView layoutEditorView2 = bVar.L.v;
                                                                                                                                        hd3 hd3Var = layoutEditorView2.g0;
                                                                                                                                        if (hd3Var != null) {
                                                                                                                                            layoutEditorView2.removeView(hd3Var.a);
                                                                                                                                            layoutEditorView2.getViews().remove(hd3Var.b);
                                                                                                                                            layoutEditorView2.m();
                                                                                                                                            layoutEditorView2.i0 = true;
                                                                                                                                            layoutEditorView2.o();
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 3:
                                                                                                                                        bVar.z();
                                                                                                                                        return;
                                                                                                                                    case 4:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 5:
                                                                                                                                        bVar.L.v.j();
                                                                                                                                        return;
                                                                                                                                    case ig7.b /* 6 */:
                                                                                                                                        bVar.L.v.k();
                                                                                                                                        return;
                                                                                                                                    case 7:
                                                                                                                                        boolean z3 = bVar.d0;
                                                                                                                                        if (z3) {
                                                                                                                                            b.u(bVar);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        qa7 qa7Var = bVar.L;
                                                                                                                                        if (!z3) {
                                                                                                                                            LinearLayout linearLayout7 = qa7Var.i;
                                                                                                                                            linearLayout7.clearAnimation();
                                                                                                                                            linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new ie3(bVar, 1)).start();
                                                                                                                                            bVar.d0 = true;
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 8:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 9:
                                                                                                                                        bVar.A(wc3.WIDTH);
                                                                                                                                        return;
                                                                                                                                    case 10:
                                                                                                                                        bVar.A(wc3.HEIGHT);
                                                                                                                                        return;
                                                                                                                                    default:
                                                                                                                                        bVar.v(true);
                                                                                                                                        return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        layoutEditorView.setLayoutComponentViewBuilderFactory(new e81(1, (byte) 0));
                                                                                                                        layoutEditorView.setOnClickListener(new View.OnClickListener(this) { // from class: he3
                                                                                                                            public final /* synthetic */ b B;

                                                                                                                            {
                                                                                                                                this.B = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i2 = r2;
                                                                                                                                b bVar = this.B;
                                                                                                                                switch (i2) {
                                                                                                                                    case 0:
                                                                                                                                        bVar.x();
                                                                                                                                        return;
                                                                                                                                    case 1:
                                                                                                                                        bVar.y();
                                                                                                                                        return;
                                                                                                                                    case 2:
                                                                                                                                        LayoutEditorView layoutEditorView2 = bVar.L.v;
                                                                                                                                        hd3 hd3Var = layoutEditorView2.g0;
                                                                                                                                        if (hd3Var != null) {
                                                                                                                                            layoutEditorView2.removeView(hd3Var.a);
                                                                                                                                            layoutEditorView2.getViews().remove(hd3Var.b);
                                                                                                                                            layoutEditorView2.m();
                                                                                                                                            layoutEditorView2.i0 = true;
                                                                                                                                            layoutEditorView2.o();
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 3:
                                                                                                                                        bVar.z();
                                                                                                                                        return;
                                                                                                                                    case 4:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 5:
                                                                                                                                        bVar.L.v.j();
                                                                                                                                        return;
                                                                                                                                    case ig7.b /* 6 */:
                                                                                                                                        bVar.L.v.k();
                                                                                                                                        return;
                                                                                                                                    case 7:
                                                                                                                                        boolean z3 = bVar.d0;
                                                                                                                                        if (z3) {
                                                                                                                                            b.u(bVar);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        qa7 qa7Var = bVar.L;
                                                                                                                                        if (!z3) {
                                                                                                                                            LinearLayout linearLayout7 = qa7Var.i;
                                                                                                                                            linearLayout7.clearAnimation();
                                                                                                                                            linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new ie3(bVar, 1)).start();
                                                                                                                                            bVar.d0 = true;
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 8:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 9:
                                                                                                                                        bVar.A(wc3.WIDTH);
                                                                                                                                        return;
                                                                                                                                    case 10:
                                                                                                                                        bVar.A(wc3.HEIGHT);
                                                                                                                                        return;
                                                                                                                                    default:
                                                                                                                                        bVar.v(true);
                                                                                                                                        return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        layoutEditorView.setOnViewSelectedListener(new ej2() { // from class: ke3
                                                                                                                            @Override // defpackage.ej2
                                                                                                                            public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                                                                                                                boolean z3;
                                                                                                                                pe3 pe3Var2;
                                                                                                                                int i2;
                                                                                                                                int i3;
                                                                                                                                int i4;
                                                                                                                                int i5;
                                                                                                                                int i6;
                                                                                                                                int i7;
                                                                                                                                int i8;
                                                                                                                                int i9;
                                                                                                                                int i10;
                                                                                                                                int i11;
                                                                                                                                int i12;
                                                                                                                                int i13;
                                                                                                                                hd3 hd3Var = (hd3) obj;
                                                                                                                                float floatValue = ((Float) obj2).floatValue();
                                                                                                                                float floatValue2 = ((Float) obj3).floatValue();
                                                                                                                                int intValue = ((Integer) obj4).intValue();
                                                                                                                                int intValue2 = ((Integer) obj5).intValue();
                                                                                                                                int intValue3 = ((Integer) obj6).intValue();
                                                                                                                                hd3Var.getClass();
                                                                                                                                b bVar = b.this;
                                                                                                                                b.u(bVar);
                                                                                                                                bVar.v(false);
                                                                                                                                vc3 vc3Var = hd3Var.b;
                                                                                                                                bVar.i0 = vc3Var.isScreen();
                                                                                                                                if (vc3Var != vc3.TOP_SCREEN && vc3Var != vc3.BOTTOM_SCREEN) {
                                                                                                                                    z3 = false;
                                                                                                                                } else {
                                                                                                                                    z3 = true;
                                                                                                                                }
                                                                                                                                bVar.j0 = z3;
                                                                                                                                bVar.k0 = vc3Var;
                                                                                                                                int i14 = a.c[vc3Var.ordinal()];
                                                                                                                                if (i14 != 1) {
                                                                                                                                    if (i14 != 2) {
                                                                                                                                        pe3Var2 = pe3.UNRESTRICTED;
                                                                                                                                    } else {
                                                                                                                                        pe3Var2 = bVar.n0;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    pe3Var2 = bVar.m0;
                                                                                                                                }
                                                                                                                                bVar.l0 = pe3Var2;
                                                                                                                                boolean z4 = bVar.i0;
                                                                                                                                float f = hd3Var.c;
                                                                                                                                boolean z5 = hd3Var.d;
                                                                                                                                qa7 qa7Var = bVar.L;
                                                                                                                                ScrollView scrollView2 = qa7Var.k;
                                                                                                                                CheckBox checkBox2 = qa7Var.e;
                                                                                                                                SeekBar seekBar5 = qa7Var.p;
                                                                                                                                SeekBar seekBar6 = qa7Var.o;
                                                                                                                                SeekBar seekBar7 = qa7Var.q;
                                                                                                                                SeekBar seekBar8 = qa7Var.n;
                                                                                                                                scrollView2.animate().cancel();
                                                                                                                                bVar.f0 = intValue3;
                                                                                                                                bVar.g0 = floatValue;
                                                                                                                                bVar.h0 = floatValue2;
                                                                                                                                bVar.p0 = true;
                                                                                                                                try {
                                                                                                                                    if (z4) {
                                                                                                                                        int i15 = intValue - intValue3;
                                                                                                                                        seekBar7.setMax(i15);
                                                                                                                                        float f2 = i15 * floatValue;
                                                                                                                                        seekBar7.setProgress(io2.m(jv3.X(f2), 0, seekBar7.getMax()));
                                                                                                                                        float f3 = intValue3;
                                                                                                                                        qa7Var.u.setText(String.valueOf(jv3.X(f2 + f3)));
                                                                                                                                        int i16 = intValue2 - intValue3;
                                                                                                                                        seekBar6.setMax(i16);
                                                                                                                                        float f4 = i16 * floatValue2;
                                                                                                                                        seekBar6.setProgress(io2.m(jv3.X(f4), 0, seekBar6.getMax()));
                                                                                                                                        qa7Var.s.setText(String.valueOf(jv3.X(f4 + f3)));
                                                                                                                                    } else {
                                                                                                                                        int min = Math.min(intValue, intValue2) - intValue3;
                                                                                                                                        if (min < 1) {
                                                                                                                                            min = 1;
                                                                                                                                        }
                                                                                                                                        float f5 = intValue3;
                                                                                                                                        int m = io2.m(Math.min(jv3.X(((intValue - intValue3) * floatValue) + f5), jv3.X(((intValue2 - intValue3) * floatValue2) + f5)), intValue3, intValue3 + min);
                                                                                                                                        seekBar5.setMax(min);
                                                                                                                                        seekBar5.setProgress(m - intValue3);
                                                                                                                                        qa7Var.t.setText(String.valueOf(m));
                                                                                                                                    }
                                                                                                                                    seekBar8.setProgress(io2.m(jv3.X(f * 100.0f), 0, seekBar8.getMax()));
                                                                                                                                    checkBox2.setChecked(z5);
                                                                                                                                    bVar.o0 = true;
                                                                                                                                    qa7Var.r.setSelection(bVar.l0.ordinal(), false);
                                                                                                                                    bVar.o0 = false;
                                                                                                                                    bVar.p0 = false;
                                                                                                                                    LinearLayout linearLayout7 = qa7Var.l;
                                                                                                                                    int i17 = 8;
                                                                                                                                    if (!z4) {
                                                                                                                                        i2 = 0;
                                                                                                                                    } else {
                                                                                                                                        i2 = 8;
                                                                                                                                    }
                                                                                                                                    linearLayout7.setVisibility(i2);
                                                                                                                                    if (!z4) {
                                                                                                                                        i3 = 0;
                                                                                                                                    } else {
                                                                                                                                        i3 = 8;
                                                                                                                                    }
                                                                                                                                    seekBar5.setVisibility(i3);
                                                                                                                                    Button button8 = qa7Var.d;
                                                                                                                                    if (!z4) {
                                                                                                                                        i4 = 0;
                                                                                                                                    } else {
                                                                                                                                        i4 = 8;
                                                                                                                                    }
                                                                                                                                    button8.setVisibility(i4);
                                                                                                                                    LinearLayout linearLayout8 = qa7Var.m;
                                                                                                                                    if (z4) {
                                                                                                                                        i5 = 0;
                                                                                                                                    } else {
                                                                                                                                        i5 = 8;
                                                                                                                                    }
                                                                                                                                    linearLayout8.setVisibility(i5);
                                                                                                                                    if (z4) {
                                                                                                                                        i6 = 0;
                                                                                                                                    } else {
                                                                                                                                        i6 = 8;
                                                                                                                                    }
                                                                                                                                    seekBar7.setVisibility(i6);
                                                                                                                                    LinearLayout linearLayout9 = qa7Var.j;
                                                                                                                                    if (z4) {
                                                                                                                                        i7 = 0;
                                                                                                                                    } else {
                                                                                                                                        i7 = 8;
                                                                                                                                    }
                                                                                                                                    linearLayout9.setVisibility(i7);
                                                                                                                                    if (z4) {
                                                                                                                                        i8 = 0;
                                                                                                                                    } else {
                                                                                                                                        i8 = 8;
                                                                                                                                    }
                                                                                                                                    seekBar6.setVisibility(i8);
                                                                                                                                    LinearLayout linearLayout10 = qa7Var.g;
                                                                                                                                    if (z4) {
                                                                                                                                        i9 = 0;
                                                                                                                                    } else {
                                                                                                                                        i9 = 8;
                                                                                                                                    }
                                                                                                                                    linearLayout10.setVisibility(i9);
                                                                                                                                    if (z4) {
                                                                                                                                        i10 = 0;
                                                                                                                                    } else {
                                                                                                                                        i10 = 8;
                                                                                                                                    }
                                                                                                                                    seekBar8.setVisibility(i10);
                                                                                                                                    LinearLayout linearLayout11 = qa7Var.h;
                                                                                                                                    if (bVar.j0) {
                                                                                                                                        i11 = 0;
                                                                                                                                    } else {
                                                                                                                                        i11 = 8;
                                                                                                                                    }
                                                                                                                                    linearLayout11.setVisibility(i11);
                                                                                                                                    if (z4) {
                                                                                                                                        i12 = 0;
                                                                                                                                    } else {
                                                                                                                                        i12 = 8;
                                                                                                                                    }
                                                                                                                                    checkBox2.setVisibility(i12);
                                                                                                                                    Button button9 = qa7Var.b;
                                                                                                                                    if (z4) {
                                                                                                                                        i13 = 0;
                                                                                                                                    } else {
                                                                                                                                        i13 = 8;
                                                                                                                                    }
                                                                                                                                    button9.setVisibility(i13);
                                                                                                                                    Button button10 = qa7Var.c;
                                                                                                                                    if (z4) {
                                                                                                                                        i17 = 0;
                                                                                                                                    }
                                                                                                                                    button10.setVisibility(i17);
                                                                                                                                    if (!bVar.e0) {
                                                                                                                                        scrollView2.setVisibility(0);
                                                                                                                                        scrollView2.post(new ie3(bVar, 4));
                                                                                                                                        bVar.e0 = true;
                                                                                                                                    }
                                                                                                                                    scrollView2.requestFocus();
                                                                                                                                    return o27.a;
                                                                                                                                } catch (Throwable th) {
                                                                                                                                    bVar.p0 = false;
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        layoutEditorView.setOnViewDeselectedListener(new je3(this, 3));
                                                                                                                        layoutEditorView.setOnViewPositionEditRequestedListener(new je3(this, 4));
                                                                                                                        linearLayout5.setOnClickListener(new View.OnClickListener(this) { // from class: he3
                                                                                                                            public final /* synthetic */ b B;

                                                                                                                            {
                                                                                                                                this.B = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i2 = r2;
                                                                                                                                b bVar = this.B;
                                                                                                                                switch (i2) {
                                                                                                                                    case 0:
                                                                                                                                        bVar.x();
                                                                                                                                        return;
                                                                                                                                    case 1:
                                                                                                                                        bVar.y();
                                                                                                                                        return;
                                                                                                                                    case 2:
                                                                                                                                        LayoutEditorView layoutEditorView2 = bVar.L.v;
                                                                                                                                        hd3 hd3Var = layoutEditorView2.g0;
                                                                                                                                        if (hd3Var != null) {
                                                                                                                                            layoutEditorView2.removeView(hd3Var.a);
                                                                                                                                            layoutEditorView2.getViews().remove(hd3Var.b);
                                                                                                                                            layoutEditorView2.m();
                                                                                                                                            layoutEditorView2.i0 = true;
                                                                                                                                            layoutEditorView2.o();
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 3:
                                                                                                                                        bVar.z();
                                                                                                                                        return;
                                                                                                                                    case 4:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 5:
                                                                                                                                        bVar.L.v.j();
                                                                                                                                        return;
                                                                                                                                    case ig7.b /* 6 */:
                                                                                                                                        bVar.L.v.k();
                                                                                                                                        return;
                                                                                                                                    case 7:
                                                                                                                                        boolean z3 = bVar.d0;
                                                                                                                                        if (z3) {
                                                                                                                                            b.u(bVar);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        qa7 qa7Var = bVar.L;
                                                                                                                                        if (!z3) {
                                                                                                                                            LinearLayout linearLayout7 = qa7Var.i;
                                                                                                                                            linearLayout7.clearAnimation();
                                                                                                                                            linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new ie3(bVar, 1)).start();
                                                                                                                                            bVar.d0 = true;
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 8:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 9:
                                                                                                                                        bVar.A(wc3.WIDTH);
                                                                                                                                        return;
                                                                                                                                    case 10:
                                                                                                                                        bVar.A(wc3.HEIGHT);
                                                                                                                                        return;
                                                                                                                                    default:
                                                                                                                                        bVar.v(true);
                                                                                                                                        return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        linearLayout5.setOnTouchListener(new ll1(1, this));
                                                                                                                        seekBar3.setOnSeekBarChangeListener(new le3(0, this));
                                                                                                                        linearLayout6.setOnClickListener(new View.OnClickListener(this) { // from class: he3
                                                                                                                            public final /* synthetic */ b B;

                                                                                                                            {
                                                                                                                                this.B = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i2 = r2;
                                                                                                                                b bVar = this.B;
                                                                                                                                switch (i2) {
                                                                                                                                    case 0:
                                                                                                                                        bVar.x();
                                                                                                                                        return;
                                                                                                                                    case 1:
                                                                                                                                        bVar.y();
                                                                                                                                        return;
                                                                                                                                    case 2:
                                                                                                                                        LayoutEditorView layoutEditorView2 = bVar.L.v;
                                                                                                                                        hd3 hd3Var = layoutEditorView2.g0;
                                                                                                                                        if (hd3Var != null) {
                                                                                                                                            layoutEditorView2.removeView(hd3Var.a);
                                                                                                                                            layoutEditorView2.getViews().remove(hd3Var.b);
                                                                                                                                            layoutEditorView2.m();
                                                                                                                                            layoutEditorView2.i0 = true;
                                                                                                                                            layoutEditorView2.o();
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 3:
                                                                                                                                        bVar.z();
                                                                                                                                        return;
                                                                                                                                    case 4:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 5:
                                                                                                                                        bVar.L.v.j();
                                                                                                                                        return;
                                                                                                                                    case ig7.b /* 6 */:
                                                                                                                                        bVar.L.v.k();
                                                                                                                                        return;
                                                                                                                                    case 7:
                                                                                                                                        boolean z3 = bVar.d0;
                                                                                                                                        if (z3) {
                                                                                                                                            b.u(bVar);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        qa7 qa7Var = bVar.L;
                                                                                                                                        if (!z3) {
                                                                                                                                            LinearLayout linearLayout7 = qa7Var.i;
                                                                                                                                            linearLayout7.clearAnimation();
                                                                                                                                            linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new ie3(bVar, 1)).start();
                                                                                                                                            bVar.d0 = true;
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 8:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 9:
                                                                                                                                        bVar.A(wc3.WIDTH);
                                                                                                                                        return;
                                                                                                                                    case 10:
                                                                                                                                        bVar.A(wc3.HEIGHT);
                                                                                                                                        return;
                                                                                                                                    default:
                                                                                                                                        bVar.v(true);
                                                                                                                                        return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        linearLayout6.setOnTouchListener(new ll1(1, this));
                                                                                                                        seekBar4.setOnSeekBarChangeListener(new le3(1, this));
                                                                                                                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: he3
                                                                                                                            public final /* synthetic */ b B;

                                                                                                                            {
                                                                                                                                this.B = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i2 = r2;
                                                                                                                                b bVar = this.B;
                                                                                                                                switch (i2) {
                                                                                                                                    case 0:
                                                                                                                                        bVar.x();
                                                                                                                                        return;
                                                                                                                                    case 1:
                                                                                                                                        bVar.y();
                                                                                                                                        return;
                                                                                                                                    case 2:
                                                                                                                                        LayoutEditorView layoutEditorView2 = bVar.L.v;
                                                                                                                                        hd3 hd3Var = layoutEditorView2.g0;
                                                                                                                                        if (hd3Var != null) {
                                                                                                                                            layoutEditorView2.removeView(hd3Var.a);
                                                                                                                                            layoutEditorView2.getViews().remove(hd3Var.b);
                                                                                                                                            layoutEditorView2.m();
                                                                                                                                            layoutEditorView2.i0 = true;
                                                                                                                                            layoutEditorView2.o();
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 3:
                                                                                                                                        bVar.z();
                                                                                                                                        return;
                                                                                                                                    case 4:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 5:
                                                                                                                                        bVar.L.v.j();
                                                                                                                                        return;
                                                                                                                                    case ig7.b /* 6 */:
                                                                                                                                        bVar.L.v.k();
                                                                                                                                        return;
                                                                                                                                    case 7:
                                                                                                                                        boolean z3 = bVar.d0;
                                                                                                                                        if (z3) {
                                                                                                                                            b.u(bVar);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        qa7 qa7Var = bVar.L;
                                                                                                                                        if (!z3) {
                                                                                                                                            LinearLayout linearLayout7 = qa7Var.i;
                                                                                                                                            linearLayout7.clearAnimation();
                                                                                                                                            linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new ie3(bVar, 1)).start();
                                                                                                                                            bVar.d0 = true;
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 8:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 9:
                                                                                                                                        bVar.A(wc3.WIDTH);
                                                                                                                                        return;
                                                                                                                                    case 10:
                                                                                                                                        bVar.A(wc3.HEIGHT);
                                                                                                                                        return;
                                                                                                                                    default:
                                                                                                                                        bVar.v(true);
                                                                                                                                        return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        linearLayout4.setOnTouchListener(new ll1(1, this));
                                                                                                                        seekBar2.setOnSeekBarChangeListener(new le3(2, this));
                                                                                                                        seekBar.setOnSeekBarChangeListener(new le3(3, this));
                                                                                                                        ArrayAdapter arrayAdapter = new ArrayAdapter(contextWrapper, 17367048, l07.c0(getResources().getString(R.string.aspect_ratio_4_3), getResources().getString(R.string.aspect_ratio_16_9), getResources().getString(R.string.aspect_ratio_unrestricted)));
                                                                                                                        arrayAdapter.setDropDownViewResource(17367049);
                                                                                                                        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                                                                                                                        spinner.setOnItemSelectedListener(new gl1(1, this));
                                                                                                                        checkBox.setOnCheckedChangeListener(new zn0(2, this));
                                                                                                                        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: he3
                                                                                                                            public final /* synthetic */ b B;

                                                                                                                            {
                                                                                                                                this.B = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                int i2 = r2;
                                                                                                                                b bVar = this.B;
                                                                                                                                switch (i2) {
                                                                                                                                    case 0:
                                                                                                                                        bVar.x();
                                                                                                                                        return;
                                                                                                                                    case 1:
                                                                                                                                        bVar.y();
                                                                                                                                        return;
                                                                                                                                    case 2:
                                                                                                                                        LayoutEditorView layoutEditorView2 = bVar.L.v;
                                                                                                                                        hd3 hd3Var = layoutEditorView2.g0;
                                                                                                                                        if (hd3Var != null) {
                                                                                                                                            layoutEditorView2.removeView(hd3Var.a);
                                                                                                                                            layoutEditorView2.getViews().remove(hd3Var.b);
                                                                                                                                            layoutEditorView2.m();
                                                                                                                                            layoutEditorView2.i0 = true;
                                                                                                                                            layoutEditorView2.o();
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 3:
                                                                                                                                        bVar.z();
                                                                                                                                        return;
                                                                                                                                    case 4:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 5:
                                                                                                                                        bVar.L.v.j();
                                                                                                                                        return;
                                                                                                                                    case ig7.b /* 6 */:
                                                                                                                                        bVar.L.v.k();
                                                                                                                                        return;
                                                                                                                                    case 7:
                                                                                                                                        boolean z3 = bVar.d0;
                                                                                                                                        if (z3) {
                                                                                                                                            b.u(bVar);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        qa7 qa7Var = bVar.L;
                                                                                                                                        if (!z3) {
                                                                                                                                            LinearLayout linearLayout7 = qa7Var.i;
                                                                                                                                            linearLayout7.clearAnimation();
                                                                                                                                            linearLayout7.animate().y(linearLayout7.getBottom() - linearLayout7.getHeight()).setDuration(100L).withStartAction(new ie3(bVar, 1)).start();
                                                                                                                                            bVar.d0 = true;
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                    case 8:
                                                                                                                                        bVar.A(wc3.SIZE);
                                                                                                                                        return;
                                                                                                                                    case 9:
                                                                                                                                        bVar.A(wc3.WIDTH);
                                                                                                                                        return;
                                                                                                                                    case 10:
                                                                                                                                        bVar.A(wc3.HEIGHT);
                                                                                                                                        return;
                                                                                                                                    default:
                                                                                                                                        bVar.v(true);
                                                                                                                                        return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        v(false);
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
            }
        }
        c44.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    public static void a(b bVar, String str) {
        str.getClass();
        bVar.getViewModel().i(str);
        oe3 oe3Var = bVar.c0;
        if (oe3Var != null) {
            LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) ((ka3) oe3Var).B;
            int i = LayoutEditorActivity.M0;
            layoutEditorActivity.C();
            bf3 B = layoutEditorActivity.B();
            nd3 nd3Var = (nd3) B.i.getValue();
            if (nd3Var != null) {
                tq5.w(ua7.a(B), null, null, new ze3(B, nd3Var, null, 1), 3);
            }
            layoutEditorActivity.finish();
        }
    }

    public static void b(b bVar, String str, kd3 kd3Var, boolean z, int i) {
        kd3Var.getClass();
        bf3 viewModel = bVar.getViewModel();
        viewModel.getClass();
        ee6 ee6Var = viewModel.i;
        nd3 nd3Var = (nd3) ee6Var.getValue();
        if (nd3Var != null) {
            ee6Var.l(null, nd3.a(nd3Var, null, str, null, kd3Var, z, i, null, 69));
        }
        bVar.setShowLayoutPropertiesDialog(false);
    }

    public static void c(b bVar) {
        bVar.setShownEditablePropertyDialog(null);
        bVar.v0 = null;
    }

    public static void d(b bVar, cd3 cd3Var) {
        cd3Var.getClass();
        bVar.w0 = cd3Var.a;
        bVar.setShownPositionDialog(cd3Var);
    }

    public static void e(b bVar) {
        k17 k17Var;
        bf3 viewModel = bVar.getViewModel();
        ug3 ug3Var = bVar.A;
        viewModel.getClass();
        ug3Var.getClass();
        m41 m41Var = (m41) viewModel.p.A.getValue();
        tc3 tc3Var = null;
        if (m41Var != null) {
            k17Var = m41Var.a;
        } else {
            k17Var = null;
        }
        int i = ve3.a[ug3Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ee6 ee6Var = viewModel.s;
                if (k17Var != null) {
                    mv5 mv5Var = k17Var.b;
                    tc3Var = new tc3(mv5Var.a, mv5Var.b);
                }
                ee6Var.k(tc3Var);
            } else {
                i.c();
                return;
            }
        } else {
            ee6 ee6Var2 = viewModel.q;
            if (k17Var != null) {
                mv5 mv5Var2 = k17Var.a;
                tc3Var = new tc3(mv5Var2.a, mv5Var2.b);
            }
            ee6Var2.k(tc3Var);
        }
        bVar.setShowBackgroundPropertiesDialog(false);
    }

    public static void f(b bVar, String str) {
        str.getClass();
        bVar.getViewModel().i(str);
        oe3 oe3Var = bVar.c0;
        if (oe3Var != null) {
            ((ka3) oe3Var).D();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(me.magnum.melonds.ui.layouteditor.b r18) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.layouteditor.b.g(me.magnum.melonds.ui.layouteditor.b):void");
    }

    private final List<LayoutEditorActivity.a> getMenuOptions() {
        ip3 C = l07.C();
        C.add(LayoutEditorActivity.a.PROPERTIES);
        C.add(LayoutEditorActivity.a.BACKGROUNDS);
        C.add(LayoutEditorActivity.a.REVERT);
        C.add(LayoutEditorActivity.a.RESET);
        bf3 viewModel = getViewModel();
        if (viewModel.f != null && viewModel.i.getValue() != null) {
            C.add(LayoutEditorActivity.a.SAVE_AS_NEW);
        }
        C.add(LayoutEditorActivity.a.SAVE_AND_EXIT);
        C.add(LayoutEditorActivity.a.EXIT_WITHOUT_SAVING);
        return l07.t(C);
    }

    private final boolean getShowBackgroundPropertiesDialog() {
        return ((Boolean) this.r0.getValue()).booleanValue();
    }

    private final boolean getShowLayoutPropertiesDialog() {
        return ((Boolean) this.q0.getValue()).booleanValue();
    }

    private final wc3 getShownEditablePropertyDialog() {
        return (wc3) this.s0.getValue();
    }

    private final cd3 getShownPositionDialog() {
        return (cd3) this.t0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bf3 getViewModel() {
        return (bf3) this.R.getValue();
    }

    public static void h(b bVar, wc3 wc3Var, int i) {
        int i2;
        boolean p;
        qa7 qa7Var = bVar.L;
        vc3 vc3Var = bVar.v0;
        if (vc3Var != null || (vc3Var = qa7Var.v.getSelectedComponent()) != null) {
            int i3 = 1;
            bVar.p0 = true;
            if (wc3Var == null) {
                i2 = -1;
            } else {
                try {
                    i2 = a.b[wc3Var.ordinal()];
                } catch (Throwable th) {
                    bVar.p0 = false;
                    throw th;
                }
            }
            if (i2 != -1) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            SeekBar seekBar = qa7Var.o;
                            seekBar.setProgress(io2.m(i - bVar.f0, 0, seekBar.getMax()));
                            bVar.q(bVar.l0, ne3.HEIGHT);
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        SeekBar seekBar2 = qa7Var.q;
                        seekBar2.setProgress(io2.m(i - bVar.f0, 0, seekBar2.getMax()));
                        bVar.q(bVar.l0, ne3.WIDTH);
                    }
                } else {
                    SeekBar seekBar3 = qa7Var.p;
                    seekBar3.setProgress(io2.m(i - bVar.f0, 0, seekBar3.getMax()));
                }
                bVar.p0 = false;
                int i4 = a.b[wc3Var.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2 && i4 != 3) {
                        i.c();
                        return;
                    }
                    p = qa7Var.v.q(vc3Var, bVar.g0, bVar.h0);
                } else {
                    int max = qa7Var.p.getMax();
                    if (max >= 1) {
                        i3 = max;
                    }
                    p = qa7Var.v.p(vc3Var, qa7Var.p.getProgress() / i3);
                }
                if (p) {
                    oe3 oe3Var = bVar.c0;
                    if (oe3Var != null) {
                        int i5 = LayoutEditorActivity.M0;
                        ((LayoutEditorActivity) ((ka3) oe3Var).B).C();
                    }
                    bVar.r(vc3Var);
                }
            } else {
                bVar.p0 = false;
            }
        }
        bVar.setShownEditablePropertyDialog(null);
        bVar.v0 = null;
    }

    public static void i(b bVar, List list, int i) {
        Object value;
        nd3 nd3Var;
        uq6 uq6Var = bVar.x0;
        String str = null;
        switch (a.d[((LayoutEditorActivity.a) list.get(i)).ordinal()]) {
            case 1:
                oe3 oe3Var = bVar.c0;
                if (oe3Var != null) {
                    int i2 = LayoutEditorActivity.M0;
                    ((LayoutEditorActivity) ((ka3) oe3Var).B).C();
                }
                bVar.setShowLayoutPropertiesDialog(true);
                return;
            case 2:
                oe3 oe3Var2 = bVar.c0;
                if (oe3Var2 != null) {
                    int i3 = LayoutEditorActivity.M0;
                    ((LayoutEditorActivity) ((ka3) oe3Var2).B).C();
                }
                bVar.setShowBackgroundPropertiesDialog(true);
                return;
            case 3:
                bf3 viewModel = bVar.getViewModel();
                viewModel.i.k(viewModel.g);
                return;
            case 4:
                ee6 ee6Var = bVar.getViewModel().i;
                do {
                    value = ee6Var.getValue();
                    nd3 nd3Var2 = (nd3) value;
                    if (nd3Var2 != null) {
                        nd3Var = nd3.a(nd3Var2, null, null, null, kd3.FOLLOW_SYSTEM, false, 50, qp1.A, 7);
                    } else {
                        nd3Var = null;
                    }
                } while (!ee6Var.j(value, nd3Var));
                return;
            case 5:
                nd3 nd3Var3 = (nd3) bVar.getViewModel().i.getValue();
                if (nd3Var3 != null) {
                    str = nd3Var3.b;
                }
                if (str != null) {
                    if (zg6.B0(str)) {
                        str = bVar.getResources().getString(R.string.custom_layout_default_name);
                        str.getClass();
                    }
                } else {
                    str = bVar.getResources().getString(R.string.custom_layout_default_name);
                    str.getClass();
                }
                uq6.c(uq6Var, str, new je3(bVar, 0));
                return;
            case ig7.b /* 6 */:
                nd3 nd3Var4 = (nd3) bVar.getViewModel().i.getValue();
                if (nd3Var4 != null) {
                    str = nd3Var4.b;
                }
                if (str != null && str.length() != 0) {
                    oe3 oe3Var3 = bVar.c0;
                    if (oe3Var3 != null) {
                        ((ka3) oe3Var3).D();
                        return;
                    }
                    return;
                }
                String string = bVar.getResources().getString(R.string.custom_layout_default_name);
                string.getClass();
                uq6.c(uq6Var, string, new je3(bVar, 1));
                return;
            case 7:
                oe3 oe3Var4 = bVar.c0;
                if (oe3Var4 != null) {
                    ((LayoutEditorActivity) ((ka3) oe3Var4).B).finish();
                    return;
                }
                return;
            default:
                i.c();
                return;
        }
    }

    public static void j(b bVar, tu0 tu0Var, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int max;
        int i7;
        int progress;
        int i8;
        k24 x;
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        sk2 sk2Var = (sk2) tu0Var;
        if (sk2Var.O(i & 1, z)) {
            boolean showLayoutPropertiesDialog = bVar.getShowLayoutPropertiesDialog();
            qa7 qa7Var = bVar.L;
            Object obj = su0.a;
            if (showLayoutPropertiesDialog) {
                sk2Var.X(-233234850);
                nd3 nd3Var = (nd3) l.x(bVar.getViewModel().j, sk2Var).getValue();
                if (nd3Var != null) {
                    sk2Var.X(-232995282);
                    boolean h = sk2Var.h(bVar);
                    Object L = sk2Var.L();
                    if (h || L == obj) {
                        L = new fe3(bVar, 1);
                        sk2Var.h0(L);
                    }
                    ki2 ki2Var = (ki2) L;
                    boolean h2 = sk2Var.h(bVar);
                    Object L2 = sk2Var.L();
                    if (h2 || L2 == obj) {
                        L2 = new ti(3, bVar);
                        sk2Var.h0(L2);
                    }
                    gk2.g(nd3Var, ki2Var, (cj2) L2, sk2Var, 0);
                    sk2Var.p(false);
                } else {
                    sk2Var.X(-232424448);
                    sk2Var.p(false);
                }
                sk2Var.p(false);
            } else {
                sk2Var.X(-232402624);
                sk2Var.p(false);
            }
            if (bVar.getShowBackgroundPropertiesDialog()) {
                sk2Var.X(-232292140);
                int i9 = a.a[bVar.A.ordinal()];
                if (i9 != 1) {
                    if (i9 == 2) {
                        sk2Var.X(962346271);
                        x = l.x((ce6) bVar.getViewModel().t.getValue(), sk2Var);
                        sk2Var.p(false);
                    } else {
                        throw ej6.d(sk2Var, 962338361, false);
                    }
                } else {
                    sk2Var.X(962341887);
                    x = l.x((ce6) bVar.getViewModel().r.getValue(), sk2Var);
                    sk2Var.p(false);
                }
                tc3 tc3Var = (tc3) x.getValue();
                if (tc3Var != null) {
                    sk2Var.X(-231801751);
                    UUID uuid = tc3Var.a;
                    BackgroundMode backgroundMode = tc3Var.b;
                    boolean h3 = sk2Var.h(bVar);
                    Object L3 = sk2Var.L();
                    if (h3 || L3 == obj) {
                        L3 = new ba1(bVar, null, 19);
                        sk2Var.h0(L3);
                    }
                    aj2 aj2Var = (aj2) L3;
                    boolean h4 = sk2Var.h(bVar) | sk2Var.h(tc3Var);
                    Object L4 = sk2Var.L();
                    if (h4 || L4 == obj) {
                        L4 = new jd2(7, bVar, tc3Var);
                        sk2Var.h0(L4);
                    }
                    ki2 ki2Var2 = (ki2) L4;
                    boolean h5 = sk2Var.h(bVar);
                    Object L5 = sk2Var.L();
                    if (h5 || L5 == obj) {
                        L5 = new je3(bVar, 2);
                        sk2Var.h0(L5);
                    }
                    mi2 mi2Var = (mi2) L5;
                    boolean h6 = sk2Var.h(bVar);
                    Object L6 = sk2Var.L();
                    if (h6 || L6 == obj) {
                        L6 = new fe3(bVar, 2);
                        sk2Var.h0(L6);
                    }
                    ki2 ki2Var3 = (ki2) L6;
                    boolean h7 = sk2Var.h(bVar);
                    Object L7 = sk2Var.L();
                    if (h7 || L7 == obj) {
                        L7 = new fe3(bVar, 3);
                        sk2Var.h0(L7);
                    }
                    i2 = 3;
                    sn2.b(uuid, backgroundMode, aj2Var, ki2Var2, mi2Var, ki2Var3, (ki2) L7, sk2Var, 0);
                    sk2Var.p(false);
                } else {
                    i2 = 3;
                    sk2Var.X(-230672576);
                    sk2Var.p(false);
                }
                sk2Var.p(false);
            } else {
                i2 = 3;
                sk2Var.X(-230650752);
                sk2Var.p(false);
            }
            wc3 shownEditablePropertyDialog = bVar.getShownEditablePropertyDialog();
            int i10 = -1;
            if (shownEditablePropertyDialog == null) {
                i3 = -1;
            } else {
                i3 = a.b[shownEditablePropertyDialog.ordinal()];
            }
            if (i3 != -1) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == i2) {
                            progress = qa7Var.o.getProgress();
                            i8 = bVar.f0;
                        } else {
                            i.c();
                            return;
                        }
                    } else {
                        progress = qa7Var.q.getProgress();
                        i8 = bVar.f0;
                    }
                } else {
                    progress = qa7Var.p.getProgress();
                    i8 = bVar.f0;
                }
                i4 = progress + i8;
            } else {
                i4 = 0;
            }
            int i11 = bVar.f0;
            if (shownEditablePropertyDialog == null) {
                i5 = -1;
            } else {
                i5 = a.b[shownEditablePropertyDialog.ordinal()];
            }
            if (i5 != -1) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == i2) {
                            max = qa7Var.o.getMax();
                            i7 = bVar.f0;
                        } else {
                            i.c();
                            return;
                        }
                    } else {
                        max = qa7Var.q.getMax();
                        i7 = bVar.f0;
                    }
                } else {
                    max = qa7Var.p.getMax();
                    i7 = bVar.f0;
                }
                i6 = max + i7;
            } else {
                i6 = bVar.f0;
            }
            boolean h8 = sk2Var.h(bVar);
            if (shownEditablePropertyDialog != null) {
                i10 = shownEditablePropertyDialog.ordinal();
            }
            boolean d = h8 | sk2Var.d(i10);
            Object L8 = sk2Var.L();
            if (d || L8 == obj) {
                L8 = new gi2(8, bVar, shownEditablePropertyDialog);
                sk2Var.h0(L8);
            }
            mi2 mi2Var2 = (mi2) L8;
            boolean h9 = sk2Var.h(bVar);
            Object L9 = sk2Var.L();
            if (h9 || L9 == obj) {
                L9 = new fe3(bVar, 4);
                sk2Var.h0(L9);
            }
            ep2.a(shownEditablePropertyDialog, i4, i11, i6, mi2Var2, (ki2) L9, sk2Var, 0);
            cd3 shownPositionDialog = bVar.getShownPositionDialog();
            boolean h10 = sk2Var.h(bVar);
            Object L10 = sk2Var.L();
            if (h10 || L10 == obj) {
                L10 = new fe3(bVar, 5);
                sk2Var.h0(L10);
            }
            ki2 ki2Var4 = (ki2) L10;
            boolean h11 = sk2Var.h(bVar);
            Object L11 = sk2Var.L();
            if (h11 || L11 == obj) {
                L11 = new ge3(bVar, 2);
                sk2Var.h0(L11);
            }
            oo2.e(shownPositionDialog, ki2Var4, (aj2) L11, sk2Var, 0);
            ep2.f(me2.X(sk2Var, R.string.layout_name), bVar.x0, null, null, sk2Var, 0, 12);
            return;
        }
        sk2Var.R();
    }

    public static void k(b bVar, int i, int i2) {
        vc3 vc3Var = bVar.w0;
        if (vc3Var == null) {
            cd3 shownPositionDialog = bVar.getShownPositionDialog();
            if (shownPositionDialog != null) {
                vc3Var = shownPositionDialog.a;
            } else {
                vc3Var = null;
            }
        }
        if (vc3Var != null) {
            LayoutEditorView layoutEditorView = bVar.L.v;
            hd3 hd3Var = layoutEditorView.getViews().get(vc3Var);
            if (hd3Var != null) {
                View view = hd3Var.a;
                int m = io2.m(i, 0, Math.max(layoutEditorView.getWidth() - view.getWidth(), 0));
                int m2 = io2.m(i2, 0, Math.max(layoutEditorView.getHeight() - view.getHeight(), 0));
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.leftMargin = m;
                    layoutParams2.topMargin = m2;
                    view.setLayoutParams(layoutParams2);
                    layoutEditorView.i0 = true;
                    layoutEditorView.o();
                    oe3 oe3Var = bVar.c0;
                    if (oe3Var != null) {
                        int i3 = LayoutEditorActivity.M0;
                        ((LayoutEditorActivity) ((ka3) oe3Var).B).C();
                    }
                    bVar.r(vc3Var);
                } else {
                    c44.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    return;
                }
            }
        }
        bVar.setShownPositionDialog(null);
        bVar.w0 = null;
    }

    public static void l(b bVar) {
        bVar.setShowLayoutPropertiesDialog(false);
    }

    public static void m(b bVar, BackgroundMode backgroundMode) {
        Object value;
        tc3 tc3Var;
        Object value2;
        tc3 tc3Var2;
        backgroundMode.getClass();
        bf3 viewModel = bVar.getViewModel();
        ug3 ug3Var = bVar.A;
        viewModel.getClass();
        ug3Var.getClass();
        int i = ve3.a[ug3Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ee6 ee6Var = viewModel.s;
                do {
                    value2 = ee6Var.getValue();
                    tc3 tc3Var3 = (tc3) value2;
                    if (tc3Var3 != null) {
                        tc3Var2 = tc3.a(tc3Var3, null, backgroundMode, 1);
                    } else {
                        tc3Var2 = null;
                    }
                } while (!ee6Var.j(value2, tc3Var2));
                return;
            }
            i.c();
            return;
        }
        ee6 ee6Var2 = viewModel.q;
        do {
            value = ee6Var2.getValue();
            tc3 tc3Var4 = (tc3) value;
            if (tc3Var4 != null) {
                tc3Var = tc3.a(tc3Var4, null, backgroundMode, 1);
            } else {
                tc3Var = null;
            }
        } while (!ee6Var2.j(value, tc3Var));
    }

    public static void n(b bVar) {
        bVar.setShownPositionDialog(null);
        bVar.w0 = null;
    }

    private final void setShowBackgroundPropertiesDialog(boolean z) {
        this.r0.setValue(Boolean.valueOf(z));
    }

    private final void setShowLayoutPropertiesDialog(boolean z) {
        this.q0.setValue(Boolean.valueOf(z));
    }

    private final void setShownEditablePropertyDialog(wc3 wc3Var) {
        this.s0.setValue(wc3Var);
    }

    private final void setShownPositionDialog(cd3 cd3Var) {
        this.t0.setValue(cd3Var);
    }

    public static void u(b bVar) {
        qa7 qa7Var = bVar.L;
        if (!bVar.d0) {
            return;
        }
        LinearLayout linearLayout = qa7Var.i;
        linearLayout.clearAnimation();
        linearLayout.animate().y(linearLayout.getBottom()).setDuration(100L).withEndAction(new ie3(bVar, 2)).start();
        bVar.d0 = false;
    }

    public final void A(wc3 wc3Var) {
        vc3 vc3Var = this.u0;
        if (vc3Var == null) {
            vc3Var = this.L.v.getSelectedComponent();
        }
        this.u0 = null;
        if (vc3Var == null) {
            return;
        }
        this.v0 = vc3Var;
        setShownEditablePropertyDialog(wc3Var);
    }

    public final hv5 B() {
        return new hv5(getShowLayoutPropertiesDialog(), getShowBackgroundPropertiesDialog());
    }

    public final void C(sb sbVar) {
        tb l = sbVar.l();
        Window window = l.getWindow();
        if (window != null) {
            window.setType(1003);
            window.getAttributes().token = getWindowToken();
        }
        l.show();
    }

    public final void D(bs5 bs5Var) {
        Uri uri;
        Bitmap bitmap;
        bs5Var.getClass();
        vy vyVar = bs5Var.a;
        if (vyVar != null) {
            uri = vyVar.c;
        } else {
            uri = null;
        }
        nn4 nn4Var = this.B;
        nn4Var.getClass();
        ab5 ab5Var = new ab5(nn4Var, uri);
        ImageView imageView = this.L.f;
        k91 k91Var = new k91(this, bs5Var);
        ci3 ci3Var = ab5Var.a;
        Uri uri2 = (Uri) ci3Var.B;
        System.nanoTime();
        StringBuilder sb = e67.a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            if (uri2 == null) {
                nn4Var.a(imageView);
                int i = on4.e;
                imageView.setImageDrawable(null);
                if (imageView.getDrawable() instanceof Animatable) {
                    ((Animatable) imageView.getDrawable()).start();
                    return;
                }
                return;
            }
            ab5.b.getAndIncrement();
            if (((mn4) ci3Var.L) == null) {
                ci3Var.L = mn4.NORMAL;
            }
            n85 n85Var = new n85(uri2, (mn4) ci3Var.L);
            StringBuilder sb2 = e67.a;
            String uri3 = uri2.toString();
            sb2.ensureCapacity(uri3.length() + 50);
            sb2.append(uri3);
            sb2.append('\n');
            String sb3 = sb2.toString();
            sb2.setLength(0);
            if (qw3.shouldReadFromMemoryCache(0)) {
                ts3 ts3Var = (ts3) ((ss3) nn4Var.d.B).get(sb3);
                if (ts3Var != null) {
                    bitmap = ts3Var.a;
                } else {
                    bitmap = null;
                }
                af6 af6Var = nn4Var.e;
                if (bitmap != null) {
                    af6Var.b.sendEmptyMessage(0);
                } else {
                    af6Var.b.sendEmptyMessage(1);
                }
                if (bitmap != null) {
                    nn4Var.a(imageView);
                    Context context = nn4Var.b;
                    ln4 ln4Var = ln4.MEMORY;
                    int i2 = on4.e;
                    Drawable drawable = imageView.getDrawable();
                    if (drawable instanceof Animatable) {
                        ((Animatable) drawable).stop();
                    }
                    imageView.setImageDrawable(new on4(context, bitmap, drawable, ln4Var));
                    k91Var.J();
                    return;
                }
            }
            int i3 = on4.e;
            imageView.setImageDrawable(null);
            if (imageView.getDrawable() instanceof Animatable) {
                ((Animatable) imageView.getDrawable()).start();
            }
            nn4Var.c(new ex2(nn4Var, imageView, n85Var, sb3, k91Var));
            return;
        }
        i.n("Method call should happen from the main thread.");
    }

    public final ImageView getImageBackground() {
        return this.L.f;
    }

    public final LayoutEditorView getLayoutEditorView() {
        return this.L.v;
    }

    public final oe3 getListener() {
        return this.c0;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (t(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void p(boolean z) {
        int i;
        qa7 qa7Var = this.L;
        LayoutEditorView layoutEditorView = qa7Var.v;
        SeekBar seekBar = qa7Var.o;
        SeekBar seekBar2 = qa7Var.q;
        if (layoutEditorView.g0 == null || !this.e0) {
            return;
        }
        int i2 = 1;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        int max = seekBar2.getMax() / 40;
        if (max < 1) {
            max = 1;
        }
        this.p0 = true;
        try {
            seekBar2.setProgress(io2.m((max * i) + seekBar2.getProgress(), 0, seekBar2.getMax()));
            this.g0 = seekBar2.getProgress() / seekBar2.getMax();
            qa7Var.u.setText(String.valueOf((int) ((seekBar2.getMax() * this.g0) + this.f0)));
            if (this.i0 && this.l0.getRatio() != null) {
                q(this.l0, ne3.WIDTH);
            } else {
                int max2 = seekBar.getMax() / 40;
                if (max2 >= 1) {
                    i2 = max2;
                }
                seekBar.setProgress(io2.m((i * i2) + seekBar.getProgress(), 0, seekBar.getMax()));
                this.h0 = seekBar.getProgress() / seekBar.getMax();
                qa7Var.s.setText(String.valueOf((int) ((seekBar.getMax() * this.h0) + this.f0)));
            }
            this.p0 = false;
            qa7Var.v.t(this.g0, this.h0);
        } catch (Throwable th) {
            this.p0 = false;
            throw th;
        }
    }

    public final void q(pe3 pe3Var, ne3 ne3Var) {
        float progress;
        float f;
        Float ratio = pe3Var.getRatio();
        if (ratio != null) {
            float floatValue = ratio.floatValue();
            qa7 qa7Var = this.L;
            SeekBar seekBar = qa7Var.q;
            SeekBar seekBar2 = qa7Var.q;
            SeekBar seekBar3 = qa7Var.o;
            float max = seekBar.getMax() / seekBar3.getMax();
            int i = a.e[ne3Var.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    f = seekBar3.getProgress() + this.f0;
                    progress = f * floatValue;
                } else {
                    i.c();
                    return;
                }
            } else {
                progress = this.f0 + seekBar2.getProgress();
                f = progress / floatValue;
            }
            float floatValue2 = pe3Var.getRatio().floatValue() * this.f0;
            float f2 = this.f0;
            float min = Math.min(seekBar2.getMax() + this.f0, (seekBar3.getMax() + this.f0) * floatValue);
            float min2 = Math.min(seekBar3.getMax() + this.f0, (seekBar2.getMax() + this.f0) / floatValue);
            if (progress < floatValue2) {
                f = floatValue2 / floatValue;
                progress = floatValue2;
            }
            if (f < f2) {
                progress = f2 * floatValue;
            } else {
                f2 = f;
            }
            if (max > floatValue) {
                if (progress > min) {
                    min2 = min / floatValue;
                }
                min = progress;
                min2 = f2;
            } else {
                if (f2 > min2) {
                    min = min2 * floatValue;
                }
                min = progress;
                min2 = f2;
            }
            float l = io2.l((min - this.f0) / seekBar2.getMax(), RecyclerView.A1, 1.0f);
            this.g0 = l;
            seekBar2.setProgress((int) (l * seekBar2.getMax()));
            qa7Var.u.setText(String.valueOf((int) ((seekBar2.getMax() * this.g0) + this.f0)));
            float l2 = io2.l((min2 - this.f0) / seekBar3.getMax(), RecyclerView.A1, 1.0f);
            this.h0 = l2;
            seekBar3.setProgress((int) (l2 * seekBar3.getMax()));
            qa7Var.s.setText(String.valueOf((int) ((seekBar3.getMax() * this.h0) + this.f0)));
        }
    }

    public final void r(vc3 vc3Var) {
        LayoutEditorView layoutEditorView = this.L.v;
        hd3 hd3Var = layoutEditorView.getViews().get(vc3Var);
        if (hd3Var != null && hd3Var != layoutEditorView.g0) {
            hd3Var.a.setAlpha(0.5f);
            hd3Var.c(false);
            mi2 mi2Var = layoutEditorView.c0;
            if (mi2Var != null) {
                mi2Var.n(hd3Var);
            }
        }
        layoutEditorView.m();
        v(true);
    }

    public final void s() {
        if (this.e0) {
            v(true);
        } else {
            y();
        }
    }

    public final void setListener(oe3 oe3Var) {
        this.c0 = oe3Var;
    }

    public final boolean t(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && !w()) {
            qa7 qa7Var = this.L;
            LayoutEditorView layoutEditorView = qa7Var.v;
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 66) {
                if (keyCode != 82 && keyCode != 108) {
                    if (keyCode != 96) {
                        if (keyCode != 97) {
                            switch (keyCode) {
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                    hd3 hd3Var = layoutEditorView.g0;
                                    if (hd3Var != null) {
                                        if (hd3Var != null) {
                                            float width = layoutEditorView.getWidth() / 100.0f;
                                            float f = 3.0f;
                                            if (width < 3.0f) {
                                                width = 3.0f;
                                            }
                                            float height = layoutEditorView.getHeight() / 100.0f;
                                            if (height >= 3.0f) {
                                                f = height;
                                            }
                                            switch (keyEvent.getKeyCode()) {
                                                case 19:
                                                    layoutEditorView.n(hd3Var, RecyclerView.A1, -f);
                                                    return true;
                                                case 20:
                                                    layoutEditorView.n(hd3Var, RecyclerView.A1, f);
                                                    return true;
                                                case 21:
                                                    layoutEditorView.n(hd3Var, -width, RecyclerView.A1);
                                                    return true;
                                                case 22:
                                                    layoutEditorView.n(hd3Var, width, RecyclerView.A1);
                                                    return true;
                                            }
                                        }
                                        return true;
                                    }
                                    layoutEditorView.l(true);
                                    return true;
                                case 23:
                                    break;
                                default:
                                    switch (keyCode) {
                                        case 102:
                                            return layoutEditorView.l(false);
                                        case 103:
                                            return layoutEditorView.l(true);
                                        case 104:
                                            p(false);
                                            return true;
                                        case 105:
                                            p(true);
                                            return true;
                                    }
                            }
                        } else if (layoutEditorView.g0 != null) {
                            layoutEditorView.m();
                            return true;
                        } else {
                            s();
                            return true;
                        }
                    }
                } else {
                    y();
                    return true;
                }
            }
            if (layoutEditorView.g0 != null) {
                LayoutEditorView layoutEditorView2 = qa7Var.v;
                if (layoutEditorView2.g0 != null) {
                    List<Number> c0 = l07.c0(Integer.valueOf((int) R.string.label_position), Integer.valueOf((int) R.string.label_size), Integer.valueOf((int) R.string.center_horizontal), Integer.valueOf((int) R.string.center_vertical), Integer.valueOf((int) R.string.delete));
                    sb sbVar = new sb(new ContextThemeWrapper(getContext(), (int) R.style.AppTheme));
                    sbVar.A(R.string.edit);
                    ArrayList arrayList = new ArrayList(uq0.y0(c0, 10));
                    for (Number number : c0) {
                        arrayList.add(getResources().getString(number.intValue()));
                    }
                    sbVar.v((CharSequence[]) arrayList.toArray(new String[0]), new cq1(c0, this, layoutEditorView2, 1));
                    sbVar.x(R.string.cancel, null);
                    C(sbVar);
                }
                return true;
            }
            x();
            return true;
        }
        return false;
    }

    public final void v(boolean z) {
        if (!this.e0) {
            return;
        }
        qa7 qa7Var = this.L;
        ScrollView scrollView = qa7Var.k;
        ScrollView scrollView2 = qa7Var.k;
        scrollView.animate().cancel();
        if (z) {
            scrollView2.post(new ie3(this, 0));
        } else {
            scrollView2.setY(scrollView2.getBottom());
            scrollView2.setVisibility(4);
        }
        this.e0 = false;
    }

    public final boolean w() {
        if (getShownEditablePropertyDialog() == null && getShownPositionDialog() == null) {
            return false;
        }
        return true;
    }

    public final void x() {
        u(this);
        List<vc3> instantiatedComponents = this.L.v.getInstantiatedComponents();
        e12 entries = vc3.getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (!instantiatedComponents.contains((vc3) obj)) {
                arrayList.add(obj);
            }
        }
        sb sbVar = new sb(new ContextThemeWrapper(getContext(), (int) R.style.AppTheme));
        sbVar.A(R.string.choose_component);
        sbVar.x(R.string.cancel, new hm0(4));
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(uq0.y0(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                arrayList2.add(getResources().getString(cg2.C((vc3) obj2)));
            }
            sbVar.v((CharSequence[]) arrayList2.toArray(new String[0]), new aq1(3, arrayList, this));
        } else {
            sbVar.w(R.string.no_more_components);
        }
        C(sbVar);
    }

    public final void y() {
        oe3 oe3Var = this.c0;
        if (oe3Var != null) {
            int i = LayoutEditorActivity.M0;
            ((LayoutEditorActivity) ((ka3) oe3Var).B).C();
        }
        List<LayoutEditorActivity.a> menuOptions = getMenuOptions();
        int size = menuOptions.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = getResources().getString(menuOptions.get(i2).getStringRes());
        }
        sb sbVar = new sb(new ContextThemeWrapper(getContext(), (int) R.style.AppTheme));
        sbVar.A(R.string.menu);
        sbVar.v(strArr, new aq1(2, this, menuOptions));
        sbVar.x(R.string.cancel, null);
        C(sbVar);
    }

    public final void z() {
        vc3 vc3Var = this.u0;
        qa7 qa7Var = this.L;
        if (vc3Var == null) {
            vc3Var = qa7Var.v.getSelectedComponent();
        }
        cd3 cd3Var = null;
        this.u0 = null;
        if (vc3Var != null) {
            LayoutEditorView layoutEditorView = qa7Var.v;
            hd3 hd3Var = layoutEditorView.getViews().get(vc3Var);
            if (hd3Var != null) {
                cd3Var = layoutEditorView.i(hd3Var);
            }
            if (cd3Var == null) {
                return;
            }
            this.w0 = vc3Var;
            setShownPositionDialog(cd3Var);
        }
    }
}

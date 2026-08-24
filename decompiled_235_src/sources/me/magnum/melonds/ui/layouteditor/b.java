package me.magnum.melonds.ui.layouteditor;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
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
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.mlkit.common.MlKitException;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import me.magnum.melonds.ui.layouteditor.a;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b extends FrameLayout {
    public final sn3 A;
    public final sw4 B;
    public final nb1 L;
    public final ex6 R;
    public jl3 d0;
    public boolean e0;
    public boolean f0;
    public int g0;
    public float h0;
    public float i0;
    public boolean j0;
    public boolean k0;
    public nj3 l0;
    public kl3 m0;
    public kl3 n0;
    public kl3 o0;
    public boolean p0;
    public boolean q0;
    public final vs4 r0;
    public final vs4 s0;
    public final vs4 t0;
    public final vs4 u0;
    public nj3 v0;
    public nj3 w0;
    public nj3 x0;
    public final j37 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(sn3 sn3Var, sw4 sw4Var, u66 u66Var, ContextWrapper contextWrapper) {
        super(contextWrapper, null);
        boolean z;
        boolean z2;
        sn3Var.getClass();
        this.A = sn3Var;
        this.B = sw4Var;
        this.R = new ex6(new yk3(this, 0));
        this.e0 = true;
        this.f0 = true;
        kl3 kl3Var = kl3.RATIO_4_3;
        this.m0 = kl3Var;
        this.n0 = kl3Var;
        this.o0 = kl3Var;
        if (u66Var != null) {
            z = u66Var.a;
        } else {
            z = false;
        }
        this.r0 = np2.Y(Boolean.valueOf(z));
        if (u66Var != null) {
            z2 = u66Var.b;
        } else {
            z2 = false;
        }
        this.s0 = np2.Y(Boolean.valueOf(z2));
        this.t0 = np2.Y(null);
        this.u0 = np2.Y(null);
        this.y0 = new j37();
        LayoutInflater from = LayoutInflater.from(contextWrapper);
        setFocusable(false);
        setFocusableInTouchMode(false);
        View inflate = from.inflate(R.layout.view_layout_editor_manager, (ViewGroup) null, false);
        int i = R.id.barrier_labels;
        if (((Barrier) gi2.B(inflate, R.id.barrier_labels)) != null) {
            i = R.id.button_add_button;
            Button button = (Button) gi2.B(inflate, R.id.button_add_button);
            if (button != null) {
                i = R.id.button_back;
                Button button2 = (Button) gi2.B(inflate, R.id.button_back);
                if (button2 != null) {
                    i = R.id.button_center_horizontal;
                    Button button3 = (Button) gi2.B(inflate, R.id.button_center_horizontal);
                    if (button3 != null) {
                        i = R.id.button_center_vertical;
                        Button button4 = (Button) gi2.B(inflate, R.id.button_center_vertical);
                        if (button4 != null) {
                            i = R.id.button_delete_button;
                            Button button5 = (Button) gi2.B(inflate, R.id.button_delete_button);
                            if (button5 != null) {
                                i = R.id.button_edit_position;
                                Button button6 = (Button) gi2.B(inflate, R.id.button_edit_position);
                                if (button6 != null) {
                                    i = R.id.button_hide_controls;
                                    ImageButton imageButton = (ImageButton) gi2.B(inflate, R.id.button_hide_controls);
                                    if (imageButton != null) {
                                        i = R.id.button_menu;
                                        Button button7 = (Button) gi2.B(inflate, R.id.button_menu);
                                        if (button7 != null) {
                                            i = R.id.button_toggle_visibility;
                                            Button button8 = (Button) gi2.B(inflate, R.id.button_toggle_visibility);
                                            if (button8 != null) {
                                                i = R.id.checkbox_above_screen;
                                                CheckBox checkBox = (CheckBox) gi2.B(inflate, R.id.checkbox_above_screen);
                                                if (checkBox != null) {
                                                    i = R.id.image_background;
                                                    ImageView imageView = (ImageView) gi2.B(inflate, R.id.image_background);
                                                    if (imageView != null) {
                                                        i = R.id.layout_alpha_labels;
                                                        LinearLayout linearLayout = (LinearLayout) gi2.B(inflate, R.id.layout_alpha_labels);
                                                        if (linearLayout != null) {
                                                            i = R.id.layout_aspect_ratio;
                                                            LinearLayout linearLayout2 = (LinearLayout) gi2.B(inflate, R.id.layout_aspect_ratio);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.layout_button_scale_labels;
                                                                LinearLayout linearLayout3 = (LinearLayout) gi2.B(inflate, R.id.layout_button_scale_labels);
                                                                if (linearLayout3 != null) {
                                                                    i = R.id.layout_controls;
                                                                    LinearLayout linearLayout4 = (LinearLayout) gi2.B(inflate, R.id.layout_controls);
                                                                    if (linearLayout4 != null) {
                                                                        i = R.id.layout_height_labels;
                                                                        LinearLayout linearLayout5 = (LinearLayout) gi2.B(inflate, R.id.layout_height_labels);
                                                                        if (linearLayout5 != null) {
                                                                            i = R.id.layout_scaling;
                                                                            if (((ConstraintLayout) gi2.B(inflate, R.id.layout_scaling)) != null) {
                                                                                i = R.id.layout_scaling_container;
                                                                                ScrollView scrollView = (ScrollView) gi2.B(inflate, R.id.layout_scaling_container);
                                                                                if (scrollView != null) {
                                                                                    i = R.id.layout_size_labels;
                                                                                    LinearLayout linearLayout6 = (LinearLayout) gi2.B(inflate, R.id.layout_size_labels);
                                                                                    if (linearLayout6 != null) {
                                                                                        i = R.id.layout_spread_labels;
                                                                                        LinearLayout linearLayout7 = (LinearLayout) gi2.B(inflate, R.id.layout_spread_labels);
                                                                                        if (linearLayout7 != null) {
                                                                                            i = R.id.layout_width_labels;
                                                                                            LinearLayout linearLayout8 = (LinearLayout) gi2.B(inflate, R.id.layout_width_labels);
                                                                                            if (linearLayout8 != null) {
                                                                                                i = R.id.seek_bar_alpha;
                                                                                                SeekBar seekBar = (SeekBar) gi2.B(inflate, R.id.seek_bar_alpha);
                                                                                                if (seekBar != null) {
                                                                                                    i = R.id.seek_bar_button_scale;
                                                                                                    SeekBar seekBar2 = (SeekBar) gi2.B(inflate, R.id.seek_bar_button_scale);
                                                                                                    if (seekBar2 != null) {
                                                                                                        i = R.id.seek_bar_height;
                                                                                                        SeekBar seekBar3 = (SeekBar) gi2.B(inflate, R.id.seek_bar_height);
                                                                                                        if (seekBar3 != null) {
                                                                                                            i = R.id.seek_bar_size;
                                                                                                            SeekBar seekBar4 = (SeekBar) gi2.B(inflate, R.id.seek_bar_size);
                                                                                                            if (seekBar4 != null) {
                                                                                                                i = R.id.seek_bar_spread;
                                                                                                                SeekBar seekBar5 = (SeekBar) gi2.B(inflate, R.id.seek_bar_spread);
                                                                                                                if (seekBar5 != null) {
                                                                                                                    i = R.id.seek_bar_width;
                                                                                                                    SeekBar seekBar6 = (SeekBar) gi2.B(inflate, R.id.seek_bar_width);
                                                                                                                    if (seekBar6 != null) {
                                                                                                                        i = R.id.spinner_aspect_ratio;
                                                                                                                        Spinner spinner = (Spinner) gi2.B(inflate, R.id.spinner_aspect_ratio);
                                                                                                                        if (spinner != null) {
                                                                                                                            i = R.id.text_button_scale;
                                                                                                                            TextView textView = (TextView) gi2.B(inflate, R.id.text_button_scale);
                                                                                                                            if (textView != null) {
                                                                                                                                i = R.id.text_height;
                                                                                                                                TextView textView2 = (TextView) gi2.B(inflate, R.id.text_height);
                                                                                                                                if (textView2 != null) {
                                                                                                                                    i = R.id.text_size;
                                                                                                                                    TextView textView3 = (TextView) gi2.B(inflate, R.id.text_size);
                                                                                                                                    if (textView3 != null) {
                                                                                                                                        i = R.id.text_spread;
                                                                                                                                        TextView textView4 = (TextView) gi2.B(inflate, R.id.text_spread);
                                                                                                                                        if (textView4 != null) {
                                                                                                                                            i = R.id.text_width;
                                                                                                                                            TextView textView5 = (TextView) gi2.B(inflate, R.id.text_width);
                                                                                                                                            if (textView5 != null) {
                                                                                                                                                i = R.id.view_layout_editor;
                                                                                                                                                LayoutEditorView layoutEditorView = (LayoutEditorView) gi2.B(inflate, R.id.view_layout_editor);
                                                                                                                                                if (layoutEditorView != null) {
                                                                                                                                                    RelativeLayout relativeLayout = (RelativeLayout) inflate;
                                                                                                                                                    this.L = new nb1(relativeLayout, button, button2, button3, button4, button5, button6, imageButton, button7, button8, checkBox, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, scrollView, linearLayout6, linearLayout7, linearLayout8, seekBar, seekBar2, seekBar3, seekBar4, seekBar5, seekBar6, spinner, textView, textView2, textView3, textView4, textView5, layoutEditorView);
                                                                                                                                                    ComposeView composeView = new ComposeView(contextWrapper, null, 6);
                                                                                                                                                    composeView.setContent(new zv0(1040140390, true, new al3(this, 0)));
                                                                                                                                                    addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
                                                                                                                                                    addView(composeView, new FrameLayout.LayoutParams(-1, -1));
                                                                                                                                                    h61 h61Var = new h61(this, 11);
                                                                                                                                                    WeakHashMap weakHashMap = ao7.a;
                                                                                                                                                    sn7.c(relativeLayout, h61Var);
                                                                                                                                                    button2.setOnClickListener(new View.OnClickListener(this) { // from class: zk3
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
                                                                                                                                                                    bVar.u(true);
                                                                                                                                                                    return;
                                                                                                                                                                case 1:
                                                                                                                                                                    bVar.s();
                                                                                                                                                                    return;
                                                                                                                                                                case 2:
                                                                                                                                                                    bVar.w();
                                                                                                                                                                    return;
                                                                                                                                                                case 3:
                                                                                                                                                                    bVar.x();
                                                                                                                                                                    return;
                                                                                                                                                                case 4:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 5:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 6:
                                                                                                                                                                    bVar.y();
                                                                                                                                                                    return;
                                                                                                                                                                case 7:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).j();
                                                                                                                                                                    return;
                                                                                                                                                                case 8:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).k();
                                                                                                                                                                    return;
                                                                                                                                                                case 9:
                                                                                                                                                                    boolean z3 = bVar.e0;
                                                                                                                                                                    nb1 nb1Var = bVar.L;
                                                                                                                                                                    if (z3) {
                                                                                                                                                                        ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                        bVar.e0 = true;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                    bVar.e0 = true;
                                                                                                                                                                    return;
                                                                                                                                                                case 10:
                                                                                                                                                                    bVar.z(oj3.SIZE);
                                                                                                                                                                    return;
                                                                                                                                                                case 11:
                                                                                                                                                                    bVar.z(oj3.WIDTH);
                                                                                                                                                                    return;
                                                                                                                                                                default:
                                                                                                                                                                    bVar.z(oj3.HEIGHT);
                                                                                                                                                                    return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    button.setOnClickListener(new View.OnClickListener(this) { // from class: zk3
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
                                                                                                                                                                    bVar.u(true);
                                                                                                                                                                    return;
                                                                                                                                                                case 1:
                                                                                                                                                                    bVar.s();
                                                                                                                                                                    return;
                                                                                                                                                                case 2:
                                                                                                                                                                    bVar.w();
                                                                                                                                                                    return;
                                                                                                                                                                case 3:
                                                                                                                                                                    bVar.x();
                                                                                                                                                                    return;
                                                                                                                                                                case 4:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 5:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 6:
                                                                                                                                                                    bVar.y();
                                                                                                                                                                    return;
                                                                                                                                                                case 7:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).j();
                                                                                                                                                                    return;
                                                                                                                                                                case 8:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).k();
                                                                                                                                                                    return;
                                                                                                                                                                case 9:
                                                                                                                                                                    boolean z3 = bVar.e0;
                                                                                                                                                                    nb1 nb1Var = bVar.L;
                                                                                                                                                                    if (z3) {
                                                                                                                                                                        ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                        bVar.e0 = true;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                    bVar.e0 = true;
                                                                                                                                                                    return;
                                                                                                                                                                case 10:
                                                                                                                                                                    bVar.z(oj3.SIZE);
                                                                                                                                                                    return;
                                                                                                                                                                case 11:
                                                                                                                                                                    bVar.z(oj3.WIDTH);
                                                                                                                                                                    return;
                                                                                                                                                                default:
                                                                                                                                                                    bVar.z(oj3.HEIGHT);
                                                                                                                                                                    return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    button7.setOnClickListener(new View.OnClickListener(this) { // from class: zk3
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
                                                                                                                                                                    bVar.u(true);
                                                                                                                                                                    return;
                                                                                                                                                                case 1:
                                                                                                                                                                    bVar.s();
                                                                                                                                                                    return;
                                                                                                                                                                case 2:
                                                                                                                                                                    bVar.w();
                                                                                                                                                                    return;
                                                                                                                                                                case 3:
                                                                                                                                                                    bVar.x();
                                                                                                                                                                    return;
                                                                                                                                                                case 4:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 5:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 6:
                                                                                                                                                                    bVar.y();
                                                                                                                                                                    return;
                                                                                                                                                                case 7:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).j();
                                                                                                                                                                    return;
                                                                                                                                                                case 8:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).k();
                                                                                                                                                                    return;
                                                                                                                                                                case 9:
                                                                                                                                                                    boolean z3 = bVar.e0;
                                                                                                                                                                    nb1 nb1Var = bVar.L;
                                                                                                                                                                    if (z3) {
                                                                                                                                                                        ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                        bVar.e0 = true;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                    bVar.e0 = true;
                                                                                                                                                                    return;
                                                                                                                                                                case 10:
                                                                                                                                                                    bVar.z(oj3.SIZE);
                                                                                                                                                                    return;
                                                                                                                                                                case 11:
                                                                                                                                                                    bVar.z(oj3.WIDTH);
                                                                                                                                                                    return;
                                                                                                                                                                default:
                                                                                                                                                                    bVar.z(oj3.HEIGHT);
                                                                                                                                                                    return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    button5.setOnClickListener(new View.OnClickListener(this) { // from class: zk3
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
                                                                                                                                                                    bVar.u(true);
                                                                                                                                                                    return;
                                                                                                                                                                case 1:
                                                                                                                                                                    bVar.s();
                                                                                                                                                                    return;
                                                                                                                                                                case 2:
                                                                                                                                                                    bVar.w();
                                                                                                                                                                    return;
                                                                                                                                                                case 3:
                                                                                                                                                                    bVar.x();
                                                                                                                                                                    return;
                                                                                                                                                                case 4:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 5:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 6:
                                                                                                                                                                    bVar.y();
                                                                                                                                                                    return;
                                                                                                                                                                case 7:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).j();
                                                                                                                                                                    return;
                                                                                                                                                                case 8:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).k();
                                                                                                                                                                    return;
                                                                                                                                                                case 9:
                                                                                                                                                                    boolean z3 = bVar.e0;
                                                                                                                                                                    nb1 nb1Var = bVar.L;
                                                                                                                                                                    if (z3) {
                                                                                                                                                                        ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                        bVar.e0 = true;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                    bVar.e0 = true;
                                                                                                                                                                    return;
                                                                                                                                                                case 10:
                                                                                                                                                                    bVar.z(oj3.SIZE);
                                                                                                                                                                    return;
                                                                                                                                                                case 11:
                                                                                                                                                                    bVar.z(oj3.WIDTH);
                                                                                                                                                                    return;
                                                                                                                                                                default:
                                                                                                                                                                    bVar.z(oj3.HEIGHT);
                                                                                                                                                                    return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    button8.setOnClickListener(new View.OnClickListener(this) { // from class: zk3
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
                                                                                                                                                                    bVar.u(true);
                                                                                                                                                                    return;
                                                                                                                                                                case 1:
                                                                                                                                                                    bVar.s();
                                                                                                                                                                    return;
                                                                                                                                                                case 2:
                                                                                                                                                                    bVar.w();
                                                                                                                                                                    return;
                                                                                                                                                                case 3:
                                                                                                                                                                    bVar.x();
                                                                                                                                                                    return;
                                                                                                                                                                case 4:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 5:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 6:
                                                                                                                                                                    bVar.y();
                                                                                                                                                                    return;
                                                                                                                                                                case 7:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).j();
                                                                                                                                                                    return;
                                                                                                                                                                case 8:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).k();
                                                                                                                                                                    return;
                                                                                                                                                                case 9:
                                                                                                                                                                    boolean z3 = bVar.e0;
                                                                                                                                                                    nb1 nb1Var = bVar.L;
                                                                                                                                                                    if (z3) {
                                                                                                                                                                        ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                        bVar.e0 = true;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                    bVar.e0 = true;
                                                                                                                                                                    return;
                                                                                                                                                                case 10:
                                                                                                                                                                    bVar.z(oj3.SIZE);
                                                                                                                                                                    return;
                                                                                                                                                                case 11:
                                                                                                                                                                    bVar.z(oj3.WIDTH);
                                                                                                                                                                    return;
                                                                                                                                                                default:
                                                                                                                                                                    bVar.z(oj3.HEIGHT);
                                                                                                                                                                    return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    button6.setOnTouchListener(new sp1(this, 1));
                                                                                                                                                    button6.setOnClickListener(new View.OnClickListener(this) { // from class: zk3
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
                                                                                                                                                                    bVar.u(true);
                                                                                                                                                                    return;
                                                                                                                                                                case 1:
                                                                                                                                                                    bVar.s();
                                                                                                                                                                    return;
                                                                                                                                                                case 2:
                                                                                                                                                                    bVar.w();
                                                                                                                                                                    return;
                                                                                                                                                                case 3:
                                                                                                                                                                    bVar.x();
                                                                                                                                                                    return;
                                                                                                                                                                case 4:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 5:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 6:
                                                                                                                                                                    bVar.y();
                                                                                                                                                                    return;
                                                                                                                                                                case 7:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).j();
                                                                                                                                                                    return;
                                                                                                                                                                case 8:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).k();
                                                                                                                                                                    return;
                                                                                                                                                                case 9:
                                                                                                                                                                    boolean z3 = bVar.e0;
                                                                                                                                                                    nb1 nb1Var = bVar.L;
                                                                                                                                                                    if (z3) {
                                                                                                                                                                        ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                        bVar.e0 = true;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                    bVar.e0 = true;
                                                                                                                                                                    return;
                                                                                                                                                                case 10:
                                                                                                                                                                    bVar.z(oj3.SIZE);
                                                                                                                                                                    return;
                                                                                                                                                                case 11:
                                                                                                                                                                    bVar.z(oj3.WIDTH);
                                                                                                                                                                    return;
                                                                                                                                                                default:
                                                                                                                                                                    bVar.z(oj3.HEIGHT);
                                                                                                                                                                    return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    button3.setOnClickListener(new View.OnClickListener(this) { // from class: zk3
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
                                                                                                                                                                    bVar.u(true);
                                                                                                                                                                    return;
                                                                                                                                                                case 1:
                                                                                                                                                                    bVar.s();
                                                                                                                                                                    return;
                                                                                                                                                                case 2:
                                                                                                                                                                    bVar.w();
                                                                                                                                                                    return;
                                                                                                                                                                case 3:
                                                                                                                                                                    bVar.x();
                                                                                                                                                                    return;
                                                                                                                                                                case 4:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 5:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 6:
                                                                                                                                                                    bVar.y();
                                                                                                                                                                    return;
                                                                                                                                                                case 7:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).j();
                                                                                                                                                                    return;
                                                                                                                                                                case 8:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).k();
                                                                                                                                                                    return;
                                                                                                                                                                case 9:
                                                                                                                                                                    boolean z3 = bVar.e0;
                                                                                                                                                                    nb1 nb1Var = bVar.L;
                                                                                                                                                                    if (z3) {
                                                                                                                                                                        ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                        bVar.e0 = true;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                    bVar.e0 = true;
                                                                                                                                                                    return;
                                                                                                                                                                case 10:
                                                                                                                                                                    bVar.z(oj3.SIZE);
                                                                                                                                                                    return;
                                                                                                                                                                case 11:
                                                                                                                                                                    bVar.z(oj3.WIDTH);
                                                                                                                                                                    return;
                                                                                                                                                                default:
                                                                                                                                                                    bVar.z(oj3.HEIGHT);
                                                                                                                                                                    return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    button4.setOnClickListener(new View.OnClickListener(this) { // from class: zk3
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
                                                                                                                                                                    bVar.u(true);
                                                                                                                                                                    return;
                                                                                                                                                                case 1:
                                                                                                                                                                    bVar.s();
                                                                                                                                                                    return;
                                                                                                                                                                case 2:
                                                                                                                                                                    bVar.w();
                                                                                                                                                                    return;
                                                                                                                                                                case 3:
                                                                                                                                                                    bVar.x();
                                                                                                                                                                    return;
                                                                                                                                                                case 4:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 5:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 6:
                                                                                                                                                                    bVar.y();
                                                                                                                                                                    return;
                                                                                                                                                                case 7:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).j();
                                                                                                                                                                    return;
                                                                                                                                                                case 8:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).k();
                                                                                                                                                                    return;
                                                                                                                                                                case 9:
                                                                                                                                                                    boolean z3 = bVar.e0;
                                                                                                                                                                    nb1 nb1Var = bVar.L;
                                                                                                                                                                    if (z3) {
                                                                                                                                                                        ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                        bVar.e0 = true;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                    bVar.e0 = true;
                                                                                                                                                                    return;
                                                                                                                                                                case 10:
                                                                                                                                                                    bVar.z(oj3.SIZE);
                                                                                                                                                                    return;
                                                                                                                                                                case 11:
                                                                                                                                                                    bVar.z(oj3.WIDTH);
                                                                                                                                                                    return;
                                                                                                                                                                default:
                                                                                                                                                                    bVar.z(oj3.HEIGHT);
                                                                                                                                                                    return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    seekBar5.setOnSeekBarChangeListener(new fl3(this, contextWrapper, 0));
                                                                                                                                                    seekBar2.setOnSeekBarChangeListener(new fl3(this, contextWrapper, 1));
                                                                                                                                                    layoutEditorView.setLayoutComponentViewBuilderFactory(new wb1(1, (byte) 0));
                                                                                                                                                    layoutEditorView.setOnClickListener(new View.OnClickListener(this) { // from class: zk3
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
                                                                                                                                                                    bVar.u(true);
                                                                                                                                                                    return;
                                                                                                                                                                case 1:
                                                                                                                                                                    bVar.s();
                                                                                                                                                                    return;
                                                                                                                                                                case 2:
                                                                                                                                                                    bVar.w();
                                                                                                                                                                    return;
                                                                                                                                                                case 3:
                                                                                                                                                                    bVar.x();
                                                                                                                                                                    return;
                                                                                                                                                                case 4:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 5:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 6:
                                                                                                                                                                    bVar.y();
                                                                                                                                                                    return;
                                                                                                                                                                case 7:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).j();
                                                                                                                                                                    return;
                                                                                                                                                                case 8:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).k();
                                                                                                                                                                    return;
                                                                                                                                                                case 9:
                                                                                                                                                                    boolean z3 = bVar.e0;
                                                                                                                                                                    nb1 nb1Var = bVar.L;
                                                                                                                                                                    if (z3) {
                                                                                                                                                                        ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                        bVar.e0 = true;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                    bVar.e0 = true;
                                                                                                                                                                    return;
                                                                                                                                                                case 10:
                                                                                                                                                                    bVar.z(oj3.SIZE);
                                                                                                                                                                    return;
                                                                                                                                                                case 11:
                                                                                                                                                                    bVar.z(oj3.WIDTH);
                                                                                                                                                                    return;
                                                                                                                                                                default:
                                                                                                                                                                    bVar.z(oj3.HEIGHT);
                                                                                                                                                                    return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    layoutEditorView.setOnViewSelectedListener(new io2() { // from class: el3
                                                                                                                                                        @Override // defpackage.io2
                                                                                                                                                        public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                                                                                                                                            boolean z3;
                                                                                                                                                            kl3 kl3Var2;
                                                                                                                                                            SeekBar seekBar7;
                                                                                                                                                            String str;
                                                                                                                                                            boolean z4;
                                                                                                                                                            int i2;
                                                                                                                                                            int i3;
                                                                                                                                                            int i4;
                                                                                                                                                            int i5;
                                                                                                                                                            int i6;
                                                                                                                                                            int i7;
                                                                                                                                                            int i8;
                                                                                                                                                            KeyEvent.Callback callback;
                                                                                                                                                            s64 s64Var;
                                                                                                                                                            float f;
                                                                                                                                                            zj3 zj3Var = (zj3) obj;
                                                                                                                                                            float floatValue = ((Float) obj2).floatValue();
                                                                                                                                                            float floatValue2 = ((Float) obj3).floatValue();
                                                                                                                                                            int intValue = ((Integer) obj4).intValue();
                                                                                                                                                            int intValue2 = ((Integer) obj5).intValue();
                                                                                                                                                            int intValue3 = ((Integer) obj6).intValue();
                                                                                                                                                            zj3Var.getClass();
                                                                                                                                                            b bVar = b.this;
                                                                                                                                                            nb1 nb1Var = bVar.L;
                                                                                                                                                            ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                            bVar.e0 = true;
                                                                                                                                                            bVar.u(false);
                                                                                                                                                            nj3 nj3Var = zj3Var.b;
                                                                                                                                                            bVar.j0 = nj3Var.isScreen();
                                                                                                                                                            if (nj3Var != nj3.TOP_SCREEN && nj3Var != nj3.BOTTOM_SCREEN) {
                                                                                                                                                                z3 = false;
                                                                                                                                                            } else {
                                                                                                                                                                z3 = true;
                                                                                                                                                            }
                                                                                                                                                            bVar.k0 = z3;
                                                                                                                                                            bVar.l0 = nj3Var;
                                                                                                                                                            int i9 = a.c[nj3Var.ordinal()];
                                                                                                                                                            if (i9 != 1) {
                                                                                                                                                                if (i9 != 2) {
                                                                                                                                                                    kl3Var2 = kl3.UNRESTRICTED;
                                                                                                                                                                } else {
                                                                                                                                                                    kl3Var2 = bVar.o0;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                kl3Var2 = bVar.n0;
                                                                                                                                                            }
                                                                                                                                                            bVar.m0 = kl3Var2;
                                                                                                                                                            boolean z5 = bVar.j0;
                                                                                                                                                            float f2 = zj3Var.c;
                                                                                                                                                            boolean z6 = zj3Var.d;
                                                                                                                                                            ScrollView scrollView2 = (ScrollView) nb1Var.k;
                                                                                                                                                            CheckBox checkBox2 = (CheckBox) nb1Var.d;
                                                                                                                                                            SeekBar seekBar8 = (SeekBar) nb1Var.p;
                                                                                                                                                            SeekBar seekBar9 = (SeekBar) nb1Var.s;
                                                                                                                                                            SeekBar seekBar10 = (SeekBar) nb1Var.r;
                                                                                                                                                            TextView textView6 = (TextView) nb1Var.w;
                                                                                                                                                            TextView textView7 = (TextView) nb1Var.z;
                                                                                                                                                            SeekBar seekBar11 = (SeekBar) nb1Var.o;
                                                                                                                                                            SeekBar seekBar12 = (SeekBar) nb1Var.q;
                                                                                                                                                            SeekBar seekBar13 = (SeekBar) nb1Var.t;
                                                                                                                                                            scrollView2.animate().cancel();
                                                                                                                                                            bVar.g0 = intValue3;
                                                                                                                                                            bVar.h0 = floatValue;
                                                                                                                                                            bVar.i0 = floatValue2;
                                                                                                                                                            bVar.q0 = true;
                                                                                                                                                            try {
                                                                                                                                                                if (z5) {
                                                                                                                                                                    int i10 = intValue - intValue3;
                                                                                                                                                                    seekBar13.setMax(i10);
                                                                                                                                                                    float f3 = i10 * floatValue;
                                                                                                                                                                    seekBar13.setProgress(gi2.q(u24.E(f3), 0, seekBar13.getMax()));
                                                                                                                                                                    float f4 = intValue3;
                                                                                                                                                                    textView7.setText(String.valueOf(u24.E(f3 + f4)));
                                                                                                                                                                    int i11 = intValue2 - intValue3;
                                                                                                                                                                    seekBar12.setMax(i11);
                                                                                                                                                                    float f5 = i11 * floatValue2;
                                                                                                                                                                    seekBar12.setProgress(gi2.q(u24.E(f5), 0, seekBar12.getMax()));
                                                                                                                                                                    textView6.setText(String.valueOf(u24.E(f5 + f4)));
                                                                                                                                                                    str = "%";
                                                                                                                                                                    seekBar7 = seekBar11;
                                                                                                                                                                } else {
                                                                                                                                                                    int min = Math.min(intValue, intValue2) - intValue3;
                                                                                                                                                                    if (min < 1) {
                                                                                                                                                                        min = 1;
                                                                                                                                                                    }
                                                                                                                                                                    int i12 = intValue - intValue3;
                                                                                                                                                                    float f6 = i12 * floatValue;
                                                                                                                                                                    float f7 = intValue3;
                                                                                                                                                                    int E = u24.E(f6 + f7);
                                                                                                                                                                    int i13 = intValue2 - intValue3;
                                                                                                                                                                    seekBar7 = seekBar11;
                                                                                                                                                                    float f8 = i13 * floatValue2;
                                                                                                                                                                    int E2 = u24.E(f8 + f7);
                                                                                                                                                                    str = "%";
                                                                                                                                                                    int q = gi2.q(Math.min(E, E2), intValue3, intValue3 + min);
                                                                                                                                                                    seekBar10.setMax(min);
                                                                                                                                                                    seekBar10.setProgress(q - intValue3);
                                                                                                                                                                    ((TextView) nb1Var.x).setText(String.valueOf(q));
                                                                                                                                                                    seekBar13.setMax(i12);
                                                                                                                                                                    seekBar13.setProgress(gi2.q(u24.E(f6), 0, seekBar13.getMax()));
                                                                                                                                                                    textView7.setText(String.valueOf(E));
                                                                                                                                                                    seekBar12.setMax(i13);
                                                                                                                                                                    seekBar12.setProgress(gi2.q(u24.E(f8), 0, seekBar12.getMax()));
                                                                                                                                                                    textView6.setText(String.valueOf(E2));
                                                                                                                                                                }
                                                                                                                                                                nj3 nj3Var2 = bVar.l0;
                                                                                                                                                                nj3 nj3Var3 = nj3.BUTTONS;
                                                                                                                                                                if (nj3Var2 == nj3Var3) {
                                                                                                                                                                    z4 = true;
                                                                                                                                                                } else {
                                                                                                                                                                    z4 = false;
                                                                                                                                                                }
                                                                                                                                                                LinearLayout linearLayout9 = (LinearLayout) nb1Var.m;
                                                                                                                                                                int i14 = 8;
                                                                                                                                                                if (z4) {
                                                                                                                                                                    i2 = 0;
                                                                                                                                                                } else {
                                                                                                                                                                    i2 = 8;
                                                                                                                                                                }
                                                                                                                                                                linearLayout9.setVisibility(i2);
                                                                                                                                                                if (z4) {
                                                                                                                                                                    i3 = 0;
                                                                                                                                                                } else {
                                                                                                                                                                    i3 = 8;
                                                                                                                                                                }
                                                                                                                                                                seekBar9.setVisibility(i3);
                                                                                                                                                                LinearLayout linearLayout10 = (LinearLayout) nb1Var.h;
                                                                                                                                                                if (z4) {
                                                                                                                                                                    i4 = 0;
                                                                                                                                                                } else {
                                                                                                                                                                    i4 = 8;
                                                                                                                                                                }
                                                                                                                                                                linearLayout10.setVisibility(i4);
                                                                                                                                                                if (z4) {
                                                                                                                                                                    i5 = 0;
                                                                                                                                                                } else {
                                                                                                                                                                    i5 = 8;
                                                                                                                                                                }
                                                                                                                                                                seekBar8.setVisibility(i5);
                                                                                                                                                                if (z4) {
                                                                                                                                                                    zj3 d = ((LayoutEditorView) nb1Var.A).d(nj3Var3);
                                                                                                                                                                    s64 s64Var2 = null;
                                                                                                                                                                    if (d != null) {
                                                                                                                                                                        callback = d.a;
                                                                                                                                                                    } else {
                                                                                                                                                                        callback = null;
                                                                                                                                                                    }
                                                                                                                                                                    if (callback instanceof s64) {
                                                                                                                                                                        s64Var = (s64) callback;
                                                                                                                                                                    } else {
                                                                                                                                                                        s64Var = null;
                                                                                                                                                                    }
                                                                                                                                                                    float f9 = 1.0f;
                                                                                                                                                                    if (s64Var != null) {
                                                                                                                                                                        f = s64Var.getButtonSpread();
                                                                                                                                                                    } else {
                                                                                                                                                                        f = 1.0f;
                                                                                                                                                                    }
                                                                                                                                                                    int q2 = gi2.q((int) (f * 100.0f), 60, 160);
                                                                                                                                                                    seekBar9.setProgress(q2);
                                                                                                                                                                    StringBuilder sb = new StringBuilder();
                                                                                                                                                                    sb.append(q2);
                                                                                                                                                                    String str2 = str;
                                                                                                                                                                    sb.append(str2);
                                                                                                                                                                    ((TextView) nb1Var.y).setText(sb.toString());
                                                                                                                                                                    if (callback instanceof s64) {
                                                                                                                                                                        s64Var2 = (s64) callback;
                                                                                                                                                                    }
                                                                                                                                                                    if (s64Var2 != null) {
                                                                                                                                                                        f9 = s64Var2.getButtonInnerScale();
                                                                                                                                                                    }
                                                                                                                                                                    int q3 = gi2.q((int) (f9 * 100.0f), 60, 140);
                                                                                                                                                                    seekBar8.setProgress(q3);
                                                                                                                                                                    ((TextView) nb1Var.v).setText(q3 + str2);
                                                                                                                                                                }
                                                                                                                                                                SeekBar seekBar14 = seekBar7;
                                                                                                                                                                seekBar14.setProgress(gi2.q(u24.E(f2 * 100.0f), 0, seekBar7.getMax()));
                                                                                                                                                                checkBox2.setChecked(z6);
                                                                                                                                                                bVar.p0 = true;
                                                                                                                                                                ((Spinner) nb1Var.u).setSelection(bVar.m0.ordinal(), false);
                                                                                                                                                                bVar.p0 = false;
                                                                                                                                                                bVar.q0 = false;
                                                                                                                                                                LinearLayout linearLayout11 = (LinearLayout) nb1Var.l;
                                                                                                                                                                if (!z5) {
                                                                                                                                                                    i6 = 0;
                                                                                                                                                                } else {
                                                                                                                                                                    i6 = 8;
                                                                                                                                                                }
                                                                                                                                                                linearLayout11.setVisibility(i6);
                                                                                                                                                                if (!z5) {
                                                                                                                                                                    i7 = 0;
                                                                                                                                                                } else {
                                                                                                                                                                    i7 = 8;
                                                                                                                                                                }
                                                                                                                                                                seekBar10.setVisibility(i7);
                                                                                                                                                                ((LinearLayout) nb1Var.n).setVisibility(0);
                                                                                                                                                                seekBar13.setVisibility(0);
                                                                                                                                                                ((LinearLayout) nb1Var.j).setVisibility(0);
                                                                                                                                                                seekBar12.setVisibility(0);
                                                                                                                                                                ((LinearLayout) nb1Var.f).setVisibility(0);
                                                                                                                                                                seekBar14.setVisibility(0);
                                                                                                                                                                LinearLayout linearLayout12 = (LinearLayout) nb1Var.g;
                                                                                                                                                                if (bVar.k0) {
                                                                                                                                                                    i8 = 0;
                                                                                                                                                                } else {
                                                                                                                                                                    i8 = 8;
                                                                                                                                                                }
                                                                                                                                                                linearLayout12.setVisibility(i8);
                                                                                                                                                                if (z5) {
                                                                                                                                                                    i14 = 0;
                                                                                                                                                                }
                                                                                                                                                                checkBox2.setVisibility(i14);
                                                                                                                                                                ((Button) nb1Var.b).setVisibility(0);
                                                                                                                                                                ((Button) nb1Var.c).setVisibility(0);
                                                                                                                                                                if (!bVar.f0) {
                                                                                                                                                                    scrollView2.setVisibility(0);
                                                                                                                                                                    scrollView2.post(new cl3(bVar, 2));
                                                                                                                                                                    bVar.f0 = true;
                                                                                                                                                                }
                                                                                                                                                                scrollView2.requestFocus();
                                                                                                                                                                return jg7.a;
                                                                                                                                                            } catch (Throwable th) {
                                                                                                                                                                bVar.q0 = false;
                                                                                                                                                                throw th;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    layoutEditorView.setOnViewDeselectedListener(new dl3(this, 3));
                                                                                                                                                    layoutEditorView.setOnViewPositionEditRequestedListener(new dl3(this, 4));
                                                                                                                                                    linearLayout6.setOnClickListener(new View.OnClickListener(this) { // from class: zk3
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
                                                                                                                                                                    bVar.u(true);
                                                                                                                                                                    return;
                                                                                                                                                                case 1:
                                                                                                                                                                    bVar.s();
                                                                                                                                                                    return;
                                                                                                                                                                case 2:
                                                                                                                                                                    bVar.w();
                                                                                                                                                                    return;
                                                                                                                                                                case 3:
                                                                                                                                                                    bVar.x();
                                                                                                                                                                    return;
                                                                                                                                                                case 4:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 5:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 6:
                                                                                                                                                                    bVar.y();
                                                                                                                                                                    return;
                                                                                                                                                                case 7:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).j();
                                                                                                                                                                    return;
                                                                                                                                                                case 8:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).k();
                                                                                                                                                                    return;
                                                                                                                                                                case 9:
                                                                                                                                                                    boolean z3 = bVar.e0;
                                                                                                                                                                    nb1 nb1Var = bVar.L;
                                                                                                                                                                    if (z3) {
                                                                                                                                                                        ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                        bVar.e0 = true;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                    bVar.e0 = true;
                                                                                                                                                                    return;
                                                                                                                                                                case 10:
                                                                                                                                                                    bVar.z(oj3.SIZE);
                                                                                                                                                                    return;
                                                                                                                                                                case 11:
                                                                                                                                                                    bVar.z(oj3.WIDTH);
                                                                                                                                                                    return;
                                                                                                                                                                default:
                                                                                                                                                                    bVar.z(oj3.HEIGHT);
                                                                                                                                                                    return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    linearLayout6.setOnTouchListener(new sp1(this, 1));
                                                                                                                                                    seekBar4.setOnSeekBarChangeListener(new gl3(this, 0));
                                                                                                                                                    linearLayout8.setOnClickListener(new View.OnClickListener(this) { // from class: zk3
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
                                                                                                                                                                    bVar.u(true);
                                                                                                                                                                    return;
                                                                                                                                                                case 1:
                                                                                                                                                                    bVar.s();
                                                                                                                                                                    return;
                                                                                                                                                                case 2:
                                                                                                                                                                    bVar.w();
                                                                                                                                                                    return;
                                                                                                                                                                case 3:
                                                                                                                                                                    bVar.x();
                                                                                                                                                                    return;
                                                                                                                                                                case 4:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 5:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 6:
                                                                                                                                                                    bVar.y();
                                                                                                                                                                    return;
                                                                                                                                                                case 7:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).j();
                                                                                                                                                                    return;
                                                                                                                                                                case 8:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).k();
                                                                                                                                                                    return;
                                                                                                                                                                case 9:
                                                                                                                                                                    boolean z3 = bVar.e0;
                                                                                                                                                                    nb1 nb1Var = bVar.L;
                                                                                                                                                                    if (z3) {
                                                                                                                                                                        ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                        bVar.e0 = true;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                    bVar.e0 = true;
                                                                                                                                                                    return;
                                                                                                                                                                case 10:
                                                                                                                                                                    bVar.z(oj3.SIZE);
                                                                                                                                                                    return;
                                                                                                                                                                case 11:
                                                                                                                                                                    bVar.z(oj3.WIDTH);
                                                                                                                                                                    return;
                                                                                                                                                                default:
                                                                                                                                                                    bVar.z(oj3.HEIGHT);
                                                                                                                                                                    return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    linearLayout8.setOnTouchListener(new sp1(this, 1));
                                                                                                                                                    seekBar6.setOnSeekBarChangeListener(new gl3(this, 1));
                                                                                                                                                    linearLayout5.setOnClickListener(new View.OnClickListener(this) { // from class: zk3
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
                                                                                                                                                                    bVar.u(true);
                                                                                                                                                                    return;
                                                                                                                                                                case 1:
                                                                                                                                                                    bVar.s();
                                                                                                                                                                    return;
                                                                                                                                                                case 2:
                                                                                                                                                                    bVar.w();
                                                                                                                                                                    return;
                                                                                                                                                                case 3:
                                                                                                                                                                    bVar.x();
                                                                                                                                                                    return;
                                                                                                                                                                case 4:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 5:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 6:
                                                                                                                                                                    bVar.y();
                                                                                                                                                                    return;
                                                                                                                                                                case 7:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).j();
                                                                                                                                                                    return;
                                                                                                                                                                case 8:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).k();
                                                                                                                                                                    return;
                                                                                                                                                                case 9:
                                                                                                                                                                    boolean z3 = bVar.e0;
                                                                                                                                                                    nb1 nb1Var = bVar.L;
                                                                                                                                                                    if (z3) {
                                                                                                                                                                        ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                        bVar.e0 = true;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                    bVar.e0 = true;
                                                                                                                                                                    return;
                                                                                                                                                                case 10:
                                                                                                                                                                    bVar.z(oj3.SIZE);
                                                                                                                                                                    return;
                                                                                                                                                                case 11:
                                                                                                                                                                    bVar.z(oj3.WIDTH);
                                                                                                                                                                    return;
                                                                                                                                                                default:
                                                                                                                                                                    bVar.z(oj3.HEIGHT);
                                                                                                                                                                    return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    linearLayout5.setOnTouchListener(new sp1(this, 1));
                                                                                                                                                    seekBar3.setOnSeekBarChangeListener(new gl3(this, 2));
                                                                                                                                                    seekBar.setOnSeekBarChangeListener(new gl3(this, 3));
                                                                                                                                                    ArrayAdapter arrayAdapter = new ArrayAdapter(contextWrapper, 17367048, hf.c0(getResources().getString(R.string.aspect_ratio_4_3), getResources().getString(R.string.aspect_ratio_16_9), getResources().getString(R.string.aspect_ratio_unrestricted)));
                                                                                                                                                    arrayAdapter.setDropDownViewResource(17367049);
                                                                                                                                                    spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                                                                                                                                                    spinner.setOnItemSelectedListener(new np1(this, 1));
                                                                                                                                                    checkBox.setOnCheckedChangeListener(new jq0(this, 2));
                                                                                                                                                    imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: zk3
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
                                                                                                                                                                    bVar.u(true);
                                                                                                                                                                    return;
                                                                                                                                                                case 1:
                                                                                                                                                                    bVar.s();
                                                                                                                                                                    return;
                                                                                                                                                                case 2:
                                                                                                                                                                    bVar.w();
                                                                                                                                                                    return;
                                                                                                                                                                case 3:
                                                                                                                                                                    bVar.x();
                                                                                                                                                                    return;
                                                                                                                                                                case 4:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 5:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).m();
                                                                                                                                                                    return;
                                                                                                                                                                case 6:
                                                                                                                                                                    bVar.y();
                                                                                                                                                                    return;
                                                                                                                                                                case 7:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).j();
                                                                                                                                                                    return;
                                                                                                                                                                case 8:
                                                                                                                                                                    ((LayoutEditorView) bVar.L.A).k();
                                                                                                                                                                    return;
                                                                                                                                                                case 9:
                                                                                                                                                                    boolean z3 = bVar.e0;
                                                                                                                                                                    nb1 nb1Var = bVar.L;
                                                                                                                                                                    if (z3) {
                                                                                                                                                                        ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                        bVar.e0 = true;
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    ((LinearLayout) nb1Var.i).setVisibility(0);
                                                                                                                                                                    bVar.e0 = true;
                                                                                                                                                                    return;
                                                                                                                                                                case 10:
                                                                                                                                                                    bVar.z(oj3.SIZE);
                                                                                                                                                                    return;
                                                                                                                                                                case 11:
                                                                                                                                                                    bVar.z(oj3.WIDTH);
                                                                                                                                                                    return;
                                                                                                                                                                default:
                                                                                                                                                                    bVar.z(oj3.HEIGHT);
                                                                                                                                                                    return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    u(false);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        u34.x("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    public static void a(b bVar, String str) {
        str.getClass();
        bVar.getViewModel().j(str);
        jl3 jl3Var = bVar.d0;
        if (jl3Var != null) {
            LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) ((s63) jl3Var).B;
            int i = LayoutEditorActivity.N0;
            layoutEditorActivity.B();
            yl3 C = layoutEditorActivity.C();
            fk3 fk3Var = (fk3) C.i.getValue();
            if (fk3Var != null) {
                hv.L(to7.a(C), null, null, new wl3(C, fk3Var, null, 1), 3);
            }
            layoutEditorActivity.finish();
        }
    }

    public static void b(b bVar, String str, ck3 ck3Var, boolean z, int i) {
        ck3Var.getClass();
        yl3 viewModel = bVar.getViewModel();
        viewModel.getClass();
        tp6 tp6Var = viewModel.i;
        fk3 fk3Var = (fk3) tp6Var.getValue();
        if (fk3Var != null) {
            tp6Var.m(null, fk3.a(fk3Var, null, str, null, ck3Var, z, i, null, 69));
        }
        bVar.setShowLayoutPropertiesDialog(false);
    }

    public static void c(b bVar) {
        bVar.setShownEditablePropertyDialog(null);
        bVar.w0 = null;
    }

    public static void d(b bVar) {
        ff7 ff7Var;
        yl3 viewModel = bVar.getViewModel();
        sn3 sn3Var = bVar.A;
        viewModel.getClass();
        sn3Var.getClass();
        w71 w71Var = (w71) viewModel.p.A.getValue();
        lj3 lj3Var = null;
        if (w71Var != null) {
            ff7Var = w71Var.a;
        } else {
            ff7Var = null;
        }
        int i = sl3.a[sn3Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                tp6 tp6Var = viewModel.s;
                if (ff7Var != null) {
                    z66 z66Var = ff7Var.b;
                    lj3Var = new lj3(z66Var.a, z66Var.b);
                }
                tp6Var.l(lj3Var);
            } else {
                i.d();
                return;
            }
        } else {
            tp6 tp6Var2 = viewModel.q;
            if (ff7Var != null) {
                z66 z66Var2 = ff7Var.a;
                lj3Var = new lj3(z66Var2.a, z66Var2.b);
            }
            tp6Var2.l(lj3Var);
        }
        bVar.setShowBackgroundPropertiesDialog(false);
    }

    public static void e(b bVar, String str) {
        str.getClass();
        bVar.getViewModel().j(str);
        jl3 jl3Var = bVar.d0;
        if (jl3Var != null) {
            ((s63) jl3Var).w();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(b bVar) {
        lj3 lj3Var;
        Object value;
        Object obj;
        ff7 ff7Var;
        z66 z66Var;
        z66 z66Var2;
        yl3 viewModel = bVar.getViewModel();
        sn3 sn3Var = bVar.A;
        viewModel.getClass();
        sn3Var.getClass();
        jf7 jf7Var = viewModel.h;
        if (jf7Var != null) {
            int i = sl3.a[sn3Var.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    lj3Var = (lj3) viewModel.s.getValue();
                } else {
                    i.d();
                    return;
                }
            } else {
                lj3Var = (lj3) viewModel.q.getValue();
            }
            if (lj3Var != null) {
                UUID uuid = lj3Var.a;
                BackgroundMode backgroundMode = lj3Var.b;
                tp6 tp6Var = viewModel.i;
                do {
                    value = tp6Var.getValue();
                    fk3 fk3Var = (fk3) value;
                    obj = null;
                    if (fk3Var != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(fk3Var.g);
                        int i2 = sl3.a[sn3Var.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                if (linkedHashMap.containsKey(jf7Var)) {
                                    ff7 ff7Var2 = (ff7) linkedHashMap.get(jf7Var);
                                    if (ff7Var2 != null && (z66Var2 = ff7Var2.b) != null) {
                                        z66 a = z66.a(z66Var2, uuid, backgroundMode, null, 4);
                                        ff7 ff7Var3 = (ff7) linkedHashMap.get(jf7Var);
                                        if (ff7Var3 != null) {
                                            obj = ff7.b(ff7Var3, null, a, 1);
                                        }
                                    }
                                    if (obj != null) {
                                        linkedHashMap.put(jf7Var, obj);
                                    }
                                    obj = fk3.a(fk3Var, null, null, null, null, false, 0, linkedHashMap, 63);
                                } else {
                                    ff7Var = new ff7(new z66(null), new z66(uuid, backgroundMode, null));
                                    obj = ff7Var;
                                    if (obj != null) {
                                    }
                                    obj = fk3.a(fk3Var, null, null, null, null, false, 0, linkedHashMap, 63);
                                }
                            } else {
                                i.d();
                                return;
                            }
                        } else if (linkedHashMap.containsKey(jf7Var)) {
                            ff7 ff7Var4 = (ff7) linkedHashMap.get(jf7Var);
                            if (ff7Var4 != null && (z66Var = ff7Var4.a) != null) {
                                z66 a2 = z66.a(z66Var, uuid, backgroundMode, null, 4);
                                ff7 ff7Var5 = (ff7) linkedHashMap.get(jf7Var);
                                if (ff7Var5 != null) {
                                    obj = ff7.b(ff7Var5, a2, null, 2);
                                }
                            }
                            if (obj != null) {
                            }
                            obj = fk3.a(fk3Var, null, null, null, null, false, 0, linkedHashMap, 63);
                        } else {
                            ff7Var = new ff7(new z66(uuid, backgroundMode, null), new z66(null));
                            obj = ff7Var;
                            if (obj != null) {
                            }
                            obj = fk3.a(fk3Var, null, null, null, null, false, 0, linkedHashMap, 63);
                        }
                    }
                } while (!tp6Var.j(value, obj));
            }
        }
        bVar.setShowBackgroundPropertiesDialog(false);
    }

    public static void g(b bVar, oj3 oj3Var, int i) {
        int i2;
        boolean q;
        nb1 nb1Var = bVar.L;
        nj3 nj3Var = bVar.w0;
        if (nj3Var != null || (nj3Var = ((LayoutEditorView) nb1Var.A).getSelectedComponent()) != null) {
            int i3 = 1;
            bVar.q0 = true;
            if (oj3Var == null) {
                i2 = -1;
            } else {
                try {
                    i2 = a.b[oj3Var.ordinal()];
                } catch (Throwable th) {
                    bVar.q0 = false;
                    throw th;
                }
            }
            if (i2 != -1) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            SeekBar seekBar = (SeekBar) nb1Var.q;
                            seekBar.setProgress(gi2.q(i - bVar.g0, 0, seekBar.getMax()));
                            bVar.q(bVar.m0, il3.HEIGHT);
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        SeekBar seekBar2 = (SeekBar) nb1Var.t;
                        seekBar2.setProgress(gi2.q(i - bVar.g0, 0, seekBar2.getMax()));
                        bVar.q(bVar.m0, il3.WIDTH);
                    }
                } else {
                    SeekBar seekBar3 = (SeekBar) nb1Var.r;
                    seekBar3.setProgress(gi2.q(i - bVar.g0, 0, seekBar3.getMax()));
                }
                bVar.q0 = false;
                int i4 = a.b[oj3Var.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2 && i4 != 3) {
                        i.d();
                        return;
                    }
                    q = ((LayoutEditorView) nb1Var.A).r(nj3Var, bVar.h0, bVar.i0);
                } else {
                    int max = ((SeekBar) nb1Var.r).getMax();
                    if (max >= 1) {
                        i3 = max;
                    }
                    q = ((LayoutEditorView) nb1Var.A).q(nj3Var, ((SeekBar) nb1Var.r).getProgress() / i3);
                }
                if (q) {
                    jl3 jl3Var = bVar.d0;
                    if (jl3Var != null) {
                        ((s63) jl3Var).x();
                    }
                    bVar.r(nj3Var);
                }
            } else {
                bVar.q0 = false;
            }
        }
        bVar.setShownEditablePropertyDialog(null);
        bVar.w0 = null;
    }

    private final List<LayoutEditorActivity.a> getMenuOptions() {
        kw3 I = hf.I();
        I.add(LayoutEditorActivity.a.PROPERTIES);
        I.add(LayoutEditorActivity.a.BACKGROUNDS);
        I.add(LayoutEditorActivity.a.REVERT);
        I.add(LayoutEditorActivity.a.RESET);
        yl3 viewModel = getViewModel();
        if (viewModel.f != null && viewModel.i.getValue() != null) {
            I.add(LayoutEditorActivity.a.SAVE_AS_NEW);
        }
        I.add(LayoutEditorActivity.a.SAVE_AND_EXIT);
        I.add(LayoutEditorActivity.a.EXIT_WITHOUT_SAVING);
        return hf.A(I);
    }

    private final boolean getShowBackgroundPropertiesDialog() {
        return ((Boolean) this.s0.getValue()).booleanValue();
    }

    private final boolean getShowLayoutPropertiesDialog() {
        return ((Boolean) this.r0.getValue()).booleanValue();
    }

    private final oj3 getShownEditablePropertyDialog() {
        return (oj3) this.t0.getValue();
    }

    private final uj3 getShownPositionDialog() {
        return (uj3) this.u0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yl3 getViewModel() {
        return (yl3) this.R.getValue();
    }

    public static void h(b bVar, List list, int i) {
        Object value;
        fk3 fk3Var;
        j37 j37Var = bVar.y0;
        String str = null;
        switch (a.d[((LayoutEditorActivity.a) list.get(i)).ordinal()]) {
            case 1:
                jl3 jl3Var = bVar.d0;
                if (jl3Var != null) {
                    ((s63) jl3Var).x();
                }
                bVar.setShowLayoutPropertiesDialog(true);
                return;
            case 2:
                jl3 jl3Var2 = bVar.d0;
                if (jl3Var2 != null) {
                    ((s63) jl3Var2).x();
                }
                bVar.setShowBackgroundPropertiesDialog(true);
                return;
            case 3:
                yl3 viewModel = bVar.getViewModel();
                viewModel.i.l(viewModel.g);
                return;
            case 4:
                tp6 tp6Var = bVar.getViewModel().i;
                do {
                    value = tp6Var.getValue();
                    fk3 fk3Var2 = (fk3) value;
                    if (fk3Var2 != null) {
                        fk3Var = fk3.a(fk3Var2, null, null, null, ck3.FOLLOW_SYSTEM, false, 50, zt1.A, 7);
                    } else {
                        fk3Var = null;
                    }
                } while (!tp6Var.j(value, fk3Var));
                return;
            case 5:
                fk3 fk3Var3 = (fk3) bVar.getViewModel().i.getValue();
                if (fk3Var3 != null) {
                    str = fk3Var3.b;
                }
                if (str != null) {
                    if (qs6.v0(str)) {
                        str = bVar.getResources().getString(R.string.custom_layout_default_name);
                        str.getClass();
                    }
                } else {
                    str = bVar.getResources().getString(R.string.custom_layout_default_name);
                    str.getClass();
                }
                j37.c(j37Var, str, new dl3(bVar, 0));
                return;
            case 6:
                fk3 fk3Var4 = (fk3) bVar.getViewModel().i.getValue();
                if (fk3Var4 != null) {
                    str = fk3Var4.b;
                }
                if (str != null && str.length() != 0) {
                    jl3 jl3Var3 = bVar.d0;
                    if (jl3Var3 != null) {
                        ((s63) jl3Var3).w();
                        return;
                    }
                    return;
                }
                String string = bVar.getResources().getString(R.string.custom_layout_default_name);
                string.getClass();
                j37.c(j37Var, string, new dl3(bVar, 1));
                return;
            case 7:
                jl3 jl3Var4 = bVar.d0;
                if (jl3Var4 != null) {
                    ((LayoutEditorActivity) ((s63) jl3Var4).B).finish();
                    return;
                }
                return;
            default:
                i.d();
                return;
        }
    }

    public static void i(b bVar, uj3 uj3Var) {
        uj3Var.getClass();
        bVar.x0 = uj3Var.a;
        bVar.setShownPositionDialog(uj3Var);
    }

    public static void j(b bVar, px0 px0Var, int i) {
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
        qa4 n;
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        xq2 xq2Var = (xq2) px0Var;
        if (xq2Var.S(i & 1, z)) {
            boolean showLayoutPropertiesDialog = bVar.getShowLayoutPropertiesDialog();
            nb1 nb1Var = bVar.L;
            Object obj = ox0.a;
            if (showLayoutPropertiesDialog) {
                xq2Var.b0(-233234850);
                fk3 fk3Var = (fk3) nb3.n(bVar.getViewModel().j, xq2Var).getValue();
                if (fk3Var != null) {
                    xq2Var.b0(-232995282);
                    boolean h = xq2Var.h(bVar);
                    Object P = xq2Var.P();
                    if (h || P == obj) {
                        P = new yk3(bVar, 1);
                        xq2Var.l0(P);
                    }
                    on2 on2Var = (on2) P;
                    boolean h2 = xq2Var.h(bVar);
                    Object P2 = xq2Var.P();
                    if (h2 || P2 == obj) {
                        P2 = new fj(bVar, 3);
                        xq2Var.l0(P2);
                    }
                    kn2.d(fk3Var, on2Var, (go2) P2, xq2Var, 0);
                    xq2Var.p(false);
                } else {
                    xq2Var.b0(-232424448);
                    xq2Var.p(false);
                }
                xq2Var.p(false);
            } else {
                xq2Var.b0(-232402624);
                xq2Var.p(false);
            }
            if (bVar.getShowBackgroundPropertiesDialog()) {
                xq2Var.b0(-232292140);
                int i9 = a.a[bVar.A.ordinal()];
                if (i9 != 1) {
                    if (i9 == 2) {
                        xq2Var.b0(962346271);
                        n = nb3.n((rp6) bVar.getViewModel().t.getValue(), xq2Var);
                        xq2Var.p(false);
                    } else {
                        throw xg6.f(xq2Var, 962338361, false);
                    }
                } else {
                    xq2Var.b0(962341887);
                    n = nb3.n((rp6) bVar.getViewModel().r.getValue(), xq2Var);
                    xq2Var.p(false);
                }
                lj3 lj3Var = (lj3) n.getValue();
                if (lj3Var != null) {
                    xq2Var.b0(-231801751);
                    UUID uuid = lj3Var.a;
                    BackgroundMode backgroundMode = lj3Var.b;
                    boolean h3 = xq2Var.h(bVar);
                    Object P3 = xq2Var.P();
                    if (h3 || P3 == obj) {
                        P3 = new xd1(bVar, null, 21);
                        xq2Var.l0(P3);
                    }
                    eo2 eo2Var = (eo2) P3;
                    boolean h4 = xq2Var.h(bVar) | xq2Var.h(lj3Var);
                    Object P4 = xq2Var.P();
                    if (h4 || P4 == obj) {
                        P4 = new ci2(8, bVar, lj3Var);
                        xq2Var.l0(P4);
                    }
                    on2 on2Var2 = (on2) P4;
                    boolean h5 = xq2Var.h(bVar);
                    Object P5 = xq2Var.P();
                    if (h5 || P5 == obj) {
                        P5 = new dl3(bVar, 2);
                        xq2Var.l0(P5);
                    }
                    qn2 qn2Var = (qn2) P5;
                    boolean h6 = xq2Var.h(bVar);
                    Object P6 = xq2Var.P();
                    if (h6 || P6 == obj) {
                        P6 = new yk3(bVar, 2);
                        xq2Var.l0(P6);
                    }
                    on2 on2Var3 = (on2) P6;
                    boolean h7 = xq2Var.h(bVar);
                    Object P7 = xq2Var.P();
                    if (h7 || P7 == obj) {
                        P7 = new yk3(bVar, 3);
                        xq2Var.l0(P7);
                    }
                    i2 = 3;
                    gi2.d(uuid, backgroundMode, eo2Var, on2Var2, qn2Var, on2Var3, (on2) P7, xq2Var, 0);
                    xq2Var.p(false);
                } else {
                    i2 = 3;
                    xq2Var.b0(-230672576);
                    xq2Var.p(false);
                }
                xq2Var.p(false);
            } else {
                i2 = 3;
                xq2Var.b0(-230650752);
                xq2Var.p(false);
            }
            oj3 shownEditablePropertyDialog = bVar.getShownEditablePropertyDialog();
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
                            progress = ((SeekBar) nb1Var.q).getProgress();
                            i8 = bVar.g0;
                        } else {
                            i.d();
                            return;
                        }
                    } else {
                        progress = ((SeekBar) nb1Var.t).getProgress();
                        i8 = bVar.g0;
                    }
                } else {
                    progress = ((SeekBar) nb1Var.r).getProgress();
                    i8 = bVar.g0;
                }
                i4 = progress + i8;
            } else {
                i4 = 0;
            }
            int i11 = bVar.g0;
            if (shownEditablePropertyDialog == null) {
                i5 = -1;
            } else {
                i5 = a.b[shownEditablePropertyDialog.ordinal()];
            }
            if (i5 != -1) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == i2) {
                            max = ((SeekBar) nb1Var.q).getMax();
                            i7 = bVar.g0;
                        } else {
                            i.d();
                            return;
                        }
                    } else {
                        max = ((SeekBar) nb1Var.t).getMax();
                        i7 = bVar.g0;
                    }
                } else {
                    max = ((SeekBar) nb1Var.r).getMax();
                    i7 = bVar.g0;
                }
                i6 = max + i7;
            } else {
                i6 = bVar.g0;
            }
            boolean h8 = xq2Var.h(bVar);
            if (shownEditablePropertyDialog != null) {
                i10 = shownEditablePropertyDialog.ordinal();
            }
            boolean d = h8 | xq2Var.d(i10);
            Object P8 = xq2Var.P();
            if (d || P8 == obj) {
                P8 = new bi2(11, bVar, shownEditablePropertyDialog);
                xq2Var.l0(P8);
            }
            qn2 qn2Var2 = (qn2) P8;
            boolean h9 = xq2Var.h(bVar);
            Object P9 = xq2Var.P();
            if (h9 || P9 == obj) {
                P9 = new yk3(bVar, 4);
                xq2Var.l0(P9);
            }
            oi2.a(shownEditablePropertyDialog, i4, i11, i6, qn2Var2, (on2) P9, xq2Var, 0);
            uj3 shownPositionDialog = bVar.getShownPositionDialog();
            boolean h10 = xq2Var.h(bVar);
            Object P10 = xq2Var.P();
            if (h10 || P10 == obj) {
                P10 = new yk3(bVar, 5);
                xq2Var.l0(P10);
            }
            on2 on2Var4 = (on2) P10;
            boolean h11 = xq2Var.h(bVar);
            Object P11 = xq2Var.P();
            if (h11 || P11 == obj) {
                P11 = new al3(bVar, 2);
                xq2Var.l0(P11);
            }
            ii2.h(shownPositionDialog, on2Var4, (eo2) P11, xq2Var, 0);
            mp2.e(yh2.O(xq2Var, R.string.layout_name), bVar.y0, null, null, xq2Var, 0, 12);
            return;
        }
        xq2Var.V();
    }

    public static void k(b bVar, int i, int i2) {
        nj3 nj3Var = bVar.x0;
        if (nj3Var == null) {
            uj3 shownPositionDialog = bVar.getShownPositionDialog();
            if (shownPositionDialog != null) {
                nj3Var = shownPositionDialog.a;
            } else {
                nj3Var = null;
            }
        }
        if (nj3Var != null) {
            LayoutEditorView layoutEditorView = (LayoutEditorView) bVar.L.A;
            zj3 zj3Var = layoutEditorView.getViews().get(nj3Var);
            if (zj3Var != null) {
                View view = zj3Var.a;
                int max = Math.max(0, layoutEditorView.getWidth() - view.getWidth());
                int max2 = Math.max(0, layoutEditorView.getHeight() - view.getHeight());
                int q = gi2.q(i, 0, max);
                int q2 = gi2.q(i2, 0, max2);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.leftMargin = q;
                    layoutParams2.topMargin = q2;
                    view.setLayoutParams(layoutParams2);
                    layoutEditorView.j0 = true;
                    layoutEditorView.p();
                    jl3 jl3Var = bVar.d0;
                    if (jl3Var != null) {
                        ((s63) jl3Var).x();
                    }
                    bVar.r(nj3Var);
                } else {
                    u34.x("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    return;
                }
            }
        }
        bVar.setShownPositionDialog(null);
        bVar.x0 = null;
    }

    public static void l(b bVar) {
        bVar.setShowLayoutPropertiesDialog(false);
    }

    public static void m(b bVar, BackgroundMode backgroundMode) {
        Object value;
        lj3 lj3Var;
        Object value2;
        lj3 lj3Var2;
        backgroundMode.getClass();
        yl3 viewModel = bVar.getViewModel();
        sn3 sn3Var = bVar.A;
        viewModel.getClass();
        sn3Var.getClass();
        int i = sl3.a[sn3Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                tp6 tp6Var = viewModel.s;
                do {
                    value2 = tp6Var.getValue();
                    lj3 lj3Var3 = (lj3) value2;
                    if (lj3Var3 != null) {
                        lj3Var2 = lj3.a(lj3Var3, null, backgroundMode, 1);
                    } else {
                        lj3Var2 = null;
                    }
                } while (!tp6Var.j(value2, lj3Var2));
                return;
            }
            i.d();
            return;
        }
        tp6 tp6Var2 = viewModel.q;
        do {
            value = tp6Var2.getValue();
            lj3 lj3Var4 = (lj3) value;
            if (lj3Var4 != null) {
                lj3Var = lj3.a(lj3Var4, null, backgroundMode, 1);
            } else {
                lj3Var = null;
            }
        } while (!tp6Var2.j(value, lj3Var));
    }

    public static void n(b bVar) {
        bVar.setShownPositionDialog(null);
        bVar.x0 = null;
    }

    private final void setShowBackgroundPropertiesDialog(boolean z) {
        this.s0.setValue(Boolean.valueOf(z));
    }

    private final void setShowLayoutPropertiesDialog(boolean z) {
        this.r0.setValue(Boolean.valueOf(z));
    }

    private final void setShownEditablePropertyDialog(oj3 oj3Var) {
        this.t0.setValue(oj3Var);
    }

    private final void setShownPositionDialog(uj3 uj3Var) {
        this.u0.setValue(uj3Var);
    }

    public final u66 A() {
        return new u66(getShowLayoutPropertiesDialog(), getShowBackgroundPropertiesDialog());
    }

    public final void B(zb zbVar) {
        ac l = zbVar.l();
        Window window = l.getWindow();
        if (window != null) {
            window.setType(1003);
            window.getAttributes().token = getWindowToken();
        }
        l.show();
    }

    public final void C(t26 t26Var) {
        Uri uri;
        Bitmap bitmap;
        t26Var.getClass();
        n00 n00Var = t26Var.a;
        if (n00Var != null) {
            uri = n00Var.c;
        } else {
            uri = null;
        }
        sw4 sw4Var = this.B;
        sw4Var.getClass();
        sk5 sk5Var = new sk5(sw4Var, uri);
        ImageView imageView = (ImageView) this.L.e;
        yc1 yc1Var = new yc1(this, t26Var);
        ap3 ap3Var = sk5Var.a;
        Uri uri2 = (Uri) ap3Var.B;
        System.nanoTime();
        StringBuilder sb = ck7.a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            if (uri2 == null) {
                sw4Var.a(imageView);
                int i = tw4.e;
                imageView.setImageDrawable(null);
                if (imageView.getDrawable() instanceof Animatable) {
                    ((Animatable) imageView.getDrawable()).start();
                    return;
                }
                return;
            }
            sk5.b.getAndIncrement();
            if (((rw4) ap3Var.L) == null) {
                ap3Var.L = rw4.NORMAL;
            }
            m44 m44Var = new m44(uri2, (rw4) ap3Var.L);
            StringBuilder sb2 = ck7.a;
            String uri3 = uri2.toString();
            sb2.ensureCapacity(uri3.length() + 50);
            sb2.append(uri3);
            sb2.append('\n');
            String sb3 = sb2.toString();
            sb2.setLength(0);
            if (e44.shouldReadFromMemoryCache(0)) {
                xz3 xz3Var = (xz3) ((nr1) sw4Var.d.B).get(sb3);
                if (xz3Var != null) {
                    bitmap = xz3Var.a;
                } else {
                    bitmap = null;
                }
                pq6 pq6Var = sw4Var.e;
                if (bitmap != null) {
                    pq6Var.b.sendEmptyMessage(0);
                } else {
                    pq6Var.b.sendEmptyMessage(1);
                }
                if (bitmap != null) {
                    sw4Var.a(imageView);
                    Context context = sw4Var.b;
                    qw4 qw4Var = qw4.MEMORY;
                    int i2 = tw4.e;
                    Drawable drawable = imageView.getDrawable();
                    if (drawable instanceof Animatable) {
                        ((Animatable) drawable).stop();
                    }
                    imageView.setImageDrawable(new tw4(context, bitmap, drawable, qw4Var));
                    yc1Var.I();
                    return;
                }
            }
            int i3 = tw4.e;
            imageView.setImageDrawable(null);
            if (imageView.getDrawable() instanceof Animatable) {
                ((Animatable) imageView.getDrawable()).start();
            }
            sw4Var.c(new i33(sw4Var, imageView, m44Var, sb3, yc1Var));
            return;
        }
        i.m("Method call should happen from the main thread.");
    }

    public final ImageView getImageBackground() {
        return (ImageView) this.L.e;
    }

    public final LayoutEditorView getLayoutEditorView() {
        return (LayoutEditorView) this.L.A;
    }

    public final jl3 getListener() {
        return this.d0;
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
        nb1 nb1Var = this.L;
        SeekBar seekBar = (SeekBar) nb1Var.q;
        SeekBar seekBar2 = (SeekBar) nb1Var.t;
        if (((LayoutEditorView) nb1Var.A).h0 == null || !this.f0) {
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
        this.q0 = true;
        try {
            seekBar2.setProgress(gi2.q((max * i) + seekBar2.getProgress(), 0, seekBar2.getMax()));
            this.h0 = seekBar2.getProgress() / seekBar2.getMax();
            ((TextView) nb1Var.z).setText(String.valueOf((int) ((seekBar2.getMax() * this.h0) + this.g0)));
            if (this.j0 && this.m0.getRatio() != null) {
                q(this.m0, il3.WIDTH);
            } else {
                int max2 = seekBar.getMax() / 40;
                if (max2 >= 1) {
                    i2 = max2;
                }
                seekBar.setProgress(gi2.q((i * i2) + seekBar.getProgress(), 0, seekBar.getMax()));
                this.i0 = seekBar.getProgress() / seekBar.getMax();
                ((TextView) nb1Var.w).setText(String.valueOf((int) ((seekBar.getMax() * this.i0) + this.g0)));
            }
            this.q0 = false;
            ((LayoutEditorView) nb1Var.A).u(this.h0, this.i0);
        } catch (Throwable th) {
            this.q0 = false;
            throw th;
        }
    }

    public final void q(kl3 kl3Var, il3 il3Var) {
        float progress;
        float f;
        Float ratio = kl3Var.getRatio();
        if (ratio != null) {
            float floatValue = ratio.floatValue();
            nb1 nb1Var = this.L;
            SeekBar seekBar = (SeekBar) nb1Var.t;
            SeekBar seekBar2 = (SeekBar) nb1Var.q;
            float max = ((SeekBar) nb1Var.t).getMax() / seekBar2.getMax();
            int i = a.e[il3Var.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    f = seekBar2.getProgress() + this.g0;
                    progress = f * floatValue;
                } else {
                    i.d();
                    return;
                }
            } else {
                progress = this.g0 + seekBar.getProgress();
                f = progress / floatValue;
            }
            float floatValue2 = kl3Var.getRatio().floatValue() * this.g0;
            float f2 = this.g0;
            float min = Math.min(seekBar.getMax() + this.g0, (seekBar2.getMax() + this.g0) * floatValue);
            float min2 = Math.min(seekBar2.getMax() + this.g0, (seekBar.getMax() + this.g0) / floatValue);
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
            float p = gi2.p((min - this.g0) / seekBar.getMax(), RecyclerView.B1, 1.0f);
            this.h0 = p;
            seekBar.setProgress((int) (p * seekBar.getMax()));
            ((TextView) nb1Var.z).setText(String.valueOf((int) ((seekBar.getMax() * this.h0) + this.g0)));
            float p2 = gi2.p((min2 - this.g0) / seekBar2.getMax(), RecyclerView.B1, 1.0f);
            this.i0 = p2;
            seekBar2.setProgress((int) (p2 * seekBar2.getMax()));
            ((TextView) nb1Var.w).setText(String.valueOf((int) ((seekBar2.getMax() * this.i0) + this.g0)));
        }
    }

    public final void r(nj3 nj3Var) {
        LayoutEditorView layoutEditorView = (LayoutEditorView) this.L.A;
        zj3 zj3Var = layoutEditorView.getViews().get(nj3Var);
        if (zj3Var != null && zj3Var != layoutEditorView.h0) {
            zj3Var.a.setAlpha(0.5f);
            zj3Var.c(false);
            qn2 qn2Var = layoutEditorView.d0;
            if (qn2Var != null) {
                qn2Var.g(zj3Var);
            }
        }
        layoutEditorView.n();
        u(true);
    }

    public final void s() {
        if (this.f0) {
            u(true);
        } else {
            x();
        }
    }

    public final void setListener(jl3 jl3Var) {
        this.d0 = jl3Var;
    }

    public final boolean t(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && !v()) {
            nb1 nb1Var = this.L;
            LayoutEditorView layoutEditorView = (LayoutEditorView) nb1Var.A;
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 66) {
                if (keyCode != 82 && keyCode != 108) {
                    if (keyCode != 96) {
                        if (keyCode != 97) {
                            switch (keyCode) {
                                case 19:
                                case 20:
                                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                case 22:
                                    zj3 zj3Var = layoutEditorView.h0;
                                    if (zj3Var != null) {
                                        if (zj3Var != null) {
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
                                                    layoutEditorView.o(zj3Var, RecyclerView.B1, -f);
                                                    return true;
                                                case 20:
                                                    layoutEditorView.o(zj3Var, RecyclerView.B1, f);
                                                    return true;
                                                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                                    layoutEditorView.o(zj3Var, -width, RecyclerView.B1);
                                                    return true;
                                                case 22:
                                                    layoutEditorView.o(zj3Var, width, RecyclerView.B1);
                                                    return true;
                                            }
                                        }
                                        return true;
                                    }
                                    layoutEditorView.l(true);
                                    return true;
                                case ConnectionResult.API_DISABLED /* 23 */:
                                    break;
                                default:
                                    switch (keyCode) {
                                        case MlKitException.MODEL_HASH_MISMATCH /* 102 */:
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
                        } else if (layoutEditorView.h0 != null) {
                            layoutEditorView.n();
                            return true;
                        } else {
                            s();
                            return true;
                        }
                    }
                } else {
                    x();
                    return true;
                }
            }
            if (layoutEditorView.h0 != null) {
                LayoutEditorView layoutEditorView2 = (LayoutEditorView) nb1Var.A;
                if (layoutEditorView2.h0 != null) {
                    List<Number> c0 = hf.c0(Integer.valueOf((int) R.string.label_position), Integer.valueOf((int) R.string.label_size), Integer.valueOf((int) R.string.center_horizontal), Integer.valueOf((int) R.string.center_vertical), Integer.valueOf((int) R.string.delete));
                    zb zbVar = new zb(new ContextThemeWrapper(getContext(), (int) R.style.AppTheme));
                    zbVar.z(R.string.edit);
                    ArrayList arrayList = new ArrayList(ht0.v0(c0, 10));
                    for (Number number : c0) {
                        arrayList.add(getResources().getString(number.intValue()));
                    }
                    zbVar.v((CharSequence[]) arrayList.toArray(new String[0]), new qu1(c0, this, layoutEditorView2, 1));
                    zbVar.x(R.string.cancel, null);
                    B(zbVar);
                }
                return true;
            }
            w();
            return true;
        }
        return false;
    }

    public final void u(boolean z) {
        if (!this.f0) {
            return;
        }
        nb1 nb1Var = this.L;
        ScrollView scrollView = (ScrollView) nb1Var.k;
        ((ScrollView) nb1Var.k).animate().cancel();
        if (z) {
            scrollView.post(new cl3(this, 0));
        } else {
            scrollView.setY(scrollView.getBottom());
            scrollView.setVisibility(4);
        }
        this.f0 = false;
    }

    public final boolean v() {
        if (getShownEditablePropertyDialog() == null && getShownPositionDialog() == null) {
            return false;
        }
        return true;
    }

    public final void w() {
        nb1 nb1Var = this.L;
        ((LinearLayout) nb1Var.i).setVisibility(0);
        this.e0 = true;
        final List<nj3> k1 = gt0.k1(nj3.getEntries());
        List<nj3> instantiatedComponents = ((LayoutEditorView) nb1Var.A).getInstantiatedComponents();
        int size = k1.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = instantiatedComponents.contains(k1.get(i));
        }
        zb zbVar = new zb(new ContextThemeWrapper(getContext(), (int) R.style.AppTheme));
        zbVar.z(R.string.components_visibility_title);
        ArrayList arrayList = new ArrayList(ht0.v0(k1, 10));
        for (nj3 nj3Var : k1) {
            arrayList.add(getResources().getString(xk2.n(nj3Var)));
        }
        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener = new DialogInterface.OnMultiChoiceClickListener() { // from class: bl3
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                nj3 nj3Var2 = (nj3) k1.get(i2);
                b bVar = this;
                nb1 nb1Var2 = bVar.L;
                if (z) {
                    ((LayoutEditorView) nb1Var2.A).g(nj3Var2);
                } else {
                    LayoutEditorView layoutEditorView = (LayoutEditorView) nb1Var2.A;
                    nj3Var2.getClass();
                    zj3 zj3Var = layoutEditorView.getViews().get(nj3Var2);
                    if (zj3Var != null) {
                        if (nb3.k(layoutEditorView.h0, zj3Var)) {
                            layoutEditorView.n();
                        }
                        layoutEditorView.removeView(zj3Var.a);
                        layoutEditorView.getViews().remove(nj3Var2);
                        layoutEditorView.j0 = true;
                        layoutEditorView.p();
                    }
                }
                jl3 jl3Var = bVar.d0;
                if (jl3Var != null) {
                    ((s63) jl3Var).x();
                }
            }
        };
        wb wbVar = (wb) zbVar.L;
        wbVar.q = (CharSequence[]) arrayList.toArray(new String[0]);
        wbVar.z = onMultiChoiceClickListener;
        wbVar.v = zArr;
        wbVar.w = true;
        zbVar.y(R.string.ok, null);
        B(zbVar);
    }

    public final void x() {
        jl3 jl3Var = this.d0;
        if (jl3Var != null) {
            ((s63) jl3Var).x();
        }
        List<LayoutEditorActivity.a> menuOptions = getMenuOptions();
        int size = menuOptions.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = getResources().getString(menuOptions.get(i).getStringRes());
        }
        zb zbVar = new zb(new ContextThemeWrapper(getContext(), (int) R.style.AppTheme));
        zbVar.z(R.string.menu);
        zbVar.v(strArr, new nu1(2, this, menuOptions));
        zbVar.x(R.string.cancel, null);
        B(zbVar);
    }

    public final void y() {
        nj3 nj3Var = this.v0;
        nb1 nb1Var = this.L;
        if (nj3Var == null) {
            nj3Var = ((LayoutEditorView) nb1Var.A).getSelectedComponent();
        }
        uj3 uj3Var = null;
        this.v0 = null;
        if (nj3Var != null) {
            LayoutEditorView layoutEditorView = (LayoutEditorView) nb1Var.A;
            zj3 zj3Var = layoutEditorView.getViews().get(nj3Var);
            if (zj3Var != null) {
                uj3Var = layoutEditorView.i(zj3Var);
            }
            if (uj3Var == null) {
                return;
            }
            this.x0 = nj3Var;
            setShownPositionDialog(uj3Var);
        }
    }

    public final void z(oj3 oj3Var) {
        nj3 nj3Var = this.v0;
        if (nj3Var == null) {
            nj3Var = ((LayoutEditorView) this.L.A).getSelectedComponent();
        }
        this.v0 = null;
        if (nj3Var == null) {
            return;
        }
        this.w0 = nj3Var;
        setShownEditablePropertyDialog(oj3Var);
    }
}

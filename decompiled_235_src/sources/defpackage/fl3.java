package defpackage;

import android.content.ContextWrapper;
import android.view.KeyEvent;
import android.widget.SeekBar;
import android.widget.TextView;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fl3  reason: default package */
/* loaded from: classes.dex */
public final class fl3 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ ContextWrapper c;

    public /* synthetic */ fl3(b bVar, ContextWrapper contextWrapper, int i) {
        this.a = i;
        this.b = bVar;
        this.c = contextWrapper;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        nj3 selectedComponent;
        KeyEvent.Callback callback;
        nj3 selectedComponent2;
        KeyEvent.Callback callback2;
        int i2 = this.a;
        ContextWrapper contextWrapper = this.c;
        b bVar = this.b;
        s64 s64Var = null;
        seekBar.getClass();
        switch (i2) {
            case 0:
                nb1 nb1Var = bVar.L;
                ((TextView) nb1Var.y).setText(i + "%");
                if (z && (selectedComponent = ((LayoutEditorView) nb1Var.A).getSelectedComponent()) == nj3.BUTTONS) {
                    float f = i / 100.0f;
                    zj3 d = ((LayoutEditorView) nb1Var.A).d(selectedComponent);
                    if (d != null) {
                        callback = d.a;
                    } else {
                        callback = null;
                    }
                    if (callback instanceof s64) {
                        s64Var = (s64) callback;
                    }
                    if (s64Var != null) {
                        s64Var.setButtonSpread(f);
                    }
                    contextWrapper.getSharedPreferences(v15.b(contextWrapper), 0).edit().putFloat("pref_button_cluster_spread", f).apply();
                    jl3 listener = bVar.getListener();
                    if (listener != null) {
                        ((s63) listener).x();
                        return;
                    }
                    return;
                }
                return;
            default:
                nb1 nb1Var2 = bVar.L;
                ((TextView) nb1Var2.v).setText(i + "%");
                if (z && (selectedComponent2 = ((LayoutEditorView) nb1Var2.A).getSelectedComponent()) == nj3.BUTTONS) {
                    float f2 = i / 100.0f;
                    zj3 d2 = ((LayoutEditorView) nb1Var2.A).d(selectedComponent2);
                    if (d2 != null) {
                        callback2 = d2.a;
                    } else {
                        callback2 = null;
                    }
                    if (callback2 instanceof s64) {
                        s64Var = (s64) callback2;
                    }
                    if (s64Var != null) {
                        s64Var.setButtonInnerScale(f2);
                    }
                    contextWrapper.getSharedPreferences(v15.b(contextWrapper), 0).edit().putFloat("pref_button_cluster_inner_scale", f2).apply();
                    jl3 listener2 = bVar.getListener();
                    if (listener2 != null) {
                        ((s63) listener2).x();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i = this.a;
        seekBar.getClass();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i = this.a;
        seekBar.getClass();
    }
}

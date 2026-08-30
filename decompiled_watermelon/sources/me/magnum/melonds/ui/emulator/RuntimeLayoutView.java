package me.magnum.melonds.ui.emulator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class RuntimeLayoutView extends wg3 implements el2 {
    public ws R;
    public final boolean c0;
    public hw6 d0;
    public es5 e0;
    public fi2 f0;
    public qu2 g0;
    public boolean h0;
    public boolean i0;
    public rw0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        if (!isInEditMode() && !this.c0) {
            this.c0 = true;
            this.d0 = (hw6) ((c81) ((hs5) d())).a.Q.get();
        }
        this.h0 = true;
        this.j0 = qw0.a;
    }

    @Override // defpackage.dl2
    public final Object d() {
        if (this.R == null) {
            this.R = new ws(this);
        }
        return this.R.d();
    }

    public final void g(vc3 vc3Var, boolean z) {
        KeyEvent.Callback callback;
        vc3Var.getClass();
        hd3 c = c(vc3Var);
        iv6 iv6Var = null;
        if (c != null) {
            callback = c.a;
        } else {
            callback = null;
        }
        if (callback instanceof iv6) {
            iv6Var = (iv6) callback;
        }
        if (iv6Var == null) {
            return;
        }
        iv6Var.setToggleState(z);
    }

    public final hw6 getTouchVibrator() {
        hw6 hw6Var = this.d0;
        if (hw6Var != null) {
            return hw6Var;
        }
        b53.g0("touchVibrator");
        throw null;
    }

    public final void h() {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View view8;
        View view9;
        View view10;
        View view11;
        View view12;
        View view13;
        View view14;
        View view15;
        View view16;
        es5 es5Var = this.e0;
        if (es5Var == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        float f = es5Var.b / 100.0f;
        boolean z = es5Var.c;
        qu2 qu2Var = this.g0;
        if (qu2Var != null) {
            hd3 c = c(vc3.DPAD);
            if (c != null && (view16 = c.a) != null) {
                hw6 touchVibrator = getTouchVibrator();
                touchVibrator.getClass();
                view16.setOnTouchListener(new h70(qu2Var, z, touchVibrator, 1));
            }
            hd3 c2 = c(vc3.BUTTONS);
            if (c2 != null && (view15 = c2.a) != null) {
                hw6 touchVibrator2 = getTouchVibrator();
                touchVibrator2.getClass();
                view15.setOnTouchListener(new h70(qu2Var, z, touchVibrator2, 0));
            }
            hd3 c3 = c(vc3.BUTTON_L);
            if (c3 != null && (view14 = c3.a) != null) {
                view14.setOnTouchListener(new q66(qu2Var, yz2.L, z, getTouchVibrator()));
            }
            hd3 c4 = c(vc3.BUTTON_R);
            if (c4 != null && (view13 = c4.a) != null) {
                view13.setOnTouchListener(new q66(qu2Var, yz2.R, z, getTouchVibrator()));
            }
            hd3 c5 = c(vc3.BUTTON_SELECT);
            if (c5 != null && (view12 = c5.a) != null) {
                view12.setOnTouchListener(new q66(qu2Var, yz2.SELECT, z, getTouchVibrator()));
            }
            hd3 c6 = c(vc3.BUTTON_START);
            if (c6 != null && (view11 = c6.a) != null) {
                view11.setOnTouchListener(new q66(qu2Var, yz2.START, z, getTouchVibrator()));
            }
            hd3 c7 = c(vc3.BUTTON_HINGE);
            if (c7 != null && (view10 = c7.a) != null) {
                view10.setOnTouchListener(new q66(qu2Var, yz2.HINGE, z, getTouchVibrator()));
            }
        }
        fi2 fi2Var = this.f0;
        if (fi2Var != null) {
            hd3 c8 = c(vc3.BUTTON_RESET);
            if (c8 != null && (view9 = c8.a) != null) {
                view9.setOnTouchListener(new q66(fi2Var, yz2.RESET, z, getTouchVibrator()));
            }
            hd3 c9 = c(vc3.BUTTON_PAUSE);
            if (c9 != null && (view8 = c9.a) != null) {
                view8.setOnTouchListener(new q66(fi2Var, yz2.PAUSE, z, getTouchVibrator()));
            }
            hd3 c10 = c(vc3.BUTTON_FAST_FORWARD_TOGGLE);
            if (c10 != null && (view7 = c10.a) != null) {
                view7.setOnTouchListener(new q66(fi2Var, yz2.FAST_FORWARD, z, getTouchVibrator()));
            }
            hd3 c11 = c(vc3.BUTTON_MICROPHONE_TOGGLE);
            if (c11 != null && (view6 = c11.a) != null) {
                view6.setOnTouchListener(new q66(fi2Var, yz2.MICROPHONE, z, getTouchVibrator()));
            }
            hd3 c12 = c(vc3.BUTTON_TOGGLE_SOFT_INPUT);
            if (c12 != null && (view5 = c12.a) != null) {
                view5.setOnTouchListener(new q66(fi2Var, yz2.TOGGLE_SOFT_INPUT, z, getTouchVibrator()));
            }
            hd3 c13 = c(vc3.BUTTON_SWAP_SCREENS);
            if (c13 != null && (view4 = c13.a) != null) {
                view4.setOnTouchListener(new q66(fi2Var, yz2.SWAP_SCREENS, z, getTouchVibrator()));
            }
            hd3 c14 = c(vc3.BUTTON_QUICK_SAVE);
            if (c14 != null && (view3 = c14.a) != null) {
                view3.setOnTouchListener(new q66(fi2Var, yz2.QUICK_SAVE, z, getTouchVibrator()));
            }
            hd3 c15 = c(vc3.BUTTON_QUICK_LOAD);
            if (c15 != null && (view2 = c15.a) != null) {
                view2.setOnTouchListener(new q66(fi2Var, yz2.QUICK_LOAD, z, getTouchVibrator()));
            }
            hd3 c16 = c(vc3.BUTTON_REWIND);
            if (c16 != null && (view = c16.a) != null) {
                view.setOnTouchListener(new q66(fi2Var, yz2.REWIND, z, getTouchVibrator()));
            }
        }
        for (hd3 hd3Var : getLayoutComponentViews()) {
            if (!hd3Var.b.isScreen()) {
                hd3Var.a.setAlpha(f);
            }
        }
        i();
    }

    public final void i() {
        ti4 ti4Var;
        View view;
        View view2;
        View view3;
        if (this.i0) {
            ti4Var = new ti4(vc3.TOP_SCREEN, vc3.BOTTOM_SCREEN);
        } else {
            ti4Var = new ti4(vc3.BOTTOM_SCREEN, vc3.TOP_SCREEN);
        }
        vc3 vc3Var = (vc3) ti4Var.A;
        vc3 vc3Var2 = (vc3) ti4Var.B;
        qu2 qu2Var = this.g0;
        if (qu2Var != null) {
            hd3 c = c(vc3Var);
            if (c != null && (view3 = c.a) != null) {
                view3.setOnTouchListener(new ou2(qu2Var, 1));
            }
            hd3 c2 = c(vc3.HYBRID_SCREEN);
            if (c2 != null && (view2 = c2.a) != null) {
                view2.setOnTouchListener(new ou2(qu2Var, 0));
            }
        }
        hd3 c3 = c(vc3Var2);
        if (c3 != null && (view = c3.a) != null) {
            view.setOnTouchListener(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [pp1] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.emulator.RuntimeLayoutView.j():void");
    }

    public final void setConnectedControllersState(rw0 rw0Var) {
        rw0Var.getClass();
        this.j0 = rw0Var;
        j();
    }

    public final void setFrontendInputHandler(fi2 fi2Var) {
        fi2Var.getClass();
        this.f0 = fi2Var;
        h();
    }

    public final void setSystemInputHandler(qu2 qu2Var) {
        qu2Var.getClass();
        this.g0 = qu2Var;
        h();
    }

    public final void setTouchVibrator(hw6 hw6Var) {
        hw6Var.getClass();
        this.d0 = hw6Var;
    }
}

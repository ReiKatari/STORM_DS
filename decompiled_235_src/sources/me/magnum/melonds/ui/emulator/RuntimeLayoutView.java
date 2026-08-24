package me.magnum.melonds.ui.emulator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RuntimeLayoutView extends un3 implements kr2 {
    public mt R;
    public final boolean d0;
    public u87 e0;
    public w26 f0;
    public fn2 g0;
    public s03 h0;
    public boolean i0;
    public boolean j0;
    public oz0 k0;
    public boolean l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        if (!isInEditMode() && !this.d0) {
            this.d0 = true;
            this.e0 = (u87) ((tb1) ((z26) c())).a.R.get();
        }
        this.i0 = true;
        this.k0 = nz0.a;
        setMotionEventSplittingEnabled(true);
        this.l0 = true;
    }

    @Override // defpackage.jr2
    public final Object c() {
        if (this.R == null) {
            this.R = new mt(this);
        }
        return this.R.c();
    }

    public final void g(int i, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        if (z) {
            int height = getHeight();
            for (zj3 zj3Var : getLayoutComponentViews()) {
                if (!zj3Var.b.isScreen()) {
                    View view = zj3Var.a;
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                        layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                    } else {
                        layoutParams = null;
                    }
                    if (layoutParams != null) {
                        int i2 = height > 0 ? (height - layoutParams.height) - 4 : Integer.MAX_VALUE;
                        int i3 = layoutParams.topMargin;
                        int i4 = i3 + i;
                        if (i4 <= i2) {
                            i2 = i4;
                        }
                        if (i2 != i3) {
                            layoutParams.topMargin = i2;
                            view.setLayoutParams(layoutParams);
                        }
                    }
                }
            }
        }
    }

    public final u87 getTouchVibrator() {
        u87 u87Var = this.e0;
        if (u87Var != null) {
            return u87Var;
        }
        nb3.a0("touchVibrator");
        throw null;
    }

    public final void h(nj3 nj3Var, boolean z) {
        KeyEvent.Callback callback;
        nj3Var.getClass();
        zj3 d = d(nj3Var);
        w64 w64Var = null;
        if (d != null) {
            callback = d.a;
        } else {
            callback = null;
        }
        if (callback instanceof w64) {
            w64Var = (w64) callback;
        }
        if (w64Var != null) {
            w64Var.setToggleState(z);
        }
    }

    public final void i() {
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
        View view17;
        View view18;
        w26 w26Var = this.f0;
        if (w26Var == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        float f = w26Var.b / 100.0f;
        boolean z = w26Var.c;
        s03 s03Var = this.h0;
        if (s03Var != null) {
            zj3 d = d(nj3.DPAD);
            if (d != null && (view18 = d.a) != null) {
                view18.setOnTouchListener(new vm1(s03Var, z, getTouchVibrator()));
            }
            zj3 d2 = d(nj3.BUTTONS);
            if (d2 != null && (view17 = d2.a) != null) {
                u87 touchVibrator = getTouchVibrator();
                touchVibrator.getClass();
                view17.setOnTouchListener(new q84(s03Var, z, touchVibrator));
            }
            zj3 d3 = d(nj3.BUTTON_L);
            if (d3 != null && (view16 = d3.a) != null) {
                view16.setOnTouchListener(new gi6(s03Var, b63.L, z, getTouchVibrator()));
            }
            zj3 d4 = d(nj3.BUTTON_R);
            if (d4 != null && (view15 = d4.a) != null) {
                view15.setOnTouchListener(new gi6(s03Var, b63.R, z, getTouchVibrator()));
            }
            zj3 d5 = d(nj3.BUTTON_SELECT);
            if (d5 != null && (view14 = d5.a) != null) {
                view14.setOnTouchListener(new gi6(s03Var, b63.SELECT, z, getTouchVibrator()));
            }
            zj3 d6 = d(nj3.BUTTON_START);
            if (d6 != null && (view13 = d6.a) != null) {
                view13.setOnTouchListener(new gi6(s03Var, b63.START, z, getTouchVibrator()));
            }
            zj3 d7 = d(nj3.BUTTON_HINGE);
            if (d7 != null && (view12 = d7.a) != null) {
                view12.setOnTouchListener(new gi6(s03Var, b63.HINGE, z, getTouchVibrator()));
            }
        }
        fn2 fn2Var = this.g0;
        if (fn2Var != null) {
            zj3 d8 = d(nj3.BUTTON_RESET);
            if (d8 != null && (view11 = d8.a) != null) {
                view11.setOnTouchListener(new gi6(fn2Var, b63.RESET, z, getTouchVibrator()));
            }
            zj3 d9 = d(nj3.BUTTON_PAUSE);
            if (d9 != null && (view10 = d9.a) != null) {
                view10.setOnTouchListener(new gi6(fn2Var, b63.PAUSE, z, getTouchVibrator()));
            }
            zj3 d10 = d(nj3.BUTTON_FAST_FORWARD_TOGGLE);
            if (d10 != null && (view9 = d10.a) != null) {
                view9.setOnTouchListener(new gi6(fn2Var, b63.FAST_FORWARD, z, getTouchVibrator()));
            }
            zj3 d11 = d(nj3.BUTTON_MICROPHONE_TOGGLE);
            if (d11 != null && (view8 = d11.a) != null) {
                view8.setOnTouchListener(new gi6(fn2Var, b63.MICROPHONE, z, getTouchVibrator()));
            }
            zj3 d12 = d(nj3.BUTTON_TOGGLE_SOFT_INPUT);
            if (d12 != null && (view7 = d12.a) != null) {
                view7.setOnTouchListener(new gi6(fn2Var, b63.TOGGLE_SOFT_INPUT, z, getTouchVibrator()));
            }
            zj3 d13 = d(nj3.BUTTON_SWAP_SCREENS);
            if (d13 != null && (view6 = d13.a) != null) {
                view6.setOnTouchListener(new gi6(fn2Var, b63.SWAP_SCREENS, z, getTouchVibrator()));
            }
            zj3 d14 = d(nj3.BUTTON_QUICK_SAVE);
            if (d14 != null && (view5 = d14.a) != null) {
                view5.setOnTouchListener(new gi6(fn2Var, b63.QUICK_SAVE, z, getTouchVibrator()));
            }
            zj3 d15 = d(nj3.BUTTON_QUICK_LOAD);
            if (d15 != null && (view4 = d15.a) != null) {
                view4.setOnTouchListener(new gi6(fn2Var, b63.QUICK_LOAD, z, getTouchVibrator()));
            }
            zj3 d16 = d(nj3.BUTTON_REWIND);
            if (d16 != null && (view3 = d16.a) != null) {
                view3.setOnTouchListener(new gi6(fn2Var, b63.REWIND, z, getTouchVibrator()));
            }
            zj3 d17 = d(nj3.BUTTON_TRANSLATE);
            if (d17 != null && (view2 = d17.a) != null) {
                view2.setOnTouchListener(new gi6(fn2Var, b63.TRANSLATE, z, getTouchVibrator()));
            }
            zj3 d18 = d(nj3.BUTTON_TOGGLE_EXTRA_BUTTONS);
            if (d18 != null && (view = d18.a) != null) {
                view.setOnTouchListener(new gi6(fn2Var, b63.TOGGLE_EXTRA_BUTTONS, z, getTouchVibrator()));
            }
        }
        for (zj3 zj3Var : getLayoutComponentViews()) {
            nj3 nj3Var = zj3Var.b;
            View view19 = zj3Var.a;
            if (nj3Var == nj3.BUTTON_TRANSLATE) {
                view19.setVisibility(8);
            } else if (!nj3Var.isScreen()) {
                view19.setAlpha(f);
            }
        }
        j();
    }

    public final void j() {
        vr4 vr4Var;
        View view;
        View view2;
        View view3;
        if (this.j0) {
            vr4Var = new vr4(nj3.TOP_SCREEN, nj3.BOTTOM_SCREEN);
        } else {
            vr4Var = new vr4(nj3.BOTTOM_SCREEN, nj3.TOP_SCREEN);
        }
        nj3 nj3Var = (nj3) vr4Var.A;
        nj3 nj3Var2 = (nj3) vr4Var.B;
        s03 s03Var = this.h0;
        if (s03Var != null) {
            zj3 d = d(nj3Var);
            if (d != null && (view3 = d.a) != null) {
                view3.setOnTouchListener(new p03(s03Var, 1));
            }
            zj3 d2 = d(nj3.HYBRID_SCREEN);
            if (d2 != null && (view2 = d2.a) != null) {
                view2.setOnTouchListener(new p03(s03Var, 0));
            }
        }
        zj3 d3 = d(nj3Var2);
        if (d3 != null && (view = d3.a) != null) {
            view.setOnTouchListener(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [yt1] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        um6 um6Var;
        int i;
        int size;
        int i2;
        zj3 d;
        View view;
        zj3 d2;
        View view2;
        oz0 oz0Var = this.k0;
        w26 w26Var = this.f0;
        if (w26Var != null) {
            um6Var = w26Var.a;
        } else {
            um6Var = null;
        }
        if (um6Var == null) {
            i = -1;
        } else {
            i = y26.a[um6Var.ordinal()];
        }
        nz0 nz0Var = nz0.a;
        ?? r4 = yt1.A;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            r4 = gt0.k1(nj3.getEntries());
                        } else {
                            i.d();
                            return;
                        }
                    } else if (!nb3.k(oz0Var, nz0Var)) {
                        if (oz0Var instanceof mz0) {
                            t52 entries = nj3.getEntries();
                            r4 = new ArrayList();
                            for (Object obj : entries) {
                                List<b63> matchingInputs = ((nj3) obj).getMatchingInputs();
                                if (matchingInputs == null || !matchingInputs.isEmpty()) {
                                    for (b63 b63Var : matchingInputs) {
                                        if (!((mz0) oz0Var).a.contains(b63Var)) {
                                            break;
                                        }
                                    }
                                }
                                r4.add(obj);
                            }
                        } else {
                            i.d();
                            return;
                        }
                    }
                }
            }
            ArrayList<nj3> arrayList = r4;
            if (!this.i0) {
                if (r4.contains(nj3.BUTTON_TOGGLE_SOFT_INPUT)) {
                    arrayList = gt0.k1(nj3.getEntries());
                } else {
                    List k1 = gt0.k1(nj3.getEntries());
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : k1) {
                        if (((nj3) obj2) != nj3.BUTTON_TOGGLE_SOFT_INPUT) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = arrayList2;
                }
            }
            t52 entries2 = nj3.getEntries();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : entries2) {
                if (!arrayList.contains((nj3) obj3)) {
                    arrayList3.add(obj3);
                }
            }
            for (nj3 nj3Var : arrayList) {
                if (!nj3Var.isScreen() && (d2 = d(nj3Var)) != null && (view2 = d2.a) != null) {
                    view2.setVisibility(8);
                }
            }
            size = arrayList3.size();
            i2 = 0;
            while (i2 < size) {
                Object obj4 = arrayList3.get(i2);
                i2++;
                nj3 nj3Var2 = (nj3) obj4;
                if (!nj3Var2.isScreen() && (d = d(nj3Var2)) != null && (view = d.a) != null) {
                    view.setVisibility(0);
                }
            }
        }
        if (!nb3.k(oz0Var, nz0Var)) {
            if (oz0Var instanceof mz0) {
                r4 = hf.c0(nj3.BUTTONS, nj3.DPAD, nj3.BUTTON_L, nj3.BUTTON_R, nj3.BUTTON_START, nj3.BUTTON_SELECT);
            } else {
                i.d();
                return;
            }
        }
        ArrayList<nj3> arrayList4 = r4;
        if (!this.i0) {
        }
        t52 entries22 = nj3.getEntries();
        ArrayList arrayList32 = new ArrayList();
        while (r0.hasNext()) {
        }
        while (r0.hasNext()) {
        }
        size = arrayList32.size();
        i2 = 0;
        while (i2 < size) {
        }
    }

    public final void setConnectedControllersState(oz0 oz0Var) {
        oz0Var.getClass();
        this.k0 = oz0Var;
        k();
    }

    public final void setFrontendInputHandler(fn2 fn2Var) {
        fn2Var.getClass();
        this.g0 = fn2Var;
        i();
    }

    public final void setSystemInputHandler(s03 s03Var) {
        s03Var.getClass();
        this.h0 = s03Var;
        i();
    }

    public final void setTouchVibrator(u87 u87Var) {
        u87Var.getClass();
        this.e0 = u87Var;
    }
}

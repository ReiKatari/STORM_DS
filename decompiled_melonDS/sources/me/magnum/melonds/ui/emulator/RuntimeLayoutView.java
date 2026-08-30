package me.magnum.melonds.ui.emulator;

import ah.o1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import eh.j;
import eh.k;
import eh.q;
import eh.r;
import gh.a;
import hh.b;
import hh.e1;
import kb.g;
import mb.c;
import oe.s;
import og.i;
import og.n;
import rd.h;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class RuntimeLayoutView extends n implements c {
    public g R;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f9509b0;

    /* renamed from: c0  reason: collision with root package name */
    public ce.c f9510c0;

    /* renamed from: d0  reason: collision with root package name */
    public e1 f9511d0;

    /* renamed from: e0  reason: collision with root package name */
    public j f9512e0;

    /* renamed from: f0  reason: collision with root package name */
    public k f9513f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f9514g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f9515h0;

    /* renamed from: i0  reason: collision with root package name */
    public hh.c f9516i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        if (!isInEditMode() && !this.f9509b0) {
            this.f9509b0 = true;
            this.f9510c0 = (ce.c) ((h) ((o1) d())).f12688a.E.get();
        }
        this.f9514g0 = true;
        this.f9516i0 = b.f6509a;
    }

    @Override // mb.b
    public final Object d() {
        if (this.R == null) {
            this.R = new g(this);
        }
        return this.R.d();
    }

    public final void g(ve.c cVar, boolean z10) {
        KeyEvent.Callback callback;
        cVar.getClass();
        i c4 = c(cVar);
        a aVar = null;
        if (c4 != null) {
            callback = c4.f11005a;
        } else {
            callback = null;
        }
        if (callback instanceof a) {
            aVar = (a) callback;
        }
        if (aVar == null) {
            return;
        }
        aVar.setToggleState(z10);
    }

    public final ce.c getTouchVibrator() {
        ce.c cVar = this.f9510c0;
        if (cVar != null) {
            return cVar;
        }
        nc.k.f("touchVibrator");
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
        e1 e1Var = this.f9511d0;
        if (e1Var == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        float f8 = e1Var.f6518b / 100.0f;
        boolean z10 = e1Var.f6519c;
        k kVar = this.f9513f0;
        if (kVar != null) {
            i c4 = c(ve.c.DPAD);
            if (c4 != null && (view16 = c4.f11005a) != null) {
                ce.c touchVibrator = getTouchVibrator();
                touchVibrator.getClass();
                view16.setOnTouchListener(new eh.b(kVar, z10, touchVibrator, 1));
            }
            i c10 = c(ve.c.BUTTONS);
            if (c10 != null && (view15 = c10.f11005a) != null) {
                ce.c touchVibrator2 = getTouchVibrator();
                touchVibrator2.getClass();
                view15.setOnTouchListener(new eh.b(kVar, z10, touchVibrator2, 0));
            }
            i c11 = c(ve.c.BUTTON_L);
            if (c11 != null && (view14 = c11.f11005a) != null) {
                view14.setOnTouchListener(new q(kVar, s.L, z10, getTouchVibrator()));
            }
            i c12 = c(ve.c.BUTTON_R);
            if (c12 != null && (view13 = c12.f11005a) != null) {
                view13.setOnTouchListener(new q(kVar, s.R, z10, getTouchVibrator()));
            }
            i c13 = c(ve.c.BUTTON_SELECT);
            if (c13 != null && (view12 = c13.f11005a) != null) {
                view12.setOnTouchListener(new q(kVar, s.SELECT, z10, getTouchVibrator()));
            }
            i c14 = c(ve.c.BUTTON_START);
            if (c14 != null && (view11 = c14.f11005a) != null) {
                view11.setOnTouchListener(new q(kVar, s.START, z10, getTouchVibrator()));
            }
            i c15 = c(ve.c.BUTTON_HINGE);
            if (c15 != null && (view10 = c15.f11005a) != null) {
                view10.setOnTouchListener(new q(kVar, s.HINGE, z10, getTouchVibrator()));
            }
        }
        j jVar = this.f9512e0;
        if (jVar != null) {
            i c16 = c(ve.c.BUTTON_RESET);
            if (c16 != null && (view9 = c16.f11005a) != null) {
                view9.setOnTouchListener(new q(jVar, s.RESET, z10, getTouchVibrator()));
            }
            i c17 = c(ve.c.BUTTON_PAUSE);
            if (c17 != null && (view8 = c17.f11005a) != null) {
                view8.setOnTouchListener(new q(jVar, s.PAUSE, z10, getTouchVibrator()));
            }
            i c18 = c(ve.c.BUTTON_FAST_FORWARD_TOGGLE);
            if (c18 != null && (view7 = c18.f11005a) != null) {
                view7.setOnTouchListener(new q(jVar, s.FAST_FORWARD, z10, getTouchVibrator()));
            }
            i c19 = c(ve.c.BUTTON_MICROPHONE_TOGGLE);
            if (c19 != null && (view6 = c19.f11005a) != null) {
                view6.setOnTouchListener(new q(jVar, s.MICROPHONE, z10, getTouchVibrator()));
            }
            i c20 = c(ve.c.BUTTON_TOGGLE_SOFT_INPUT);
            if (c20 != null && (view5 = c20.f11005a) != null) {
                view5.setOnTouchListener(new q(jVar, s.TOGGLE_SOFT_INPUT, z10, getTouchVibrator()));
            }
            i c21 = c(ve.c.BUTTON_SWAP_SCREENS);
            if (c21 != null && (view4 = c21.f11005a) != null) {
                view4.setOnTouchListener(new q(jVar, s.SWAP_SCREENS, z10, getTouchVibrator()));
            }
            i c22 = c(ve.c.BUTTON_QUICK_SAVE);
            if (c22 != null && (view3 = c22.f11005a) != null) {
                view3.setOnTouchListener(new q(jVar, s.QUICK_SAVE, z10, getTouchVibrator()));
            }
            i c23 = c(ve.c.BUTTON_QUICK_LOAD);
            if (c23 != null && (view2 = c23.f11005a) != null) {
                view2.setOnTouchListener(new q(jVar, s.QUICK_LOAD, z10, getTouchVibrator()));
            }
            i c24 = c(ve.c.BUTTON_REWIND);
            if (c24 != null && (view = c24.f11005a) != null) {
                view.setOnTouchListener(new q(jVar, s.REWIND, z10, getTouchVibrator()));
            }
        }
        for (i iVar : getLayoutComponentViews()) {
            if (!iVar.f11006b.isScreen()) {
                iVar.f11005a.setAlpha(f8);
            }
        }
        i();
    }

    public final void i() {
        yb.j jVar;
        View view;
        i c4;
        View view2;
        if (this.f9515h0) {
            jVar = new yb.j(ve.c.TOP_SCREEN, ve.c.BOTTOM_SCREEN);
        } else {
            jVar = new yb.j(ve.c.BOTTOM_SCREEN, ve.c.TOP_SCREEN);
        }
        ve.c cVar = (ve.c) jVar.A;
        ve.c cVar2 = (ve.c) jVar.B;
        k kVar = this.f9513f0;
        if (kVar != null && (c4 = c(cVar)) != null && (view2 = c4.f11005a) != null) {
            view2.setOnTouchListener(new r(kVar));
        }
        i c10 = c(cVar2);
        if (c10 != null && (view = c10.f11005a) != null) {
            view.setOnTouchListener(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [zb.q] */
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

    public final void setConnectedControllersState(hh.c cVar) {
        cVar.getClass();
        this.f9516i0 = cVar;
        j();
    }

    public final void setFrontendInputHandler(j jVar) {
        jVar.getClass();
        this.f9512e0 = jVar;
        h();
    }

    public final void setSystemInputHandler(k kVar) {
        kVar.getClass();
        this.f9513f0 = kVar;
        h();
    }

    public final void setTouchVibrator(ce.c cVar) {
        cVar.getClass();
        this.f9510c0 = cVar;
    }
}

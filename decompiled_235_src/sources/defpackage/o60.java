package defpackage;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o60  reason: default package */
/* loaded from: classes.dex */
public final class o60 extends hr {
    public BottomSheetBehavior Z;
    public FrameLayout d0;
    public CoordinatorLayout e0;
    public FrameLayout f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public n60 j0;
    public boolean k0;
    public bt l0;
    public m60 m0;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.Z == null) {
            h();
        }
        super.cancel();
    }

    public final void h() {
        if (this.d0 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.d0 = frameLayout;
            this.e0 = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.d0.findViewById(R.id.design_bottom_sheet);
            this.f0 = frameLayout2;
            BottomSheetBehavior A = BottomSheetBehavior.A(frameLayout2);
            this.Z = A;
            m60 m60Var = this.m0;
            ArrayList arrayList = A.Y;
            if (!arrayList.contains(m60Var)) {
                arrayList.add(m60Var);
            }
            this.Z.G(this.g0);
            this.l0 = new bt(this.Z, this.f0);
        }
    }

    public final FrameLayout i(View view, int i, ViewGroup.LayoutParams layoutParams) {
        h();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.d0.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.k0) {
            FrameLayout frameLayout = this.d0;
            os0 os0Var = new os0(this, 16);
            WeakHashMap weakHashMap = ao7.a;
            sn7.c(frameLayout, os0Var);
        }
        this.f0.removeAllViews();
        FrameLayout frameLayout2 = this.f0;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new r7(this, 2));
        ao7.n(this.f0, new l60(this, 0));
        this.f0.setOnTouchListener(new t20(1));
        return this.d0;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.k0 && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            } else {
                z = false;
            }
            FrameLayout frameLayout = this.d0;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.e0;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            kt7.a(window, !z);
            n60 n60Var = this.j0;
            if (n60Var != null) {
                n60Var.e(window);
            }
        }
        bt btVar = this.l0;
        if (btVar != null) {
            View view = (View) btVar.R;
            boolean z2 = this.g0;
            s14 s14Var = (s14) btVar.B;
            if (z2) {
                if (s14Var != null) {
                    s14Var.b((r14) btVar.L, view, false);
                }
            } else if (s14Var != null) {
                s14Var.c(view);
            }
        }
    }

    @Override // defpackage.hr, defpackage.qv0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        s14 s14Var;
        n60 n60Var = this.j0;
        if (n60Var != null) {
            n60Var.e(null);
        }
        bt btVar = this.l0;
        if (btVar != null && (s14Var = (s14) btVar.B) != null) {
            s14Var.c((View) btVar.R);
        }
    }

    @Override // defpackage.qv0, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.Z;
        if (bottomSheetBehavior != null && bottomSheetBehavior.N == 5) {
            bottomSheetBehavior.I(4);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        bt btVar;
        super.setCancelable(z);
        if (this.g0 != z) {
            this.g0 = z;
            BottomSheetBehavior bottomSheetBehavior = this.Z;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.G(z);
            }
            if (getWindow() != null && (btVar = this.l0) != null) {
                View view = (View) btVar.R;
                boolean z2 = this.g0;
                s14 s14Var = (s14) btVar.B;
                if (z2) {
                    if (s14Var != null) {
                        s14Var.b((r14) btVar.L, view, false);
                    }
                } else if (s14Var != null) {
                    s14Var.c(view);
                }
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.g0) {
            this.g0 = true;
        }
        this.h0 = z;
        this.i0 = true;
    }

    @Override // defpackage.hr, defpackage.qv0, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(i(view, 0, null));
    }

    @Override // defpackage.hr, defpackage.qv0, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(i(null, i, null));
    }

    @Override // defpackage.hr, defpackage.qv0, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(i(view, 0, layoutParams));
    }
}

package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import j7.j1;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 extends a6.b {
    public final /* synthetic */ int R;
    public final /* synthetic */ Object X;

    public /* synthetic */ g0(int i2, Object obj) {
        this.R = i2;
        this.X = obj;
    }

    @Override // a6.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.R) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.X).R);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // a6.b
    public final void d(View view, b6.g gVar) {
        Preference k10;
        RecyclerView recyclerView;
        String string;
        int i2 = this.R;
        int i10 = -1;
        View.AccessibilityDelegate accessibilityDelegate = this.A;
        Object obj = this.X;
        switch (i2) {
            case 0:
                h0 h0Var = (h0) obj;
                h0Var.Z.d(view, gVar);
                RecyclerView recyclerView2 = h0Var.Y;
                recyclerView2.getClass();
                j1 M = RecyclerView.M(view);
                if (M != null && (recyclerView = M.f7610r) != null) {
                    i10 = recyclerView.J(M);
                }
                j7.k0 adapter = recyclerView2.getAdapter();
                if ((adapter instanceof d0) && (k10 = ((d0) adapter).k(i10)) != null) {
                    k10.onInitializeAccessibilityNodeInfo(gVar);
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, gVar.f2077a);
                com.google.android.material.datepicker.m mVar = (com.google.android.material.datepicker.m) obj;
                if (mVar.f3041f0.getVisibility() == 0) {
                    string = mVar.getString(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    string = mVar.getString(R.string.mtrl_picker_toggle_to_day_selection);
                }
                gVar.b(new b6.d(16, string));
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2077a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f3069b0);
                accessibilityNodeInfo.setChecked(checkableImageButton.R);
                return;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo2 = gVar.f2077a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f3073u0);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, gVar.f2077a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i11 = MaterialButtonToggleGroup.f3000n0;
                if (view instanceof MaterialButton) {
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        if (i12 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i12) == view) {
                                i10 = i13;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i12).getVisibility() != 8) {
                                    i13++;
                                }
                                i12++;
                            }
                        }
                    }
                }
                gVar.k(b6.f.a(((MaterialButton) view).f2986l0, 0, 1, i10, 1));
                return;
        }
    }

    @Override // a6.b
    public boolean g(View view, int i2, Bundle bundle) {
        switch (this.R) {
            case 0:
                return ((h0) this.X).Z.g(view, i2, bundle);
            default:
                return super.g(view, i2, bundle);
        }
    }
}

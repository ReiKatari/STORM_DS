package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rn0  reason: default package */
/* loaded from: classes.dex */
public final class rn0 extends z1 {
    public final /* synthetic */ int R;
    public final /* synthetic */ Object X;

    public /* synthetic */ rn0(int i, Object obj) {
        this.R = i;
        this.X = obj;
    }

    @Override // defpackage.z1
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.R) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.X).R);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // defpackage.z1
    public final void d(View view, t2 t2Var) {
        String string;
        Preference j;
        RecyclerView recyclerView;
        int i = this.R;
        int i2 = -1;
        View.AccessibilityDelegate accessibilityDelegate = this.A;
        Object obj = this.X;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = t2Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.c0);
                accessibilityNodeInfo.setChecked(checkableImageButton.R);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, t2Var.a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.o0;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i4) == view) {
                                i2 = i5;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i4).getVisibility() != 8) {
                                    i5++;
                                }
                                i4++;
                            }
                        }
                    }
                }
                t2Var.k(s2.a(((MaterialButton) view).m0, 0, 1, i2, 1));
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, t2Var.a);
                wu3 wu3Var = (wu3) obj;
                if (wu3Var.g0.getVisibility() == 0) {
                    string = wu3Var.getString(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    string = wu3Var.getString(R.string.mtrl_picker_toggle_to_day_selection);
                }
                t2Var.b(new n2(16, string));
                return;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo2 = t2Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).v0);
                return;
            default:
                us4 us4Var = (us4) obj;
                us4Var.Z.d(view, t2Var);
                RecyclerView recyclerView2 = us4Var.Y;
                recyclerView2.getClass();
                g75 N = RecyclerView.N(view);
                if (N != null && (recyclerView = N.r) != null) {
                    i2 = recyclerView.K(N);
                }
                g65 adapter = recyclerView2.getAdapter();
                if ((adapter instanceof rs4) && (j = ((rs4) adapter).j(i2)) != null) {
                    j.onInitializeAccessibilityNodeInfo(t2Var);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.z1
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.R) {
            case 4:
                return ((us4) this.X).Z.g(view, i, bundle);
            default:
                return super.g(view, i, bundle);
        }
    }
}

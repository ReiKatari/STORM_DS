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
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l60  reason: default package */
/* loaded from: classes.dex */
public final class l60 extends b2 {
    public final /* synthetic */ int R;
    public final /* synthetic */ Object X;

    public /* synthetic */ l60(Object obj, int i) {
        this.R = i;
        this.X = obj;
    }

    @Override // defpackage.b2
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.R) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.X).R);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // defpackage.b2
    public final void d(View view, v2 v2Var) {
        String string;
        Preference j;
        RecyclerView recyclerView;
        int i = this.R;
        int i2 = -1;
        View.AccessibilityDelegate accessibilityDelegate = this.A;
        Object obj = this.X;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = v2Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (((o60) obj).g0) {
                    v2Var.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                    return;
                }
                accessibilityNodeInfo.setDismissable(false);
                return;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = v2Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.d0);
                accessibilityNodeInfo2.setChecked(checkableImageButton.R);
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, v2Var.a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.p0;
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
                v2Var.k(u2.b(((MaterialButton) view).n0, 0, 1, i2, 1));
                return;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, v2Var.a);
                f24 f24Var = (f24) obj;
                if (f24Var.h0.getVisibility() == 0) {
                    string = f24Var.getString(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    string = f24Var.getString(R.string.mtrl_picker_toggle_to_day_selection);
                }
                v2Var.b(new p2(16, string));
                return;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo3 = v2Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).w0);
                return;
            default:
                w15 w15Var = (w15) obj;
                w15Var.Z.d(view, v2Var);
                RecyclerView recyclerView2 = w15Var.Y;
                recyclerView2.getClass();
                wg5 N = RecyclerView.N(view);
                if (N != null && (recyclerView = N.r) != null) {
                    i2 = recyclerView.K(N);
                }
                wf5 adapter = recyclerView2.getAdapter();
                if ((adapter instanceof t15) && (j = ((t15) adapter).j(i2)) != null) {
                    j.onInitializeAccessibilityNodeInfo(v2Var);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.b2
    public boolean g(View view, int i, Bundle bundle) {
        int i2 = this.R;
        Object obj = this.X;
        switch (i2) {
            case 0:
                if (i == 1048576) {
                    o60 o60Var = (o60) obj;
                    if (o60Var.g0) {
                        o60Var.cancel();
                        return true;
                    }
                }
                return super.g(view, i, bundle);
            case 5:
                return ((w15) obj).Z.g(view, i, bundle);
            default:
                return super.g(view, i, bundle);
        }
    }
}

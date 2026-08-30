package ca;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import b6.g;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends j6.a {

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Chip f2773k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f2773k0 = chip;
    }

    @Override // j6.a
    public final void l(ArrayList arrayList) {
        e eVar;
        arrayList.add(0);
        Rect rect = Chip.f3010t0;
        Chip chip = this.f2773k0;
        if (chip.c() && (eVar = chip.f3013b0) != null && eVar.N0 && chip.f3016e0 != null) {
            arrayList.add(1);
        }
    }

    @Override // j6.a
    public final void o(int i2, g gVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2077a;
        String str = "";
        if (i2 == 1) {
            Chip chip = this.f2773k0;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    str = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, str).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            gVar.b(b6.d.f2056e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            gVar.i(Button.class.getName());
            return;
        }
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setBoundsInParent(Chip.f3010t0);
    }

    @Override // j6.a
    public final void p(int i2, boolean z10) {
        Chip chip = this.f2773k0;
        if (i2 == 1) {
            chip.f3021j0 = z10;
        }
        e eVar = chip.f3013b0;
        boolean z11 = chip.f3021j0;
        boolean z12 = false;
        if (eVar.O0 != null) {
            z12 = eVar.R(z11 ? new int[]{16842919, 16842910} : e.I1);
        }
        if (z12) {
            chip.refreshDrawableState();
        }
    }
}

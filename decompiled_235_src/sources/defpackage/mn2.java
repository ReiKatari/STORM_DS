package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import com.stormds.emulator.R;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mn2  reason: default package */
/* loaded from: classes.dex */
public final class mn2 extends p0 {
    public final WindowManager i0;
    public final WindowManager.LayoutParams j0;
    public on2 k0;
    public boolean l0;
    public final vs4 m0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mn2(View view, boolean z, UUID uuid) {
        super(r0, null);
        int i;
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.i0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.flags = 512;
        layoutParams.type = 1000;
        if (z) {
            i = 2132017472;
        } else {
            i = R.style.FullscreenDialog;
        }
        layoutParams.windowAnimations = i;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.format = -3;
        this.j0 = layoutParams;
        setId(16908290);
        setTag(R.id.view_tree_lifecycle_owner, bl2.B(view));
        setTag(R.id.view_tree_view_model_store_owner, ln2.r(view));
        setTag(R.id.view_tree_saved_state_registry_owner, kn2.C(view));
        setTag(R.id.compose_view_saveable_id_tag, "CustomLayout:" + uuid);
        this.m0 = np2.Y(f04.k);
    }

    @Override // defpackage.p0
    public final void a(px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-266009091);
        if (xq2Var.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            ((eo2) this.m0.getValue()).o(xq2Var, 0);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new z5(this, i, 11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if ((keyEvent != null && keyEvent.getKeyCode() == 4) || (keyEvent != null && keyEvent.getKeyCode() == 111)) {
            on2 on2Var = this.k0;
            if (on2Var != null) {
                on2Var.c();
                return true;
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.p0
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.l0;
    }
}

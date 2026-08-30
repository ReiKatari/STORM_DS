package defpackage;

import android.app.Presentation;
import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k42  reason: default package */
/* loaded from: classes.dex */
public final class k42 extends Presentation {
    public static final /* synthetic */ int e0 = 0;
    public final oh2 A;
    public boolean B;
    public final RuntimeLayoutView L;
    public final View R;
    public final tj4 X;
    public final o51 Y;
    public final EmulatorSurfaceView Z;
    public bs5 c0;
    public js5 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k42(EmulatorActivity emulatorActivity, Display display, oh2 oh2Var, boolean z) {
        super(emulatorActivity, display);
        oh2Var.getClass();
        this.A = oh2Var;
        this.B = z;
        RuntimeLayoutView runtimeLayoutView = new RuntimeLayoutView(emulatorActivity, null);
        this.L = runtimeLayoutView;
        FrameLayout frameLayout = new FrameLayout(emulatorActivity);
        View view = new View(emulatorActivity);
        this.R = view;
        this.X = me2.G(null);
        ComposeView composeView = new ComposeView(emulatorActivity, null, 6);
        Window window = getWindow();
        if (window != null) {
            window.setFlags(40, 40);
        }
        si0 si0Var = new si0(2, this);
        frameLayout.addOnLayoutChangeListener(si0Var);
        runtimeLayoutView.addOnLayoutChangeListener(si0Var);
        o51 o51Var = new o51(emulatorActivity);
        Context context = getContext();
        context.getClass();
        EmulatorSurfaceView emulatorSurfaceView = new EmulatorSurfaceView(context, null);
        emulatorSurfaceView.setRenderer(o51Var);
        emulatorSurfaceView.setFocusable(false);
        emulatorSurfaceView.setFocusableInTouchMode(false);
        this.Z = emulatorSurfaceView;
        this.Y = o51Var;
        js5 js5Var = this.d0;
        us1 us1Var = emulatorSurfaceView.e0;
        if (us1Var != null) {
            o51 o51Var2 = (o51) us1Var;
            synchronized (o51Var2.b) {
                o51Var2.c = js5Var;
                o51Var2.d = true;
            }
        }
        frameLayout.addView(emulatorSurfaceView);
        frameLayout.addView(runtimeLayoutView);
        frameLayout.addView(view);
        frameLayout.addView(composeView);
        composeView.setContent(new et0(-1002894128, true, new i42(this, 0)));
        view.setBackgroundColor(-16777216);
        view.setAlpha(0.6f);
        view.setVisibility(8);
        view.setOnClickListener(new j42());
        oh2Var.e(emulatorSurfaceView);
        frameLayout.setTag(R.id.view_tree_lifecycle_owner, emulatorActivity);
        frameLayout.setTag(R.id.view_tree_view_model_store_owner, emulatorActivity);
        frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, emulatorActivity);
        setContentView(frameLayout);
    }

    public final void a(et0 et0Var) {
        this.X.setValue(et0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bd  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [pp1] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k42.b():void");
    }

    @Override // android.app.Presentation, android.app.Dialog
    public final void onStart() {
        super.onStart();
        this.L.post(new m0(24, this));
    }

    @Override // android.app.Presentation, android.app.Dialog
    public final void onStop() {
        super.onStop();
        this.A.b(this.Z);
    }
}

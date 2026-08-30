package ih;

import android.app.Presentation;
import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import hh.f1;
import java.util.ArrayList;
import me.magnum.melonds.R;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
import oe.b0;
import og.i;
import w.x0;
import yb.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends Presentation {
    public static final /* synthetic */ int Z = 0;
    public final x0 A;
    public final RuntimeLayoutView B;
    public final View L;
    public final ah.b R;
    public final EmulatorSurfaceView X;
    public f1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View$OnClickListener, java.lang.Object] */
    public f(EmulatorActivity emulatorActivity, Display display, x0 x0Var) {
        super(emulatorActivity, display);
        x0Var.getClass();
        this.A = x0Var;
        RuntimeLayoutView runtimeLayoutView = new RuntimeLayoutView(emulatorActivity, null);
        this.B = runtimeLayoutView;
        FrameLayout frameLayout = new FrameLayout(emulatorActivity);
        View view = new View(emulatorActivity);
        this.L = view;
        Window window = getWindow();
        if (window != null) {
            window.setFlags(40, 40);
        }
        frameLayout.addOnLayoutChangeListener(new aa.a(2, this));
        ah.b bVar = new ah.b(emulatorActivity);
        Context context = getContext();
        context.getClass();
        EmulatorSurfaceView emulatorSurfaceView = new EmulatorSurfaceView(context, null);
        emulatorSurfaceView.setRenderer(bVar);
        emulatorSurfaceView.setFocusable(false);
        emulatorSurfaceView.setFocusableInTouchMode(false);
        this.X = emulatorSurfaceView;
        this.R = bVar;
        f1 f1Var = this.Y;
        d dVar = emulatorSurfaceView.f9508d0;
        if (dVar != null) {
            ah.b bVar2 = (ah.b) dVar;
            synchronized (bVar2.f722b) {
                bVar2.f723c = f1Var;
                bVar2.f724d = true;
            }
        }
        frameLayout.addView(emulatorSurfaceView);
        frameLayout.addView(runtimeLayoutView);
        frameLayout.addView(view);
        view.setBackgroundColor(-16777216);
        view.setAlpha(0.6f);
        view.setVisibility(8);
        view.setOnClickListener(new Object());
        synchronized (x0Var.f14092e) {
            ((ArrayList) x0Var.f14093f).add(emulatorSurfaceView);
        }
        frameLayout.setTag(R.id.view_tree_lifecycle_owner, emulatorActivity);
        frameLayout.setTag(R.id.view_tree_view_model_store_owner, emulatorActivity);
        frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, emulatorActivity);
        setContentView(frameLayout);
    }

    public final void a() {
        j jVar;
        b0 b0Var;
        float f8;
        boolean z10;
        RuntimeLayoutView runtimeLayoutView = this.B;
        if (runtimeLayoutView.f9515h0) {
            jVar = new j(ve.c.BOTTOM_SCREEN, ve.c.TOP_SCREEN);
        } else {
            jVar = new j(ve.c.TOP_SCREEN, ve.c.BOTTOM_SCREEN);
        }
        i c4 = runtimeLayoutView.c((ve.c) jVar.A);
        i c10 = runtimeLayoutView.c((ve.c) jVar.B);
        b0 b0Var2 = null;
        if (c4 != null) {
            b0Var = c4.b();
        } else {
            b0Var = null;
        }
        if (c10 != null) {
            b0Var2 = c10.b();
        }
        b0 b0Var3 = b0Var2;
        float f10 = 1.0f;
        if (c4 != null) {
            f8 = c4.f11007c;
        } else {
            f8 = 1.0f;
        }
        if (c10 != null) {
            f10 = c10.f11007c;
        }
        float f11 = f10;
        if (c10 != null) {
            z10 = c10.f11008d;
        } else {
            z10 = false;
        }
        this.R.f(b0Var, b0Var3, f8, f11, z10);
    }

    @Override // android.app.Presentation, android.app.Dialog
    public final void onStop() {
        super.onStop();
        this.A.o(this.X);
    }
}

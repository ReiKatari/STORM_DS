package defpackage;

import android.app.Presentation;
import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Locale;
import me.magnum.melonds.domain.model.Rect;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c92  reason: default package */
/* loaded from: classes.dex */
public final class c92 extends Presentation {
    public static final /* synthetic */ int f0 = 0;
    public final om2 A;
    public boolean B;
    public final RuntimeLayoutView L;
    public final View R;
    public final vs4 X;
    public final c91 Y;
    public final EmulatorSurfaceView Z;
    public t26 d0;
    public b36 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c92(EmulatorActivity emulatorActivity, Display display, om2 om2Var, boolean z) {
        super(emulatorActivity, display);
        View decorView;
        View decorView2;
        View decorView3;
        om2Var.getClass();
        this.A = om2Var;
        this.B = z;
        RuntimeLayoutView runtimeLayoutView = new RuntimeLayoutView(emulatorActivity, null);
        this.L = runtimeLayoutView;
        FrameLayout frameLayout = new FrameLayout(emulatorActivity);
        View view = new View(emulatorActivity);
        this.R = view;
        this.X = np2.Y(null);
        ComposeView composeView = new ComposeView(emulatorActivity, null, 6);
        Window window = getWindow();
        if (window != null) {
            window.setFlags(40, 40);
        }
        al0 al0Var = new al0(this, 2);
        frameLayout.addOnLayoutChangeListener(al0Var);
        runtimeLayoutView.addOnLayoutChangeListener(al0Var);
        c91 c91Var = new c91(emulatorActivity);
        Context context = getContext();
        context.getClass();
        EmulatorSurfaceView emulatorSurfaceView = new EmulatorSurfaceView(context, null);
        emulatorSurfaceView.setRenderer(c91Var);
        emulatorSurfaceView.setFocusable(false);
        emulatorSurfaceView.setFocusableInTouchMode(false);
        this.Z = emulatorSurfaceView;
        this.Y = c91Var;
        b36 b36Var = this.e0;
        fx1 fx1Var = emulatorSurfaceView.f0;
        if (fx1Var != null) {
            c91 c91Var2 = (c91) fx1Var;
            synchronized (c91Var2.b) {
                c91Var2.c = b36Var;
                c91Var2.d = true;
            }
        }
        frameLayout.addView(emulatorSurfaceView);
        frameLayout.addView(runtimeLayoutView);
        frameLayout.addView(view);
        frameLayout.addView(composeView);
        composeView.setViewCompositionStrategy(vs0.y0);
        composeView.setContent(new zv0(-1002894128, true, new a92(this, 0)));
        view.setBackgroundColor(-16777216);
        view.setAlpha(0.6f);
        view.setVisibility(8);
        view.setOnClickListener(new b92());
        om2Var.c(emulatorSurfaceView);
        frameLayout.setTag(R.id.view_tree_lifecycle_owner, emulatorActivity);
        Window window2 = getWindow();
        if (window2 != null && (decorView3 = window2.getDecorView()) != null) {
            decorView3.setTag(R.id.view_tree_lifecycle_owner, emulatorActivity);
        }
        frameLayout.setTag(R.id.view_tree_view_model_store_owner, emulatorActivity);
        Window window3 = getWindow();
        if (window3 != null && (decorView2 = window3.getDecorView()) != null) {
            decorView2.setTag(R.id.view_tree_view_model_store_owner, emulatorActivity);
        }
        frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, emulatorActivity);
        Window window4 = getWindow();
        if (window4 != null && (decorView = window4.getDecorView()) != null) {
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, emulatorActivity);
        }
        setContentView(frameLayout);
    }

    public final void a(zv0 zv0Var) {
        this.X.setValue(zv0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bd  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [yt1] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        vr4 vr4Var;
        vr4 vr4Var2;
        Rect rect;
        Rect rect2;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        Rect rect3;
        vr4 vr4Var3;
        Rect rect4;
        Rect rect5;
        BackgroundMode backgroundMode;
        boolean z4;
        VulkanPresentationConfig vulkanPresentationConfig;
        t26 t26Var;
        Window window;
        View decorView;
        RuntimeLayoutView runtimeLayoutView = this.L;
        if (runtimeLayoutView.j0) {
            vr4Var = new vr4(nj3.BOTTOM_SCREEN, nj3.TOP_SCREEN);
        } else {
            vr4Var = new vr4(nj3.TOP_SCREEN, nj3.BOTTOM_SCREEN);
        }
        zj3 d = runtimeLayoutView.d((nj3) vr4Var.A);
        zj3 d2 = runtimeLayoutView.d((nj3) vr4Var.B);
        zj3 d3 = runtimeLayoutView.d(nj3.HYBRID_SCREEN);
        ?? r6 = 0;
        if (d3 != null) {
            Rect b = d3.b();
            int max = Math.max(1, b.getHeight() / 2);
            vr4Var2 = new vr4(new Rect(b.getX(), b.getY(), b.getWidth(), max), new Rect(b.getX(), b.getY() + max, b.getWidth(), Math.max(1, b.getHeight() - max)));
        } else {
            vr4Var2 = new vr4(null, null);
        }
        Rect rect6 = (Rect) vr4Var2.A;
        Rect rect7 = (Rect) vr4Var2.B;
        if (d != null) {
            rect = d.b();
        } else {
            rect = null;
        }
        if (d2 != null) {
            rect2 = d2.b();
        } else {
            rect2 = null;
        }
        float f3 = 1.0f;
        if (d != null) {
            f = d.c;
        } else {
            f = 1.0f;
        }
        if (d2 != null) {
            f2 = d2.c;
        } else {
            f2 = 1.0f;
        }
        int i = 0;
        if (d != null) {
            z = d.d;
        } else {
            z = false;
        }
        if (d2 != null) {
            z2 = d2.d;
        } else {
            z2 = false;
        }
        if (d3 != null) {
            f3 = d3.c;
        }
        float f4 = f3;
        if (d3 != null) {
            z3 = d3.d;
        } else {
            z3 = false;
        }
        this.Y.e(rect, rect2, f, f2, z2, rect6, rect7, f4, z3);
        b36 b36Var = this.e0;
        EmulatorSurfaceView emulatorSurfaceView = this.Z;
        if (b36Var != null) {
            po5 po5Var = b36Var.d;
            if (b36Var.a == VideoRenderer.VULKAN) {
                vr4 currentSurfaceSize = emulatorSurfaceView.getCurrentSurfaceSize();
                int intValue = ((Number) currentSurfaceSize.A).intValue();
                int intValue2 = ((Number) currentSurfaceSize.B).intValue();
                if (intValue <= 0) {
                    intValue = emulatorSurfaceView.getWidth();
                }
                if (intValue2 <= 0) {
                    intValue2 = emulatorSurfaceView.getHeight();
                }
                if (rect == null || rect.getWidth() <= 0 || rect.getHeight() <= 0) {
                    rect = null;
                }
                if (rect2 != null && rect2.getWidth() > 0 && rect2.getHeight() > 0) {
                    rect3 = rect2;
                } else {
                    rect3 = null;
                }
                if (intValue > 0 && intValue2 > 0) {
                    vr4Var3 = new vr4(rect, rect3);
                } else {
                    vr4Var3 = new vr4(null, null);
                }
                Rect rect8 = (Rect) vr4Var3.A;
                Rect rect9 = (Rect) vr4Var3.B;
                if (rect6 != null && rect6.getWidth() > 0 && rect6.getHeight() > 0) {
                    rect4 = rect6;
                } else {
                    rect4 = null;
                }
                if (rect7 != null && rect7.getWidth() > 0 && rect7.getHeight() > 0) {
                    rect5 = rect7;
                } else {
                    rect5 = null;
                }
                t26 t26Var2 = this.d0;
                if (t26Var2 == null || (backgroundMode = t26Var2.b) == null) {
                    backgroundMode = t26.c.b;
                }
                BackgroundMode backgroundMode2 = backgroundMode;
                VideoFiltering videoFiltering = b36Var.b;
                if (videoFiltering == VideoFiltering.RETROARCH) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                String str = po5Var.a;
                String lowerCase = po5Var.b.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                vulkanPresentationConfig = new VulkanPresentationConfig(rect8, rect9, f, f2, z, z2, rect4, rect5, f4, z3, backgroundMode2, videoFiltering, z4, str, lowerCase, po5Var.c, po5Var.e, po5Var.f);
                t26Var = this.d0;
                if (t26Var == null) {
                    t26Var = t26.c;
                }
                this.A.e(emulatorSurfaceView, vulkanPresentationConfig, t26Var);
                if (Build.VERSION.SDK_INT < 29 && (window = getWindow()) != null && (decorView = window.getDecorView()) != null && decorView.isAttachedToWindow()) {
                    if (this.B) {
                        ArrayList C0 = fv.C0(new Rect[]{rect2, rect7});
                        r6 = new ArrayList(ht0.v0(C0, 10));
                        int size = C0.size();
                        while (i < size) {
                            Object obj = C0.get(i);
                            i++;
                            Rect rect10 = (Rect) obj;
                            r6.add(new android.graphics.Rect(rect10.getX(), rect10.getY(), rect10.getRight(), rect10.getBottom()));
                        }
                    }
                    if (r6 == 0) {
                        r6 = yt1.A;
                    }
                    runtimeLayoutView.setSystemGestureExclusionRects(r6);
                    return;
                }
                return;
            }
        }
        vulkanPresentationConfig = null;
        t26Var = this.d0;
        if (t26Var == null) {
        }
        this.A.e(emulatorSurfaceView, vulkanPresentationConfig, t26Var);
        if (Build.VERSION.SDK_INT < 29) {
        }
    }

    @Override // android.app.Presentation, android.app.Dialog
    public final void onStart() {
        super.onStart();
        this.L.post(new n0(this, 24));
    }

    @Override // android.app.Presentation, android.app.Dialog
    public final void onStop() {
        super.onStop();
        this.A.d(this.Z);
    }
}

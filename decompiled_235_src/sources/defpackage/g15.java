package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.fragment.app.h;
import androidx.fragment.app.i;
import androidx.fragment.app.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g15  reason: default package */
/* loaded from: classes.dex */
public final class g15 implements Runnable {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ g15(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    private final void a() {
        lz6 b;
        long j;
        lz6 b2;
        qz6 qz6Var = (qz6) this.B;
        synchronized (qz6Var) {
            qz6Var.g++;
            b = qz6Var.b();
        }
        if (b == null) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        while (true) {
            try {
                currentThread.setName(b.a);
                Logger logger = ((qz6) this.B).b;
                pz6 pz6Var = b.c;
                pz6Var.getClass();
                boolean isLoggable = logger.isLoggable(Level.FINE);
                if (isLoggable) {
                    j = System.nanoTime();
                    jx2.j(logger, b, pz6Var, "starting");
                } else {
                    j = -1;
                }
                long a = b.a();
                if (isLoggable) {
                    jx2.j(logger, b, pz6Var, "finished run in " + jx2.s(System.nanoTime() - j));
                }
                qz6 qz6Var2 = (qz6) this.B;
                synchronized (qz6Var2) {
                    qz6.a(qz6Var2, b, a, true);
                    b2 = qz6Var2.b();
                }
                if (b2 == null) {
                    return;
                }
                b = b2;
            } catch (Throwable th) {
                try {
                    qz6 qz6Var3 = (qz6) this.B;
                    synchronized (qz6Var3) {
                        qz6.a(qz6Var3, b, -1L, false);
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                        throw th;
                    }
                } finally {
                    currentThread.setName(name);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r1 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        r3.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        defpackage.kj2.w("SequentialExecutor", "Exception while executing runnable " + r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b() {
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                synchronized (((vb6) this.B).A) {
                    if (!z) {
                        vb6 vb6Var = (vb6) this.B;
                        ub6 ub6Var = vb6Var.R;
                        ub6 ub6Var2 = ub6.RUNNING;
                        if (ub6Var != ub6Var2) {
                            vb6Var.X++;
                            vb6Var.R = ub6Var2;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((vb6) this.B).A.poll();
                    if (runnable == null) {
                        ((vb6) this.B).R = ub6.IDLE;
                    }
                }
                if (!z2) {
                    return;
                }
            } finally {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int actionMasked;
        int i;
        Object obj;
        i44 i44Var;
        switch (this.A) {
            case 0:
                RecyclerView recyclerView = ((k15) this.B).mList;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case 1:
                te teVar = (te) this.B;
                teVar.removeCallbacks(this);
                MotionEvent motionEvent = teVar.r1;
                if (motionEvent != null && (actionMasked = motionEvent.getActionMasked()) != 10 && actionMasked != 1) {
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    } else {
                        i = 7;
                    }
                    teVar.F(motionEvent, i, teVar.s1, false);
                    return;
                }
                return;
            case 2:
                fx3 fx3Var = (fx3) this.B;
                mp1 mp1Var = fx3Var.L;
                mx mxVar = fx3Var.A;
                if (fx3Var.k0) {
                    if (fx3Var.i0) {
                        fx3Var.i0 = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        mxVar.e = currentAnimationTimeMillis;
                        mxVar.g = -1L;
                        mxVar.f = currentAnimationTimeMillis;
                        mxVar.h = 0.5f;
                    }
                    if ((mxVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > mxVar.g + mxVar.i) || !fx3Var.e()) {
                        fx3Var.k0 = false;
                        return;
                    }
                    if (fx3Var.j0) {
                        fx3Var.j0 = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.B1, RecyclerView.B1, 0);
                        mp1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (mxVar.f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a = mxVar.a(currentAnimationTimeMillis2);
                        mxVar.f = currentAnimationTimeMillis2;
                        fx3Var.m0.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - mxVar.f)) * ((a * 4.0f) + ((-4.0f) * a * a)) * mxVar.d));
                        WeakHashMap weakHashMap = ao7.a;
                        mp1Var.postOnAnimation(this);
                        return;
                    }
                    u34.j("Cannot compute scroll delta before calling start()");
                    return;
                }
                return;
            case 3:
                k60 k60Var = (k60) this.B;
                k60Var.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) k60Var.e;
                ho7 ho7Var = bottomSheetBehavior.O;
                if (ho7Var != null && ho7Var.f()) {
                    k60Var.a(k60Var.b);
                    return;
                } else if (bottomSheetBehavior.N == 2) {
                    bottomSheetBehavior.J(k60Var.b);
                    return;
                } else {
                    return;
                }
            case 4:
                i iVar = (i) this.B;
                i.access$100(iVar).onDismiss(i.access$000(iVar));
                return;
            case 5:
                mp1 mp1Var2 = (mp1) this.B;
                mp1Var2.k0 = null;
                mp1Var2.drawableStateChanged();
                return;
            case 6:
                ((fs1) this.B).m();
                return;
            case 7:
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.B;
                int i2 = EmulatorActivity.Z1;
                emulatorActivity.S();
                Handler handler = emulatorActivity.N0;
                if (handler != null) {
                    handler.postDelayed(this, 1500L);
                    return;
                } else {
                    nb3.a0("handler");
                    throw null;
                }
            case 8:
                u92 u92Var = (u92) this.B;
                ValueAnimator valueAnimator = u92Var.z;
                int i3 = u92Var.A;
                if (i3 != 1) {
                    if (i3 != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                u92Var.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), RecyclerView.B1);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 9:
                h hVar = (h) this.B;
                if (!hVar.b.isEmpty()) {
                    hVar.e();
                    return;
                }
                return;
            case 10:
                ((u) this.B).z(true);
                return;
            case 11:
                ((gx3) this.B).cancel(true);
                return;
            case 12:
                lv2.a((rj0) this.B);
                return;
            case 13:
                bt btVar = (bt) this.B;
                nv2 nv2Var = (nv2) btVar.R;
                if (nv2Var.A.getAndSet(null) != null) {
                    ((Handler) btVar.B).removeCallbacks(nv2Var);
                    return;
                }
                return;
            case 14:
                pw3 pw3Var = (pw3) this.B;
                pw3Var.B = null;
                pw3Var.A = null;
                return;
            case 15:
                synchronized (((qx3) this.B).a) {
                    obj = ((qx3) this.B).f;
                    ((qx3) this.B).f = qx3.k;
                }
                ((qx3) this.B).f(obj);
                return;
            case 16:
                ((ViewGroup) this.B).setNestedScrollingEnabled(true);
                return;
            case 17:
                ((MotionLayout) this.B).j1.a();
                return;
            case 18:
                throw new RuntimeException((Exception) this.B);
            case 19:
                ((t15) this.B).m();
                return;
            case 20:
                try {
                    b();
                    return;
                } catch (Error e) {
                    synchronized (((vb6) this.B).A) {
                        ((vb6) this.B).R = ub6.IDLE;
                        throw e;
                    }
                }
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                ((StaggeredGridLayoutManager) this.B).D0();
                return;
            case 22:
                a();
                return;
            case ConnectionResult.API_DISABLED /* 23 */:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.B).L.f0;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                ((Toolbar) this.B).w();
                return;
            case 25:
                i87 i87Var = (i87) this.B;
                Window.Callback callback = i87Var.m;
                Menu L0 = i87Var.L0();
                if (L0 instanceof i44) {
                    i44Var = (i44) L0;
                } else {
                    i44Var = null;
                }
                if (i44Var != null) {
                    i44Var.w();
                }
                try {
                    L0.clear();
                    if (callback.onCreatePanelMenu(0, L0)) {
                        if (!callback.onPreparePanel(0, null, L0)) {
                        }
                        if (i44Var == null) {
                            i44Var.v();
                            return;
                        }
                        return;
                    }
                    L0.clear();
                    if (i44Var == null) {
                    }
                } catch (Throwable th) {
                    if (i44Var != null) {
                        i44Var.v();
                    }
                    throw th;
                }
            case SubAllocator.N4 /* 26 */:
                ((ho7) this.B).n(0);
                return;
            default:
                eb ebVar = (eb) this.B;
                ((i36) ebVar.X).n(new j97(ebVar, 15));
                return;
        }
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.os.Looper;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d51  reason: default package */
/* loaded from: classes.dex */
public final class d51 implements zk4, ot, at6, ax1, mo2, rb0, aw, so2, OnSuccessListener {
    public final /* synthetic */ int A;
    public Object B;

    public d51(int i) {
        this.A = i;
        switch (i) {
            case 6:
                this.B = uj2.u(Looper.getMainLooper());
                return;
            case 7:
                this.B = new TreeSet(vy7.Y);
                return;
            case 8:
                this.B = new ConcurrentHashMap(16);
                return;
            case 10:
                y65 y65Var = si1.a;
                this.B = (SmallDisplaySizeQuirk) si1.a().b(SmallDisplaySizeQuirk.class);
                return;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                this.B = null;
                return;
            default:
                this.B = new hb4();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b2, code lost:
        if (r1 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d5, code lost:
        if (r1 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f6, code lost:
        if (r4 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0117, code lost:
        if (r4 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0130, code lost:
        if (r3 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0139, code lost:
        if (r2 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ba2 j(qu2 qu2Var, List list) {
        boolean z;
        boolean z2;
        boolean z3;
        String oj7Var;
        boolean z4 = false;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((di7) it.next()) instanceof d23) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                di7 di7Var = (di7) it2.next();
                if ((di7Var instanceof p25) || ej2.L(di7Var)) {
                    z2 = true;
                    break;
                }
                while (it2.hasNext()) {
                }
            }
        }
        z2 = false;
        if (list == null || !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                di7 di7Var2 = (di7) it3.next();
                if ((di7Var2 instanceof p25) || (di7Var2 instanceof r13) || ej2.L(di7Var2)) {
                    z3 = true;
                    break;
                }
                while (it3.hasNext()) {
                }
            }
        }
        z3 = false;
        if (list == null || !list.isEmpty()) {
            Iterator it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                } else if (ej2.L((di7) it4.next())) {
                    z4 = true;
                    break;
                }
            }
        }
        int i = ud1.b[qu2Var.a().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            oj7Var = oj7.VIDEO_CAPTURE.toString();
                        } else {
                            i.d();
                            return null;
                        }
                    } else {
                        int i2 = ud1.a[((kn7) qu2Var).a.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                oj7Var = oj7.VIDEO_CAPTURE.toString();
                            }
                            oj7Var = null;
                            if (oj7Var == null) {
                                return null;
                            }
                            return new ba2(oj7Var, qu2Var);
                        }
                        oj7Var = oj7.PREVIEW + " or " + oj7.VIDEO_CAPTURE + " or " + oj7.IMAGE_ANALYSIS;
                    }
                } else {
                    oj7Var = oj7.PREVIEW + " or " + oj7.VIDEO_CAPTURE + " or " + oj7.IMAGE_ANALYSIS;
                }
            } else {
                oj7Var = oj7.PREVIEW + " or " + oj7.VIDEO_CAPTURE;
            }
        } else {
            oj7Var = oj7.IMAGE_CAPTURE.toString();
        }
    }

    @Override // defpackage.zk4
    public vu7 U(View view, vu7 vu7Var) {
        boolean z;
        ru7 ru7Var = vu7Var.a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.B;
        if (!Objects.equals(coordinatorLayout.m0, vu7Var)) {
            coordinatorLayout.m0 = vu7Var;
            boolean z2 = true;
            if (vu7Var.d() > 0) {
                z = true;
            } else {
                z = false;
            }
            coordinatorLayout.n0 = z;
            coordinatorLayout.setWillNotDraw((z || coordinatorLayout.getBackground() != null) ? false : false);
            if (!ru7Var.r()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = ao7.a;
                    if (childAt.getFitsSystemWindows() && ((h51) childAt.getLayoutParams()).a != null && ru7Var.r()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return vu7Var;
    }

    @Override // defpackage.at6
    public d44 a(c44 c44Var) {
        return null;
    }

    @Override // defpackage.mo2
    public gx3 apply(Object obj) {
        return l.z(((mo2) this.B).apply(obj));
    }

    public void c(sm3 sm3Var) {
        if (!sm3Var.H()) {
            p53.c("DepthSortedSet.add called on an unattached node");
        }
        ((fn6) this.B).add(sm3Var);
    }

    @Override // defpackage.ax1
    public void d() {
        ((EmulatorActivity) this.B).finish();
    }

    @Override // defpackage.ax1
    public void e(pq5 pq5Var) {
        pq5Var.getClass();
        int i = EmulatorActivity.Z1;
        sz1 W = ((EmulatorActivity) this.B).W();
        W.getClass();
        hv.L(W.z, null, null, new u12(W, pq5Var, (r41) null), 3);
    }

    public ca2 f(qi1 qi1Var, ArrayList arrayList, int i, List list) {
        if (i >= arrayList.size()) {
            LinkedHashSet<qu2> K = ii2.K((Set) qi1Var.e, list);
            kj2.t("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + K + ", useCases = " + ((List) qi1Var.g));
            ArrayList arrayList2 = new ArrayList(ht0.v0(K, 10));
            for (qu2 qu2Var : K) {
                arrayList2.add(qu2Var.a());
            }
            Iterator it = gt0.k1(gt0.o1(arrayList2)).iterator();
            while (true) {
                if (it.hasNext()) {
                    da2 da2Var = (da2) it.next();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : K) {
                        if (((qu2) obj).a() == da2Var) {
                            arrayList3.add(obj);
                        }
                    }
                    if (arrayList3.size() > 1) {
                        break;
                    }
                } else {
                    cg0 cg0Var = (cg0) this.B;
                    il5 il5Var = new il5(K);
                    Iterator it2 = K.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            qu2 qu2Var2 = (qu2) it2.next();
                            if (!qu2Var2.b(cg0Var, qi1Var)) {
                                kj2.t("CameraInfoInternal", qu2Var2 + " is not supported.");
                                break;
                            }
                        } else {
                            try {
                                oi2.V(cg0Var, qi1Var, il5Var);
                                return new y92(new il5(K));
                            } catch (IllegalArgumentException | si0 e) {
                                String c0 = kj2.c0("CameraInfoInternal");
                                if (kj2.J(3, c0)) {
                                    Log.d(c0, "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e);
                                }
                            }
                        }
                    }
                }
            }
            return z92.a;
        }
        int i2 = i + 1;
        ca2 f = f(qi1Var, arrayList, i2, gt0.U0(arrayList.get(i), list));
        if (f instanceof y92) {
            return f;
        }
        return f(qi1Var, arrayList, i2, list);
    }

    public pp6 g() {
        ws1 a = ws1.a();
        if (a.c() == 1) {
            return new p33(true);
        }
        vs4 Y = np2.Y(Boolean.FALSE);
        a.h(new be1(Y, this));
        return Y;
    }

    @Override // defpackage.at6
    public void h(c44 c44Var, Bitmap bitmap, Map map) {
        ((rs7) this.B).g(c44Var, bitmap, map, nb3.w(bitmap));
    }

    @Override // defpackage.so2
    public void i(Throwable th) {
        switch (this.A) {
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                ((qb0) this.B).c(th);
                return;
            case 28:
                ((s23) this.B).close();
                return;
            default:
                ((x13) this.B).close();
                return;
        }
    }

    @Override // defpackage.ax1
    public void k(ConsoleType consoleType) {
        int i = EmulatorActivity.Z1;
        sz1 W = ((EmulatorActivity) this.B).W();
        W.getClass();
        hv.L(to7.a(W), null, null, new m5(W, consoleType, (r41) null, 13), 3);
    }

    public void l() {
        ((vk2) this.B).R.P();
    }

    public void m(vc0 vc0Var) {
        if (!vc0Var.b) {
            dk0 dk0Var = (dk0) this.B;
            synchronized (((ArrayList) dk0Var.B)) {
                ((ArrayList) dk0Var.B).remove(vc0Var);
            }
        }
    }

    @Override // defpackage.ot
    public Object n(p76 p76Var, Float f, Float f2, qn2 qn2Var, pl6 pl6Var) {
        Object i = kn2.i(p76Var, f.floatValue(), ak7.f(RecyclerView.B1, f2.floatValue(), 28), (oc1) this.B, qn2Var, pl6Var);
        if (i == x61.COROUTINE_SUSPENDED) {
            return i;
        }
        return (qo) i;
    }

    public boolean o(sm3 sm3Var) {
        if (!sm3Var.H()) {
            p53.c("DepthSortedSet.remove called on an unattached node");
        }
        return ((fn6) this.B).remove(sm3Var);
    }

    @Override // defpackage.so2, com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.A) {
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                qb0 qb0Var = (qb0) this.B;
                try {
                    qb0Var.a(obj);
                    return;
                } catch (Throwable th) {
                    qb0Var.c(th);
                    return;
                }
            case 25:
                ((rp2) this.B).g(obj);
                return;
            case SubAllocator.N4 /* 26 */:
            case 27:
            default:
                Void r2 = (Void) obj;
                return;
            case 28:
                Void r22 = (Void) obj;
                return;
        }
    }

    @Override // defpackage.rb0
    public Object s(qb0 qb0Var) {
        boolean z;
        to2 to2Var = (to2) this.B;
        if (to2Var.B == null) {
            z = true;
        } else {
            z = false;
        }
        np2.A("The result can only set once!", z);
        to2Var.B = qb0Var;
        return "FutureChain[" + to2Var + "]";
    }

    public String toString() {
        switch (this.A) {
            case 7:
                return ((fn6) this.B).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mo2
    public Object apply(Object obj) {
        Void r1 = (Void) obj;
        return (j9) this.B;
    }

    @Override // defpackage.at6
    public void b(int i) {
    }

    public /* synthetic */ d51(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    public /* synthetic */ d51(int i, boolean z) {
        this.A = i;
    }

    public d51(TextView textView) {
        this.A = 16;
        this.B = new lt1(textView);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [yc1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.text.Editable$Factory, at1] */
    public d51(EditText editText) {
        this.A = 15;
        ?? obj = new Object();
        obj.A = editText;
        nt1 nt1Var = new nt1(editText);
        obj.B = nt1Var;
        editText.addTextChangedListener(nt1Var);
        if (at1.b == null) {
            synchronized (at1.a) {
                try {
                    if (at1.b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            at1.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, at1.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        at1.b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(at1.b);
        this.B = obj;
    }
}

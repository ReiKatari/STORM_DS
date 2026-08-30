package defpackage;

import android.content.ClipDescription;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.Editable;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import androidx.recyclerview.widget.RecyclerView;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t71  reason: default package */
/* loaded from: classes.dex */
public final class t71 implements ys, jh6, os1, ij2, j90, iv, oj2 {
    public final /* synthetic */ int A;
    public Object B;

    public t71(int i) {
        this.A = i;
        switch (i) {
            case 5:
                this.B = new TreeSet(dt3.c0);
                return;
            case ig7.b /* 6 */:
                this.B = new ConcurrentHashMap(16);
                return;
            case 8:
                ox4 ox4Var = oe1.a;
                this.B = (SmallDisplaySizeQuirk) oe1.a().b(SmallDisplaySizeQuirk.class);
                return;
            case 19:
                this.B = null;
                return;
            default:
                this.B = me2.n(Looper.getMainLooper());
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.i52 n(defpackage.no2 r7, java.util.List r8) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t71.n(no2, java.util.List):i52");
    }

    @Override // defpackage.jh6
    public pw3 a(ow3 ow3Var) {
        return null;
    }

    @Override // defpackage.ij2
    public fq3 apply(Object obj) {
        return jv3.K(((ij2) this.B).apply(obj));
    }

    @Override // defpackage.os1
    public void c(rg5 rg5Var) {
        rg5Var.getClass();
        int i = EmulatorActivity.P1;
        hv1 U = ((EmulatorActivity) this.B).U();
        U.getClass();
        tq5.w(U.z, null, null, new wx1(U, rg5Var, (j11) null), 3);
    }

    public void d(vf3 vf3Var) {
        if (!vf3Var.H()) {
            mz2.c("DepthSortedSet.add called on an unattached node");
        }
        ((pb6) this.B).add(vf3Var);
    }

    @Override // defpackage.jh6
    public void e(ow3 ow3Var, Bitmap bitmap, Map map) {
        ((ud7) this.B).h(ow3Var, bitmap, map, l.D(bitmap));
    }

    public j52 f(me1 me1Var, ArrayList arrayList, int i, List list) {
        if (i >= arrayList.size()) {
            LinkedHashSet<no2> O = hi2.O((Set) me1Var.e, list);
            ve2.v("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + O + ", useCases = " + ((List) me1Var.g));
            ArrayList arrayList2 = new ArrayList(uq0.y0(O, 10));
            for (no2 no2Var : O) {
                arrayList2.add(no2Var.a());
            }
            Iterator it = tq0.n1(tq0.r1(arrayList2)).iterator();
            while (true) {
                if (it.hasNext()) {
                    k52 k52Var = (k52) it.next();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : O) {
                        if (((no2) obj).a() == k52Var) {
                            arrayList3.add(obj);
                        }
                    }
                    if (arrayList3.size() > 1) {
                        break;
                    }
                } else {
                    td0 td0Var = (td0) this.B;
                    qb5 qb5Var = new qb5(O);
                    Iterator it2 = O.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            no2 no2Var2 = (no2) it2.next();
                            if (!no2Var2.b(td0Var, me1Var)) {
                                ve2.v("CameraInfoInternal", no2Var2 + " is not supported.");
                                break;
                            }
                        } else {
                            try {
                                ve2.S(td0Var, me1Var, qb5Var);
                                return new f52(new qb5(O));
                            } catch (IllegalArgumentException | jg0 e) {
                                String a0 = ve2.a0("CameraInfoInternal");
                                if (ve2.G(3, a0)) {
                                    Log.d(a0, "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e);
                                }
                            }
                        }
                    }
                }
            }
            return g52.a;
        }
        int i2 = i + 1;
        j52 f = f(me1Var, arrayList, i2, tq0.Y0(list, arrayList.get(i)));
        if (f instanceof f52) {
            return f;
        }
        return f(me1Var, arrayList, i2, list);
    }

    @Override // defpackage.os1
    public void g(ConsoleType consoleType) {
        int i = EmulatorActivity.P1;
        hv1 U = ((EmulatorActivity) this.B).U();
        U.getClass();
        tq5.w(ua7.a(U), null, null, new n5(U, consoleType, (j11) null, 12), 3);
    }

    @Override // defpackage.oj2
    public void h(Throwable th) {
        switch (this.A) {
            case 22:
                ((i90) this.B).c(th);
                return;
            case 25:
                ((ow2) this.B).close();
                return;
            default:
                ((tv2) this.B).close();
                return;
        }
    }

    @Override // defpackage.j90
    public Object i(i90 i90Var) {
        boolean z;
        pj2 pj2Var = (pj2) this.B;
        if (pj2Var.B == null) {
            z = true;
        } else {
            z = false;
        }
        nl2.D("The result can only set once!", z);
        pj2Var.B = i90Var;
        return "FutureChain[" + pj2Var + "]";
    }

    @Override // defpackage.os1
    public void j() {
        ((EmulatorActivity) this.B).finish();
    }

    public ae6 k() {
        mo1 a = mo1.a();
        if (a.c() == 1) {
            return new lx2(true);
        }
        tj4 G = me2.G(Boolean.FALSE);
        a.h(new fa1(G, this));
        return G;
    }

    @Override // defpackage.oj2
    public void l(Object obj) {
        switch (this.A) {
            case 22:
                i90 i90Var = (i90) this.B;
                try {
                    i90Var.a(obj);
                    return;
                } catch (Throwable th) {
                    i90Var.c(th);
                    return;
                }
            case 25:
                Void r2 = (Void) obj;
                return;
            default:
                Void r22 = (Void) obj;
                return;
        }
    }

    @Override // defpackage.ys
    public Object m(dw5 dw5Var, Float f, Float f2, mi2 mi2Var, aa6 aa6Var) {
        Object f3 = sn2.f(dw5Var, f.floatValue(), dt3.f(RecyclerView.A1, f2.floatValue(), 28), (x81) this.B, mi2Var, aa6Var);
        if (f3 == p31.COROUTINE_SUSPENDED) {
            return f3;
        }
        return (eo) f3;
    }

    public ca3 o(x70 x70Var) {
        ua uaVar;
        ba3 ba3Var;
        wa waVar = (wa) this.B;
        try {
            switch (waVar.d) {
                case 0:
                    uaVar = new ua(waVar, 0);
                    break;
                default:
                    uaVar = new ua(waVar, 1);
                    break;
            }
            b1 K = uaVar.K(x70Var);
            uaVar.V(K);
            b1 b1Var = (b1) uaVar.o(K);
            aa3 t = ca3.t();
            String a = waVar.a();
            t.c();
            ca3.m((ca3) t.B, a);
            try {
                int a2 = b1Var.a();
                byte[] bArr = new byte[a2];
                zp0 zp0Var = new zp0(a2, bArr);
                b1Var.d(zp0Var);
                if (zp0Var.c - zp0Var.d == 0) {
                    v70 v70Var = new v70(bArr);
                    t.c();
                    ca3.n((ca3) t.B, v70Var);
                    switch (waVar.d) {
                        case 0:
                            ba3Var = ba3.SYMMETRIC;
                            break;
                        default:
                            ba3Var = ba3.SYMMETRIC;
                            break;
                    }
                    t.c();
                    ca3.o((ca3) t.B, ba3Var);
                    return (ca3) t.a();
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            } catch (IOException e) {
                throw new RuntimeException(b1Var.b("ByteString"), e);
            }
        } catch (i53 e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    public void p() {
        ((wf2) this.B).R.P();
    }

    public void q(na0 na0Var) {
        if (!na0Var.b) {
            vh0 vh0Var = (vh0) this.B;
            synchronized (((ArrayList) vh0Var.b)) {
                ((ArrayList) vh0Var.b).remove(na0Var);
            }
        }
    }

    public boolean r(vf3 vf3Var) {
        if (!vf3Var.H()) {
            mz2.c("DepthSortedSet.remove called on an unattached node");
        }
        return ((pb6) this.B).remove(vf3Var);
    }

    public String toString() {
        switch (this.A) {
            case 5:
                return ((pb6) this.B).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ij2
    public Object apply(Object obj) {
        Void r1 = (Void) obj;
        return (i9) this.B;
    }

    @Override // defpackage.jh6
    public void b(int i) {
    }

    public /* synthetic */ t71(int i, boolean z) {
        this.A = i;
    }

    public t71(wa waVar, Class cls) {
        this.A = 29;
        if (!waVar.b.keySet().contains(cls) && !Void.class.equals(cls)) {
            f81.k("Given internalKeyMananger ", waVar.toString(), " does not support primitive class ", cls.getName());
            throw null;
        } else {
            this.B = waVar;
        }
    }

    public /* synthetic */ t71(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    public t71(TextView textView) {
        this.A = 14;
        this.B = new cp1(textView);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [k91, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.text.Editable$Factory, qo1] */
    public t71(EditText editText) {
        this.A = 13;
        ?? obj = new Object();
        obj.A = editText;
        ep1 ep1Var = new ep1(editText);
        obj.B = ep1Var;
        editText.addTextChangedListener(ep1Var);
        if (qo1.b == null) {
            synchronized (qo1.a) {
                try {
                    if (qo1.b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            qo1.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, qo1.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        qo1.b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(qo1.b);
        this.B = obj;
    }

    public t71(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.A = 27;
        if (Build.VERSION.SDK_INT >= 25) {
            this.B = new n03(uri, clipDescription, uri2);
        } else {
            this.B = new os(uri, clipDescription, uri2, 19);
        }
    }

    public t71(FileInputStream fileInputStream) {
        this.A = 28;
        this.B = new gk0(fileInputStream, hk0.a);
    }
}

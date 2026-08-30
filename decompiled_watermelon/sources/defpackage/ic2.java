package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ic2  reason: default package */
/* loaded from: classes.dex */
public final class ic2 implements i47, i57 {
    public final je0 a;
    public final zd6 b;
    public n47 c;
    public gs0 d;

    public ic2(je0 je0Var, ay3 ay3Var, zd6 zd6Var, n57 n57Var, wj7 wj7Var) {
        Object obj;
        je0Var.getClass();
        zd6Var.getClass();
        n57Var.getClass();
        this.a = je0Var;
        this.b = zd6Var;
        ce0 ce0Var = je0Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_MAX_REGIONS_AF;
        key.getClass();
        ia0 ia0Var = (ia0) ce0Var;
        ia0Var.getClass();
        Object c = ia0Var.c(key);
        Integer num = (Integer) (c == null ? r6 : c);
        CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_MAX_REGIONS_AE;
        key2.getClass();
        ia0Var.getClass();
        Object c2 = ia0Var.c(key2);
        Integer num2 = (Integer) (c2 == null ? r6 : c2);
        CameraCharacteristics.Key key3 = CameraCharacteristics.CONTROL_MAX_REGIONS_AWB;
        key3.getClass();
        ia0Var.getClass();
        Object c3 = ia0Var.c(key3);
        r6 = c3 != null ? c3 : 0;
        ce0.g.getClass();
        be0.a(ce0Var);
        CameraCharacteristics.Key key4 = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key4.getClass();
        int[] iArr = (int[]) ((ia0) ce0Var).c(key4);
        if (iArr != null) {
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                List list = ja.b;
                arrayList.add(dk7.u(i));
            }
        }
        ce0 ce0Var2 = this.a.b;
        CameraCharacteristics.Key key5 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        key5.getClass();
        int[] iArr2 = (int[]) ((ia0) ce0Var2).c(key5);
        if (iArr2 != null) {
            ArrayList arrayList2 = new ArrayList(iArr2.length);
            for (int i2 : iArr2) {
                Iterator it = kb.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((kb) obj).a == i2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                arrayList2.add((kb) obj);
            }
        }
    }

    @Override // defpackage.i57
    public final void a(LinkedHashSet linkedHashSet) {
        Size c;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            f47 f47Var = (f47) it.next();
            if ((f47Var instanceof nt4) && (c = ((nt4) f47Var).c()) != null) {
                new Rational(c.getWidth(), c.getHeight());
            }
        }
    }

    @Override // defpackage.i47
    public final void b(n47 n47Var) {
        this.c = n47Var;
    }

    @Override // defpackage.i47
    public final void reset() {
        gs0 gs0Var = new gs0();
        n47 n47Var = this.c;
        if (n47Var != null) {
            gs0 gs0Var2 = this.d;
            if (gs0Var2 != null) {
                b31.z("Cancelled by another cancelFocusAndMetering()", gs0Var2);
            }
            this.d = gs0Var;
            zd6 zd6Var = this.b;
            synchronized (zd6Var.d) {
            }
            zd6Var.f();
            l.K(n47Var.g(), gs0Var);
            return;
        }
        b31.z("Camera is not active.", gs0Var);
    }
}

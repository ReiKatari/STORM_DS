package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zg2  reason: default package */
/* loaded from: classes.dex */
public final class zg2 implements gi7, fj7 {
    public final sg0 a;
    public final op6 b;
    public li7 c;
    public tu0 d;

    public zg2(sg0 sg0Var, t54 t54Var, op6 op6Var, kj7 kj7Var, oy7 oy7Var) {
        Object obj;
        sg0Var.getClass();
        op6Var.getClass();
        kj7Var.getClass();
        this.a = sg0Var;
        this.b = op6Var;
        lg0 lg0Var = sg0Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_MAX_REGIONS_AF;
        key.getClass();
        qc0 qc0Var = (qc0) lg0Var;
        qc0Var.getClass();
        Object c = qc0Var.c(key);
        Integer num = (Integer) (c == null ? r6 : c);
        CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_MAX_REGIONS_AE;
        key2.getClass();
        qc0Var.getClass();
        Object c2 = qc0Var.c(key2);
        Integer num2 = (Integer) (c2 == null ? r6 : c2);
        CameraCharacteristics.Key key3 = CameraCharacteristics.CONTROL_MAX_REGIONS_AWB;
        key3.getClass();
        qc0Var.getClass();
        Object c3 = qc0Var.c(key3);
        r6 = c3 != null ? c3 : 0;
        lg0.g.getClass();
        kg0.a(lg0Var);
        CameraCharacteristics.Key key4 = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key4.getClass();
        int[] iArr = (int[]) ((qc0) lg0Var).c(key4);
        if (iArr != null) {
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                List list = oa.b;
                arrayList.add(nc1.N(i));
            }
        }
        lg0 lg0Var2 = this.a.b;
        CameraCharacteristics.Key key5 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        key5.getClass();
        int[] iArr2 = (int[]) ((qc0) lg0Var2).c(key5);
        if (iArr2 != null) {
            ArrayList arrayList2 = new ArrayList(iArr2.length);
            for (int i2 : iArr2) {
                Iterator it = qb.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((qb) obj).a == i2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                arrayList2.add((qb) obj);
            }
        }
    }

    @Override // defpackage.fj7
    public final void a(LinkedHashSet linkedHashSet) {
        Size c;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            di7 di7Var = (di7) it.next();
            if ((di7Var instanceof p25) && (c = ((p25) di7Var).c()) != null) {
                new Rational(c.getWidth(), c.getHeight());
            }
        }
    }

    @Override // defpackage.gi7
    public final void b(li7 li7Var) {
        this.c = li7Var;
    }

    @Override // defpackage.gi7
    public final void reset() {
        tu0 tu0Var = new tu0();
        li7 li7Var = this.c;
        if (li7Var != null) {
            tu0 tu0Var2 = this.d;
            if (tu0Var2 != null) {
                i61.A("Cancelled by another cancelFocusAndMetering()", tu0Var2);
            }
            this.d = tu0Var;
            op6 op6Var = this.b;
            synchronized (op6Var.d) {
            }
            op6Var.f();
            nc1.a0(li7Var.j(), tu0Var);
            return;
        }
        i61.A("Camera is not active.", tu0Var);
    }
}

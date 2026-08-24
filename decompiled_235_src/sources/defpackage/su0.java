package defpackage;

import android.media.MediaCodec;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: su0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class su0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ su0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        qn2[] qn2VarArr;
        int i;
        int i2 = this.a;
        int i3 = 0;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                for (qn2 qn2Var : (qn2[]) obj3) {
                    int z = g04.z((Comparable) qn2Var.g(obj), (Comparable) qn2Var.g(obj2));
                    if (z != 0) {
                        return z;
                    }
                }
                return 0;
            case 1:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.n0).compareTo(Boolean.valueOf(materialButton2.n0));
                if (compareTo == 0) {
                    int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                    if (compareTo2 == 0) {
                        return Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
                    }
                    return compareTo2;
                }
                return compareTo;
            case 2:
                xh5 xh5Var = tz5.L;
                return ((Number) ((z5) obj3).o(obj, obj2)).intValue();
            case 3:
                hn6 hn6Var = (hn6) obj3;
                pq5 pq5Var = (pq5) obj;
                pq5 pq5Var2 = (pq5) obj2;
                xh5 xh5Var2 = tz5.L;
                pq5Var.getClass();
                pq5Var2.getClass();
                String k0 = hf.k0(pq5Var);
                String k02 = hf.k0(pq5Var2);
                k0.getClass();
                k02.getClass();
                int compareToIgnoreCase = k0.compareToIgnoreCase(k02);
                if (hn6Var != hn6.ASCENDING) {
                    return -compareToIgnoreCase;
                }
                return compareToIgnoreCase;
            case 4:
                return ((Number) ((eo2) obj3).o(obj, obj2)).intValue();
            default:
                wy wyVar = (wy) obj2;
                ((q33) obj3).getClass();
                Class cls = ((wy) obj).a.j;
                if (cls == MediaCodec.class) {
                    i = 2;
                } else if (cls != p25.class && cls != pr6.class) {
                    i = 1;
                } else {
                    i = 0;
                }
                Class cls2 = wyVar.a.j;
                if (cls2 == MediaCodec.class) {
                    i3 = 2;
                } else if (cls2 != p25.class && cls2 != pr6.class) {
                    i3 = 1;
                }
                return i - i3;
        }
    }
}

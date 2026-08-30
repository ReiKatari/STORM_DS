package defpackage;

import android.media.MediaCodec;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fs0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fs0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fs0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        mi2[] mi2VarArr;
        int i;
        int i2 = this.a;
        int i3 = 0;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                for (mi2 mi2Var : (mi2[]) obj3) {
                    int i4 = iq2.i((Comparable) mi2Var.n(obj), (Comparable) mi2Var.n(obj2));
                    if (i4 != 0) {
                        return i4;
                    }
                }
                return 0;
            case 1:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.m0).compareTo(Boolean.valueOf(materialButton2.m0));
                if (compareTo == 0) {
                    int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                    if (compareTo2 == 0) {
                        return Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
                    }
                    return compareTo2;
                }
                return compareTo;
            case 2:
                h85 h85Var = yo5.I;
                return ((Number) ((z5) obj3).j(obj, obj2)).intValue();
            case 3:
                return ((Number) ((aj2) obj3).j(obj, obj2)).intValue();
            default:
                hx hxVar = (hx) obj2;
                ((mx2) obj3).getClass();
                Class cls = ((hx) obj).a.j;
                if (cls == MediaCodec.class) {
                    i = 2;
                } else if (cls != nt4.class && cls != zf6.class) {
                    i = 1;
                } else {
                    i = 0;
                }
                Class cls2 = hxVar.a.j;
                if (cls2 == MediaCodec.class) {
                    i3 = 2;
                } else if (cls2 != nt4.class && cls2 != zf6.class) {
                    i3 = 1;
                }
                return i - i3;
        }
    }
}

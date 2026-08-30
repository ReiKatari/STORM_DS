package bc;

import a0.m;
import android.media.MediaCodec;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import d0.d;
import d0.f1;
import j0.i;
import java.util.Comparator;
import mc.l;
import mc.p;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2158a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2159b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f2158a = i2;
        this.f2159b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        l[] lVarArr;
        int i2;
        switch (this.f2158a) {
            case 0:
                for (l lVar : (l[]) this.f2159b) {
                    int M = d.M((Comparable) lVar.k(obj), (Comparable) lVar.k(obj2));
                    if (M != 0) {
                        return M;
                    }
                }
                return 0;
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((Number) ((p) this.f2159b).j(obj, obj2)).intValue();
            case 2:
                i iVar = (i) obj2;
                ((m) this.f2159b).getClass();
                Class cls = ((i) obj).f7213a.f7304j;
                int i10 = 0;
                if (cls == MediaCodec.class) {
                    i2 = 2;
                } else if (cls != f1.class && cls != v0.d.class) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                Class cls2 = iVar.f7213a.f7304j;
                if (cls2 == MediaCodec.class) {
                    i10 = 2;
                } else if (cls2 != f1.class && cls2 != v0.d.class) {
                    i10 = 1;
                }
                return i2 - i10;
            default:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f2159b;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.f2986l0).compareTo(Boolean.valueOf(materialButton2.f2986l0));
                if (compareTo == 0) {
                    int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                    if (compareTo2 == 0) {
                        return Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
                    }
                    return compareTo2;
                }
                return compareTo;
        }
    }
}

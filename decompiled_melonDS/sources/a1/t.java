package a1;

import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class t implements Map.Entry, oc.a {
    public final /* synthetic */ int A;
    public final Object B;
    public final Object L;

    public /* synthetic */ t(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry;
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                if (obj instanceof Map.Entry) {
                    entry = (Map.Entry) obj;
                } else {
                    entry = null;
                }
                if (entry != null && nc.k.a(entry.getKey(), this.B) && nc.k.a(entry.getValue(), getValue())) {
                    return true;
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.A) {
            case 0:
                return this.B;
            default:
                return this.B;
        }
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.A) {
            case 0:
                return this.L;
            default:
                return this.L;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int i2;
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                int i10 = 0;
                Object obj = this.B;
                if (obj != null) {
                    i2 = obj.hashCode();
                } else {
                    i2 = 0;
                }
                Object value = getValue();
                if (value != null) {
                    i10 = value.hashCode();
                }
                return i10 ^ i2;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.B);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}

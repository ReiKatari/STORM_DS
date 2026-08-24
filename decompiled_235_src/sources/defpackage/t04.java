package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t04  reason: default package */
/* loaded from: classes.dex */
public class t04 implements Map.Entry, zf3 {
    public final /* synthetic */ int A;
    public final Object B;
    public final Object L;

    public /* synthetic */ t04(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry;
        switch (this.A) {
            case 0:
                if (obj instanceof Map.Entry) {
                    entry = (Map.Entry) obj;
                } else {
                    entry = null;
                }
                if (entry != null && nb3.k(entry.getKey(), this.B) && nb3.k(entry.getValue(), getValue())) {
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
        int i;
        switch (this.A) {
            case 0:
                int i2 = 0;
                Object obj = this.B;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object value = getValue();
                if (value != null) {
                    i2 = value.hashCode();
                }
                return i ^ i2;
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
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.B);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}

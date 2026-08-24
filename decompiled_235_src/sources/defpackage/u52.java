package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u52  reason: default package */
/* loaded from: classes.dex */
public final class u52 extends z0 implements t52, RandomAccess, Serializable {
    public final Enum[] A;

    public u52(Enum[] enumArr) {
        enumArr.getClass();
        this.A = enumArr;
    }

    @Override // defpackage.l0
    public final int a() {
        return this.A.length;
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        if (((Enum) fv.J0(r3.ordinal(), this.A)) != r3) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.A;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        e41.q(lb1.j("index: ", i, length, ", size: "));
        return null;
    }

    @Override // defpackage.z0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) fv.J0(ordinal, this.A)) != r3) {
            return -1;
        }
        return ordinal;
    }

    @Override // defpackage.z0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) fv.J0(ordinal, this.A)) != r3) {
            return -1;
        }
        return ordinal;
    }
}

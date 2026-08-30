package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f12  reason: default package */
/* loaded from: classes.dex */
public final class f12 extends y0 implements e12, RandomAccess, Serializable {
    public final Enum[] A;

    public f12(Enum[] enumArr) {
        enumArr.getClass();
        this.A = enumArr;
    }

    @Override // defpackage.k0
    public final int b() {
        return this.A.length;
    }

    @Override // defpackage.k0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        if (((Enum) nu.v0(r3.ordinal(), this.A)) != r3) {
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
        f81.q(wh1.f(i, length, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.y0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) nu.v0(ordinal, this.A)) != r3) {
            return -1;
        }
        return ordinal;
    }

    @Override // defpackage.y0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) nu.v0(ordinal, this.A)) != r3) {
            return -1;
        }
        return ordinal;
    }
}

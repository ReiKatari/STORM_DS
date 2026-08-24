package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xn5  reason: default package */
/* loaded from: classes.dex */
public final class xn5 extends yn5 {
    public final List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn5(List list) {
        super(list);
        list.getClass();
        this.b = list;
    }

    @Override // defpackage.yn5
    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xn5) && nb3.k(this.b, ((xn5) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Success(uiEvents=" + this.b + ")";
    }
}

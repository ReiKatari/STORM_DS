package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hu2  reason: default package */
/* loaded from: classes.dex */
public final class hu2 implements iu2 {
    public final int a;

    public hu2(int i) {
        boolean z;
        this.a = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            s53.a("Provided count should be larger than zero");
        }
    }

    @Override // defpackage.iu2
    public final ArrayList a(qh1 qh1Var, int i, int i2) {
        return hi2.q(i, this.a, i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hu2) {
            if (this.a == ((hu2) obj).a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return -this.a;
    }
}

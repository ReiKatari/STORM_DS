package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: do2  reason: default package */
/* loaded from: classes.dex */
public final class do2 implements eo2 {
    public final int a;

    public do2(int i) {
        boolean z;
        this.a = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            pz2.a("Provided count should be larger than zero");
        }
    }

    @Override // defpackage.eo2
    public final ArrayList a(od1 od1Var, int i, int i2) {
        return oo2.p(i, this.a, i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof do2) {
            if (this.a == ((do2) obj).a) {
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

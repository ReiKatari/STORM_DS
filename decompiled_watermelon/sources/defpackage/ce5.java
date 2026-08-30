package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ce5  reason: default package */
/* loaded from: classes.dex */
public final class ce5 extends de5 {
    public final List a;

    public ce5(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.de5
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ce5) && b53.x(this.a, ((ce5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(uiEvents=" + this.a + ")";
    }
}

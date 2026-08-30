package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tk2  reason: default package */
/* loaded from: classes.dex */
public final class tk2 implements fv0 {
    public final cv0 A;

    public tk2(cv0 cv0Var) {
        this.A = cv0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tk2) {
            if (this.A.equals(((tk2) obj).A)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode() * 31;
    }
}

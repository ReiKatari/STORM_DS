package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i34  reason: default package */
/* loaded from: classes.dex */
public final class i34 {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final boolean e;

    public i34(Set set, Set set2, Set set3, Set set4, boolean z) {
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = set4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i34) {
                i34 i34Var = (i34) obj;
                if (!b53.x(this.a, i34Var.a) || !b53.x(this.b, i34Var.b) || !b53.x(this.c, i34Var.c) || !b53.x(this.d, i34Var.d) || this.e != i34Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        return Boolean.hashCode(this.e) + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NativeRaRetryOutcome(acceptedNativeSubmissionIds=" + this.a + ", alreadyAcceptedNativeSubmissionIds=" + this.b + ", retryableFailureNativeSubmissionIds=" + this.c + ", permanentFailureNativeSubmissionIds=" + this.d + ", transientFailure=" + this.e + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ i34() {
        /*
            r6 = this;
            up1 r1 = defpackage.up1.A
            r5 = 1
            r2 = r1
            r3 = r1
            r4 = r1
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i34.<init>():void");
    }
}
